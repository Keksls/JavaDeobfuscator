/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;

/*
 * Renamed from aHz
 */
class ahz_1
extends Thread {
    static final ahz_1 a = new ahz_1();
    protected static final Logger b;
    private final Queue<aha_1> c = new ConcurrentLinkedQueue<aha_1>();
    private volatile boolean d = true;
    private final Lock e = new ReentrantLock();
    private final Condition f = this.e.newCondition();
    private static final SimpleDateFormat g;
    private BufferedWriter h;
    private BufferedWriter i;

    ahz_1() {
    }

    public void a(aha_1 aha_12) {
        this.c.offer(aha_12);
        this.b();
    }

    public void a(boolean bl) {
        this.d = bl;
        this.b();
    }

    private void b() {
        this.e.lock();
        this.f.signal();
        this.e.unlock();
    }

    private void a(String string, String string2, String string3, int n, Object object, long l) {
        this.c(string);
        StringBuilder stringBuilder = new StringBuilder().append(string2).append("|").append(string3).append("|").append(n).append("|").append(l).append("|").append(object);
        if (this.h != null) {
            try {
                this.h.write(stringBuilder.toString());
                this.h.newLine();
            }
            catch (IOException iOException) {
                b.error((Object)"Erreur durant l'\u00e9criture des donn\u00e9es");
            }
        }
        if (this.i != null) {
            try {
                this.i.write(stringBuilder.toString());
                this.i.newLine();
            }
            catch (IOException iOException) {
                b.error((Object)"Erreur durant l'\u00e9criture des donn\u00e9es");
            }
        }
    }

    private void b(String string) {
        if (this.i == null) {
            String string2 = string + "/stats-instant.log";
            File file = new File(string);
            if (!file.exists()) {
                file.mkdirs();
            }
            file = new File(string2);
            try {
                this.i = new BufferedWriter(new FileWriter(file, false), 1024);
            }
            catch (IOException iOException) {
                b.error((Object)("Impossible de cr\u00e9\u00e9r le fichier " + string2));
            }
        }
    }

    private void c(String string) {
        if (this.h == null) {
            String string2 = string + "/stats-" + g.format(new Date()) + ".log";
            File file = new File(string);
            if (!file.exists()) {
                file.mkdirs();
            }
            file = new File(string2);
            try {
                this.h = new BufferedWriter(new FileWriter(file, true), 1024);
            }
            catch (IOException iOException) {
                b.error((Object)("Impossible de cr\u00e9\u00e9r le fichier " + string2));
            }
        }
    }

    private void c() {
        if (this.i != null) {
            try {
                this.i.flush();
                this.i.close();
            }
            catch (IOException iOException) {
                b.error((Object)"Erreur durant la fermeture du log : ", (Throwable)iOException);
            }
            this.i = null;
        }
    }

    private void d() {
        if (this.h != null) {
            try {
                this.h.flush();
                this.h.close();
            }
            catch (IOException iOException) {
                b.error((Object)"Erreur durant la fermeture du log : ", (Throwable)iOException);
            }
            this.h = null;
        }
    }

    public void a(String string) {
        this.c.offer(new aha_1(string, null, null, 0, null, -1L));
    }

    public void a() {
        this.c.offer(new aha_1(null, null, null, 0, null, -2L));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        b.info((Object)"MonitoredPropertyWriter started");
        boolean bl = false;
        while (!bl) {
            aha_1 aha_12;
            block10: while ((aha_12 = this.c.poll()) != null) {
                switch ((int)aha_12.f) {
                    case -1: {
                        this.b(aha_12.a);
                        continue block10;
                    }
                    case -2: {
                        this.c();
                        continue block10;
                    }
                }
                this.a(aha_12.a, aha_12.b, aha_12.c, aha_12.d, aha_12.e, aha_12.f);
            }
            if (this.c.isEmpty()) {
                this.d();
                if (this.c.isEmpty() && this.e.tryLock()) {
                    try {
                        this.f.await();
                    }
                    catch (InterruptedException interruptedException) {
                        b.warn((Object)"Interrupted");
                    }
                    finally {
                        this.e.unlock();
                    }
                }
            }
            bl = !this.d && this.c.isEmpty();
        }
        this.c();
        b.info((Object)"MonitoredPropertyWriter terminated");
    }

    static {
        a.setName("MonitoredPropertyWriter");
        a.start();
        b = Logger.getLogger(ahz_1.class);
        g = new SimpleDateFormat("dd-MM-yyyy");
    }
}

