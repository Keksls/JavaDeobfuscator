/*
 * Decompiled with CFR 0.152.
 */
public class dcv
extends cVc {
    public static final dcv i = new dcv();

    @Override
    protected void e() {
    }

    @Override
    public void h() {
    }

    @Override
    protected void a(aff_1 aff_12) {
        this.e.a(aff_12.d(), aff_12.e(), aff_12.f());
    }

    @Override
    protected void a(int n, int n2) {
        if (!azu_0.j().k().ak()) {
            ((bja_2)this.b.T().p()).a(this.b, n, n2);
        }
    }

    @Override
    protected String l() {
        return null;
    }

    @Override
    protected int e(aff_1 aff_12) {
        if (this.b == null) {
            return -1;
        }
        if (yz_0.i(aff_12.d(), aff_12.e(), aff_12.f())) {
            return -1;
        }
        if (yz_0.e(aff_12.d(), aff_12.e(), aff_12.f())) {
            return -1;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bsx_2 bsx_22 = bmr_12.di();
        if (bsx_22 != null && !bsx_22.a(bmr_12, aff_12.d(), aff_12.e())) {
            return -1;
        }
        return 100;
    }

    @Override
    protected void m() {
    }
}

