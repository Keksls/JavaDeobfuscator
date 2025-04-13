/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

@fpw_0
public final class cHE {
    private static final Logger a = Logger.getLogger(cHE.class);
    public static final String PACKAGE = "wakfu.market";
    private static final String b = "entryNameSearch";
    private static final String c = "offerNameSearch";
    private static final bkj_0 d = new bkj_0();

    private cHE() {
    }

    private static long a(@Nullable String string, long l) {
        if (string == null || string.isBlank()) {
            return l;
        }
        try {
            return bae.h().f(string);
        }
        catch (ParseException parseException) {
            return l;
        }
    }

    private static Optional<exk_2> a(Object object) {
        if (object instanceof exk_2) {
            return Optional.of((exk_2)object);
        }
        if (object instanceof exs_1) {
            return Optional.ofNullable(((exs_1)object).h());
        }
        if (object instanceof bhx_1) {
            return Optional.ofNullable(exk_2.a(((bhx_1)object).a()));
        }
        return Optional.empty();
    }

    private static boolean a(fzs fzs2, fup_0 fup_02) {
        boolean bl;
        if (fzs2 instanceof fcp_2) {
            bl = ((fcp_2)fzs2).j();
        } else {
            bl = !fup_02.getSelected();
            fup_02.setSelected(bl);
        }
        return bl;
    }

    public static void changeMarketView(fcp_2 fcp_22) {
        if (!fcp_22.j()) {
            return;
        }
        ftI ftI2 = (ftI)fcp_22.e();
        try {
            byte by = Byte.parseByte(ftI2.getValue());
            dfc dfc2 = new dfc(17251);
            dfc2.a(by);
            add_2.b().a(dfc2);
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Invalid tab value : " + ftI2.getValue()));
        }
    }

    public static void setSellItemMode(fzs fzs2, String string) {
        boolean bl = Boolean.parseBoolean(string);
        dfc dfc2 = new dfc(16938);
        dfc2.a(bl);
        add_2.b().a(dfc2);
    }

    static void a(fck_2 fck_22, Object object) {
        if (!azu_0.j().c(daw.d())) {
            return;
        }
        if (fck_22.x() != 1) {
            return;
        }
        cHE.a(object).ifPresent(exk_22 -> {
            if (fpm_0.b().q("marketFulfillOfferDialog")) {
                cHE.b(exk_22);
            } else if (daw.i()) {
                fuh_0 fuh_02 = (fuh_0)fpm_0.b().k("marketDialog").getElementMap().a(daw.p() ? b : c);
                if (fuh_02 == null) {
                    return;
                }
                cHE.a(exk_22, fuh_02);
            } else if (daw.r()) {
                cHE.a(exk_22);
            } else if (daw.s()) {
                cHE.a(true, (bjw_1)exk_22.T());
            }
        });
    }

    public static void changeSearchSubTab(fcp_2 fcp_22) {
        cHE.a((short)18494, fcp_22);
    }

    public static void changeMyOffersSubTab(fcp_2 fcp_22) {
        cHE.a((short)17067, fcp_22);
    }

    private static void a(short s2, fcp_2 fcp_22) {
        if (!fcp_22.j() || !(fcp_22.e() instanceof ftI)) {
            return;
        }
        ftI ftI2 = (ftI)fcp_22.e();
        try {
            int n = Integer.parseInt(ftI2.getValue());
            dfc dfc2 = new dfc(s2);
            dfc2.b(n);
            add_2.b().a(dfc2);
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Invalid sub tab value : " + ftI2.getValue()));
        }
    }

    public static void updateOnSaleEntriesNameSearch(fzs fzs2, fuh_0 fuh_02) {
        dfc dfc2 = new dfc(17038);
        dfc2.a(fuh_02.getText());
        add_2.b().a(dfc2);
    }

    public static void searchOnSaleEntriesFromClickOnItemList(fcf_2 fcf_22, fuh_0 fuh_02) {
        if (!fcf_22.k() || !(fcf_22.l() instanceof ezr_0)) {
            return;
        }
        ezr_0 ezr_02 = (ezr_0)fcf_22.l();
        fuh_02.c(ezr_02.e());
        cHE.updateOnSaleEntriesNameSearch(null, fuh_02);
    }

    public static void onSaleEntriesPreviousPage(fzs fzs2) {
        add_2.b().a(new dfc(18656));
    }

    public static void onSaleEntriesNextPage(fzs fzs2) {
        add_2.b().a(new dfc(17400));
    }

    public static void scrollOnSaleSearch(fck_2 fck_22) {
        if (fck_22.z() > 0) {
            cHE.onSaleEntriesNextPage(fck_22);
        } else {
            cHE.onSaleEntriesPreviousPage(fck_22);
        }
    }

    public static void retrieveOnSaleItem(fzs fzs2, bKT bKT2) {
        dfc dfc2 = new dfc(19161);
        dfc2.a(bKT2);
        add_2.b().a(dfc2);
    }

    public static void fetchKamas(fzs fzs2) {
        add_2.b().a(new dfc(16381));
    }

    public static void toggleSoldItemsDetailWindow(fzs fzs2) {
        add_2.b().a(new dfc(19879));
    }

    public static void soldItemsPreviousPage(fzs fzs2) {
        add_2.b().a(new dfc(17556));
    }

    public static void soldItemsNextPage(fzs fzs2) {
        add_2.b().a(new dfc(19232));
    }

    public static void scrollSoldItemsSearch(fck_2 fck_22) {
        if (fck_22.z() > 0) {
            cHE.soldItemsNextPage(fck_22);
        } else {
            cHE.soldItemsPreviousPage(fck_22);
        }
    }

    public static void retrieveExpireEntry(fzs fzs2, bKT bKT2) {
        dfc dfc2 = new dfc(18576);
        dfc2.a(bKT2);
        add_2.b().a(dfc2);
    }

    public static void retrieveAllExpiredEntries(fzs fzs2) {
        add_2.b().a(new dfc(18463));
    }

