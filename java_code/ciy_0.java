/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cIY
 */
@fpw_0
public class ciy_0 {
    public static final String PACKAGE = "wakfu.osamodasSymbiot";
    private static final Logger a = Logger.getLogger(ciy_0.class);

    public static void selectCreature(fzs fzs2) {
        if (fzs2 == null || frd_0.j != fzs2.f()) {
            return;
        }
        fcb_2 fcb_22 = (fcb_2)fzs2;
        if (!(fcb_22.j() instanceof bop_0)) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bop_0 bop_02 = (bop_0)fcb_22.j();
        bol_0 bol_02 = bmr_12.cH();
        if (bol_02 == null) {
            return;
        }
        if (fcb_22.x() == 1) {
            dfc dfc2 = new dfc();
            dfc2.a_(17347);
            dfc2.a(bol_02.a(bop_02));
            add_2.b().a(dfc2);
        } else if (fcb_22.x() == 3) {
            dbJ.a().a(bop_02);
        } else if (fcb_22.x() == 507) {
            dfc dfc3 = new dfc();
            dfc3.a_(16781);
            dfc3.a(bol_02.a(bop_02));
            add_2.b().a(dfc3);
        }
    }

    public static void selectNextCreature(fzs fzs2) {
        if (fzs2 != null && frd_0.E.equals((Object)fzs2.f())) {
            fck_2 fck_22 = (fck_2)fzs2;
            dfc.d((short)16781);
        }
    }

    public static boolean validateChangeNameForm(fzz fzz2) {
        fzz2.a();
        fit_1 fit_12 = fzz2.getProperty("osamodasSymbiot.describedCreature");
        if (fit_12 != null) {
            String string = fit_12.b("name");
            String string2 = eai_0.a(string);
            if (!string2.equals(string)) {
                fit_12.a("name", (Object)string2);
            }
            return cfq_0.checkNameValidity(string);
        }
        return true;
    }

    public static void setCreatureName(fzs fzs2, bop_0 bop_02, fug_0 fug_02) {
        if (fzs2.f() != frd_0.C && (fzs2.f() != frd_0.n || ((fcd_2)fzs2).k() != 10)) {
            return;
        }
        bol_0 bol_02 = azu_0.j().k().cH();
        if (bol_02 == null) {
            return;
        }
        if (!fug_02.isValid()) {
            return;
        }
        dfc dfc2 = new dfc();
        dfc2.a(fug_02.getText());
        dfc2.a(bol_02.a(bop_02));
        dfc2.a_(16537);
        add_2.b().a(dfc2);
    }

    public static void freeCreature(fzs fzs2, bop_0 bop_02) {
        bol_0 bol_02 = azu_0.j().k().cH();
        if (bol_02 == null) {
            return;
        }
        dfc dfc2 = new dfc();
        dfc2.a(bol_02.a(bop_02));
        dfc2.a_(18349);
        add_2.b().a(dfc2);
    }

    public static void monsterPopup(fzs fzs2) {
        short s2 = azu_0.j().k().dr();
        bpl_0 bpl_02 = bpp_0.a().a(7348, s2);
        if (bpl_02 == null) {
            return;
        }
        fis_1.a().a("describedSpell", bpl_02);
        fis_1.a().a("describedSpellRealLevel", bpl_02.c());
    }

    public static void closeMonsterPopup(fzs fzs2) {
        fis_1.a().a("describedSpell", (Object)null);
    }
}

