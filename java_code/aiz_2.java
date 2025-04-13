/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Renamed from aIZ
 */
class aiz_2
implements Runnable {
    private final aiu_2 b;
    private final DataOutputStream c;
    private final Thread d;
    private boolean e;
    private final List<air_2> f = new ArrayList<air_2>();
    protected static final Logger a = Logger.getLogger("com.ankamagames.framework.net.torrent.peer");

    public aiz_2(aiu_2 aiu_22, DataOutputStream dataOutputStream) {
        this.b = aiu_22;
        this.c = dataOutputStream;
        this.e = false;
        this.d = new Thread((Runnable)this, "Torrent-PerConnectionOut");
        this.d.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            while (!this.e) {
                aje_2 aje_22;
                air_2 air_22 = null;
                List<air_2> list = this.f;
                synchronized (list) {
                    while (!this.e && this.f.isEmpty()) {
                        try {
                            this.c.flush();
                            this.f.wait();
                        }
                        catch (InterruptedException interruptedException) {}
                    }
                    aje_22 = this.b.a;
                    if (!this.e && aje_22 != null) {
                        Iterator<air_2> iterator = this.f.iterator();
                        while (air_22 == null && iterator.hasNext()) {
                            air_2 air_23 = iterator.next();
                            if (air_23.k == 7) {
                                if (aje_22.e) {
                                    iterator.remove();
                                }
                                air_23 = null;
                            } else if (air_23.k == 6 && aje_22.g) {
                                iterator.remove();
                                air_23 = null;
                            }
                            if (air_22 != null || air_23 == null) continue;
                            air_22 = air_23;
                            iterator.remove();
                        }
                        if (air_22 == null && this.f.size() > 0) {
                            air_22 = this.f.remove(0);
                        }
                    }
                }
                if (air_22 == null) continue;
                a.log(Level.ALL, "Send " + this.b + ": " + air_22);
                air_22.a(this.c);
                if (air_22.k == 0) {
                    this.b(7);
                }
                if (air_22.k != 7) continue;
                aje_22.b(air_22.q);
            }
        }
        catch (IOException iOException) {
        }
        catch (Throwable throwable) {
            a.log(Level.SEVERE, this.b + " failed", throwable);
        }
        finally {
            this.e = true;
            this.b.c();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        List<air_2> list = this.f;
        synchronized (list) {
            if (this.e) {
                return;
            }
            this.e = true;
            this.d.interrupt();
            this.f.clear();
            this.f.notify();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(air_2 air_22) {
        List<air_2> list = this.f;
        synchronized (list) {
            this.f.add(air_22);
            this.f.notify();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean b(int n) {
        boolean bl = false;
        List<air_2> list = this.f;
        synchronized (list) {
            Iterator<air_2> iterator = this.f.iterator();
            while (iterator.hasNext()) {
                air_2 air_22 = iterator.next();
                if (air_22.k != n) continue;
                iterator.remove();
                bl = true;
            }
        }
        return bl;
    }

    void b() {
        air_2 air_22 = new air_2();
        air_22.k = (byte)-1;
        this.a(air_22);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(boolean bl) {
        List<air_2> list = this.f;
        synchronized (list) {
            int n;
            int n2 = n = bl ? 1 : 0;
            if (!this.b(n)) {
                air_2 air_22 = new air_2();
                air_22.k = bl ? (byte)0 : 1;
                this.a(air_22);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(boolean bl) {
        List<air_2> list = this.f;
        synchronized (list) {
            int n;
            int n2 = n = bl ? 3 : 2;
            if (!this.b(n)) {
                air_2 air_22 = new air_2();
                air_22.k = bl ? (byte)2 : (byte)3;
                this.a(air_22);
            }
        }
    }

    void a(int n) {
        air_2 air_22 = new air_2();
        air_22.k = (byte)4;
        air_22.l = n;
        this.a(air_22);
    }

    void a(ain_2 ain_22) {
        air_2 air_22 = new air_2();
        air_22.k = (byte)5;
        air_22.o = ain_22.a();
        air_22.p = 0;
        air_22.q = air_22.o.length;
        this.a(air_22);
    }

    void a(List list) {
        for (Object e2 : list) {
            ajf_2 ajf_22 = (ajf_2)e2;
            this.a(ajf_22);
        }
    }

    void a(ajf_2 ajf_22) {
        air_2 air_22 = new air_2();
        air_22.k = (byte)6;
        air_22.l = ajf_22.a;
        air_22.m = ajf_22.c;
        air_22.n = ajf_22.d;
        this.a(air_22);
    }

    void a(int n, int n2, int n3, byte[] byArray) {
        air_2 air_22 = new air_2();
        air_22.k = (byte)7;
        air_22.l = n;
        air_22.m = n2;
        air_22.n = n3;
        air_22.o = byArray;
        air_22.p = n2;
        air_22.q = n3;
        this.a(air_22);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(ajf_2 ajf_22) {
        Object object = this.f;
        synchronized (object) {
            Iterator<air_2> iterator = this.f.iterator();
            while (iterator.hasNext()) {
                air_2 air_22 = iterator.next();
                if (air_22.k != 6 || air_22.l != ajf_22.a || air_22.m != ajf_22.c || air_22.n != ajf_22.d) continue;
                iterator.remove();
            }
        }
        object = new air_2();
        ((air_2)object).k = (byte)8;
        ((air_2)object).l = ajf_22.a;
        ((air_2)object).m = ajf_22.c;
        ((air_2)object).n = ajf_22.d;
        this.a((air_2)object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(int n, int n2, int n3) {
        List<air_2> list = this.f;
        synchronized (list) {
            Iterator<air_2> iterator = this.f.iterator();
            while (iterator.hasNext()) {
                air_2 air_22 = iterator.next();
                if (air_22.k != 7 || air_22.l != n || air_22.m != n2 || air_22.n != n3) continue;
                iterator.remove();
            }
        }
    }
}

