/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cGg
 */
@fpw_0
public class cgg_0 {
    protected static final Logger a = Logger.getLogger(cgg_0.class);
    public static final String PACKAGE = "wakfu.chatOptions";

    public static void createView(fzs fzs2) {
        fsk fsk2 = (fsk)((fyb_0)fzs2.d()).getElementMap().a("windowsComboBox");
        try {
            aUxx aUxx2 = aUxx.a();
            aUxx2.b((Integer)fsk2.getSelectedValue()).b();
            fis_1.a().a((ajf_1)aUxx.a(), aUxx.d);
            aUxx.a().o();
        }
        catch (Exception exception) {
            a.error((Object)"Exception during createView", (Throwable)exception);
        }
    }

    public static void selectView(fcb_2 fcb_22) {
        fis_1.a().a("chat.editedView", fcb_22.j());
    }

    public static void transferView(fcf_2 fcf_22) {
        int n;
        aUr aUr2 = (aUr)fis_1.a().e("chat.editedView");
        int n2 = (Integer)fcf_22.j().getItemValue();
        if (n2 == (n = aUxx.a().b(aUr2))) {
            return;
        }
        aUxx.a().a(aUr2, n, n2);
        fis_1.a().a("chat.editedView", "windowId");
        aUxx.a().o();
    }

    public static void changeChannel(fcf_2 fcf_22) {
        aUr aUr2 = (aUr)fis_1.a().e("chat.editedView");
        aUY aUY2 = (aUY)fcf_22.j().getItemValue();
        aUxx.a().o();
    }
}

