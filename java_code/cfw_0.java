/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.debug.anim.AnmDebuggerCommand;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cFw
 */
@fpw_0
public class cfw_0 {
    protected static final Logger a = Logger.getLogger(cfw_0.class);
    public static final String PACKAGE = "wakfu.adminCharacterEditor";
    private static final ArrayList<cfy_0> b = new ArrayList();
    private static final ArrayList<cfy_0> c = new ArrayList();

    public static void openCharacterColorEditor(fzs fzs2) {
        if (fpm_0.b().q("adminCharacterEditorDialog")) {
            bmr_1 bmr_12 = azu_0.j().k();
            b.clear();
            c.clear();
            for (atm_1 atm_12 : atm_1.values()) {
                bog_2 bog_22 = new bog_2(Hw.d(), Hw.d(), Hw.d());
                if (atm_12.b() >= atm_1.k.b()) {
                    b.add(new cfy_0(bog_22, atm_12));
                    continue;
                }
                c.add(new cfy_0(bog_22, atm_12));
            }
            cfw_0.reloadAnmimation(null);
            fis_1.a().a("adminColors", b);
            fis_1.a().a("adminInactiveColors", c);
            fpm_0.b().a("adminCharacterColorEditorDialog", cfi_0.a("adminCharacterColorEditorDialog"), 1L, (short)10000);
            fpm_0.b().o("adminCharacterEditorDialog");
        } else {
            fpm_0.b().a("adminCharacterEditorDialog", cfi_0.a("adminCharacterEditorDialog"), 1L, (short)10000);
            fpm_0.b().o("adminCharacterColorEditorDialog");
            fis_1.a().a("adminAnimDirection");
            fis_1.a().a("adminAnimName");
            fis_1.a().a("adminColors");
            fis_1.a().a("adminInactiveColors");
        }
    }

    public static void loadAnmDebugger(fzs fzs2) {
        if (fpm_0.b().q("debugAnmDialog")) {
            fpm_0.b().o("debugAnmDialog");
        } else {
            AnmDebuggerCommand.b();
        }
    }

    public static void reloadAnmimation(fzs fzs2) {
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        fis_1.a().a((ajf_1)bmr_12, "actorDescriptorLibrary");
        fis_1.a().a((ajf_1)bmr_12, "actorEquipment");
        fis_1.a().a("adminAnimDirection", biI2.aC().l);
        fis_1.a().a("adminAnimName", (Object)biI2.ab());
    }

    public static void deleteActiveColor(fzs fzs2, cfy_0 cfy_02) {
        b.remove(cfy_02);
        c.add(cfy_02);
        fis_1.a().a("adminColors", (Object)null);
        fis_1.a().a("adminInactiveColors", (Object)null);
        fis_1.a().a("adminColors", b);
        fis_1.a().a("adminInactiveColors", c);
    }

    public static void activateColor(fzs fzs2) {
        fsk fsk2 = (fsk)((fyb_0)fzs2.e()).getElementMap().a("comboColor");
        cfy_0 cfy_02 = (cfy_0)fsk2.getSelectedValue();
        c.remove(cfy_02);
        b.add(cfy_02);
        fis_1.a().a("adminColors", (Object)null);
        fis_1.a().a("adminInactiveColors", (Object)null);
        fis_1.a().a("adminColors", b);
        fis_1.a().a("adminInactiveColors", c);
    }

    public static void setFilterRed(fcq_1 fcq_12, cfy_0 cfy_02) {
        if (cfy_02 != null) {
            cfy_02.a(fcq_12.j());
            cfy_02.a((frO)((fyb_0)fcq_12.d()).getElementMap().a("localPlayerDisplay"));
        }
    }

    public static void setFilterGreen(fcq_1 fcq_12, cfy_0 cfy_02) {
        if (cfy_02 != null) {
            cfy_02.b(fcq_12.j());
            cfy_02.a((frO)((fyb_0)fcq_12.d()).getElementMap().a("localPlayerDisplay"));
        }
    }

    public static void setFilterBlue(fcq_1 fcq_12, cfy_0 cfy_02) {
        if (cfy_02 != null) {
            cfy_02.c(fcq_12.j());
            cfy_02.a((frO)((fyb_0)fcq_12.d()).getElementMap().a("localPlayerDisplay"));
        }
    }

    public static void setFilterRed(fzs fzs2, fug_0 fug_02, cfy_0 cfy_02) {
        if (fug_02.getText().length() == 0) {
            return;
        }
        float f2 = (float)Co.h(fug_02.getText()) / 255.0f;
        cfy_02.a(f2);
        cfy_02.a((frO)((fyb_0)fzs2.d()).getElementMap().a("localPlayerDisplay"));
    }

    public static void setFilterGreen(fzs fzs2, fug_0 fug_02, cfy_0 cfy_02) {
        if (fug_02.getText().length() == 0) {
            return;
        }
        float f2 = (float)Co.h(fug_02.getText()) / 255.0f;
        cfy_02.b(f2);
        cfy_02.a((frO)((fyb_0)fzs2.d()).getElementMap().a("localPlayerDisplay"));
    }

    public static void setFilterBlue(fzs fzs2, fug_0 fug_02, cfy_0 cfy_02) {
        if (fzs2.f() != frd_0.p) {
            return;
        }
        if (fug_02.getText().length() == 0) {
            return;
        }
        float f2 = (float)Co.h(fug_02.getText()) / 255.0f;
        cfy_02.c(f2);
        cfy_02.a((frO)((fyb_0)fzs2.d()).getElementMap().a("localPlayerDisplay"));
    }

    public static void applyColor(fzs fzs2, cfy_0 cfy_02) {
        cfy_02.a((frO)((fyb_0)fzs2.d()).getElementMap().a("localPlayerDisplay"));
    }

    private static void a(fzs fzs2) {
        fru_0 fru_02 = (fru_0)((fyb_0)fzs2.d()).getElementMap().a("applyColorButton");
        fru_02.setEnabled(true);
    }

    public static void validLevel(fck_2 fck_22) {
        fug_0 fug_02 = (fug_0)fpm_0.b().h().d("adminCharacterEditorDialog").a("level");
        if (fug_02 == null || fug_02.getText() == null || fug_02.getText().length() == 0) {
            return;
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)280);
        pt.b(Short.parseShort(fug_02.getText()));
        aaw_22.c(pt);
        cfw_0.a();
    }

    public static void validSpellLevel(fck_2 fck_22, bpl_0 bpl_02, fug_0 fug_02) {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)59);
        pt.a(bpl_02.aT_());
        pt.b(Short.parseShort(fug_02.getText()));
        aaw_22.c(pt);
        cfw_0.a();
    }

    public static void learnSkill(fck_2 fck_22, brg_1 brg_12) {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)290);
        pt.a(brg_12.e());
        aaw_22.c(pt);
        cfw_0.a();
    }

    public static void addSkillXp(fck_2 fck_22, brg_1 brg_12, fug_0 fug_02) {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        long l = 0L;
        try {
            l = Long.parseLong(fug_02.getText());
        }
        catch (Exception exception) {
            a.error((Object)"Exception during addSkillXp", (Throwable)exception);
        }
        fug_02.c("0");
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)211);
        pt.a(brg_12.e());
        pt.a(l);
        aaw_22.c(pt);
        cfw_0.a();
    }

    private static void a() {
        ado_1.a().a(new cfx_0(), 1500L, 1);
    }
}

