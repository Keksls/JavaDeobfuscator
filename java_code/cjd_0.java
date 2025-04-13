/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cJD
 */
@fpw_0
public class cjd_0 {
    public static final String PACKAGE = "wakfu.spellDeck";

    public static void changeDisplayType(fzs fzs2) {
        if (!(fzs2.d() instanceof ftI)) {
            return;
        }
        ftI ftI2 = (ftI)fzs2.d();
        dfc dfc2 = new dfc(18030);
        dfc2.a(Byte.valueOf(ftI2.getValue()));
        add_2.b().a(dfc2);
    }

    public static void displayList(fck_2 fck_22) {
        add_2.b().a(new dfc(17284));
    }

    public static void changeDisplayType(fzs fzs2, String string) {
        dfc dfc2 = new dfc(18030);
        dfc2.a(Byte.valueOf(string));
        add_2.b().a(dfc2);
    }

    public static void spellDropOut(fcx_1 fcx_12) {
        dha_0 dha_02 = new dha_0();
        dha_02.a_(18011);
        dha_02.a((bpr_0)fcx_12.l());
        add_2.b().a(dha_02);
    }

    public static void spellRemove(fcb_2 fcb_22) {
        dha_0 dha_02 = new dha_0();
        dha_02.a_(18011);
        dha_02.a((bpr_0)fcb_22.j());
        add_2.b().a(dha_02);
    }

    public static void spellAdd(fcb_2 fcb_22) {
        dha_0 dha_02 = new dha_0();
        dha_02.a_(16922);
        dha_02.a((bpl_0)fcb_22.j());
        add_2.b().a(dha_02);
    }

    public static void spellDrop(fcv_2 fcv_22, bpr_0 bpr_02) {
        Object object = fcv_22.n();
        bpl_0 bpl_02 = object instanceof bpl_0 ? (bpl_0)object : (object instanceof bpr_0 ? ((bpr_0)object).b() : null);
        if (bpl_02 == null) {
            return;
        }
        dha_0 dha_02 = new dha_0();
        dha_02.a_(16922);
        dha_02.a(bpl_02);
        dha_02.a(bpr_02);
        add_2.b().a(dha_02);
    }

    public static void setToCurrentBuildSheet(fck_2 fck_22) {
        if (fck_22 instanceof fcb_2) {
            bPK bPK2 = (bPK)((fcb_2)fck_22).j();
            dfc dfc2 = new dfc(19533);
            dfc2.a(bPK2);
            add_2.b().a(dfc2);
        }
        add_2.b().a(new dfc(17681));
    }

    public static void copyPaste(fzs fzs2, fug_0 fug_02) {
        String string = fug_02.getText();
        ca_0.a(string);
    }

