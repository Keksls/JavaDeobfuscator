/*
 * Decompiled with CFR 0.152.
 */
public class bMq
extends fgp_0 {
    private bwe_2 g;

    public bMq(fgy_0 fgy_02) {
        super(fgy_02);
    }

    public void a(int n) {
        this.a(fga_0.a, n);
    }

    public void b(int n) {
        this.a(fga_0.b, n);
    }

    public void c(int n) {
        this.a(fga_0.c, n);
    }

    public void d(int n) {
        this.a(fga_0.d, n);
    }

    public void e(int n) {
        this.a(fga_0.e, n);
    }

    public void f(int n) {
        this.a(fga_0.f, n);
    }

    @Override
    public boolean a(epq_2 epq_22, int n) {
        return true;
    }

    @Override
    public boolean b(epq_2 epq_22, int n) {
        return true;
    }

    @Override
    public boolean g(int n) {
        return false;
    }

    @Override
    public boolean h(int n) {
        return false;
    }

    private void a(fga_0 fga_02, int n) {
        cqr_0 cqr_02 = new cqr_0();
        cqr_02.b(this.d.B());
        cqr_02.a(fga_02.a());
        cqr_02.c(n);
        ans_0.D();
        ans_0.F().K().c(cqr_02);
    }

    public bwe_2 a() {
        if (this.g == null) {
            this.g = new bwe_2(this.d);
        }
        return this.g;
    }
}

