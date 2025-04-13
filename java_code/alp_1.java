/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/*
 * Renamed from aLP
 */
public class alp_1
extends all_1 {
    private static final byte i = 8;
    private final LinkedList<amj_1> j = new LinkedList();
    private final Object k = new Object();
    private final ArrayList<amj_1> l = new ArrayList(5);
    private final ArrayList<amj_1> m = new ArrayList(5);
    private alj_1 n = null;
    private final byte o = (byte)8;

    public alp_1(String string) {
        super(string);
    }

    public alp_1(String string, byte by) {
        super(string, by);
    }

    public alp_1(String string, byte by, byte by2) {
        super(string, by, by2);
    }

    @Override
    public Collection<amj_1> r() {
        return this.j;
    }

    @Override
    public amj_1 a(amx_1 amx_12, boolean bl, boolean bl2, boolean bl3, long l) {
        amj_1 amj_12 = this.a(amx_12, -1L);
        if (amj_12 == null) {
            a.debug((Object)("Impossible d'initialiser une source audio : " + amx_12.g()));
            return null;
        }
        if (this.a(amj_12, true, true, bl3)) {
            return amj_12;
        }
        return null;
    }

    @Override
    public void a(amj_1 amj_12) {
        this.a(amj_12, true, true, amj_12.g());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private synchronized boolean a(amj_1 amj_12, boolean bl, boolean bl2, boolean bl3) {
        if (amj_12 == null) {
            a.error((Object)"On ne peut pas jouer une source nulle");
            return false;
        }
        amj_12.h(this.a());
        amj_12.d(this.n());
        amj_12.b(bl3);
        if (this.e != 0) {
            amj_12.b(this.e);
        }
        if (this.f) {
            amj_12.c(true);
            amj_12.d(0);
        }
        Object object = this.k;
        synchronized (object) {
            if (this.j.size() > 8) {
                ams_1.a(amj_12);
                return false;
            }
            try {
                amj_12.k();
            }
            catch (Exception exception) {
                a.error((Object)"Erreur durant la lecture de la source", (Throwable)exception);
                ams_1.a(amj_12);
                return false;
            }
            this.l.add(amj_12);
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void s() {
        Object object = this.k;
        synchronized (object) {
            int n = this.l.size();
            for (int k = 0; k < n; ++k) {
                amj_1 amj_12 = this.l.get(k);
                this.j.add(amj_12);
            }
            this.l.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void f(float f2) {
        Object object = this.k;
        synchronized (object) {
            float f3 = this.a();
            for (amj_1 amj_12 : this.j) {
                amj_12.h(f3);
            }
        }
    }

    @Override
    public void b(float f2, float f3) {
    }

    @Override
    public void c(float f2, float f3) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(boolean bl, boolean bl2) {
        Object object = this.k;
        synchronized (object) {
            for (amj_1 amj_12 : this.j) {
                amj_12.d(bl2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public synchronized void a(long l) {
        super.a(l);
        Object object = this.k;
        synchronized (object) {
            int n;
            int n2 = 0;
            if (this.b != null) {
                n2 = this.b.d();
            }
            int n3 = this.j.size();
            for (n = 0; n < n3; ++n) {
                amj_1 amj_12 = this.j.get(n);
                switch (amj_12.b(l)) {
                    case 1: 
                    case 3: {
                        this.m.add(amj_12);
                        ams_1.a(amj_12);
                    }
                }
            }
            n = this.m.size();
            for (int k = 0; k < n; ++k) {
                this.j.remove(this.m.get(k));
            }
            if (n > 0 && this.j.size() == 0 && this.n != null) {
                this.n.b();
            }
            this.m.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void t() {
        Object object = this.k;
        synchronized (object) {
            int n = this.j.size();
            for (int k = 0; k < n; ++k) {
                ams_1.a(this.j.get(k));
            }
            this.j.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(amj_1 amj_12) {
        Object object = this.k;
        synchronized (object) {
            boolean bl = this.j.remove(amj_12);
            if (bl) {
                ams_1.a(amj_12);
            }
        }
    }

    @Override
    public synchronized boolean c(int n) {
        int n2;
        if (!super.c(n)) {
            return false;
        }
        int n3 = this.j.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.j.get(n2).b(n);
        }
        n3 = this.l.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.l.get(n2).b(n);
        }
        return true;
    }

    public void a(alj_1 alj_12) {
        this.n = alj_12;
    }

    public void g(float f2) {
        if (this.n != null) {
            this.n.a(f2);
        }
    }

    public void h(float f2) {
        if (this.n != null) {
            this.n.b(f2);
        }
    }

    public void x() {
        if (this.n != null) {
            this.n.c();
            this.n.d();
        }
    }
}

