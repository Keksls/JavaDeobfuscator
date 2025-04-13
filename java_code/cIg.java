/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@fpw_0
public class cIg {
    public static final String PACKAGE = "wakfu.notificationPanel";
    private static final Pattern a = Pattern.compile("\\#\\#(.*)\\#\\#");

    public static String createLink(String string, blr_1 blr_12) {
        return cIg.createLink(string, blr_12, null);
    }

    public static String createLink(String string, blr_1 blr_12, String string2) {
        Matcher matcher = a.matcher(string);
        if (matcher.find()) {
            String string3 = matcher.group(1);
            ani_2 ani_22 = new ani_2();
            ani_22.a((CharSequence)string.substring(0, matcher.start()));
            ani_22.i().g().c(blr_12.name() + (string2 == null ? "" : string2));
            ani_22.a((CharSequence)string3).h().j();
            ani_22.a((CharSequence)string.substring(matcher.end()));
            string = ani_22.r();
        }
        return string;
    }

    public static void forceCycle(fzs fzs2) {
        if (((fck_2)fzs2).x() != 1) {
            return;
        }
        dbp.a().e();
    }

    public static void gotoNotificationLinkTooltip(fzs fzs2, fil_1 fil_12) {
        fuk_0 fuk_02 = (fuk_0)fzs2.e();
        fxH fxH2 = fuk_02.getBlockUnderMouse();
        if (fxH2 != null && fxH2.g() == fxI.b) {
            fxQ fxQ2 = fxH2.h();
            if (fxQ2 == null) {
                return;
            }
            if (fxQ2.b() == ane_2.b && ((fxS)fxQ2).n()) {
                fpu_0.popup(fil_12, fuk_02);
            }
        }
    }

    public static void gotoNotificationLink(fzs fzs2, bls_1 bls_12) {
        if (((fck_2)fzs2).x() != 3) {
            cIg.forceCycle(fzs2);
            return;
        }
        String string = null;
        fuk_0 fuk_02 = (fuk_0)fzs2.e();
        fxH fxH2 = fuk_02.getBlockUnderMouse();
        blr_1 blr_12 = bls_12.a();
        if (fxH2 != null && fxH2.g() == fxI.b) {
            String string2;
            fxQ fxQ2 = fxH2.h();
            if (fxQ2 == null) {
                return;
            }
            if (fxQ2.b() == ane_2.b && (string2 = ((fxS)fxQ2).p()) != null && string2.length() > 0) {
                string = string2.replaceAll(blr_12.name(), "");
            }
        }
        switch (blr_12) {
            case a: {
                if (azu_0.j().c(cwu_0.h())) break;
                azu_0.j().a(cwu_0.h());
                break;
            }
            case c: {
                if (azu_0.j().c(dbd.a())) break;
                fis_1.a().a("nationCurrentPageIndex", (byte)2);
                azu_0.j().a(dbd.a());
                break;
            }
            case d: {
                if (string == null) {
                    return;
                }
                int n = Integer.parseInt(string);
                if (azu_0.j().c(dbd.a())) break;
                boolean bl = n == azu_0.j().k().fE().n();
                fis_1.a().a("nationCurrentPageIndex", bl ? (byte)2 : 3);
                azu_0.j().a(dbd.a());
                break;
            }
            case b: {
                if (string == null) {
                    return;
                }
                int n = Integer.parseInt(string);
                ((bvx_0)ans_0.D().h()).a((agp_0)bWe.ab, n);
                if (!azu_0.j().c(cxa_0.a())) {
                    azu_0.j().a(cxa_0.a());
                    break;
                }
                cxa_0.a().c();
                break;
            }
            case g: {
                break;
            }
            case e: {
                if (string == null) {
                    return;
                }
                if (string.length() > 0) {
                    byte by = Byte.parseByte(string);
                    fis_1.a().a("nationCurrentPageIndex", by);
                }
                if (azu_0.j().c(dbd.a())) break;
                azu_0.j().a(dbd.a());
                break;
            }
            case i: {
                break;
            }
            case h: {
                break;
            }
            case f: {
                if (azu_0.j().c(cZu.a())) break;
                azu_0.j().a(cZu.a());
            }
        }
    }

    public static void selectMessage(fcb_2 fcb_22) {
        dbp.a().a((bls_1)fcb_22.j());
    }

    public static void overMessage(fzs fzs2) {
        dbp.a().a(true);
    }

    public static void outMessage(fzs fzs2) {
        dbp.a().a(false);
    }
}

