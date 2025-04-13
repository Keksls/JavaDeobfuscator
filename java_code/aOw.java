/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class aOw
extends aOs {
    protected static final Logger b = Logger.getLogger(aOw.class);

    aOw(aOt aOt2) {
        super(aOt2);
    }

    @Override
    public void b(afj_0 afj_02) {
        String string = afj_02.F();
        if (string.equals(this.a.f())) {
            afj_02.e(this.a.e());
        } else {
            afj_02.e(this.a.d());
        }
    }

    @Override
    public void a(afj_0 afj_02, int n) {
        afj_02.a(false);
        if (afj_02.k(this.a.c()) && (afj_02.F().equals(this.a.e()) || afj_02.F().equals(this.a.b()))) {
            afj_02.e(this.a.c());
        } else if (!afj_02.k(this.a.c())) {
            afj_02.e(this.a.a());
        }
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
    public void d(afj_0 afj_02) {
        bqi_2 bqi_22 = aOw.a((biI)afj_02);
        if (bqi_22 != null) {
            bqi_22.d();
        }
    }

    @Override
    public void e(afj_0 afj_02) {
        afj_02.p(true);
        bqi_2 bqi_22 = aOw.a((biI)afj_02);
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

    @Override
    public afm_0 a() {
        return afm_0.l;
    }
}