    public static void toggleExpireEntriesDetailWindow(fzs fzs2) {
        add_2.b().a(new dfc(17675));
    }

    public static void expiredEntriesPreviousPage(fzs fzs2) {
        add_2.b().a(new dfc(16859));
    }

    public static void expiredEntriesNextPage(fzs fzs2) {
        add_2.b().a(new dfc(18058));
    }

    public static void scrollExpiredEntriesSearch(fck_2 fck_22) {
        if (fck_22.z() > 0) {
            cHE.expiredEntriesNextPage(fck_22);
        } else {
            cHE.expiredEntriesPreviousPage(fck_22);
        }
    }

    public static void dropItemToSell(fcv_2 fcv_22) {
        cgo_0.onDropItem();
        cHE.a(fcv_22.n()).ifPresent(cHE::a);
    }

    public static void dropItemToSell(fcv_2 fcv_22, fug_0 fug_02) {
        cgo_0.onDropItem();
        cHE.a(fcv_22.n()).ifPresent(exk_22 -> cHE.a(exk_22, fug_02));
    }

    public static void selectItemToSellFromList(fck_2 fck_22, exk_2 exk_22, fug_0 fug_02) {
        if (!fzw_0.a.d("marketSellViewLock")) {
            return;
        }
        if (fck_22.x() != 1) {
            return;
        }
        cHE.a(exk_22, fug_02);
    }

    private static void a(exk_2 exk_22) {
        fyb_0 fyb_03 = fpm_0.b().k("marketDialog");
        fug_0 fug_02 = fyb_03 == null ? null : (fug_0)fyb_03.getElementRecursively("priceSellItemTE", fyb_02 -> !fyb_02.isATemplate());
        cHE.a(exk_22, fug_02);
    }

    private static void a(exk_2 exk_22, @Nullable fug_0 fug_02) {
        if (euu_2.f(azu_0.j().k().U_(), exk_22.a()) == null) {
            a.error((Object)"This item does not belong to the player");
            return;
        }
        dgQ dgQ2 = new dgQ();
        dgQ2.a(exk_22.e());
        dgQ2.a(exk_22);
        dgQ2.a(fug_02);
        add_2.b().a(dgQ2);
    }

    public static void filterInventoryItems(fzs fzs2, fuh_0 fuh_02) {
        String string = fuh_02.getText();
        bky_0.a().a(string);
    }

    public static void sortInventoryItemByName(fzs fzs2) {
        cHE.a(bhu_1.a);
    }

    public static void sortInventoryItemByLevel(fzs fzs2) {
        cHE.a(bhu_1.b);
    }

    public static void sortInventoryItemByPrice(fzs fzs2) {
        cHE.a(bhu_1.c);
    }

    public static void sortInventoryItemByQuantity(fzs fzs2) {
        cHE.a(bhu_1.d);
    }

    private static void a(Comparator<exk_2> comparator) {
        dfc dfc2 = new dfc(18553);
        dfc2.a(comparator);
        add_2.b().a(dfc2);
    }

    public static void showItemToSellPopup(fzs fzs2, fil_1 fil_12, fvE fvE2) {
        exk_2 exk_22 = bky_0.a().x().f();
        if (exk_22 == null) {
            return;
        }
        cJl.showPopup(null, exk_22, fil_12, fvE2);
    }

    public static void refreshSaleData(fcz_1 fcz_12) {
        if (!fcz_12.j()) {
            bky_0.a().x().b();
        }
    }

    public static void priceChanged(fcd_2 fcd_22, fug_0 fug_02) {
        if (fcd_22.k() == 10) {
            cHE.a();
            return;
        }
        long l = cHE.a(fug_02.getText(), 0L);
        if (l != bky_0.a().x().a()) {
            bky_0.a().x().a(l, l > 999999999999L);
        }
    }

    public static void quantityChanged(fcd_2 fcd_22, fug_0 fug_02) {
        if (fcd_22.k() == 10) {
            cHE.a();
            return;
        }
        int n = (int)cHE.a(fug_02.getText(), 0L);
        if (bky_0.a().x().i() != n) {
            cHE.a(n, n > bky_0.a().x().c());
        }
    }

    public static void setQuantityToOne(fzs fzs2) {
        cHE.a(1, true);
    }

    public static void removeOneFromQuantity(fzs fzs2, bkr_0 bkr_02) {
        cHE.a(bkr_02.i() - 1, true);
    }

    public static void setQuantityToHalf(fzs fzs2, bkr_0 bkr_02) {
        cHE.a(bkr_02.c() / 2, true);
    }

    public static void addOneToQuantity(fzs fzs2, bkr_0 bkr_02) {
        cHE.a(bkr_02.i() + 1, true);
    }

    public static void setQuantityToMax(fzs fzs2, bkr_0 bkr_02) {
        cHE.a(bkr_02.c(), true);
    }

    private static void a(int n, boolean bl) {
        bky_0.a().x().a(n, bl);
    }

    public static void sellDurationChanged(fcf_2 fcf_22) {
        if (!(fcf_22.l() instanceof bLg)) {
            a.error((Object)("[MARKET] Not a sell duration: " + fcf_22.l()));
            return;
        }
        bLg bLg2 = (bLg)fcf_22.l();
        add_2.b().a(new dgR(bLg2));
    }

    public static void cancelItemToSell(fzs fzs2) {
        dfc dfc2 = new dfc(18479);
        add_2.b().a(dfc2);
    }

    public static void sellItem(fck_2 fck_22) {
        cHE.a();
    }

    private static void a() {
        dfc dfc2 = new dfc(19079);
        add_2.b().a(dfc2);
    }

    public static void previousPage(fzs fzs2) {
        add_2.b().a(new dfc(19404));
    }

    public static void nextPage(fzs fzs2) {
        add_2.b().a(new dfc(16686));
    }

    public static void scrollMainSearch(fck_2 fck_22) {
        if (fck_22.z() > 0) {
            cHE.nextPage(fck_22);
        } else {
            cHE.previousPage(fck_22);
        }
    }

