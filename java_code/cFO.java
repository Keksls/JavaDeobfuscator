/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

@fpw_0
public class cFO {
    public static final String PACKAGE = "wakfu.characterChoice";
    protected static final Logger a = Logger.getLogger(cFO.class);

    public static void selectCharacter(fzs fzs2, bnh_1 bnh_12) {
        if (bnh_12.equals(bmp_1.a().c())) {
            return;
        }
        dfq dfq2 = new dfq();
        dfq2.a(bnh_12);
        dfq2.a_(19705);
        add_2.b().a(dfq2);
    }

    public static void deleteCharacter(fzs fzs2, bnh_1 bnh_12) {
        if (cFO.a()) {
            cFO.b();
            return;
        }
        dfq dfq2 = new dfq();
        dfq2.a(bnh_12);
        dfq2.a_(17541);
        add_2.b().a(dfq2);
    }

    public static void createNewCharacter(fzs fzs2) {
        if (cFO.a()) {
            cFO.b();
            return;
        }
        if (cFO.c()) {
            cFO.d();
            return;
        }
        dfc.d((short)17294);
    }

    public static void enterWorld(fzs fzs2, bnh_1 bnh_12) {
        boolean bl;
        Object object;
        if (bnh_12 == null) {
            return;
        }
        if (fzs2 instanceof fcd_2) {
            object = (fcd_2)fzs2;
            switch (((fcd_2)object).k()) {
                case 10: {
                    break;
                }
                default: {
                    return;
                }
            }
        }
        boolean bl2 = bl = !emp_0.a((int[])(object = (Object)azu_0.j().n().v()), emp_0.b);
        if (enp_2.a.d(ens_2.C) && !bl) {
            cFO.displayMailPopup(bnh_12);
        } else {
            dfq dfq2 = new dfq();
            dfq2.a(bnh_12);
            dfq2.a_(18869);
            add_2.b().a(dfq2);
        }
    }

    public static void enterWorldDoubleClick(fzs fzs2, bnh_1 bnh_12) {
        boolean bl;
        if (bnh_12 == null) {
            return;
        }
        int[] nArray = azu_0.j().n().v();
        boolean bl2 = bl = !emp_0.a(nArray, emp_0.b);
        if (enp_2.a.d(ens_2.C) && !bl) {
            cFO.displayMailPopup(bnh_12);
        } else {
            dfq dfq2 = new dfq();
            dfq2.a(bnh_12);
            dfq2.a_(18869);
            add_2.b().a(dfq2);
        }
    }

    public static void displayMailPopup(bnh_1 bnh_12) {
        dfq dfq2 = new dfq();
        dfq2.a(bnh_12);
        dfq2.a_(18516);
        add_2.b().a(dfq2);
    }

    public static void cancelCharacterChoice(fzs fzs2) {
        azu_0.j().I();
    }

    public static void onMouseOverDeletionButton(fzs fzs2, bnh_1 bnh_12, frO frO2, fil_1 fil_12) {
        if (bnh_12 != null) {
            frO2.setAnimName("AnimEmote-Defaite");
            fpu_0.popup(fzs2, fil_12);
        }
    }

    public static void onMouseOutDeletionButton(fzs fzs2, bnh_1 bnh_12, frO frO2, fil_1 fil_12) {
        if (bnh_12 != null) {
            frO2.setAnimName(bnh_12.bv().ab());
            fpu_0.closePopup(fzs2, fil_12);
        }
    }

    public static void onMouseOverCharacter(fzs fzs2, bnh_1 bnh_12, frO frO2) {
        if (bnh_12 != fis_1.a().e("characterChoice.selectedCharacter")) {
            frO2.setAnimName("AnimEmote-Coucou");
        }
    }

    public static void onMouseOutCharacter(fzs fzs2, bnh_1 bnh_12, frO frO2) {
        if (bnh_12 != fis_1.a().e("characterChoice.selectedCharacter")) {
            frO2.setAnimName(bnh_12.bv().ab());
        }
    }

    public static void onMouseOverAnimNewCharacter(fzs fzs2, frO frO2) {
    }

    public static void onMouseOutAnimNewCharacter(fzs fzs2, frO frO2) {
    }

    public static void validRename(fzs fzs2, fug_0 fug_02) {
        String string = fug_02.getText();
        blx_1 blx_12 = (blx_1)fis_1.a().e("characterChoice.selectedCharacter");
        if (fzs2 == null || fzs2.f() == frd_0.C || fzs2 instanceof fcd_2 && ((fcd_2)fzs2).k() == 10) {
            string = eai_0.a(fug_02.getText());
            if (cFP.validateCharacterCreationForm(fug_02)) {
                long l = blx_12.a_();
                a.info((Object)("Demande de renommage du personnage characterId=" + l + " en " + string));
                long l2 = fis_1.a().f("renameCharater.availableId").m();
                String string2 = fis_1.a().b("renameCharater.availableUid");
                cBr cBr2 = new cBr();
                cBr2.a(l);
                cBr2.a(string);
                cBr2.b(l2);
                cBr2.b(string2);
                azu_0.j().K().c(cBr2);
                add_2.b().a(new dfc(17162));
            } else {
                a.info((Object)"Formulaire invalide");
            }
        } else if (fzs2 instanceof fcd_2) {
            fis_1.a().a("renameCharacter.dirty", !string.equals(blx_12.dp()));
        }
    }

    public static void buySlot(fzs fzs2, bss_0<?, ?> bss_02) {
        ddO.a().a(bss_02);
    }

    private static boolean a() {
        return azs_0.a().a("disableCharacterManagement", false);
    }

    private static void b() {
        fzn_0 fzn_02 = new fzn_0(7, 1, bae.h().a("error.disabled.character.management", new Object[0]), 2L);
        fpm_0.b().a(fzn_02);
    }

    private static boolean c() {
        return bmp_1.a().d() >= 150;
    }

    private static void d() {
        fzn_0 fzn_02 = new fzn_0(7, 1, bae.h().a("error.account.too.many.characters", new Object[0]), 2L);
        fpm_0.b().a(fzn_02);
    }

    public static void openRenameDialog(fzs fzs2, bnh_1 bnh_12) {
        if (!bnh_12.hK()) {
            return;
        }
        bmp_1.a().e(bnh_12);
        cWI.a().a(bnh_12.a_(), 0L, "");
    }

    public static void moveCharacterUp(fck_2 fck_22, bnh_1 bnh_12) {
        if (cWI.a().d()) {
            return;
        }
        dfc dfc2 = new dfc(19843);
        dfc2.a(bnh_12);
        add_2.b().a(dfc2);
    }

    public static void moveCharacterDown(fck_2 fck_22, bnh_1 bnh_12) {
        if (cWI.a().d()) {
            return;
        }
        dfc dfc2 = new dfc(18658);
        dfc2.a(bnh_12);
        add_2.b().a(dfc2);
    }

    public static void showCharacterOption(fck_2 fck_22, bof_1 bof_12) {
        bof_12.a(true);
        fis_1.a().a((ajf_1)bof_12, "hovered");
    }

    public static void hideCharacterOption(fck_2 fck_22, bof_1 bof_12) {
        bof_12.a(false);
        fis_1.a().a((ajf_1)bof_12, "hovered");
    }
}

