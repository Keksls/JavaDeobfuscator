/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

@fpw_0
public class cId {
    protected static final Logger a = Logger.getLogger(cId.class);
    public static final String PACKAGE = "wakfu.nationSelectionPanel";

    public static void chooseNation(fzs fzs2, bVp bVp2) {
        dfc dfc2 = new dfc();
        dfc2.b(bVp2.a());
        dfc2.a_(18135);
        add_2.b().a(dfc2);
    }

    public static void onMouseOverElement(fzs fzs2, bVp bVp2) {
        ftj_0 ftj_02;
        if (!(fzs2 instanceof fck_2)) {
            return;
        }
        if (!faX.a(azu_0.j().k().fE().m(), faX.i)) {
            return;
        }
        fck_2 fck_22 = (fck_2)fzs2;
        Object t = fzs2.e();
        fsQ fsQ2 = (fsQ)((fyb_0)t).getElementMap().a("list");
        bVp bVp3 = (bVp)fis_1.a().e("selectedNation");
        if (bVp3 != null && ((ftj_02 = fsQ2.getRenderableByOffset(fsQ2.getOffsetByValue(bVp3))).getScreenX() > fck_22.v() || ftj_02.getScreenX() + ftj_02.getWidth() < fck_22.v() || ftj_02.getScreenY() > fck_22.w() || ftj_02.getScreenY() + ftj_02.getHeight() < fck_22.w())) {
            return;
        }
        fis_1.a().a("selectedNation", bVp2);
    }

    public static void onMouseOutElement(fzs fzs2) {
        ftj_0 ftj_02;
        if (!(fzs2 instanceof fck_2)) {
            return;
        }
        if (!faX.a(faX.i, azu_0.j().k().fE().m())) {
            return;
        }
        fck_2 fck_22 = (fck_2)fzs2;
        Object t = fzs2.e();
        fsQ fsQ2 = (fsQ)((fyb_0)t).getElementMap().a("list");
        bVp bVp2 = (bVp)fis_1.a().e("selectedNation");
        if (bVp2 != null && (ftj_02 = fsQ2.getRenderableByOffset(fsQ2.getOffsetByValue(bVp2))).getScreenX() <= fck_22.v() && ftj_02.getScreenX() + ftj_02.getWidth() >= fck_22.v() && ftj_02.getScreenY() <= fck_22.w() && ftj_02.getScreenY() + ftj_02.getHeight() >= fck_22.w()) {
            return;
        }
        fis_1.a().a("selectedNation", (Object)null);
    }
}