    public static void enterMainSearchRow(fcb_2 fcb_22) {
        if (fcb_22.j() instanceof bKX) {
            bky_0.a().a((bKX)fcb_22.j());
        }
    }

    public static void exitMainSearchRow(fcb_2 fcb_22) {
        bky_0.a().a((bKX)null);
    }

    public static void createOfferFromEntry(fzs fzs2, bKT bKT2, ftI ftI2) {
        ftI2.getAppearance().o();
        cHE.a(true, (bjw_1)bKT2.h().T());
    }

    public static void openStuffPreviewWindow(fzs fzs2, bKT bKT2) {
        ddo_0.b.a(bKT2.h());
    }

    public static void purchaseEntry(fzs fzs2, fvk_0 fvk_02, bKT bKT2) {
        fis_1.a().a("marketItemPurchase", new bkq_0(bKT2));
        fpm_0.b().a("marketConfirmPurchaseDialog", cfi_0.a("marketConfirmPurchaseDialog"), 385L, (short)10000);
    }

    public static void setItemPurchaseQuantityToOne(fzs fzs2, bkq_0 bkq_02) {
        bkq_02.a(1);
    }

    public static void removeOneToItemPurchaseQuantity(fzs fzs2, bkq_0 bkq_02) {
        bkq_02.a(bkq_02.e() - 1);
    }

    public static void setItemPurchaseQuantityToHalf(fzs fzs2, bkq_0 bkq_02) {
        bkq_02.a(bkq_02.a() / 2);
    }

    public static void addOneToItemPurchaseQuantity(fzs fzs2, bkq_0 bkq_02) {
        bkq_02.a(bkq_02.e() + 1);
    }

    public static void setItemPurchaseQuantityToMax(fzs fzs2, bkq_0 bkq_02) {
        bkq_02.a(bkq_02.a());
    }

    public static void updateItemPurchaseQuantity(fcd_2 fcd_22, bkq_0 bkq_02, fug_0 fug_02) {
        if (fcd_22.k() == 10) {
            cHE.confirmPurchase(fcd_22, bkq_02);
            return;
        }
        int n = (int)cHE.a(fug_02.getText(), 0L);
        if (bkq_02.e() != n) {
            bkq_02.a(n);
        }
    }

    public static void updateItemPurchaseQuantityWithMouseWheel(fck_2 fck_22, bkq_0 bkq_02) {
        int n = fck_22.t() ? 10 : 1;
        bkq_02.a(bkq_02.e() - fck_22.z() * n);
    }

    public static void confirmPurchase(fzs fzs2, bkq_0 bkq_02) {
        if (!bkq_02.b()) {
            return;
        }
        dfc dfc2 = new dfc(17154);
        dfc2.b(bkq_02.e());
        dfc2.a(bkq_02.c());
        add_2.b().a(dfc2);
        cHE.b();
    }

    public static void cancelPurchase(fzs fzs2) {
        cHE.b();
    }

    private static void b() {
        fis_1.a().a("marketItemPurchase", (Object)null);
        fpm_0.b().a("marketConfirmPurchaseDialog", false);
    }

    public static void similarEntriesSearchPreviousPage(fzs fzs2) {
        add_2.b().a(new dfc(17604));
    }

    public static void similarEntriesSearchNextPage(fzs fzs2) {
        add_2.b().a(new dfc(16010));
    }

    public static void scrollSimilarEntriesSearch(fck_2 fck_22) {
        if (fck_22.z() > 0) {
            cHE.similarEntriesSearchNextPage(fck_22);
        } else if (fck_22.z() < 0) {
            cHE.similarEntriesSearchPreviousPage(fck_22);
        }
    }

    public static void similarOffersSearchPreviousPage(fzs fzs2) {
        add_2.b().a(new dfc(17862));
    }

    public static void similarOffersSearchNextPage(fzs fzs2) {
        add_2.b().a(new dfc(19807));
    }

    public static void scrollSimilarOffersSearch(fck_2 fck_22) {
        if (fck_22.z() > 0) {
            cHE.similarOffersSearchNextPage(fck_22);
        } else if (fck_22.z() < 0) {
            cHE.similarOffersSearchPreviousPage(fck_22);
        }
    }

    public static void showItemDetails(fcb_2 fcb_22) {
        if (fcb_22.x() != 3) {
            return;
        }
        cHE.a(fcb_22.j()).ifPresent(exk_22 -> {
            fvE fvE2 = (fvE)fcb_22.e();
            cfq_0.sendOpenCloseItemDetailMessage(exk_22, fyf_0.a().c(), fcb_22.w() + fvE2.getHeight());
        });
    }

    public static void toggleAdvancedFiltersWindow(fzs fzs2) {
        add_2.b().a(new dfc(16434));
    }

    public static void removeFilter(fzs fzs2, bKH bKH2) {
        add_2.b().a(new dgU(bKH2));
    }

    public static void removeAllFilters(fzs fzs2) {
        add_2.b().a(new dfc(17565));
    }

    private static long a(@Nullable String string) {
        return cHE.a(string, -1L);
    }

    public static void collapseType(fzs fzs2, bLe bLe2) {
        add_2.b().a(new dgT(bLe2));
    }

    public static void collapseInventoryType(fzs fzs2, bLd bLd2) {
        add_2.b().a(new dgT(bLd2));
    }

    public static void toggleType(fcp_2 fcp_22, bLe bLe3) {
        boolean bl = fcp_22.j();
        if (bLe3.j() == bl) {
            return;
        }
        bLe3.c(bl);
        ArrayList<bKH> arrayList = new ArrayList<bKH>();
        bLe3.a(bLe2 -> arrayList.add(new bki_0((bLe)bLe2, () -> bLe2.c(false))));
        add_2.b().a(new dgX(arrayList));
    }

