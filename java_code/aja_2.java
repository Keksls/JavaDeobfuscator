/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Renamed from aJa
 */
public class aja_2
implements ajd_2 {
    final ais_2 a;
    final ajg_2 b;
    Integer c = 0;
    static final long d = 1000L;
    static final int e = 24;
    static final int f = 4;
    int g = 0;
    private long l;
    private long m;
    final HashMap<aiu_2, Long> h = new HashMap();
    final HashMap<aiu_2, Long> i = new HashMap();
    public final List<aiu_2> j = new ArrayList<aiu_2>();
    private final Timer n = new Timer(true);
    private final byte[] o;
    private final List<Integer> p;
    private boolean q = false;
    private final aiq_2 r;
    private ajl_1 s;
    protected static final Logger k = Logger.getLogger("com.ankamagames.framework.net.torrent.peer");

    public aja_2(byte[] byArray, ais_2 ais_22, ajg_2 ajg_22, aiq_2 aiq_22) {
        this.o = byArray;
        this.a = ais_22;
        this.b = ajg_22;
        this.r = aiq_22;
        this.p = new ArrayList<Integer>();
        ain_2 ain_22 = ajg_22.e();
        for (int k = 0; k < ais_22.h(); ++k) {
            if (ain_22.b(k)) continue;
            this.p.add(k);
        }
        Collections.shuffle(this.p);
        this.n.schedule((TimerTask)new aix_2(this), 1000L, 1000L);
    }

    public void a(ajl_1 ajl_12) {
        this.s = ajl_12;
    }

    public byte[] a() {
        return this.o;
    }

    public boolean b() {
        return this.b.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int c() {
        List<aiu_2> list = this.j;
        synchronized (list) {
            return this.j.size();
        }
    }

    public List<aiu_2> d() {
        return this.j;
    }

    public long e() {
        return this.b.c() * this.a.a(0);
    }

    public long f() {
        return this.l;
    }

    public long g() {
        return this.m;
    }

    public ais_2 h() {
        return this.a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean i() {
        List<aiu_2> list = this.j;
        synchronized (list) {
            return !this.q && this.j.size() < 24;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void j() {
        this.q = true;
        List<aiu_2> list = this.j;
        synchronized (list) {
            this.n.cancel();
            Iterator<aiu_2> iterator = this.j.iterator();
            while (iterator.hasNext()) {
                aiu_2 aiu_22 = iterator.next();
                aiu_22.c();
                iterator.remove();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(aiu_2 aiu_22) {
        if (this.q) {
            aiu_22.a(false);
            return;
        }
        List<aiu_2> list = this.j;
        synchronized (list) {
            if (aja_2.a(aiu_22.a(), this.j)) {
                k.log(Level.FINER, "Already connected to: " + aiu_22);
                aiu_22.a(false);
            } else {
                k.log(Level.FINER, "New connection to peer: " + aiu_22);
                this.j.add(0, aiu_22);
                this.k();
                if (this.r != null) {
                    this.r.a(this, aiu_22, aiw_2.a, 0L);
                }
            }
        }
    }

    private static boolean a(ajc_2 ajc_22, List list) {
        for (Object e2 : list) {
            if (!ajc_22.a(((aiu_2)e2).a())) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(aiu_2 aiu_22) {
        boolean bl;
        if (this.q) {
            aiu_22.a(false);
            return;
        }
        Object object = this.j;
        synchronized (object) {
            bl = !aiu_22.b() && this.j.size() < 24;
        }
        if (bl) {
            object = this;
            ain_2 ain_22 = this.b.e();
            ajb_2 ajb_22 = new ajb_2(this, aiu_22, (ajd_2)object, ain_22);
            String string = aiu_22.toString();
            new Thread((Runnable)ajb_22, string).start();
        } else if (k.getLevel().intValue() <= Level.FINER.intValue()) {
            if (aiu_22.b()) {
                k.log(Level.FINER, "Add peer already connected: " + aiu_22);
            } else {
                k.log(Level.FINER, "MAX_CONNECTIONS = 24 not accepting extra peer: " + aiu_22);
            }
        }
    }

    void k() {
        LinkedList<aiu_2> linkedList = new LinkedList<aiu_2>();
        for (aiu_2 aiu_22 : this.j) {
            if (this.g >= 4 || !aiu_22.f() || !aiu_22.d()) continue;
            if (!aiu_22.g()) {
                linkedList.add(0, aiu_22);
                continue;
            }
            linkedList.add(aiu_22);
        }
        while (this.g < 4 && linkedList.size() > 0) {
            aiu_2 aiu_23 = (aiu_2)linkedList.remove(0);
            k.log(Level.FINER, "Unchoke: " + (aiu_2)aiu_23);
            aiu_23.c(false);
            ++this.g;
            this.j.remove(aiu_23);
            this.j.add(aiu_23);
        }
    }

    public byte[] l() {
        return this.b.e().a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(aiu_2 aiu_22, int n) {
        List<Integer> list = this.p;
        synchronized (list) {
            return this.p.contains(n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(aiu_2 aiu_22, ain_2 ain_22) {
        List<Integer> list = this.p;
        synchronized (list) {
            for (Integer n : this.p) {
                if (!ain_22.b(n)) continue;
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int b(aiu_2 aiu_22, ain_2 ain_22) {
        if (this.q) {
            return -1;
        }
        List<Integer> list = this.p;
        synchronized (list) {
            Integer n = null;
            Iterator<Integer> iterator = this.p.iterator();
            while (n == null && iterator.hasNext()) {
                Integer n2 = iterator.next();
                if (!ain_22.b(n2)) continue;
                iterator.remove();
                n = n2;
            }
            if (n == null) {
                return -1;
            }
            this.p.add(n);
            return n;
        }
    }

    @Override
    public byte[] b(aiu_2 aiu_22, int n) {
        if (this.q) {
            return null;
        }
        try {
            return this.b.a(n);
        }
        catch (IOException iOException) {
            ajj_2.a("Error reading storage", iOException);
            return null;
        }
    }

    @Override
    public void c(aiu_2 aiu_22, int n) {
        if (this.s.c() != null) {
            try {
                this.c = this.c + n;
                if ((long)this.c.intValue() >= this.s.c().l() / (long)this.j.size()) {
                    int n2 = (int)this.s.c().l();
                    if (n2 < 5000) {
                        n2 = 5000;
                    }
                    Thread.sleep(this.c / n2 * 1000);
                    this.c = this.s.c().l() > (long)n ? Integer.valueOf(this.c - (int)this.s.c().l()) : Integer.valueOf(0);
                }
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        this.l += (long)n;
        if (this.r != null) {
            this.r.a(this, aiu_22, aiw_2.c, n);
        }
    }

    @Override
    public void d(aiu_2 aiu_22, int n) {
        this.m += (long)n;
        if (this.r != null) {
            this.r.a(this, aiu_22, aiw_2.d, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(aiu_2 aiu_22, int n, byte[] byArray) {
        if (this.q) {
            return true;
        }
        List<Comparable<Integer>> list = this.p;
        synchronized (list) {
            if (!this.p.contains(n)) {
                k.log(Level.FINER, aiu_22 + " piece " + n + " no longer needed");
                return true;
            }
            try {
                if (!this.b.a(n, byArray)) {
                    this.m -= (long)this.a.a(n);
                    k.log(Level.INFO, "Got BAD piece " + n + " from " + aiu_22);
                    return false;
                }
                k.log(Level.FINER, "Recv p" + n + " " + aiu_22);
            }
            catch (IOException iOException) {
                ajj_2.a("Error writing storage", iOException);
            }
            this.p.remove((Object)n);
        }
        list = this.j;
        synchronized (list) {
            for (aiu_2 aiu_23 : this.j) {
                if (!aiu_23.b()) continue;
                aiu_23.a(n);
            }
        }
        if (this.b()) {
            this.s.interrupt();
        }
        return true;
    }

    @Override
    public void a(aiu_2 aiu_22, boolean bl) {
        k.log(Level.FINER, "Got choke(" + bl + "): " + aiu_22);
        if (this.r != null) {
            this.r.a(this, aiu_22, aiw_2.e, 0L);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(aiu_2 aiu_22, boolean bl) {
        if (bl) {
            List<aiu_2> list = this.j;
            synchronized (list) {
                if (this.g < 4 && aiu_22.f()) {
                    ++this.g;
                    aiu_22.c(false);
                    k.log(Level.FINER, "Unchoke: " + aiu_22);
                }
            }
        }
        if (this.r != null) {
            this.r.a(this, aiu_22, aiw_2.f, 0L);
        }
    }

    public List<Integer> m() {
        return this.p;
    }

    public long n() {
        return this.b.c();
    }

    public long o() {
        return this.b.g();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void c(aiu_2 aiu_22) {
        k.log(Level.FINER, "Disconnected " + aiu_22);
        List<aiu_2> list = this.j;
        synchronized (list) {
            if (this.h.containsKey(aiu_22)) {
                this.h.remove(aiu_22);
            }
            if (this.i.containsKey(aiu_22)) {
                this.i.remove(aiu_22);
            }
            if (this.j.remove(aiu_22)) {
                this.k();
            }
        }
        if (this.r != null) {
            this.r.a(this, aiu_22, aiw_2.b, 0L);
        }
    }

    public ais_2 p() {
        return this.a;
    }

    public long q() {
        long l = 0L;
        for (long l2 : this.h.values()) {
            l += l2;
        }
        return l;
    }

    public long r() {
        long l = 0L;
        for (long l2 : this.i.values()) {
            l += l2;
        }
        return l;
    }
}

