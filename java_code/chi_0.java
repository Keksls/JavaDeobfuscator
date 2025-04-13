/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHi
 */
@fpw_0
public class chi_0 {
    public static final String PACKAGE = "wakfu.guildHavenWorld";
    private static final String a = "havenWorldElementContainer";

    public static void selectTab(fcp_2 fcp_22) {
        if (!fcp_22.j()) {
            return;
        }
        ftI ftI2 = (ftI)fcp_22.e();
        String string = ftI2.getValue();
        fyy_0 fyy_02 = ftI2.getElementMap();
        chi_0.a(fyy_02);
        chi_0.a(fyy_02, a + string, true);
    }

    private static void a(fyy_0 fyy_02) {
        chi_0.a(fyy_02, "havenWorldElementContainer1", false);
        chi_0.a(fyy_02, "havenWorldElementContainer2", false);
        chi_0.a(fyy_02, "havenWorldElementContainer3", false);
        chi_0.a(fyy_02, "havenWorldElementContainer4", false);
    }

    private static void a(fyy_0 fyy_02, String string, boolean bl) {
        fvE fvE2 = (fvE)fyy_02.a(string);
        if (fvE2 != null) {
            fvE2.setVisible(bl);
        }
    }

    public static void changeHavenWorldLock(fck_2 fck_22) {
        Object object = fis_1.a().e("havenWorld");
        if (!(object instanceof btx_2)) {
            return;
        }
        ((btx_2)object).e();
        cci_2.a.h();
    }
}

