/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bGA
 */
public final class bga_0
implements bgz_1 {
    private final aff_1 a = new aff_1();
    boolean b;
    private Runnable c;
    private final bFZ d;

    public bga_0(bFZ bFZ2) {
        this.d = bFZ2;
    }

    @Override
    public boolean a() {
        return this.b;
    }

    @Override
    public aff_1 b() {
        return this.a;
    }

    @Override
    public void c() {
        this.b = true;
        this.a.g(this.d.P_());
        this.h();
    }

    private void h() {
        this.d.aI_();
    }

    @Override
    public void a(int n, int n2, short s2) {
        this.a.c(n, n2, s2);
        this.h();
    }

    @Override
    public void d() {
        cnI cnI2 = new cnI();
        cnI2.a(this.d.a_());
        cnI2.a(this.a);
        cnI2.b(this.d.F().a());
        azu_0.j().K().c(cnI2);
        this.c = new bgb_0(this);
        ado_1.a().a(this.c, 1000L, 1);
        this.h();
    }

    @Override
    public void e() {
        this.a.c();
        this.b = false;
        this.h();
    }

    @Override
    public void f() {
        if (this.c != null) {
            ado_1.a().b(this.c);
            this.c = null;
        }
    }

    @Override
    public void g() {
        this.b = false;
        this.c = null;
    }
}

