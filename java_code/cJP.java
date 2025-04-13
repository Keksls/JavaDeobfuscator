/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.debug.anim.AnmDebuggerCommand;

@fpw_0
public class cJP {
    public static final String PACKAGE = "wakfu.stuffPreviewDebug";
    private static long a = -1L;

    public static void equipItem(exk_2 exk_22, String string) {
        dgL dgL2 = new dgL();
        dgL2.a(exk_22);
        dgL2.a(Byte.valueOf(string));
        dgL2.a_(19366);
        add_2.b().a(dgL2);
    }

    public static void unequipItem(byte by) {
        dgL dgL2 = new dgL();
        dgL2.a(by);
        dgL2.a_(19599);
        add_2.b().a(dgL2);
        cJP.setDraggedItemId(-1L);
    }

    public static void unequip(fcb_2 fcb_22, String string) {
        cJP.unequipItem(Byte.parseByte(string));
    }

    public static void itemDropOut(fcx_1 fcx_12, String string) {
        cJP.unequipItem(Byte.parseByte(string));
    }

    public static void equipmentDropItem(fcv_2 fcv_22, String string) {
        if (!(fcv_22.n() instanceof exk_2)) {
            return;
        }
        exk_2 exk_22 = (exk_2)fcv_22.n();
        cgo_0.onDropItem();
        cJP.equipItem(exk_22, string);
    }

    public static void dragItem(fcp_1 fcp_12) {
        exk_2 exk_22 = (exk_2)fcp_12.l();
        cJP.setDraggedItemId(exk_22.aT_());
    }

    public static long getDraggedItemId() {
        return a;
    }

    public static void setDraggedItemId(long l) {
        a = l;
    }

    public static void changeItemBackground(fck_2 fck_22, String string, fvk_0 fvk_02) {
        cJP.changeItemBackground(fck_22, null, null, string, fvk_02, null);
    }

    public static void changeItemBackground(fck_2 fck_22, ajf_1 ajf_12, exk_2 exk_22, String string, fvk_0 fvk_02, fil_1 fil_12) {
        String string2 = "";
        fvE fvE2 = (fvE)fck_22.e();
        if (bvz_2.a.b() != null && fis_1.a().e("exchange.sourceBag") instanceof bHe) {
            return;
        }
        if (string != null) {
            exk_22 = ddn.a().c().c(Byte.parseByte(string));
        }
        if (exk_22 != null) {
            if (fck_22.f() == frd_0.y) {
                string2 = exk_22.T().x() != 0 ? "itemSetSelectedBackground" : "itemSelectedBackground";
            } else if (fck_22.f() == frd_0.z) {
                string2 = bhv_1.b(exk_22, fvE2.getElementMap().c());
            }
            fvE2.setStyle(string2);
        }
        if (fil_12 != null) {
            if (fck_22.f() == frd_0.y) {
                cJl.showPopup(fck_22, exk_22, fil_12, fvE2);
            } else {
                cJl.closePopup(fck_22);
            }
        }
    }

    public static void turnClockWise(fck_2 fck_22) {
        add_2.b().a(new dfc(19095));
    }

    public static void turnCounterClockWise(fck_2 fck_22) {
        add_2.b().a(new dfc(16844));
    }

    public static void setStaticAnimation(fck_2 fck_22) {
        dfc dfc2 = new dfc(16612);
        dfc2.a("AnimStatique");
        add_2.b().a(dfc2);
    }

    public static void setWalkAnimation(fck_2 fck_22) {
        dfc dfc2 = new dfc(16612);
        dfc2.a("AnimMarche");
        add_2.b().a(dfc2);
    }

    public static void setRunAnimation(fck_2 fck_22) {
        dfc dfc2 = new dfc(16612);
        dfc2.a("AnimCourse");
        add_2.b().a(dfc2);
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

    public static void loadAnmDebugger(fzs fzs2) {
        if (fpm_0.b().q("debugAnmDialog")) {
            fpm_0.b().o("debugAnmDialog");
        } else {
            AnmDebuggerCommand.b();
        }
    }
}

