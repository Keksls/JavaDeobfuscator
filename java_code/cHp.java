/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

@fpw_0
public class cHp {
    protected static final Logger a = Logger.getLogger(cHp.class);
    public static final String PACKAGE = "wakfu.havenWorldPanel";

    public static void toggleOpenBuildingList(fzs fzs2) {
        btx_2 btx_22;
        btx_22.a(!(btx_22 = (btx_2)fis_1.a().e("havenWorld")).a());
    }

    public static void toggleOpenEvolutingBuildingList(fzs fzs2) {
        btx_2 btx_22;
        btx_22.b(!(btx_22 = (btx_2)fis_1.a().e("havenWorld")).b());
    }

    public static void onMouseOverElement(fzs fzs2, bth_2 bth_22, fil_1 fil_12) {
        btg_2 btg_22 = (btg_2)fis_1.a().e("basicHavenWorld");
        bua_2.a.a(btg_22.a());
        fpu_0.popup(fzs2, fil_12);
        fvE fvE2 = (fvE)fzs2.e();
        fvE2.getAppearance().setModulationColor(anr_0.v);
        buc_2 buc_22 = bua_2.a.b(bth_22.g().d());
        fis_1.a().a("havenWorldOverCatalogEntry", buc_22);
    }

    public static void onMouseOutElement(fzs fzs2, bth_2 bth_22, fil_1 fil_12) {
        fpu_0.closePopup(fzs2, fil_12);
        fvE fvE2 = (fvE)fzs2.e();
        if (bth_22.equals(fis_1.a().e("havenWorldSelectedCatalogEntry"))) {
            fvE2.getAppearance().setModulationColor(anr_0.v);
        } else {
            fvE2.getAppearance().setModulationColor(azf_2.e);
        }
        fis_1.a().a("havenWorldOverCatalogEntry", (Object)null);
    }
}

