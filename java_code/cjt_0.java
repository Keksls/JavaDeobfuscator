/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cJt
 */
@fpw_0
public class cjt_0
extends cHn {
    private static final Logger a = Logger.getLogger(cjt_0.class);
    public static final String PACKAGE = "wakfu.seedSpreader";
    private static exi_2 b;

    public static exi_2 getDraggedItem() {
        return b;
    }

    public static void setDraggedItem(exi_2 exi_22) {
        b = exi_22;
    }

    public static void removeSeed(fcp_1 fcp_12) {
        b = (exi_2)fcp_12.l();
        dfc.d((short)19480);
    }

    public static void closeWindow(fzs fzs2) {
        if (dcx_0.d().g()) {
            String string = bae.h().a("question.seedSpreaderClose", new Object[0]);
            fzn_0 fzn_02 = new fzn_0(102, 0, string, null, cfn_0.a(8), 24L);
            fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
            fzm_02.a(new cju_0());
        } else {
            cjt_0.a();
        }
    }

    static void a() {
        fpm_0.b().o("seedSpreaderDialog");
    }
}

