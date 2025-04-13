/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public final class aOx
extends aOs {
    aOx(aOt aOt2) {
        super(aOt2);
    }

    @Override
    public void b(afj_0 afj_02) {
        afj_02.e(this.a.e());
    }

    @Override
    public void a(afj_0 afj_02, int n) {
        afj_02.a(false);
        afj_02.e(this.a.b());
    }

    @Override
    public int a(afj_0 afj_02) {
        return UL.b.b();
    }

    @Override
    public void c(afj_0 afj_02) {
        afj_02.a(true);
        if (!afj_02.aC().c()) {
            return;
        }
        afj_02.e(this.a.f());
    }

    @Override
    public afm_0 a() {
        return afm_0.m;
    }

    @Override
    public void d(afj_0 afj_02) {
        bqi_2 bqi_22 = aOx.a((biI)afj_02);
        if (bqi_22 != null) {
            bqi_22.d();
        }
    }

    @Override
    public void e(afj_0 afj_02) {
        afj_02.p(true);
        bqi_2 bqi_22 = aOx.a((biI)afj_02);
        if (bqi_22 != null) {
            bqi_22.d();
        }
        afj_02.a(agn.a());
        afj_02.e("AnimArtefact-Nager-Debut");
    }

    @Override
    public void f(afj_0 afj_02) {
    }

    @Nullable
    private static bqi_2 a(biI biI2) {
        if (biI2 == null || !(biI2.bI() instanceof bnh_1)) {
            return null;
        }
        bnh_1 bnh_12 = (bnh_1)biI2.bI();
        if (bnh_12 == null) {
            return null;
        }
        bpc_2 bpc_22 = bnh_12.eE();
        if (bpc_22 == null) {
            return null;
        }
        if (bpc_22.ac_() != 14) {
            return null;
        }
        return (bqi_2)bpc_22;
    }
}

