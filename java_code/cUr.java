/*
 * Decompiled with CFR 0.152.
 */
public class cUr
extends cSS
implements afy_0 {
    private final fkd a;

    public cUr(fkd fkd2) {
        this.a = fkd2;
    }

    @Override
    public cSY n() {
        return cSY.C;
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        this.a();
    }

    @Override
    public boolean c() {
        if (this.l instanceof bmv_1) {
            bmv_1 bmv_12 = (bmv_1)this.l;
            if (bmv_12.cI() == 132) {
                return false;
            }
            bmr_1 bmr_12 = azu_0.j().k();
            return bmv_12.a(erl_2.o) && !bmv_12.ak() && !bmr_12.ak() && !bvz_2.a.a();
        }
        b.error((Object)("[RESURRECTION] On essaye de rez un " + this.l.getClass().getSimpleName()));
        return false;
    }

    private void a() {
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        bmv_1 bmv_12 = (bmv_1)this.l;
        int n = biI2.ap().e(bmv_12.P_());
        if (n <= 1) {
            aej_2 aej_22 = biI2.ap().b(bmv_12.P_());
            if (aej_22 != null) {
                biI2.a(aej_22);
            }
            clk_1 clk_12 = new clk_1(bmv_12.a_(), this.a);
            azu_0.j().K().c(clk_12);
        } else {
            biI2.b(this);
            if (!bmr_12.b(bmv_12.P_(), true, false)) {
                biI2.c(this);
                bQG.a();
                bQG.a(2, new Object[0]);
            }
        }
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        this.a();
    }

    @Override
    public String r() {
        switch (this.a) {
            case a: {
                return "resurrect";
            }
            case b: {
                return "resurrectPest";
            }
        }
        return "unknown resurrection type";
    }

    @Override
    public cSS v() {
        return new cUr(this.a);
    }

    @Override
    protected int t() {
        return cUL.J.aH;
    }
}

