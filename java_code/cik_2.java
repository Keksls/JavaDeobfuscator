/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cik
 */
final class cik_2
extends chd_1<cte_1, bvx_2> {
    private static final Logger b = Logger.getLogger(cik_2.class);

    cik_2() {
    }

    @Override
    public boolean a(cte_1 cte_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 == null) {
            b.warn((Object)"on re\u00e7oit un message de s\u00e9lection de pointEffect hors combat !?");
            return false;
        }
        blx_1 blx_12 = bvx_22.A().x(cte_12.b());
        bbg_0 bbg_02 = new bbg_0(alc_1.q(), 0, emd_1.ai.a(), blx_12, cte_12.c());
        baa_0.a().a((bvx_2)this.a, (aku_1)bbg_02);
        baa_0.a().a(this.a);
        return false;
    }
}

