/*
 * Decompiled with CFR 0.152.
 */
public class det {
    private det() {
    }

    public static void a() {
        cZI cZI2 = cZI.a();
        if (!cZI.A()) {
            azu_0.j().a(cZI2);
        } else {
            add_2.b().a(new dfc(18991));
        }
    }

    public static void a(int n) {
        if (!cZI.A()) {
            det.a();
            det.b(n);
        } else {
            if (!det.b() || det.c(n)) {
                det.a();
                return;
            }
            det.b(n);
        }
    }

    private static boolean b() {
        return fpm_0.b().k("heroBuildDialog") != null;
    }

    private static boolean c(int n) {
        fyb_0 fyb_02 = fpm_0.b().k("heroBuildDialog");
        if (fyb_02 == null) {
            return false;
        }
        fyb_0 fyb_03 = fyb_02.getChildWithId("sheetsTabContainer");
        if (!(fyb_03 instanceof fut_0)) {
            return false;
        }
        fut_0 fut_02 = (fut_0)fyb_03;
        return fut_02.getSelectedTabIndex() == n;
    }

    public static void b(int n) {
        fyb_0 fyb_02 = fpm_0.b().k("heroBuildDialog");
        if (fyb_02 == null) {
            return;
        }
        fyb_0 fyb_03 = fyb_02.getChildWithId("sheetsTabContainer");
        if (!(fyb_03 instanceof fut_0)) {
            return;
        }
        fut_0 fut_02 = (fut_0)fyb_03;
        if (!fut_02.isEnabledFull()) {
            return;
        }
        fut_02.setSelectedTabIndex(n);
    }
}

