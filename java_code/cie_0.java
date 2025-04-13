/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from cIe
 */
@fpw_0
public final class cie_0 {
    public static final String PACKAGE = "wakfu.ninePatch";
    private static final Logger a = Logger.getLogger(cie_0.class);

    private cie_0() {
    }

    public static void updateField(fzs fzs2, fzz fzz2) {
        fzz2.a();
    }

    public static void printInfo(fzs fzs2, fzz fzz2) {
        cdy_1 cdy_12 = (cdy_1)fis_1.a().f("ninePatch").f();
        a.info((Object)("form.isValid() = " + fzz2.isValid()));
        fvE fvE2 = (fvE)fzz2.getElementMap().a("targetContainer");
        fqj fqj2 = fvE2.getAppearance();
        fby_2 fby_22 = cdy_12.a();
        fqj2.j();
        fqj2.addBasicElement(fby_22);
        cdy_12.b();
    }

    public static boolean validateForm(fzz fzz2) {
        a.info((Object)("form = " + fzz2));
        Collection<fit_1> collection = fzz2.getProperties();
        for (fit_1 fit_12 : collection) {
            boolean bl = (Boolean)fit_12.a("isValid");
            if (bl) continue;
            return false;
        }
        return true;
    }

    public static void computeXCoords(fzs fzs2, fug_0 fug_02, fug_0 fug_03, fug_0 fug_04) {
        cdy_1 cdy_12 = (cdy_1)fis_1.a().f("ninePatch").f();
        fug_02.setTextImmediate(String.valueOf(0));
        int n = cdy_12.e();
        fug_03.setTextImmediate(String.valueOf(n / 2));
        int n2 = cdy_12.r();
        fug_04.setTextImmediate(String.valueOf(n - n2));
    }

    public static void computeYCoords(fzs fzs2, fug_0 fug_02, fug_0 fug_03, fug_0 fug_04) {
        cdy_1 cdy_12 = (cdy_1)fis_1.a().f("ninePatch").f();
        fug_02.setTextImmediate(String.valueOf(0));
        int n = cdy_12.f();
        fug_03.setTextImmediate(String.valueOf(n / 2));
        int n2 = cdy_12.u();
        fug_04.setTextImmediate(String.valueOf(n - n2));
    }

    public static void copyXML(fck_2 fck_22) {
        cdy_1 cdy_12 = (cdy_1)fis_1.a().f("ninePatch").f();
        if (Cz.f(cdy_12.v())) {
            return;
        }
        ca_0.a(cdy_12.v());
        aul_0.a().c("XML definition copied to clipboard");
    }
}

