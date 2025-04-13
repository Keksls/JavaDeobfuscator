/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfy
 */
class cfy_2
implements adx_1<caq_0> {
    cfy_2() {
    }

    @Override
    public boolean a(caq_0 caq_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 == null || bpc_22.ac_() != 23) {
            cfx_1.b.warn((Object)"[GUILD_STORAGE_BOX] Reception d'un message de contenu dans un contexte ne correspondant pas");
            return false;
        }
        ky_0 ky_02 = caq_02.b();
        fzn.a().b();
        ddi_0.d().f();
        ky_02.b().forEach(ki2 -> {
            eru_1 eru_12 = bph_2.a(ki2);
            ddi_0.d().a(eru_12);
        });
        ddi_0.d().a(ky_02.f());
        cfx_1.b.info((Object)"[GUILD_STORAGE_BOX] Content received");
        return false;
    }

    @Override
    public int a() {
        return 15319;
    }
}

