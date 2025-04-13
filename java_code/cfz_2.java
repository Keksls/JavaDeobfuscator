/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfz
 */
class cfz_2
implements adx_1<car_0> {
    cfz_2() {
    }

    @Override
    public boolean a(car_0 car_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22.ac_() != 23) {
            cfx_1.b.warn((Object)"[GUILD_STORAGE_BOX] Reception d'un message de taille dans un contexte ne correspondant pas");
            return false;
        }
        ery_1 ery_12 = car_02.d();
        ddi_0.d().a(car_02.b(), ery_12, car_02.c());
        cfx_1.b.info((Object)"[GUILD_STORAGE_BOX]  Taille re\u00e7ue");
        return false;
    }

    @Override
    public int a() {
        return 15751;
    }
}

