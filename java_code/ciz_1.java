/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ciz
 */
final class ciz_1
extends chd_1<cta_1, bvw_2> {
    private static final Logger b = Logger.getLogger(ciz_1.class);

    ciz_1() {
    }

    @Override
    public boolean a(cta_1 cta_12) {
        long l = cta_12.c();
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            b.error((Object)("Personnage id=" + l + " lors du traitement d'un " + cta_1.class.getSimpleName()));
            return false;
        }
        if (this.a(cta_12, l, blx_12)) {
            this.a(cta_12, blx_12);
        }
        return false;
    }

    private void a(cta_1 cta_12, blx_1 blx_12) {
        ani_2 ani_22 = new ani_2();
        aUr.a(ani_22, "characterName_" + blx_12.a_(), blx_12.dp());
        String string = cta_12.b() ? "fight.callForHelp" : "fight.cancelCallForHelp";
        aUh.c(string, ani_22.r());
    }

    private boolean a(cta_1 cta_12, long l, blx_1 blx_12) {
        bvw_2 bvw_22 = blx_12.bw();
        if (bvw_22 == null) {
            bvx_2 bvx_22 = blx_12.bz();
            if (bvx_22 == null) {
                b.error((Object)("No fight info found for the player with the id " + l + " when he asked for help"));
                return false;
            }
            bvx_22.a(blx_12.Y(), cta_12.b());
            bmr_1 bmr_12 = azu_0.j().k();
            if (bvx_22 == bmr_12.bz() && bvx_22.d(cta_12.c()) == bmr_12.Y()) {
                fis_1.a().a("currentFightRequestHelp", cta_12.b());
            }
        } else {
            bvw_22.a(blx_12.Y(), cta_12.b());
            aoy_0.a(bvw_22, blx_12.Y(), cta_12.b());
        }
        return false;
    }
}

