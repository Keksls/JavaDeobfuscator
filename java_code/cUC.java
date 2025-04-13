/*
 * Decompiled with CFR 0.152.
 */
public final class cUC
extends cto_0 {
    public cUC b() {
        return new cUC();
    }

    @Override
    public boolean d() {
        bFN bFN2 = (bFN)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        return bFN2.a(bmr_12) && super.d();
    }

    @Override
    public String q() {
        bFN bFN2;
        Object Provider;
        fjp_0 fjp_02;
        String string = super.q();
        bFN bFN3 = (bFN)this.l;
        String string2 = bFN3.ap();
        bmr_1 bmr_12 = azu_0.j().k();
        if (string2 == null || string2.isEmpty()) {
            return string;
        }
        ani_2 ani_22 = new ani_2().a((CharSequence)string);
        fka fka2 = ccs_1.a().a((long)bFN3.C()).p;
        if (fka2 != fka.a) {
            ani_22.m().a((CharSequence)bae.h().a("desc.cost", string2));
        }
        if ((fjp_02 = ((fju)(Provider = fjq_0.a((bFN2 = (bFN)this.l).ao()))).a(bmr_12, bFN2, -1L)) == fjp_0.f) {
            ani_22.m().a(h).a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0]));
        }
        if (fjp_02 == fjp_0.k) {
            ani_22.m().a(h).a((CharSequence)bae.h().a("chat.travel.disabledByPact", new Object[0]));
        }
        return ani_22.r();
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.b();
    }
}

