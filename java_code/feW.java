/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class feW {
    protected static final Logger a = Logger.getLogger(feW.class);
    protected long b;
    protected long c;
    protected String d;
    protected long e;
    protected short f;
    protected long g;
    protected final feZ h;
    protected final ffr i;
    protected final feX j;
    protected boolean k;

    protected feW(long l, long l2, String string, long l3, feZ feZ2, ffr ffr2, feX feX2) {
        this.b = l;
        this.c = l2;
        this.d = string;
        this.e = l3;
        this.h = feZ2;
        this.i = ffr2;
        this.j = feX2;
        this.k = true;
    }

    public boolean c() {
        return this.k;
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    public long d() {
        return this.b;
    }

    public void a(long l) {
        this.b = l;
    }

    public long e() {
        return this.c;
    }

    public void b(long l) {
        this.c = l;
    }

    public String f() {
        return this.d;
    }

    public void a(String string) {
        this.d = string;
    }

    public long g() {
        return this.e;
    }

    public void c(long l) {
        this.e = l;
    }

    public feZ h() {
        return this.h;
    }

    public ffr i() {
        return this.i;
    }

    public feX j() {
        return this.j;
    }

    public byte k() {
        return 0;
    }

    public short l() {
        return this.f;
    }

    public void a(short s2) {
        this.f = s2;
    }

    public long m() {
        return this.g;
    }

    public void d(long l) {
        this.g = l;
    }

    public feY a(ffq ffq2) {
        feY feY2 = this.j.a(ffq2.G(), ffq2.H());
        if (feY2 != null && feY2.a(ffq2)) {
            this.a(ffq2, feY2);
            return feY2;
        }
        return null;
    }

    public boolean a(ffq ffq2, int n, int n2) {
        feY feY2 = this.j.a(n, n2);
        return feY2 != null && feY2.a(ffq2, n, n2);
    }

    public boolean b(ffq ffq2) {
        feY feY2 = this.j.a(ffq2.G(), ffq2.H());
        if (feY2 != null && feY2.b(ffq2)) {
            this.b(ffq2, feY2);
            return true;
        }
        return false;
    }

    public boolean a(us_2 us_22) {
        us_22.h = this.f;
        us_22.i = this.g;
        for (feY feY2 : this.j) {
            uu_2 uu_22 = new uu_2();
            feY2.a(uu_22.a, true);
            us_22.a.add(uu_22);
        }
        return true;
    }

    public boolean a(un_2 un_22, boolean bl) {
        un_22.b = this.c;
        un_22.c = this.d;
        un_22.d = this.e;
        un_22.e = this.f;
        un_22.f = this.g;
        for (feY feY2 : this.j) {
            up_1 up_12 = new up_1();
            if (!feY2.a(up_12.a, false)) {
                a.error((Object)("Erreur durant la s\u00e9rialisation de la salle " + feY2.b() + " du sac " + this));
                return false;
            }
            un_22.g.add(up_12);
        }
        return true;
    }

    public boolean b(us_2 us_22) {
        feY feY2;
        this.f = us_22.h;
        this.g = us_22.i;
        this.j.b();
        if (us_22.a.isEmpty()) {
            a.error((Object)("Pas de pi\u00e8ce ... probl\u00e8me de d\u00e9-serialisation du sac " + this));
        }
        for (uu_2 uu_22 : us_22.a) {
            try {
                feY2 = this.h.a();
                this.j.a(uu_22.a.a, feY2);
                if (feY2.b(uu_22.a, false)) continue;
                a.error((Object)("Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es d'une pi\u00e8ce du sac " + this));
            }
            catch (Exception exception) {
                a.error((Object)("Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es d'une pi\u00e8ce du sac " + uu_22), (Throwable)exception);
            }
        }
        try {
            this.j.a(this.h);
        }
        catch (Exception exception) {
            a.error((Object)("Erreur durant l'update des donn\u00e9es d'une pi\u00e8ce du sac " + this), (Throwable)exception);
        }
        for (uu_2 uu_22 : us_22.a) {
            try {
                feY2 = this.j.a(uu_22.a.a);
                if (feY2.b(uu_22.a, true)) continue;
                a.error((Object)("Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es d'une pi\u00e8ce du sac " + this));
            }
            catch (Exception exception) {
                a.error((Object)("Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es d'une pi\u00e8ce du sac " + uu_22), (Throwable)exception);
            }
        }
        return true;
    }

    public boolean a(un_2 un_22) {
        feY feY2;
        this.b = un_22.a;
        this.c = un_22.b;
        this.d = un_22.c;
        this.e = un_22.d;
        this.f = un_22.e;
        this.g = un_22.f;
        this.j.b();
        for (up_1 up_12 : un_22.g) {
            feY2 = this.h.a();
            this.j.a(up_12.a.a, feY2);
            if (feY2.b(up_12.a, false)) continue;
            a.error((Object)("Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es d'une pi\u00e8ce du sac " + this));
            return false;
        }
        this.j.a(this.h);
        for (up_1 up_12 : un_22.g) {
            feY2 = this.j.a(up_12.a.a);
            if (feY2.b(up_12.a, true)) continue;
            a.error((Object)("Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es d'une pi\u00e8ce du sac " + this));
            return false;
        }
        return true;
    }

    protected void a(ffq ffq2, feY feY2) {
    }

    protected void b(ffq ffq2, feY feY2) {
    }

    public abstract void a(yx_0 var1);
}

