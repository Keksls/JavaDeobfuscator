/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

@fpw_0
public class cGC {
    public static final String PACKAGE = "wakfu.roomManager";
    protected static final Logger a = Logger.getLogger(cGC.class);

    public static void addUser(fzs fzs2, bsx_2 bsx_22, fug_0 fug_02) {
        a.error((Object)"DimensionalBagRoomManagerDialogAction.addUser()");
    }

    public static void removeUser(fzs fzs2, fzz fzz2, bsx_2 bsx_22) {
        a.error((Object)"DimensionalBagRoomManagerDialogAction.removeUser()");
    }

    public void a(fzs fzs2, fzz fzz2) {
        cpE cpE2 = new cpE();
        azu_0.j().K().c(cpE2);
    }

    public static void changeUserPermission(fzs fzs2, fzz fzz2, bsx_2 bsx_22) {
        a.error((Object)"DimensionalBagRoomManagerDialogAction.changeUserPermission()");
    }

    public void b(fzs fzs2, fzz fzz2) {
        cpH cpH2 = new cpH();
        azu_0.j().K().c(cpH2);
    }

    public static void onClicktRoom(fzs fzs2, bsx_2 bsx_22, String string) {
        a.error((Object)"DimensionalBagRoomManagerDialog.onClicktRoom()");
    }

    public static void changeGroupePermission(fzs fzs2, fzz fzz2, bsx_2 bsx_22) {
        a.error((Object)"DimensionalBagRoomManagerDialogAction.changeGroupePermission()");
    }

    public static void closeDimensionalBagRoomManagerDialog(fzs fzs2) {
        if (fpm_0.b().q("dimensionalBagRoomManagerDialog")) {
            fis_1.a().a("showRoomBagDetails", false);
            azu_0.j().b(cXQ.d());
        }
    }

    public static void changeBagName(fzs fzs2, bsx_2 bsx_22, fug_0 fug_02) {
        a.error((Object)"DimensionalBagRoomManagerDialogActiob.changeBagRoom()");
    }

    public static void showInfos(fzs fzs2, fvk_0 fvk_02, String string) {
        if (fzs2.f() == frd_0.C) {
            fvE fvE2;
            fvE2.setVisible(!(fvE2 = (fvE)fvk_02.getElementMap().a(string + "Info")).getVisible());
            fvE fvE3 = (fvE)fvk_02.getElementMap().a(string + "Button");
            if (fvE3.getStyle().equals("add")) {
                fvE3.setStyle("remove");
            } else {
                fvE3.setStyle("add");
            }
        }
    }

    public static void closeRoomDetail(fck_2 fck_22) {
        fis_1.a().a("showRoomBagDetails", false);
    }

    public static void emptyTextEditor(fck_2 fck_22, fvk_0 fvk_02, fug_0 fug_02) {
        if (fck_22.f() == frd_0.B && fug_02.getId().equals("tempAccessTextEditor") && fis_1.a().c("isTempAccessTexteditorDefault")) {
            fug_02.c("");
            fis_1.a().a("isTempAccessTexteditorDefault", true);
        }
    }

    public static void setTempAccessTexteditorProperty(fcd_2 fcd_22, bsx_2 bsx_22, fug_0 fug_02) {
        a.error((Object)"DimensionalBagRoomManagerDialogAction.setTempAccessTexteditorProperty()");
    }

    public static void setPermissionsToDefault(fck_2 fck_22) {
        a.warn((Object)"(pas fait : ) Remise des permissions aux valeurs par d\u00e9faut ");
    }

    public static void dropItem(fcv_2 fcv_22, String string) {
        Object object = fcv_22.m();
        if (object instanceof bss_1) {
            bss_1 bss_12 = (bss_1)object;
            dgL dgL2 = new dgL();
            dgL2.a(bss_12.a());
            dgL2.a(true);
            dgL2.a(Co.g(string));
            dgL2.b((int)bss_12.b());
            dgL2.a_(18231);
            add_2.b().a(dgL2);
        } else if (object instanceof exk_2) {
            dgL dgL3 = new dgL();
            dgL3.b(cjk_0.getSourceUniqueId());
            dgL3.c(cjk_0.getSourcePosition());
            dgL3.b(cjk_0.getSourceUniqueId());
            dgL3.a((exk_2)object);
            dgL3.a(false);
            dgL3.a(Co.g(string));
            dgL3.a_(18231);
            add_2.b().a(dgL3);
        }
    }

    public static void closeDialog(fzs fzs2) {
        azu_0.j().b(cXQ.d());
    }
}

