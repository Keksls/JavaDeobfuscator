/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUF
 */
public final class cuf_0
extends cto_0 {
    public cuf_0 b() {
        return new cuf_0();
    }

    @Override
    public boolean d() {
        bFN bFN2 = (bFN)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        return bFN2.a(bmr_12) && super.d();
    }

    @Override
    protected int t() {
        return cUL.Z.aH;
    }

    @Override
    public String q() {
        String string = super.q();
        bFN bFN2 = (bFN)this.l;
        String string2 = bFN2.ap();
        bmr_1 bmr_12 = azu_0.j().k();
        if (string2 == null || string2.length() == 0) {
            return string;
        }
        ani_2 ani_22 = new ani_2().a((CharSequence)string);
        cct_1 cct_12 = ccs_1.a().a(bFN2.C());
        fka fka2 = cct_12 == null ? fka.a : cct_12.p;
        if (fka.a != fka2) {
            ani_22.m().a((CharSequence)bae.h().a("desc.cost", string2));
        }
        if (!emj_0.b.a(new emh_0[]{bmr_12})) {
            ani_22.m().a(h).a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0]));
        }
        return ani_22.r();
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.b();
    }
}

