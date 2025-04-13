/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bQZ
 */
public final class bqz_0
extends bra_1 {
    @Override
    public String a(bFN bFN2) {
        return bae.h().a("haven.world.zaap.name", new Object[0]);
    }

    @Override
    public boolean a(bmr_1 bmr_12, bFN bFN2) {
        return !bmr_12.a(erl_2.aW);
    }

    @Override
    public void a(TG tG, epq_2 epq_22) {
    }

    @Override
    public void b(TG tG, epq_2 epq_22) {
        del_0.a().a((bFN)tG);
    }

    @Override
    public fjp_0 a(epq_2 epq_22, TG tG, long l) {
        if (!(tG instanceof bDL)) {
            return fjp_0.g;
        }
        if (!(epq_22 instanceof bmr_1)) {
            return fjp_0.g;
        }
        fjE fjE2 = (fjE)fjs.a.a(fjv.a, l);
        if (!fjE2.a(epq_22)) {
            return fjp_0.d;
        }
        if (bqz_0.a((bmr_1)epq_22) && euu_2.a((long)fjE2.c(), (long)fjE2.c()) != enX.a) {
            return fjp_0.j;
        }
        return fjp_0.a;
    }

    private static boolean a(bmr_1 bmr_12) {
        if (euw_2.a.h(bmr_12.U_()) > 1) {
            return true;
        }
        return bmr_12.dE().a() != null && !bmr_12.dE().a().c(bmr_12.U_()).isEmpty();
    }

    @Override
    public fjv a() {
        return fjv.e;
    }
}

