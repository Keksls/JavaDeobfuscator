/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

@fpw_0
public class cFP {
    public static final String PACKAGE = "wakfu.characterCreation";
    private static final int d = 6;
    private static final String e = "colorSelectionGroup";
    private static final String f = "characterAEV";
    private static boolean g = false;
    protected static final Logger a = Logger.getLogger(cFP.class);
    public static final int b = 0;
    public static final int c = 7;

    private cFP() {
    }

    public static void setCreateCharacterFlag(boolean bl) {
        g = bl;
    }

    public static void cancelCharacterCreation(fzs fzs2) {
        dfc.d((short)16865);
    }

    public static boolean validateCharacterCreationForm(fug_0 fug_02) {
        if (fug_02 != null) {
            String string = fug_02.getText();
            String string2 = eai_0.a(string);
            if (!string2.equals(string)) {
                fug_02.setTextImmediate(string2);
            }
            return cfq_0.checkNameValidity(string2);
        }
        return false;
    }

    public static void stopCharacterNameTween(fzs fzs2) {
        cwk_0.a().e();
    }

    public static void createCharacter(fzs fzs2, fug_0 fug_02) {
        cFP.stopCharacterNameTween(fzs2);
        if (fzs2 == null || fzs2.f() == frd_0.C || fzs2 instanceof fcd_2 && ((fcd_2)fzs2).k() == 10) {
            if (cFP.validateCharacterCreationForm(fug_02)) {
                if (!g) {
                    dfq dfq2 = new dfq();
                    dfq2.a(fug_02.getText());
                    dfq2.a_(18325);
                    add_2.b().a(dfq2);
                    g = true;
                }
            } else {
                a.info((Object)"Formulaire invalide");
                fis_1.a().a("characterCreation.enableNameChange", true);
            }
        }
    }

    public static void setCharacterSex(fck_2 fck_22) {
        cFP.a(boh_2.b.a());
        ftI ftI2 = (ftI)fck_22.e();
        dfq dfq2 = new dfq();
        dfq2.a(Byte.parseByte(ftI2.getValue()));
        dfq2.a_(18660);
        add_2.b().a(dfq2);
    }

    public static void onMouseEnterPart(fck_2 fck_22, String string) {
        Optional<boh_2> optional = boh_2.a(string);
        if (optional.isEmpty()) {
            return;
        }
        bnh_1 bnh_12 = cwk_0.c();
        fyy_0 fyy_02 = fpm_0.b().h().d("characterCreationDialog");
        frO frO2 = (frO)fyy_02.a(f);
        boh_2 boh_22 = optional.get();
        fji_2 fji_22 = new fji_2(new bog_2(boh_22.a(bnh_12)).e(), azf_2.g, azf_2.e, boh_22.b(), frO2, 0, 150, fjw_2.a, -1);
        frO2.addTween(fji_22);
    }

    public static void onMouseExitPart(fck_2 fck_22, String string) {
        cFP.a();
    }

    private static void a() {
        fyy_0 fyy_02 = fpm_0.b().h().d("characterCreationDialog");
        frO frO2 = (frO)fyy_02.a(f);
        frO2.removeTweensOfType(fji_2.class);
    }

    public static void onColorizablePartSelected(fcp_2 fcp_22) {
        if (!fcp_22.j()) {
            return;
        }
        ftI ftI2 = (ftI)fcp_22.e();
        String string = ftI2.getValue();
        cFP.a(string);
        Optional<boh_2> optional = boh_2.a(string);
        if (optional.isEmpty()) {
            return;
        }
        int n = optional.get().a(cwk_0.c());
        cwk_0.a(n);
    }

    private static void a(String string) {
        fyy_0 fyy_02 = fpm_0.b().h().d("characterCreationDialog");
        fim_1 fim_12 = (fim_1)fyy_02.a(e);
        fim_12.setValue(string);
        Optional<boh_2> optional = boh_2.a(string);
        if (optional.isEmpty()) {
            return;
        }
        String string2 = optional.get().c(cwk_0.c());
        fis_1.a().a("characterCreation.colorizablePartDescription", (Object)string2, "characterCreationDialog");
    }

