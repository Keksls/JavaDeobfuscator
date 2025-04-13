/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

@fpw_0
public class cKg {
    public static final String PACKAGE = "wakfu.windowStick";
    private static final byte a = 0;
    private static final byte b = 1;

    public static void stickWindow(fcw_2 fcw_22) {
        cKg.a(fcw_22, "", (byte)0);
    }

    private static String a(fvk_0 fvk_02, frs_0 frs_02, byte by) {
        switch (by) {
            case 0: {
                switch (frs_02) {
                    case b: 
                    case h: {
                        return fvk_02.getHorizontalDialog();
                    }
                }
                return fvk_02.getVerticalDialog();
            }
            case 1: {
                String string = fvk_02.getElementMap().c();
                switch (frs_02) {
                    case d: {
                        return fvk_02.getVerticalDialog();
                    }
                    case f: {
                        return fvk_02.getHorizontalDialog();
                    }
                }
                return string;
            }
        }
        return null;
    }

    private static fvk_0 a(fcw_2 fcw_22, String string, byte by) {
        fvk_0 fvk_02 = (fvk_0)fcw_22.e();
        String string2 = fvk_02.getElementMap().c();
        fbe_2 fbe_22 = fvk_02.getStickData();
        frs_0 frs_02 = fcw_22.j();
        int n = fta_0.getInstance().getDragButton();
        String string3 = cKg.a(fvk_02, frs_02, by);
        if (string2.startsWith(string3)) {
            return fvk_02;
        }
        fpm_0.b().a(string2, false);
        fvk_0 fvk_03 = (fvk_0)fpm_0.b().a(string3 + string, cfi_0.a(string3), 40976L, (short)10000);
        fvk_03.setHorizontalDialog(fvk_02.getHorizontalDialog());
        fvk_03.setVerticalDialog(fvk_02.getVerticalDialog());
        fbf_2.a().a(fvk_03, fbe_22.a(), false);
        fbf_2.a().d(fvk_03);
        ArrayList<fvM> arrayList = fvk_03.getMovePoints();
        if (!arrayList.isEmpty()) {
            fvM fvM2 = arrayList.get(0);
            cKh cKh2 = new cKh(fvM2, fvk_03, n);
            fvM2.setEnablePositionEvents(true);
            fvM2.setEnableResizeEvents(true);
            fvM2.addEventListener(frd_0.P, cKh2, false);
            fvM2.addEventListener(frd_0.Q, cKh2, false);
        }
        return fvk_03;
    }

    public static void stickShortcutBar(fcw_2 fcw_22, bOv bOv2) {
        byte by = (byte)(bOv2.n() - bOv2.a().e());
        fvk_0 fvk_02 = cKg.a(fcw_22, String.valueOf(by), (byte)0);
        dcj_0.a().b(by, fvk_02.getElementMap().c().startsWith(fvk_02.getVerticalDialog()));
        dcj_0.a().c(by);
    }

    public static void stickStateBar(fcw_2 fcw_22) {
        fvk_0 fvk_02;
        fvk_0 fvk_03 = (fvk_0)fcw_22.e();
        if (fvk_03 != (fvk_02 = cKg.a(fcw_22, "", (byte)0))) {
            fvk_02.addEventListener(frd_0.P, new cKi(fvk_02), false);
        }
    }

    public static void stickFollowAchievements(fcw_2 fcw_22) {
        fvk_0 fvk_02;
        fvk_0 fvk_03 = (fvk_0)fcw_22.e();
        if (fvk_03 != (fvk_02 = cKg.a(fcw_22, "", (byte)1))) {
            fvk_02.addEventListener(frd_0.P, new cKj(fvk_02), false);
            fvk_02.setEnableResizeEvents(true);
        }
    }
}

