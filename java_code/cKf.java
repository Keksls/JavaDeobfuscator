/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.wrapper.SteamApi
 */
import com.ankamagames.steam.wrapper.SteamApi;
import java.text.ParseException;
import java.util.Objects;

@fpw_0
public class cKf {
    public static final String PACKAGE = "wakfu.webShop";

    public static void first(fzs fzs2, bSO bSO2) {
        bSO2.f();
    }

    public static void previous(fzs fzs2, bSO bSO2) {
        bSO2.g();
    }

    public static void next(fzs fzs2, bSO bSO2) {
        bSO2.h();
    }

    public static void last(fzs fzs2, bSO bSO2) {
        bSO2.i();
    }

    public static void selectCategory(fcf_2 fcf_22, bSO bSO2) {
        if (fcf_22.k()) {
            cKf.search((fzs)fcf_22, bSO2, (bSt)fcf_22.l());
        }
    }

    public static void selectCategory(fzs fzs2, bSO bSO2, bSt<?> bSt2) {
        if (bSO2.e() != bSt2) {
            cKf.search(fzs2, bSO2, bSt2);
        }
    }

    public static void discoverHighLight(fzs fzs2, bSO bSO2, bsv_0<?, ?> bsv_02) {
        if (bsv_02.g()) {
            cKf.goToHighlightCategory(fzs2, bSO2, bsv_02);
        } else if (bsv_02.h()) {
            cKf.openLink(fzs2, bSO2, bsv_02);
        }
    }

    public static void goToHighlightCategory(fzs fzs2, bSO bSO2, bsv_0<?, ?> bsv_02) {
        bSt<?> bSt2 = bSO2.a(bsv_02.c());
        if (bSt2 != null) {
            bSO2.a(bSt2);
            bSO2.c("");
        } else {
            add_2.b().a(new dhh_0(18903, bsv_02.c()));
        }
    }

