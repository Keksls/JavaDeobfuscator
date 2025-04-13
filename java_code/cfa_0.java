/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfA
 */
class cfa_0
implements adx_1<cas_0> {
    cfa_0() {
    }

    @Override
    public boolean a(cas_0 cas_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 == null || bpc_22.ac_() != 23) {
            cfx_1.b.warn((Object)"[GUILD_STORAGE_BOX] Reception d'un message de contenu dans un contexte ne correspondant pas");
            return false;
        }
        long l = cas_02.b();
        km_0 km_02 = cas_02.c();
        ddi_0.d().b(l);
        ddi_0.d().a(km_02);
        cfx_1.b.info((Object)"[GUILD_STORAGE_BOX]  Contenu re\u00e7u");
        return false;
    }

    @Override
    public int a() {
        return 15705;
    }
}

