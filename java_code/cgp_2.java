/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cgp
 */
class cgp_2
implements adx_1<cyy_1> {
    cgp_2() {
    }

    @Override
    public boolean a(cyy_1 cyy_12) {
        long l;
        long l2;
        fhy_0 fhy_02;
        fhz_0 fhz_02;
        eyo_2 eyo_22 = cyy_12.b();
        if (eyo_22 != eyo_2.b) {
            String string = "enchantment.shards.result." + eyo_22.name();
            if (azu_0.j().c(cyq_0.a)) {
                cyq_0.a.d().a(string);
            } else {
                fpm_0.b().a(bae.h().a(string, new Object[0]), cfn_0.a(1), 2L, 102, 3);
            }
        }
        if ((fhz_02 = (fhy_02 = fhx_0.a(l2 = cyy_12.c(), l = azu_0.j().n().u(), l)).b()) == fhz_0.f) {
            cgo_2.a.warn((Object)("On re\u00e7oit un SHARDS_RESULT_MESSAGE pour l'item " + l2 + " alors qu'il n'est pas dans notre inventaire ou equipement"));
            return false;
        }
        exk_2 exk_22 = fhy_02.a();
        eZw eZw2 = cyy_12.d();
        if (eZw2 != null) {
            exk_22.a(eZw2);
        }
        exk_22.P();
        long l3 = fhy_02.d();
        if (fhz_02 == fhz_0.e) {
            eBt eBt2 = eBo.a.c(l3);
            if (eBt2 == null) {
                cgo_2.a.warn((Object)("On re\u00e7oit un SHARDS_RESULT_MESSAGE pour l'item " + l2 + " en \u00e9quipement de h\u00e9ro, mais le h\u00e9ro avec l'id " + l3 + " n'existe pas"));
                return false;
            }
            cxo_0.b(eBt2);
            cxq_0.a.h(eBt2);
        } else {
            bmr_1 bmr_12 = (bmr_1)euw_2.a.d(l3);
            if (fhz_02 == fhz_0.d || fhz_02 == fhz_0.b) {
                bmr_12.bI();
            }
        }
        cyq_0.a.c();
        return false;
    }

    @Override
    public int a() {
        return 13865;
    }
}