    public static void dropItemOnSearch(fcv_2 fcv_22, fuh_0 fuh_02) {
        cHE.a(fcv_22.n()).ifPresent(exk_22 -> cHE.a(exk_22, fuh_02));
    }

    public static void searchFromEntry(fzs fzs2, fuh_0 fuh_02, bKX bKX2) {
        cHE.a(bKX2.h(), fuh_02);
    }

    public static void searchFromClickOnItemList(fcf_2 fcf_22, fuh_0 fuh_02) {
        if (!fcf_22.k() || !(fcf_22.l() instanceof ezr_0)) {
            return;
        }
        exk_2 exk_22 = exk_2.a((ezr_0)fcf_22.l());
        cHE.a(exk_22, fuh_02);
    }

    private static void a(exk_2 exk_22, fuh_0 fuh_02) {
        bkk_0 bkk_02 = bky_0.a().b();
        boolean bl = cHE.a(exk_22, bkk_02);
        String string = exk_22.N();
        fuh_02.c(string);
        cHE.a(new bKK(string, exk_22.aT_(), bkk_02), bl, bkk_02);
    }

    private static boolean a(exk_2 exk_22, bkk_0 bkk_02) {
        Collection collection;
        ArrayList<bKH> arrayList = new ArrayList<bKH>();
        bKJ bKJ2 = (bKJ)bkk_02.a(bKG.b);
        if (bKJ2 != null && !bKJ2.c(exk_22.T().G())) {
            arrayList.add(bKJ2);
        }
        if ((collection = bkk_02.b(bKG.c)) != null && !collection.isEmpty() && collection.stream().noneMatch(bKQ2 -> bKQ2.g() == exk_22.G())) {
            arrayList.addAll(collection);
        }
        if (exk_22.T().ae() == 0) {
            arrayList.addAll(bkk_02.b(bKG.i));
            arrayList.addAll(bkk_02.b(bKG.j));
        }
        if (exk_22.T().q().a() == 0) {
            arrayList.addAll(bkk_02.b(bKG.k));
        }
        if (!arrayList.isEmpty()) {
            add_2.b().a(new dgU(false, arrayList));
        }
        return !arrayList.isEmpty();
    }

    public static void updateNameSearch(fzs fzs2, fuh_0 fuh_02) {
        bkk_0 bkk_02 = bky_0.a().b();
        d.a(bKG.a, () -> cHE.a(new bKK(fuh_02.getText(), bkk_02), false, bkk_02));
    }

    private static void a(bKK bKK2, boolean bl, bkk_0 bkk_02) {
        if (!bl && bKK2.equals(bkk_02.a(bKG.a))) {
            return;
        }
        add_2.b().a(new dgX(bKK2));
    }