    public static void openLink(fzs fzs2, bSO bSO2, bsv_0<?, ?> bsv_02) {
        String string = bsv_02.b();
        if (string == null) {
            return;
        }
        dfc dfc2 = new dfc(19506);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void selectCarrouselHighlight(fzs fzs2, bSO bSO2, bsv_0<?, ?> bsv_02) {
        int n = bSO2.a(bsv_02);
        if (n == -1) {
            return;
        }
        dfc dfc2 = new dfc(19329);
        dfc2.b(n);
        add_2.b().a(dfc2);
    }

    public static void search(fzs fzs2, bSO bSO2, bSt<?> bSt2) {
        bSO2.a(bSt2);
        bSO2.c("");
    }

    public static void home(fzs fzs2, bSO bSO2) {
        ful_0 ful_02 = (ful_0)((fyb_0)fzs2.d()).getElementMap().a("textEditor");
        if (ful_02 != null) {
            ful_02.c("");
        }
        bSO2.k();
    }

    public static void search2(fcp_2 fcp_22, bSO bSO2) {
        if (fcp_22.j()) {
            // empty if block
        }
    }

    public static void search3(fcp_2 fcp_22, bSO bSO2) {
        if (fcp_22.j()) {
            // empty if block
        }
    }

    public static void search4(fcp_2 fcp_22, bSO bSO2) {
        if (fcp_22.j()) {
            // empty if block
        }
    }

    public static void search(fzs fzs2, bSO bSO2, ful_0 ful_02) {
        bSO2.c(ful_02.getText());
    }

    public static void search(fcd_2 fcd_22, bSO bSO2) {
        fug_0 fug_02 = (fug_0)fcd_22.e();
        if (fcd_22.k() == 10) {
            bSO2.c(fug_02.getText());
        }
    }

    public static void resetSearch(fzs fzs2, bSO bSO2, ful_0 ful_02) {
        ful_02.c("");
        bSO2.c("");
    }

    public static void quickBuy(fzs fzs2, bSO bSO2, bss_0<?, ?> bss_02) {
        bSO2.a(bss_02);
    }

    public static void oneClick(fzs fzs2, bSO bSO2, bss_0<?, ?> bss_02) {
        dfc dfc2 = new dfc(19954);
        dfc2.a(new Cm(bss_02, bSO2));
        add_2.b().a(dfc2);
    }

    public static void openItemDescription(fck_2 fck_22, bjw_1 bjw_12) {
        if (fck_22.x() == 3) {
            cfq_0.sendOpenCloseItemDetailMessage(((fyb_0)fck_22.e()).getElementMap().b(), bjw_12);
        }
    }

    public static void openArticleDescription(fzs fzs2, bss_0<?, ?> bss_02) {
        ddO.a().a(bss_02);
    }

    public static void openStuffPreviewWindow(fzs fzs2, bss_0<?, ?> bss_02) {
        bjw_1 bjw_12 = cKf.getPetItemReference(bss_02);
        if (bjw_12 != null) {
            cfq_0.sendOpenCloseItemDetailMessage(bjw_12, fta_0.getInstance().getWidth() / 2 - ((fyb_0)fzs2.e()).getRenderableParent().getWidth() / 2, fta_0.getInstance().getHeight() / 2 - ((fyb_0)fzs2.e()).getRenderableParent().getHeight());
        } else {
            bss_02.q();
        }
    }

    public static bjw_1 getPetItemReference(bss_0<?, ?> bss_02) {
        return bss_02.m().stream().map(bSJ::b).filter(Objects::nonNull).filter(ezr_0::Y).findFirst().orElse(null);
    }

    public static void buyOgrines(fzs fzs2) {
        add_2.b().a(new dfc(16208));
    }

    public static void mouseOverArticle(fck_2 fck_22, bss_0<?, ?> bss_02) {
        fis_1.a().a("overArticle", bss_02);
    }

    public static void mouseOutArticle(fck_2 fck_22, bss_0<?, ?> bss_02) {
        fis_1.a().a("overArticle", (Object)null);
    }

    private static void a(String string) {
        if (bPL.a.e()) {
            SteamApi.SteamFriends().ActivateGameOverlayToWebPage(string);
        } else {
            aii_1.a(string);
        }
    }

    public static void goToConversionStone(fzs fzs2) {
        add_2.b().a(new dfc(16425));
    }

    public static void goToConversionStoneTab(fzs fzs2, String string) {
        dfc dfc2 = new dfc(18648);
        dfc2.a(Byte.valueOf(string));
        add_2.b().a(dfc2);
    }

    public static void conversionStoneGoToArticle(fzs fzs2) {
        add_2.b().a(new dfc(19022));
    }

    public static void conversionStoneMultipleGoToArticle(fzs fzs2) {
        add_2.b().a(new dfc(18295));
    }

    public static void conversionStoneSell(fzs fzs2, fug_0 fug_02) {
        dfc dfc2 = new dfc(19193);
        dfc2.a(fug_02.getText());
        add_2.b().a(dfc2);
    }

    public static void conversionStoneBuy(fzs fzs2, btp_1 btp_12) {
        dfc dfc2 = new dfc(19156);
        dfc2.a(btp_12);
        add_2.b().a(dfc2);
    }

    public static void conversionStoneRefreshSell(fzs fzs2) {
        add_2.b().a(new dfc(19097));
    }

    public static void conversionStoneRefreshBuy(fzs fzs2) {
        add_2.b().a(new dfc(19610));
    }

    public static void conversionStoneRefreshOffersList(fzs fzs2) {
        add_2.b().a(new dfc(16243));
    }

    public static void conversionStoneCancelOffer(fzs fzs2, btp_1 btp_12) {
        dfc dfc2 = new dfc(16073);
        dfc2.a(btp_12);
        add_2.b().a(dfc2);
    }

    public static void conversionStoneChangeOwnOffer(fck_2 fck_22) {
        add_2.b().a(new dfc(16330));
    }

    public static void onConversionStoneSellPriceChanged(fzs fzs2) {
        long l;
        abo_1 abo_12;
        if (fzs2 instanceof fcd_2 && ((fca_2)(abo_12 = (fcd_2)fzs2)).q()) {
            return;
        }
        abo_12 = (fug_0)fzs2.e();
        String string = ((fug_0)abo_12).getText();
        if (string.isEmpty()) {
            string = "0";
        }
        try {
            l = bae.h().f(string);
        }
        catch (ParseException parseException) {
            l = 0L;
        }
        dfc dfc2 = new dfc(18798);
        dfc2.a(l);
        add_2.b().a(dfc2);
    }
}