    public static void onCodeKeyPress(fcd_2 fcd_22, fug_0 fug_02) {
        if (fcd_22.k() != 10) {
            return;
        }
        String string = fug_02.getText();
        dfc dfc2 = new dfc(17304);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void pasteCodeAndApply(fzs fzs2, fug_0 fug_02) {
        if (fug_02 == null) {
            return;
        }
        Optional<String> optional = ca_0.a();
        if (optional.isEmpty()) {
            return;
        }
        String string = cjd_0.a(fug_02, optional.get());
        if (string == null) {
            return;
        }
        fug_02.c(string);
        dfc dfc2 = new dfc(17304);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void copyPaste(fzs fzs2, fuh_0 fuh_02) {
        String string = fuh_02.getText();
        ca_0.a(string);
    }

    public static void onCodeKeyPress(fcd_2 fcd_22, fuh_0 fuh_02) {
        if (fcd_22.k() != 10) {
            return;
        }
        String string = fuh_02.getText();
        dfc dfc2 = new dfc(17304);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void pasteCodeAndApply(fzs fzs2, fuh_0 fuh_02) {
        if (fuh_02 == null) {
            return;
        }
        Optional<String> optional = ca_0.a();
        if (optional.isEmpty()) {
            return;
        }
        String string = cjd_0.a(fuh_02, optional.get());
        if (string == null) {
            return;
        }
        fuh_02.c(string);
        dfc dfc2 = new dfc(17304);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    private static String a(@NotNull fuh_0 fuh_02, String string) {
        if (fuh_02.getText() == null) {
            return string;
        }
        Pattern pattern = Pattern.compile(fuh_02.getRestrict());
        if (pattern == null) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < string.length(); ++k) {
            String string2 = Character.toString(string.charAt(k));
            if (!pattern.matcher(string2).matches()) continue;
            stringBuilder.append(string2);
        }
        if (stringBuilder.length() <= 0) {
            return null;
        }
        String string3 = stringBuilder.toString();
        int n = fuh_02.getMaxCharacters();
        if (string3.length() > n) {
            return string3.substring(0, n);
        }
        return string3;
    }

    @Nullable
    private static String a(@NotNull fug_0 fug_02, String string) {
        if (fug_02.getTextBuilder() == null || fug_02.getTextBuilder().k() == null) {
            return string;
        }
        Pattern pattern = fug_02.getTextBuilder().k().g();
        if (pattern == null) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < string.length(); ++k) {
            String string2 = Character.toString(string.charAt(k));
            if (!pattern.matcher(string2).matches()) continue;
            stringBuilder.append(string2);
        }
        if (stringBuilder.length() <= 0) {
            return null;
        }
        String string3 = stringBuilder.toString();
        int n = fug_02.getMaxCharacters();
        if (string3.length() > n) {
            return string3.substring(0, n);
        }
        return string3;
    }

    public static void closeSpellDescription(fzs fzs2) {
        dha_0 dha_02 = new dha_0();
        dha_02.a_(19621);
        dha_02.a((bpl_0)null);
        add_2.b().a(dha_02);
    }

    public static void onDeckNameChanged(fcz_1 fcz_12) {
        if (!fcz_12.j()) {
            fug_0 fug_02 = (fug_0)fcz_12.e();
            dfc dfc2 = new dfc(19138);
            dfc2.a(fug_02.getText());
            add_2.b().a(dfc2);
        }
    }

    public static void onDeckNameChanged(fcd_2 fcd_22) {
        fug_0 fug_02 = (fug_0)fcd_22.e();
        dfc dfc2 = new dfc(19138);
        dfc2.a(fug_02.getText());
        add_2.b().a(dfc2);
    }

    public static void changeDeckLevel(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(19372);
            dfc2.a(fcf_22.l());
            add_2.b().a(dfc2);
        }
    }

    public static void addDeck(fck_2 fck_22) {
        bmr_1 bmr_12 = (bmr_1)dcX.a.j().l();
        if (bmr_12 == null) {
            return;
        }
        fiR fiR2 = bmr_12.dw();
    }

    public static void removeDeck(fck_2 fck_22) {
        dfc dfc2 = new dfc(19279);
        add_2.b().a(dfc2);
    }

    public static void selectPage(fcb_2 fcb_22) {
        dfc dfc2 = new dfc(19533);
        dfc2.a(fcb_22.j());
        add_2.b().a(dfc2);
    }

    public static void modifyPage(fck_2 fck_22) {
        add_2.b().a(new dfc(16237));
    }

    public static void validate(fck_2 fck_22) {
        add_2.b().a(new dfc(16760));
    }

    public static void closePageList(fck_2 fck_22) {
        add_2.b().a(new dfc(18208));
    }

    public static void openCloseDescription(fcb_2 fcb_22) {
        cJF.openCloseDescription(fcb_22, "spellPopup");
    }

    public static void showHideState(fzs fzs2, fvE fvE2, fil_1 fil_12, bpe_0 bpe_02) {
        if (fzs2.f() == frd_0.C) {
            bpl_0 bpl_02;
            dgo_0 dgo_02 = new dgo_0();
            dgo_02.a(bpe_02);
            if (fvE2.getElementMap() != null && (bpl_02 = (bpl_0)fis_1.a().d("editableDescribedSpell", fvE2.getElementMap().c())) != null) {
                dgo_02.b(((bph_0)bpl_02.r()).i());
            }
            dgo_02.a(fvE2.getElementMap().c());
            add_2.b().a(dgo_02);
        } else {
            fis_1.a().a("describedState", bpe_02);
            fpu_0.popup(fil_12, fvE2);
            fvE2.addEventListener(frd_0.G, new cJE(fvE2), true);
        }
    }
}

