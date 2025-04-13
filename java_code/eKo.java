/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

public final class eKo {
    protected static final Logger a;
    private static ys_0[] b;
    private static ys_0[] c;
    private up_0 d;
    private tg_0 e;
    private yv_0 f;
    private final eKm g;
    private final aff_1 h;
    private final int i;
    private final So<efh_0> j;
    private int k;
    private int l;
    private boolean m;
    private int n = 0;

    public eKo(eKm eKm2, aff_1 aff_12, int n, So<efh_0> so) {
        this.g = eKm2;
        this.h = aff_12;
        this.i = n;
        this.j = so;
        if (this.j != null) {
            this.e = this.j.e();
        }
    }

    private boolean b() {
        this.c();
        return this.e() && this.d();
    }

    private void c() {
        this.d = new up_0();
        this.d.a(this.g.W(), this.g.X(), this.g.fV(), true);
    }

    private boolean d() {
        int n = this.g.G();
        int n2 = this.g.H();
        short s2 = this.g.I();
        int n3 = this.f.a(n, n2, b, 0);
        short s3 = yu_0.a(0, n3, b, s2);
        if (s3 == Short.MIN_VALUE) {
            a.error((Object)("Unable to find the cell (" + n + "; " + n2 + ") with z value = " + s2));
            return false;
        }
        return true;
    }

    private boolean e() {
        int n = this.g.G();
        int n2 = this.g.H();
        this.f = this.e.n(n, n2);
        if (this.f == null) {
            a.error((Object)("The cell (" + n + "; " + n2 + ") is not in the fightMap"));
            return false;
        }
        return true;
    }

    public eKn a() {
        if (!this.b()) {
            a.error((Object)"Impossible d'initialiser correctement le computer");
            return null;
        }
        int n = this.g.G();
        int n2 = this.g.H();
        short s2 = this.g.I();
        int n3 = 0;
        aej_2 aej_22 = this.f();
        eKn eKn2 = new eKn();
        if (aej_22.m == 0 && aej_22.n == 0) {
            eKn2.a(n, n2, s2);
            return eKn2;
        }
        this.k = this.f.a(n, n2, c, 0);
        for (int k = 0; k < this.i; ++k) {
            eKl eKl2 = this.a(n += aej_22.m, n2 += aej_22.n, s2, eKn2);
            this.h();
            if (eKl2.b()) break;
            if (eKl2.d()) {
                eKn2.a(true);
                eKn2.a(eKl2.e());
                break;
            }
            int n4 = eKl2.c() - s2;
            if (n4 < 0) {
                n3 -= n4;
            }
            eKn2.b(k + 1);
            eKn2.a(n3);
            s2 = eKl2.c();
            eKn2.a(n, n2, s2);
            if (this.b(n, n2)) break;
        }
        return eKn2;
    }

    private eKl a(int n, int n2, short s2, eKn eKn2) {
        int n3 = this.g.X();
        for (int k = -n3; k <= n3; ++k) {
            for (int i2 = -n3; i2 <= n3; ++i2) {
                eKl eKl2 = this.a(n + k, n2 + i2, s2, false);
                if (eKl2.b()) {
                    return eKl2;
                }
                if (!eKl2.d()) continue;
                eKn2.a(true);
                eKn2.a(eKl2.e());
                return eKl2;
            }
        }
        return this.a(n, n2, s2, true);
    }

    private aej_2 f() {
        if (!this.m) {
            return new afs_2(this.g.G(), this.g.H(), this.g.I(), this.h.d(), this.h.e(), this.h.f()).h();
        }
        return new afs_2(this.h.d(), this.h.e(), this.h.f(), this.g.G(), this.g.H(), this.g.I()).h();
    }

    private eKl a(int n, int n2, short s2, boolean bl) {
        List<sr_0> list;
        eKl eKl2 = new eKl();
        eKl2.a(false);
        eKl2.b(false);
        if (!this.a(n, n2)) {
            a.error((Object)("The cell (" + n + "; " + n2 + ") is not in the fightMap"));
            eKl2.b(true);
            return eKl2;
        }
        if (!this.e.c(n, n2)) {
            eKl2.c(true);
            return eKl2;
        }
        int n3 = this.f.a(n, n2, c, 0);
        if (!this.a(n3, s2)) {
            eKl2.c(true);
            return eKl2;
        }
        eKl2.a(this.g());
        if (bl) {
            this.k = n3;
        }
        if (this.g.ab() && this.e.a(n, n2, s2)) {
            ti_0 ti_02 = this.e.g(n, n2);
            if (ti_02 instanceof Su && ti_02 != this.g) {
                eKl2.a(ti_02);
                eKl2.c(true);
            } else if (!(ti_02 instanceof Su)) {
                eKl2.c(true);
            }
            return eKl2;
        }
        if (this.g instanceof ekh_0 && !(list = this.j.g().a(n, n2, ele_0.j.a())).isEmpty()) {
            eKl2.c(true);
            return eKl2;
        }
        eKl2.a(true);
        return eKl2;
    }

    private boolean a(int n, short s2) {
        short s3 = yu_0.a(this.l, this.k, b, s2);
        if (s3 == Short.MIN_VALUE) {
            a.error((Object)"Pas d'altitude valide trouv\u00e9e pour la prochaine cellule");
            return false;
        }
        int n2 = this.d.a(s3 + this.l, this.l, this.k, b, 0, n, c);
        if (n2 <= 0) {
            return false;
        }
        short s4 = eKo.c[this.d.a[0]].c;
        return this.n <= 0 || s4 - s2 <= this.n;
    }

    private short g() {
        return eKo.c[this.d.a[0]].c;
    }

    private void h() {
        ys_0[] ys_0Array = b;
        b = c;
        c = ys_0Array;
        this.l = this.d.a[0];
    }

    private boolean a(int n, int n2) {
        if (this.f.b(n, n2)) {
            return true;
        }
        this.f = this.e.n(n, n2);
        return this.f != null;
    }

    private boolean b(int n, int n2) {
        return this.h.b(n, n2);
    }

    public void a(boolean bl) {
        this.m = bl;
    }

    public void a(int n) {
        this.n = n;
    }

    static {
        int n;
        a = Logger.getLogger(eKo.class);
        b = new ys_0[32];
        for (n = 0; n < b.length; ++n) {
            eKo.b[n] = new ys_0();
        }
        c = new ys_0[32];
        for (n = 0; n < c.length; ++n) {
            eKo.c[n] = new ys_0();
        }
    }
}

