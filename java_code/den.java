/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class den {
    private static boolean b = false;
    private ahz_0 c;
    private ahv_0 d;
    private final ArrayList<deo> e = new ArrayList(1);
    public static final den a = new den();

    private den() {
    }

    public void a(ahv_0 ahv_02) {
        this.d = ahv_02;
        if (this.c != null) {
            this.c.a(ahv_02);
        }
    }

    public void a(deo deo2) {
        if (!this.e.contains(deo2)) {
            this.e.add(deo2);
        }
    }

    public void a() {
        this.e.clear();
    }

    public void b(deo deo2) {
        this.e.remove(deo2);
    }

    public boolean a(adt_1 adt_12) {
        if (!den.f()) {
            if (this.c != null) {
                this.c = null;
            }
            return true;
        }
        switch (adt_12.a()) {
            case 18907: {
                dhL dhL2 = (dhL)adt_12;
                int n = dhL2.r();
                int n2 = dhL2.s();
                if (this.c != null) {
                    this.c.a(n, n2);
                } else {
                    bvx_2 bvx_22;
                    bvx_2 bvx_23 = bvx_22 = azu_0.j().k().dn() ? cYX.c.g() : cyp_0.g().n();
                    if (bvx_22 == null) {
                        return false;
                    }
                    if (cuy_0.a(n, n2, bvx_22)) {
                        this.a(n, n2);
                    }
                }
                return false;
            }
            case 16119: {
                this.d();
                return true;
            }
        }
        return true;
    }

    private static boolean f() {
        if (dhL.u()) {
            return true;
        }
        return b;
    }

    public static boolean b() {
        return b;
    }

    public void c() {
        this.d();
        this.e.clear();
    }

    public void d() {
        abY abY2 = this.g();
        abY2.a(new aia_0());
        abY2.a(aiu.b);
        this.c = null;
        b = false;
        for (int k = 0; k < this.e.size(); ++k) {
            this.e.get(k).b();
        }
    }

    private void a(int n, int n2) {
        abY abY2 = this.g();
        this.c = new ahz_0(abY2, n, n2);
        this.c.a(this.d);
        abY2.a(this.c);
        abY2.a(aiu.b);
        for (int k = 0; k < this.e.size(); ++k) {
            this.e.get(k).a();
        }
    }

    private abY g() {
        aNF aNF2 = (aNF)ans_0.D().c();
        return aNF2.b();
    }

    public static void e() {
        b = !b;
    }
}

