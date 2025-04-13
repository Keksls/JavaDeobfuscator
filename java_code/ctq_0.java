/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTq
 */
public class ctq_0
extends cSS {
    private final bmv_1 a;

    @Deprecated
    ctq_0() {
        this(null);
    }

    public ctq_0(bmv_1 bmv_12) {
        this.a = bmv_12;
    }

    @Override
    public void o() {
        if (this.a == null) {
            return;
        }
        long l = this.a.cL();
        clt_0 clt_02 = new clt_0(l);
        bai_0 bai_02 = azu_0.j().n();
        boolean bl = emp_0.b(bai_02.v(), emq_0.V);
        if (bl && this.a.f(erl_2.i)) {
            fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.confirm", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
            fzm_02.a((int n, String string) -> {
                if (n != 8) {
                    return;
                }
                azu_0.j().K().c(clt_02);
            });
        } else {
            azu_0.j().K().c(clt_02);
        }
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl = emp_0.b(bmr_12.N_().a(), emq_0.V);
        if (bl) {
            return true;
        }
        long l = bmr_12.T_();
        return bmr_12.fc() == Math.abs(l);
    }

    @Override
    public String r() {
        return "destroyMonsterGroup";
    }

    @Override
    protected int t() {
        return cUL.ay.aH;
    }

    @Override
    public cSY n() {
        return cSY.ap;
    }

    @Override
    public cSS v() {
        return new ctq_0(this.a);
    }
}