    public static void onColorPicked(fct_1 fct_12, fug_0 fug_02) {
        azj_2 azj_22 = (azj_2)fct_12.j();
        fug_02.c(azj_22.w().toUpperCase());
        String string = cFP.getColorizablePartName();
        dfc dfc2 = new dfc(19341);
        dfc2.b(azj_22.a());
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void onColorType(fcd_2 fcd_22, fug_0 fug_02) {
        azf_2 azf_22;
        String string = fug_02.getText();
        if (string.length() < 6) {
            return;
        }
        try {
            azf_22 = azf_2.a(string);
        }
        catch (RuntimeException runtimeException) {
            a.error((Object)("Error when creating color from hex " + string), (Throwable)runtimeException);
            return;
        }
        fis_1.a().a("characterCreation.colorPickerValue", (Object)azf_22, "characterCreationDialog");
        dfc dfc2 = new dfc(19341);
        dfc2.b(azf_22.a());
        dfc2.a(cFP.getColorizablePartName());
        add_2.b().a(dfc2);
    }

    public static void cancelColor(fzs fzs2, String string) {
        cFP.a();
        dfc dfc2 = new dfc(16470);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void cancelAllColors(fzs fzs2) {
        cFP.a();
        add_2.b().a(new dfc(16968));
    }

    public static void randomColor(fzs fzs2) {
        dfc dfc2 = new dfc(17721);
        dfc2.a(cFP.getColorizablePartName());
        add_2.b().a(dfc2);
    }

    public static String getColorizablePartName() {
        fyy_0 fyy_02 = fpm_0.b().h().d("characterCreationDialog");
        fim_1 fim_12 = (fim_1)fyy_02.a(e);
        return fim_12.getValue();
    }

    public static void setRandomCharacterName(fzs fzs2, fug_0 fug_02) {
        bnh_1 bnh_12 = (bnh_1)fis_1.a().e("characterCreation.editablePlayerInfo");
        bnh_12.c(bpa_1.c().a());
        fug_02.c(bnh_12.dp());
        cwk_0.a().e();
    }

    public static void changeDirectionClockWise(fck_2 fck_22, frO frO2) {
        if (fck_22.x() != 1) {
            return;
        }
        if (cwk_0.a().f()) {
            return;
        }
        int n = frO2.getDirection() + 1 > 7 ? 0 : frO2.getDirection() + 1;
        frO2.setAnimName("AnimStatique");
        frO2.setDirection(n);
        bnh_1 bnh_12 = (bnh_1)fis_1.a().e("characterCreation.editablePlayerInfo");
        bnh_12.a(aej_2.a(n));
    }

    public static void changeDirectionCounterClockwise(fck_2 fck_22, frO frO2) {
        if (fck_22.x() != 1) {
            return;
        }
        if (cwk_0.a().f()) {
            return;
        }
        int n = frO2.getDirection() - 1 < 0 ? 7 : frO2.getDirection() - 1;
        frO2.setAnimName("AnimStatique");
        frO2.setDirection(n);
        bnh_1 bnh_12 = (bnh_1)fis_1.a().e("characterCreation.editablePlayerInfo");
        bnh_12.a(aej_2.a(n));
    }

    public static void selectBreed(fcb_2 fcb_22) {
        cFP.a(boh_2.b.a());
        dfr dfr2 = new dfr();
        dfr2.a_(17914);
        dfr2.a((blw_1)fcb_22.j());
        add_2.b().a(dfr2);
    }

    public static void selectRole(fcb_2 fcb_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(19271);
        dfc2.b(((bkz_1)fcb_22.j()).a());
        add_2.b().a(dfc2);
    }

    public static void overBreed(fcb_2 fcb_22) {
        fis_1.a().a("characterCreation.breedOver", fcb_22.j());
    }

    public static void outBreed(fcb_2 fcb_22) {
        fis_1.a().a("characterCreation.breedOver", (Object)null);
    }

    public static void setNextHairStyle(fzs fzs2) {
        dfc.d((short)16044);
    }

    public static void setPreviousHairStyle(fzs fzs2) {
        dfc.d((short)17424);
    }

    public static void setNextDressStyle(fzs fzs2) {
        dfc.d((short)16089);
    }

    public static void setPreviousDressStyle(fzs fzs2) {
        dfc.d((short)19326);
    }

    public static void setRandomCharacterColors(fzs fzs2) {
        dfc.d((short)18968);
    }
}