    public static void setLevelSearchToCurrent(fzs fzs2, fug_0 fug_02, fug_0 fug_03) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null) {
            Cm<Short, Short> cm = ezi_1.c(bmr_12.dr());
            fug_02.setText(cm.a());
            fug_03.setText(cm.b());
            cHE.a(fug_02, fug_03, cm.a(), cm.b());
        }
    }

    public static void updateLevelSearch(fzs fzs2, fug_0 fug_02, fug_0 fug_03) {
        short s2 = (short)cHE.a(fug_02.getText());
        short s3 = (short)cHE.a(fug_03.getText());
        cHE.a(fug_02, fug_03, s2, s3);
    }

    private static void a(fug_0 fug_02, fug_0 fug_03, short s2, short s3) {
        bKJ bKJ2 = new bKJ(s2, s3, bky_0.a().b());
        cHE.a(fug_02, fug_03, bKJ2, s2, s3);
        d.a(bKG.b, () -> add_2.b().a(new dgX(bKJ2)));
    }

    private static void a(fug_0 fug_02, fug_0 fug_03, bKH bKH2, long l, long l2) {
        if (bKH2.a() || l == -1L && l2 == -1L) {
            fug_02.i();
            fug_03.i();
        } else {
            fug_02.getTextBuilder().a(new fyr_0(elw_1.al));
            fug_03.getTextBuilder().a(new fyr_0(elw_1.al));
        }
    }

    public static void resetRaritySearch(fzs fzs2) {
        add_2.b().a(new dgV(bKG.c));
    }

    public static void toggleRarity(fcp_2 fcp_22, bLl bLl2) {
        add_2.b().a(new dgW(bLl2, fcp_22.j()));
    }

    public static void toggleOnlyCheapest(fzs fzs2, fup_0 fup_02) {
        cHE.a(fzs2, fup_02, "market.filter.only.cheapest");
    }

    public static void toggleOnlyMostExpensive(fzs fzs2, fup_0 fup_02) {
        cHE.a(fzs2, fup_02, "market.filter.only.most.expensive");
    }

    private static void a(fzs fzs2, fup_0 fup_02, String string) {
        boolean bl = cHE.a(fzs2, fup_02);
        bkl_0 bkl_02 = new bkl_0(bl, string, bky_0.a().b());
        add_2.b().a(new dgX(bkl_02));
    }

    public static void toggleOnlyCanAfford(fcp_2 fcp_22) {
        bkm_0 bkm_02 = new bkm_0(fcp_22.j(), "market.filter.i.can.buy", bky_0.a().b());
        add_2.b().a(new dgX(bkm_02));
    }

    public static void toggleOnlyCanFulfill(fcp_2 fcp_22) {
        bkm_0 bkm_02 = new bkm_0(fcp_22.j(), "market.filter.i.can.fulfill", bky_0.a().b());
        add_2.b().a(new dgX(bkm_02));
    }

    public static void resetPriceSearch(fzs fzs2, fug_0 fug_02, fug_0 fug_03) {
        fug_02.i();
        fug_03.i();
        bky_0.a().b().f();
        add_2.b().a(new dgV(bKG.f));
    }

    public static void updatePriceSearch(fzs fzs2, fug_0 fug_02, fug_0 fug_03) {
        long l = cHE.a(fug_02.getText());
        long l2 = cHE.a(fug_03.getText());
        bKN bKN2 = new bKN(l, l2, bky_0.a().b());
        cHE.a(fug_02, fug_03, bKN2, l, l2);
        d.a(bKG.f, () -> add_2.b().a(new dgX(bKN2)));
    }

    public static void resetQuantitySearch(fzs fzs2, fug_0 fug_02, fug_0 fug_03) {
        fug_02.i();
        fug_03.i();
        bky_0.a().b().g();
        add_2.b().a(new dgV(bKG.h));
    }

    public static void updateQuantitySearch(fzs fzs2, fug_0 fug_02, fug_0 fug_03) {
        long l = cHE.a(fug_02.getText());
        long l2 = cHE.a(fug_03.getText());
        bko_1 bko_12 = new bko_1(l, l2, bky_0.a().b());
        cHE.a(fug_02, fug_03, bko_12, l, l2);
        d.a(bKG.h, () -> add_2.b().a(new dgX(bko_12)));
    }

    public static void resetPackSizeSearch(fzs fzs2) {
        add_2.b().a(new dgV(bKG.g));
    }

    public static void resetSlotAndSublimationSearch(fzs fzs2) {
        add_2.b().a(new dgV(bKG.i, bKG.j));
    }

    public static void toggleSlotsFixedOrder(fzs fzs2, fup_0 fup_02) {
        boolean bl = cHE.a(fzs2, fup_02);
        cHE.a(bl);
    }

    public static void changeSlotColor(fcf_2 fcf_22, bLi bLi2, fup_0 fup_02) {
        if (!fcf_22.k() || !(fcf_22.l() instanceof bLh)) {
            return;
        }
        bLi2.a((bLh)fcf_22.l());
        cHE.a(fup_02.getSelected());
    }

    private static void a(boolean bl) {
        dfc dfc2 = new dfc(16988);
        dfc2.a(bl);
        add_2.b().a(dfc2);
    }

    public static void resetSlotSearch(fzs fzs2) {
        add_2.b().a(new dfc(16303));
    }

    public static void onHoverSublimation(fcb_2 fcb_22, fil_1 fil_12, fvE fvE2) {
        if (!(fcb_22.j() instanceof bLj)) {
            return;
        }
        int n = ((bLj)fcb_22.j()).b();
        bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(n);
        if (bjw_12.q().a() == 0) {
            return;
        }
        efh_0 efh_02 = bjw_12.q().a(0);
        int n2 = (int)efh_02.a(0);
        short s2 = (short)efh_02.a(1);
        fie_0 fie_02 = fih_0.a().a(n2);
        if (fie_02 == null) {
            return;
        }
        fis_1.a().a("describedState", fie_02.c() == s2 ? fie_02 : fie_02.c(s2));
        fpu_0.popup(fil_12, fvE2);
        fvE2.addEventListener(frd_0.G, new cHF(fvE2), true);
    }

    public static void selectBasicSublimation(fcf_2 fcf_22, fuh_0 fuh_02) {
        cHE.a(fcf_22, false, fuh_02);
    }

    public static void selectSpecialSublimation(fcf_2 fcf_22, fuh_0 fuh_02) {
        cHE.a(fcf_22, true, fuh_02);
    }

    private static void a(fcf_2 fcf_22, boolean bl, fuh_0 fuh_02) {
        if (!fcf_22.k() || !(fcf_22.l() instanceof bLj)) {
            return;
        }
        bLj bLj2 = (bLj)fcf_22.l();
        cHE.a(bLj2, bl, fuh_02);
    }

    private static void a(bLj bLj2, boolean bl, fuh_0 fuh_02) {
        bks_0 bks_02 = new bks_0(bLj2, bl, bky_0.a().b());
        fuh_02.c(bLj2.a());
        add_2.b().a(new dgX(bks_02));
    }

    public static void updateSublimationSearch(fzs fzs2, fuh_0 fuh_02) {
        bLj bLj2;
        String string = fuh_02.getText();
        if (string == null || string.isBlank()) {
            cHE.clearBasicSublimationSearch(null);
        }
        if ((bLj2 = bky_0.a().b().a(string, false)) != null) {
            cHE.a(bLj2, false, fuh_02);
        } else {
            cHE.clearBasicSublimationSearch(null);
        }
        bky_0.a().b().l().a(string);
    }

    public static void clearBasicSublimationSearch(@Nullable fcl_1 fcl_12) {
        Object t = bky_0.a().b().a(bKG.j, 0);
        if (t != null) {
            add_2.b().a(new dgU((bKH)t));
        }
        bky_0.a().b().l().a((String)null);
    }

    public static void updateSpecialSublimationSearch(fzs fzs2, fuh_0 fuh_02) {
        String string = fuh_02.getText();
        if (string == null || string.isBlank()) {
            cHE.clearSpecialSublimationSearch(null);
            return;
        }
        bLj bLj2 = bky_0.a().b().a(string, true);
        if (bLj2 != null) {
            cHE.a(bLj2, true, fuh_02);
        } else {
            cHE.clearSpecialSublimationSearch(null);
        }
        bky_0.a().b().l().b(string);
    }

    public static void clearSpecialSublimationSearch(@Nullable fcl_1 fcl_12) {
        Object t = bky_0.a().b().a(bKG.j, 1);
        if (t != null) {
            add_2.b().a(new dgU((bKH)t));
        }
        bky_0.a().b().l().b((String)null);
    }

    public static void toggleRandomElements(fcp_2 fcp_22) {
        dfc dfc2 = new dfc(19988);
        dfc2.a(fcp_22.j());
        add_2.b().a(dfc2);
    }

    public static void resetCharacteristicsSearch(fzs fzs2) {
        add_2.b().a(new dgV(bKG.k));
    }

    public static void updateCharacteristicsSearch(fzs fzs2, bkz_0 bkz_02, fug_0 fug_02) {
        int n = (int)cHE.a(fug_02.getText());
        bkz_02.a(n);
        bKF bKF2 = new bKF(bkz_02.c(), n, () -> {
            bkz_02.a(-1);
            fis_1.a().a((ajf_1)bkz_02, "minValue");
        });
        d.a(bKG.k, ((bKH)bKF2).aW_(), () -> add_2.b().a(new dgX(bKF2)));
    }

    public static void marketHistoryPreviousPage(fzs fzs2) {
        add_2.b().a(new dfc(18912));
    }

    public static void marketHistoryNextPage(fzs fzs2) {
        add_2.b().a(new dfc(19229));
    }

    public static void scrollMarketHistorySearch(fck_2 fck_22) {
        if (fck_22.z() > 0) {
            cHE.marketHistoryNextPage(fck_22);
        } else {
            cHE.marketHistoryPreviousPage(fck_22);
        }
    }

    public static void searchHistoryFromClickOnItemList(fcf_2 fcf_22, fuh_0 fuh_02) {
        if (!fcf_22.k() || !(fcf_22.l() instanceof ezr_0)) {
            return;
        }
        ezr_0 ezr_02 = (ezr_0)fcf_22.l();
        fuh_02.c(ezr_02.e());
        cHE.a(ezr_02.e(), fuh_02);
    }

    public static void updateHistoryNameSearch(fzs fzs2, fuh_0 fuh_02) {
        d.a(bKG.a, () -> cHE.a(fuh_02.getText(), fuh_02));
    }

    private static void a(String string, fuh_0 fuh_02) {
        fay_0 fay_02;
        String string2;
        String string3 = Cz.e(string);
        if (string3.equals(string2 = (fay_02 = daw.d().v()).c())) {
            return;
        }
        bhc_1.a().b();
        fay_02.a(string3.isBlank() ? null : string3).a(bae.h().f());
        add_2.b().a(new dfc(16559));
    }

    public static void updateHistoryPriceSearch(fzs fzs2, fug_0 fug_02, fug_0 fug_03) {
        long l = cHE.a(fug_02.getText());
        long l2 = cHE.a(fug_03.getText());
        bKN bKN2 = new bKN(l, l2);
        cHE.a(fug_02, fug_03, bKN2, l, l2);
        d.a(bKG.f, () -> {
            fay_0 fay_02 = daw.d().v();
            long l3 = fay_02.f();
            long l4 = fay_02.g();
            if (l == l3 && l2 == l4) {
                return;
            }
            fay_02.a(l).b(l2);
            add_2.b().a(new dfc(16559));
        });
    }

    public static void selectHistoryElementType(fcf_2 fcf_22) {
        fay_0 fay_02;
        if (!(fcf_22.l() instanceof bKU)) {
            a.error((Object)("[MARKET] Not a history element type: " + fcf_22.l()));
            return;
        }
        @Nullable faJ faJ2 = ((bKU)fcf_22.l()).a();
        if (faJ2 == (fay_02 = daw.d().v()).e()) {
            return;
        }
        fay_02.a(faJ2);
        fis_1.a().a((ajf_1)bky_0.a(), "selectedTimespan");
        add_2.b().a(new dfc(16559));
    }

    public static void selectHistoryTimespan(fcf_2 fcf_22) {
        fay_0 fay_02;
        if (!(fcf_22.l() instanceof bLk)) {
            a.error((Object)("[MARKET] Not a timespan: " + fcf_22.l()));
            return;
        }
        faP faP2 = ((bLk)fcf_22.l()).a();
        if (faP2 == (fay_02 = daw.d().v()).h()) {
            return;
        }
        fay_02.a(faP2);
        fis_1.a().a((ajf_1)bky_0.a(), "selectedTimespan");
        add_2.b().a(new dfc(16559));
    }

    public static void openOfferItemChoiceDialog(fzs fzs2) {
        add_2.b().a(new dfc(17110));
    }

    public static void updateOfferItemChoiceSearch(fzs fzs2, fuh_0 fuh_02) {
        dfc dfc2 = new dfc(16550);
        dfc2.a(fuh_02.getText());
        add_2.b().a(dfc2);
    }

    public static void selectOfferItem(fcf_2 fcf_22) {
        if (!fcf_22.k() || !(fcf_22.l() instanceof bjw_1)) {
            return;
        }
        cHE.a(true, (bjw_1)fcf_22.l());
    }

    public static void dropItemToCreateOffer(fcv_2 fcv_22) {
        if (!(fcv_22.n() instanceof exk_2)) {
            return;
        }
        cgo_0.onDropItem();
        cHE.a(true, (bjw_1)((exk_2)fcv_22.n()).T());
    }

    public static void showOfferItemPopup(fzs fzs2, fil_1 fil_12, fvE fvE2) {
        bjw_1 bjw_12 = bky_0.a().y().h();
        if (bjw_12 == null) {
            return;
        }
        cJl.showPopup(null, exk_2.a(bjw_12), fil_12, fvE2);
    }

    public static void disableCreateOfferMode(fzs fzs2) {
        cHE.a(false, null);
    }

    private static void a(boolean bl, bjw_1 bjw_12) {
        dfc dfc2 = new dfc(19686);
        dfc2.a(bl);
        dfc2.a(bjw_12);
        add_2.b().a(dfc2);
    }

    public static void sendCreateOfferMessage() {
        add_2.b().a(new dfc(19376));
    }

    public static void refreshCreateOfferData(fcz_1 fcz_12) {
        if (!fcz_12.j()) {
            bky_0.a().y().b();
        }
    }

    public static void offerUnitPriceChanged(fcd_2 fcd_22, fug_0 fug_02) {
        if (fcd_22.k() == 10) {
            cHE.sendCreateOfferMessage();
            return;
        }
        long l = cHE.a(fug_02.getText(), 0L);
        if (l != bky_0.a().y().a()) {
            bky_0.a().y().a(l, l > 999999999999L);
        }
    }

    public static void offerQuantityChanged(fcd_2 fcd_22, fug_0 fug_02) {
        if (fcd_22.k() == 10) {
            cHE.sendCreateOfferMessage();
            return;
        }
        cHE.a(fug_02.getText(), false);
    }

    public static void setOfferQuantityTo(fzs fzs2, String string) {
        cHE.a(string, true);
    }

    private static void a(String string, boolean bl) {
        int n = (int)cHE.a(string, 0L);
        if (n != bky_0.a().y().i()) {
            bky_0.a().y().a(n, bl || n > 999999);
        }
    }

    public static void offerSellDurationChanged(fcf_2 fcf_22) {
        if (!(fcf_22.l() instanceof bLg)) {
            a.error((Object)("[MARKET] Not a sell duration: " + fcf_22.l()));
            return;
        }
        bLg bLg2 = (bLg)fcf_22.l();
        if (bLg2 != bky_0.a().y().j()) {
            bky_0.a().y().a(bLg2);
        }
    }

    public static void offerItemLevelChanged(fcd_2 fcd_22, fug_0 fug_02) {
        if (fcd_22.k() == 10) {
            cHE.sendCreateOfferMessage();
            return;
        }
        short s2 = (short)cHE.a(fug_02.getText());
        if (s2 != bky_0.a().y().k()) {
            bky_0.a().y().a(s2);
        }
    }

    public static void toggleOfferSlotsFixedOrder(fzs fzs2, fup_0 fup_02) {
        boolean bl = cHE.a(fzs2, fup_02);
        bky_0.a().y().a(bl);
        cHE.a(bl, bl);
    }

    public static void changeOfferSlotColor(fcf_2 fcf_22, bLi bLi2, fup_0 fup_02) {
        if (!fcf_22.k() || !(fcf_22.l() instanceof bLh)) {
            return;
        }
        bLh bLh2 = (bLh)fcf_22.l();
        boolean bl = bLh2.a() != bLi2.b().a();
        bLi2.a(bLh2);
        cHE.a(fup_02.getSelected(), bl);
    }

    private static void a(boolean bl, boolean bl2) {
        dfc dfc2 = new dfc(16283);
        dfc2.a(bl);
        dfc2.b(bl2 ? 1 : 0);
        add_2.b().a(dfc2);
    }

    public static void resetOfferSlots(fzs fzs2) {
        add_2.b().a(new dfc(16864));
    }

    public static void selectOfferBasicSublimation(fcf_2 fcf_22) {
        if (!fcf_22.k() || !(fcf_22.l() instanceof bLj)) {
            return;
        }
        bLj bLj2 = (bLj)fcf_22.l();
        cHE.a(bLj2);
    }

    private static void a(@Nullable bLj bLj2) {
        if (bLj2 != bky_0.a().y().m().p()) {
            bky_0.a().y().a(bLj2);
        }
    }

    public static void updateOfferBasicSublimation(fzs fzs2, fuh_0 fuh_02) {
        String string = fuh_02.getText();
        bky_0.a().y().m().a(string);
        if (string == null || string.isBlank()) {
            cHE.clearOfferBasicSublimation(null);
        }
        bLj bLj2 = bky_0.a().y().a(string, false);
        cHE.a(bLj2);
    }

    public static void selectOfferSpecialSublimation(fcf_2 fcf_22) {
        if (!fcf_22.k() || !(fcf_22.l() instanceof bLj)) {
            return;
        }
        bLj bLj2 = (bLj)fcf_22.l();
        cHE.b(bLj2);
    }

    private static void b(@Nullable bLj bLj2) {
        if (bLj2 != bky_0.a().y().m().q()) {
            bky_0.a().y().b(bLj2);
        }
    }

    public static void updateOfferSpecialSublimation(fzs fzs2, fuh_0 fuh_02) {
        String string = fuh_02.getText();
        bky_0.a().y().m().b(string);
        if (string == null || string.isBlank()) {
            cHE.clearOfferSpecialSublimation(null);
        }
        bLj bLj2 = bky_0.a().y().a(string, false);
        cHE.b(bLj2);
    }

    public static void clearOfferBasicSublimation(@Nullable fzs fzs2) {
        bky_0.a().y().m().a((String)null);
        bky_0.a().y().a((bLj)null);
    }

    public static void clearOfferSpecialSublimation(@Nullable fzs fzs2) {
        bky_0.a().y().m().b((String)null);
        bky_0.a().y().b((bLj)null);
    }

    public static void createOffer(fzs fzs2) {
        cHE.sendCreateOfferMessage();
    }

    public static void fulfillOffer(fzs fzs2, fvk_0 fvk_02, bKY bKY2) {
        dfc dfc2 = new dfc(17990);
        dfc2.a(bKY2);
        add_2.b().a(dfc2);
    }

    public static void cancelFulfillment(fzs fzs2) {
        cHE.closeOfferFulfillWindow();
    }

    public static void closeOfferFulfillWindow() {
        fis_1.a().a("marketOfferFulfillment", (Object)null);
        fpm_0.b().a("marketFulfillOfferDialog", false);
    }

    public static void dropItemToFulfillOffer(fcv_2 fcv_22) {
        if (!(fcv_22.n() instanceof exk_2)) {
            return;
        }
        cgo_0.onDropItem();
        cHE.b((exk_2)fcv_22.n());
    }

    private static void b(exk_2 exk_22) {
        if (!fzw_0.a.d("marketFulfillOfferLock")) {
            return;
        }
        dfc dfc2 = new dfc(16014);
        dfc2.a(exk_22);
        add_2.b().a(dfc2);
    }

    public static void removeItemFulfillingOffer(fzs fzs2, bko_0 bko_02) {
        dfc dfc2 = new dfc(19179);
        dfc2.a(bko_02.h());
        add_2.b().a(dfc2);
    }

    public static void autoFulfillOffer(fzs fzs2) {
        add_2.b().a(new dfc(17234));
    }

    public static void updateOfferFulfillmentItemQuantity(fcd_2 fcd_22, fug_0 fug_02, bkn_0 bkn_02, bko_0 bko_02) {
        if (fcd_22.k() == 10) {
            cHE.confirmOfferFulfillment(null);
            return;
        }
        int n = (int)cHE.a(fug_02.getText(), 0L);
        if (n != bko_02.c()) {
            bkn_02.a(bko_02, n);
        }
    }

    public static void setOfferFulfillmentItemQuantityToMax(fzs fzs2, bkn_0 bkn_02, bko_0 bko_02) {
        bkn_02.a(bko_02, bko_02.a());
    }

    public static void confirmOfferFulfillment(fzs fzs2) {
        add_2.b().a(new dfc(18974));
    }

    public static void updateCurrentOffersNameSearch(fzs fzs2, fuh_0 fuh_02) {
        dfc dfc2 = new dfc(19714);
        dfc2.a(fuh_02.getText());
        add_2.b().a(dfc2);
    }

    public static void searchCurrentOffersFromClickOnItemList(fcf_2 fcf_22, fuh_0 fuh_02) {
        if (!fcf_22.k() || !(fcf_22.l() instanceof ezr_0)) {
            return;
        }
        ezr_0 ezr_02 = (ezr_0)fcf_22.l();
        fuh_02.c(ezr_02.e());
        cHE.updateOnSaleEntriesNameSearch(null, fuh_02);
    }

    public static void currentOffersPreviousPage(fzs fzs2) {
        add_2.b().a(new dfc(18320));
    }

    public static void currentOffersNextPage(fzs fzs2) {
        add_2.b().a(new dfc(16515));
    }

    public static void scrollOnCurrentOffers(fck_2 fck_22) {
        if (fck_22.z() > 0) {
            cHE.currentOffersNextPage(fck_22);
        } else {
            cHE.currentOffersPreviousPage(fck_22);
        }
    }

    public static void cancelCurrentOffer(fzs fzs2, bKY bKY2) {
        dfc dfc2 = new dfc(17754);
        dfc2.a(bKY2);
        add_2.b().a(dfc2);
    }

    public static void toggleExpiredOffersDetailWindow(fzs fzs2) {
        add_2.b().a(new dfc(16250));
    }

    public static void expiredOffersPreviousPage(fzs fzs2) {
        add_2.b().a(new dfc(16463));
    }

    public static void expiredOffersNextPage(fzs fzs2) {
        add_2.b().a(new dfc(18492));
    }

    public static void scrollExpiredOffersSearch(fck_2 fck_22) {
        if (fck_22.z() > 0) {
            cHE.expiredOffersNextPage(fck_22);
        } else {
            cHE.expiredOffersPreviousPage(fck_22);
        }
    }

    public static void retrieveAllExpiredOffersKamas(fzs fzs2) {
        add_2.b().a(new dfc(16105));
    }

    public static void togglePurchasedItemsDetailWindow(fzs fzs2) {
        add_2.b().a(new dfc(19826));
    }

    public static void purchasedItemsPreviousPage(fzs fzs2) {
        add_2.b().a(new dfc(18652));
    }

    public static void purchasedItemsNextPage(fzs fzs2) {
        add_2.b().a(new dfc(17994));
    }

    public static void scrollPurchasedItemsSearch(fck_2 fck_22) {
        if (fck_22.z() > 0) {
            cHE.purchasedItemsNextPage(fck_22);
        } else {
            cHE.purchasedItemsPreviousPage(fck_22);
        }
    }

    public static void retrieveOnePurchasedItem(fzs fzs2, bKZ bKZ2) {
        dfc dfc2 = new dfc(19033);
        dfc2.a(bKZ2);
        add_2.b().a(dfc2);
    }

    public static void retrieveAllOfferPurchasedItems(fzs fzs2) {
        add_2.b().a(new dfc(19116));
    }

    public static void openOptionsTab(fzs fzs2) {
        dfc dfc2 = new dfc(17251);
        dfc2.a((byte)99);
        add_2.b().a(dfc2);
    }

    private static void a(bWe bWe2, fcp_2 fcp_22) {
        boolean bl = fcp_22.j();
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe2, bl);
    }

    private static void a(bWe bWe2, fcf_2 fcf_22) {
        if (!fcf_22.k()) {
            return;
        }
        Object object = fcf_22.l();
        if (!(object instanceof bLb)) {
            return;
        }
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe2, ((bLb)object).a());
    }

    public static void changeOpenInventory(fcp_2 fcp_22) {
        cHE.a(bWe.aY, fcp_22);
    }

    public static void changeKeepLastSearch(fcp_2 fcp_22) {
        cHE.a(bWe.aZ, fcp_22);
    }

    public static void changeIncludeOtherRarities(fcp_2 fcp_22) {
        cHE.a(bWe.ba, fcp_22);
        dfc dfc2 = new dfc(17963);
        dfc2.a((Object)bKG.a);
        add_2.b().a(dfc2);
    }

    public static void changeSellItemPriceFieldKeepMode(fcf_2 fcf_22) {
        cHE.a(bWe.bb, fcf_22);
    }

    public static void changeSellItemQuantityFieldKeepMode(fcf_2 fcf_22) {
        cHE.a(bWe.bc, fcf_22);
    }

    public static void changeSellItemKeepSellDuration(fcp_2 fcp_22) {
        cHE.a(bWe.bd, fcp_22);
    }

    public static void changeCreateOfferPriceFieldKeepMode(fcf_2 fcf_22) {
        cHE.a(bWe.be, fcf_22);
    }

    public static void changeCreateOfferQuantityFieldKeepMode(fcf_2 fcf_22) {
        cHE.a(bWe.bf, fcf_22);
    }

    public static void changeCreateOfferKeepSellDuration(fcp_2 fcp_22) {
        cHE.a(bWe.bg, fcp_22);
    }

    public static void changeCreateOfferKeepSlotsAndSublimations(fcp_2 fcp_22) {
        cHE.a(bWe.bh, fcp_22);
    }

    public static void changeCreateOfferKeepItemLevel(fcp_2 fcp_22) {
        cHE.a(bWe.bi, fcp_22);
    }
}

