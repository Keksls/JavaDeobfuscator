/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public abstract class ahy
implements ahk_0 {
    public static int[] a;
    private boolean b = true;
    private boolean c = true;
    private ahg_0 d;
    private final acy_2<ach_2<ahB>> e = new acy_2();
    private ahD f;
    final ArrayList<ahA> g = new ArrayList();

    protected ahy() {
    }

    public void a(ahD ahD2) {
        this.f = ahD2;
    }

    public void a(ahg_0 ahg_02) {
        this.d = ahg_02;
    }

    public boolean a() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    protected void a(int n, long l, ahh_0 ahh_02) {
        ach_2<ahB> ach_22 = this.e.g(n);
        if (ach_22 == null) {
            return;
        }
        ahB ahB2 = ach_22.e(l);
        if (ahB2 == null) {
            return;
        }
        ahB2.a(ahh_02);
    }

    public boolean a(int n, long l) {
        ach_2<ahB> ach_22 = this.e.g(n);
        return ach_22 != null && ach_22.c(l);
    }

    public boolean a(int n) {
        ach_2<ahB> ach_22 = this.e.g(n);
        return ach_22 != null && ach_22.d() != 0;
    }

    public void a(int n, long l, int n2, int n3, int n4, Object object, ahC ahC2, boolean bl) {
        this.b();
        this.b(n, l, n2, n3, n4, object, ahC2, bl);
    }

    private void b(int n, long l, int n2, int n3, int n4, Object object, ahC ahC2, boolean bl) {
        ahB ahB2;
        ach_2<ahB> ach_22 = this.e.g(n);
        if (ach_22 == null) {
            ach_22 = new ach_2();
            this.e.a(n, ach_22);
        }
        if ((ahB2 = ach_22.e(l)) != null) {
            this.a(ahB2, n2, n3, n4, false);
            ahB2.a(object);
        } else {
            ahB2 = this.a(n, this.f, object, a[n], n2, n3, n4, bl);
            ahB2.a();
            this.a(ahB2, n2, n3, n4, true);
            ach_22.a(l, ahB2);
        }
        ahB2.a(ahC2);
    }

    protected abstract ahB a(int var1, ahD var2, Object var3, int var4, int var5, int var6, int var7, boolean var8);

    public void a(int n, long l, int n2, int n3, int n4) {
        ach_2<ahB> ach_22 = this.e.g(n);
        if (ach_22 == null) {
            return;
        }
        ahB ahB2 = ach_22.e(l);
        if (ahB2 == null) {
            return;
        }
        this.a(ahB2, n2, n3, n4, false);
    }

    void a(ahB ahB2, int n, int n2, int n3, boolean bl) {
        if (this.d == null) {
            this.g.add(new ahz(this, ahB2, n, n2, n3, bl));
            return;
        }
        float f2 = this.d.c(n, n2);
        float f3 = this.d.a(n, n2, n3);
        if (bl) {
            ahB2.a(n, n2, n3);
            ahB2.a((int)f2, (int)f3);
        } else {
            ahB2.b(n, n2, n3);
            ahB2.b((int)f2, (int)f3);
        }
    }

    public void b(int n, long l) {
        ach_2<ahB> ach_22 = this.e.g(n);
        if (ach_22 == null) {
            return;
        }
        ahB ahB2 = ach_22.d(l);
        if (ahB2 != null) {
            ahB2.t();
        }
    }

    public void b(int n) {
        ach_2<ahB> ach_22 = this.e.g(n);
        if (ach_22 == null) {
            return;
        }
        for (int k = ach_22.d() - 1; k >= 0; --k) {
            ach_22.c(k).t();
        }
        ach_22.c();
    }

    public void b() {
        int n = this.e.d();
        for (int k = 0; k < n; ++k) {
            this.b(this.e.e(k));
        }
        this.e.c();
    }

    public void a(ahg_0 ahg_02, int n) {
        ahg_0 ahg_03 = this.d;
        this.d = ahg_02;
        if (ahg_03 == null && this.d != null) {
            this.c();
        }
        boolean bl = false;
        if (this.c != this.b) {
            this.b = this.c;
            if (this.b) {
                bl = true;
            } else {
                int n2 = this.e.d();
                for (int k = 0; k < n2; ++k) {
                    ach_2<ahB> ach_22 = this.e.h(k);
                    int n3 = ach_22.d();
                    for (int i2 = 0; i2 < n3; ++i2) {
                        ach_22.c(i2).t();
                    }
                }
            }
        }
        if (this.b) {
            this.a(ahg_02, n, bl);
        }
    }

    private void c() {
        for (int k = this.g.size() - 1; k >= 0; --k) {
            this.g.get(k).a();
        }
    }

    private void a(ahg_0 ahg_02, int n, boolean bl) {
        ahq_0 ahq_02 = ahg_02.s();
        ahh_0 ahh_02 = ahq_02.u();
        int n2 = this.e.d();
        for (int k = 0; k < n2; ++k) {
            ach_2<ahB> ach_22 = this.e.h(k);
            for (int i2 = ach_22.d() - 1; i2 >= 0; --i2) {
                int n3;
                ahB ahB2 = ach_22.c(i2);
                int n4 = n3 = ahB2.g() ? Short.MIN_VALUE : (int)yz_0.d(ahB2.h(), ahB2.i(), (short)ahB2.j());
                if (n3 == Short.MIN_VALUE) {
                    n3 = (short)ahB2.j();
                }
                this.a(ahB2, ahB2.h(), ahB2.i(), n3, false);
                ahB2.a(n);
                float f2 = ahh_02.J() - (float)ahB2.h();
                float f3 = ahh_02.K() - (float)ahB2.i();
                float f4 = afq_2.c(f2, f3);
                if (f4 < 4.0f) {
                    this.b();
                    return;
                }
                int n5 = ahB2.b();
                int n6 = ahB2.c();
                boolean bl2 = ahq_02.a(n6, n5, n6, n5);
                ahB2.a(bl2, bl);
            }
        }
    }

    public void a(ahg_0 ahg_02, float f2, float f3) {
    }
}

