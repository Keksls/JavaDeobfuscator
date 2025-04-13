/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.GameActionsActionsTypeMeta
 *  com.ankama.haapi.client.okhttp.ankama.model.GameActionsDefinition
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopArticle
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopHighlight
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopPrice
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopPromo
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReference
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeAccountStatus
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeGameAction
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeIceGift
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeKard
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeOgrine
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeVirtualSubscriptionLevel
 *  com.ankama.shopi.client.model.AccountStatusReference
 *  com.ankama.shopi.client.model.Article
 *  com.ankama.shopi.client.model.ArticleNonVirtualPaymentMode
 *  com.ankama.shopi.client.model.ArticlePaymentModeOneOf
 *  com.ankama.shopi.client.model.ArticlePaymentModeOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ArticleVirtualPaymentMode
 *  com.ankama.shopi.client.model.Category
 *  com.ankama.shopi.client.model.ClassicReference
 *  com.ankama.shopi.client.model.GameActionActionOneOf
 *  com.ankama.shopi.client.model.GameActionDefinition
 *  com.ankama.shopi.client.model.GameActionReference
 *  com.ankama.shopi.client.model.GoultineReference
 *  com.ankama.shopi.client.model.KardReference
 *  com.ankama.shopi.client.model.MetadataOneOf
 *  com.ankama.shopi.client.model.MetadataOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.OgrineReference
 *  com.ankama.shopi.client.model.OgrineTokenReference
 *  com.ankama.shopi.client.model.Price
 *  com.ankama.shopi.client.model.PromoteCarousel
 *  com.ankama.shopi.client.model.PromoteTargetOneOf
 *  com.ankama.shopi.client.model.PromoteTargetOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.Promotion
 *  com.ankama.shopi.client.model.ReferenceOneOf
 *  com.ankama.shopi.client.model.ReferenceOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ServerReference
 *  com.ankama.shopi.client.model.SingleReference
 *  com.ankama.shopi.client.model.StringMetadata
 *  com.ankama.shopi.client.model.VirtualPaymentModeId
 *  com.ankama.shopi.client.model.VirtualSubscriptionReference
 *  com.ankama.shopi.client.model.VodReference
 *  com.ankama.shopi.client.model.WakfuItemAction
 *  com.ankama.shopi.client.model.WavenItemReference
 *  com.ankama.shopi.client.model.WebtoonReference
 *  com.google.gson.GsonBuilder
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jsoup.Jsoup
 *  org.threeten.bp.DateTimeUtils
 *  org.threeten.bp.Instant
 */
import com.ankama.haapi.client.okhttp.ankama.model.GameActionsActionsTypeMeta;
import com.ankama.haapi.client.okhttp.ankama.model.GameActionsDefinition;
import com.ankama.haapi.client.okhttp.ankama.model.ShopArticle;
import com.ankama.haapi.client.okhttp.ankama.model.ShopHighlight;
import com.ankama.haapi.client.okhttp.ankama.model.ShopPrice;
import com.ankama.haapi.client.okhttp.ankama.model.ShopPromo;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReference;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeAccountStatus;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeGameAction;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeIceGift;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeKard;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeOgrine;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeVirtualSubscriptionLevel;
import com.ankama.shopi.client.model.AccountStatusReference;
import com.ankama.shopi.client.model.Article;
import com.ankama.shopi.client.model.ArticleNonVirtualPaymentMode;
import com.ankama.shopi.client.model.ArticlePaymentModeOneOf;
import com.ankama.shopi.client.model.ArticleVirtualPaymentMode;
import com.ankama.shopi.client.model.Category;
import com.ankama.shopi.client.model.ClassicReference;
import com.ankama.shopi.client.model.GameActionActionOneOf;
import com.ankama.shopi.client.model.GameActionDefinition;
import com.ankama.shopi.client.model.GameActionReference;
import com.ankama.shopi.client.model.GoultineReference;
import com.ankama.shopi.client.model.KardReference;
import com.ankama.shopi.client.model.MetadataOneOf;
import com.ankama.shopi.client.model.OgrineReference;
import com.ankama.shopi.client.model.OgrineTokenReference;
import com.ankama.shopi.client.model.Price;
import com.ankama.shopi.client.model.PromoteCarousel;
import com.ankama.shopi.client.model.PromoteTargetOneOf;
import com.ankama.shopi.client.model.Promotion;
import com.ankama.shopi.client.model.ReferenceOneOf;
import com.ankama.shopi.client.model.ServerReference;
import com.ankama.shopi.client.model.SingleReference;
import com.ankama.shopi.client.model.StringMetadata;
import com.ankama.shopi.client.model.VirtualPaymentModeId;
import com.ankama.shopi.client.model.VirtualSubscriptionReference;
import com.ankama.shopi.client.model.VodReference;
import com.ankama.shopi.client.model.WakfuItemAction;
import com.ankama.shopi.client.model.WavenItemReference;
import com.ankama.shopi.client.model.WebtoonReference;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.Jsoup;
import org.threeten.bp.DateTimeUtils;
import org.threeten.bp.Instant;

/*
 * Renamed from bSp
 */
public class bsp_2 {
    private static final Logger b = Logger.getLogger(bsp_2.class);
    private static final String c = "OG";
    private static final String d = "SW";
    private static final String e = "WD";
    public static final bsp_2 a = new bsp_2();
    private bsz_1 f;
    private String g;

    private bsp_2() {
    }

    public void a(String string) {
        this.f = bsz_1.a(string);
    }

    public void b(String string) {
        this.g = string;
    }

    public bsz_1 a() {
        return this.f;
    }

    static List<bsv_0<?, ?>> a(List<ShopHighlight> list) {
        return list.stream().map(bsp_2::a).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
    }

    private static Optional<bsc_0> a(ShopHighlight shopHighlight) {
        int n = Co.c(shopHighlight.getId());
        try {
            String string = shopHighlight.getName();
            String string2 = shopHighlight.getDescription();
            String string3 = shopHighlight.getLink();
            String string4 = shopHighlight.getType();
            String string5 = shopHighlight.getMode();
            ArrayList<bsg_2> arrayList = bsg_2.a(shopHighlight.getImage());
            bsa_0 bsa_02 = string4.equals("ARTICLE") && shopHighlight.getExternalArticle() != null ? bsp_2.a(shopHighlight.getExternalArticle()) : null;
            Integer n2 = string4.equals("CATEGORY") && shopHighlight.getExternalCategory() != null ? Integer.valueOf(Co.c(shopHighlight.getExternalCategory().getId())) : null;
            return Optional.of(new bsc_0(n, string, string2, string3, string4, string5, arrayList, bsa_02, n2));
        }
        catch (Exception exception) {
            b.error((Object)("Highlight with id " + n + " can't be loaded"), (Throwable)exception);
            return Optional.empty();
        }
    }

    @Nullable
    public static bsa_0 a(ShopArticle shopArticle) {
        ArrayList<bse_0> arrayList;
        if (!bsp_2.a(shopArticle.getIngameConditions(), shopArticle.getId())) {
            return null;
        }
        ArrayList<bsg_2> arrayList2 = bsg_2.a(shopArticle.getImage());
        ArrayList<bSJ> arrayList3 = new ArrayList<bSJ>();
        List list = shopArticle.getReferences();
        bsp_2.a(arrayList3, list);
        List list2 = shopArticle.getPromo();
        if (list2 != null) {
            arrayList = new ArrayList<bse_0>();
            bsp_2.a(arrayList, list2);
        } else {
            arrayList = null;
        }
        bsz_1 bsz_12 = bsz_1.a(shopArticle.getCurrency());
        Float f2 = bsz_12 == bsz_1.a ? shopArticle.getPrice() : Float.valueOf(0.0f);
        Float f3 = bsz_12 == bsz_1.a ? shopArticle.getOriginalPrice() : Float.valueOf(0.0f);
        bsz_1 bsz_13 = bsz_12 == bsz_1.a ? bsz_1.a : null;
        Float f4 = null;
        Float f5 = null;
        bsz_1 bsz_14 = null;
        Float f6 = null;
        Float f7 = null;
        bsz_1 bsz_15 = null;
        List list3 = shopArticle.getPricelist();
        if (list3 != null) {
            boolean bl = bPL.a.e();
            boolean bl2 = false;
            bsz_1 bsz_16 = bsp_2.a.f;
            for (ShopPrice shopPrice : list3) {
                if (!bl && bsp_2.a.g.equals(shopPrice.getPaymentmode()) && e.equals(shopPrice.getCountry())) {
                    f6 = shopPrice.getPrice();
                    f7 = shopPrice.getOriginalPrice();
                    bsz_15 = bsz_1.a(shopPrice.getCurrency());
                }
                if (!bl && bsp_2.a.g.equals(shopPrice.getPaymentmode()) && !e.equals(shopPrice.getCountry()) && bsz_16 != null && shopPrice.getCurrency().equals(bsz_16.b())) {
                    f4 = shopPrice.getPrice();
                    f5 = shopPrice.getOriginalPrice();
                    bsz_14 = bsz_1.a(shopPrice.getCurrency());
                }
                if (bl && d.equals(shopPrice.getPaymentmode()) && bsz_16 != null && shopPrice.getCurrency().equals(bsz_16.b())) {
                    f2 = shopPrice.getPrice();
                    f3 = shopPrice.getOriginalPrice();
                    bsz_13 = bsz_1.a(shopPrice.getCurrency());
                    bl2 = true;
                }
                if (bl && !bl2) {
                    f2 = shopPrice.getPrice();
                    f3 = shopPrice.getOriginalPrice();
                    bsz_13 = bsz_1.a(shopPrice.getCurrency());
                    bl2 = true;
                }
                if (!c.equals(shopPrice.getPaymentmode())) continue;
                f2 = shopPrice.getPrice();
                f3 = shopPrice.getOriginalPrice();
                bsz_13 = bsz_1.a(shopPrice.getCurrency());
            }
        }
        return new bsa_0(Hw.e(shopArticle.getId()), shopArticle.getKey(), shopArticle.getName(), shopArticle.getDescription(), shopArticle.getSubtitle(), f2 == null ? null : Float.valueOf(Hw.a(f2.floatValue(), 2)), f3, bsz_13, (Integer)Hw.e(shopArticle.getStock() != null ? shopArticle.getStock() : -1L), arrayList3, shopArticle.getReferences(), arrayList2, arrayList, shopArticle.getEnddate() != null && shopArticle.getShowCountDown() != false ? wt_0.a(DateTimeUtils.toDate((Instant)shopArticle.getEnddate().toInstant())) : wt_0.b(), Float.valueOf(Hw.a(((Float)Optional.ofNullable(f4).orElse(Optional.ofNullable(f6).orElse(Float.valueOf(-1.0f)))).floatValue(), 2)), Optional.ofNullable(f5).orElse(Optional.ofNullable(f7).orElse(Float.valueOf(-1.0f))), Optional.ofNullable(bsz_14).orElse(bsz_15));
    }

    private static void a(Collection<bse_0> collection, List<ShopPromo> list) {
        for (ShopPromo shopPromo : list) {
            String string = shopPromo.getName();
            String string2 = shopPromo.getDescription();
            collection.add(new bse_0(string, string2));
        }
    }

    private static void a(ArrayList<bSJ> arrayList, List<ShopReference> list) {
        for (ShopReference shopReference : list) {
            bsx_0 bsx_02 = bsx_0.a(shopReference.getType());
            switch (bsx_02) {
                case a: 
                case b: {
                    bsp_2.a(arrayList, shopReference.getReferenceIcegift(), bsx_02);
                    break;
                }
                case c: {
                    bsp_2.a(arrayList, shopReference.getReferenceVirtualsubscriptionlevel());
                    break;
                }
                case d: {
                    bsp_2.a(arrayList, shopReference.getReferenceAccountstatus());
                    break;
                }
                case e: {
                    bsp_2.a(arrayList, shopReference.getReferenceOgrine());
                    break;
                }
                case g: {
                    bsp_2.a(arrayList, shopReference.getReferenceGameaction(), (long)shopReference.getQuantity());
                    break;
                }
                case h: {
                    bsp_2.b(arrayList, shopReference.getReferenceKard());
                    break;
                }
            }
        }
    }

    private static void a(List<bSJ> list, ShopReferenceTypeGameAction shopReferenceTypeGameAction, long l) {
        if (shopReferenceTypeGameAction == null) {
            return;
        }
        GameActionsDefinition gameActionsDefinition = shopReferenceTypeGameAction.getDefinition();
        if (gameActionsDefinition == null) {
            b.error((Object)"We have an action without definition");
            return;
        }
        List list2 = gameActionsDefinition.getActions();
        for (GameActionsActionsTypeMeta gameActionsActionsTypeMeta : list2) {
            if (esc_1.b.a().equalsIgnoreCase(gameActionsActionsTypeMeta.getType())) {
                Long l2 = gameActionsActionsTypeMeta.getQuantity();
                bSJ bSJ2 = new bSJ(gameActionsActionsTypeMeta.getItemId().intValue(), Hw.a(l * (l2 != null ? l2 : 0L), 0L, Long.MAX_VALUE), bsx_0.g);
                list.add(bSJ2);
                continue;
            }
            b.error((Object)("We have an action with a unhandled type : " + gameActionsActionsTypeMeta.getType() + ", on action definition : " + gameActionsDefinition.getId()));
        }
    }

    private static void a(Collection<bSJ> collection, ShopReferenceTypeAccountStatus shopReferenceTypeAccountStatus) {
        bSJ bSJ2 = new bSJ(bsx_0.d);
        String string = shopReferenceTypeAccountStatus.getStatus();
        String string2 = shopReferenceTypeAccountStatus.getType();
        if (string != null) {
            bSJ2.a("STATUS", string);
        }
        if (string2 != null) {
            bSJ2.a("TYPE", string2);
        }
        collection.add(bSJ2);
    }

    private static void a(ArrayList<bSJ> arrayList, ShopReferenceTypeVirtualSubscriptionLevel shopReferenceTypeVirtualSubscriptionLevel) {
        bSJ bSJ2 = new bSJ(bsx_0.c);
        bSJ2.a("server.id", shopReferenceTypeVirtualSubscriptionLevel.getServerId());
        arrayList.add(bSJ2);
    }

    private static void b(ArrayList<bSJ> arrayList, List<ShopReferenceTypeKard> list) {
        bSJ bSJ2 = new bSJ(bsx_0.h);
        arrayList.add(bSJ2);
    }

    private static void a(ArrayList<bSJ> arrayList, List<ShopReferenceTypeIceGift> list, bsx_0 bsx_02) {
        if (list == null) {
            return;
        }
        for (ShopReferenceTypeIceGift shopReferenceTypeIceGift : list) {
            int n = Co.a((Object)shopReferenceTypeIceGift.getId(), -1);
            bSJ bSJ2 = new bSJ(n, 1L, bsx_02);
            arrayList.add(bSJ2);
            Map map = shopReferenceTypeIceGift.getMetas();
            if (map == null) continue;
            for (Map.Entry entry : map.entrySet()) {
                bSJ2.a((String)entry.getKey(), (String)entry.getValue());
            }
        }
    }

    private static void a(ArrayList<bSJ> arrayList, ShopReferenceTypeOgrine shopReferenceTypeOgrine) {
        bSJ bSJ2 = new bSJ(bsx_0.e);
        arrayList.add(bSJ2);
    }

    static List<bsv_0<?, ?>> b(List<PromoteCarousel> list) {
        return list.stream().map(bsp_2::a).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
    }

    private static Optional<bsi_0> a(PromoteCarousel promoteCarousel) {
        String string = promoteCarousel.getName();
        String string2 = bsp_2.c(promoteCarousel.getDescription());
        ArrayList<bsg_2> arrayList = bsg_2.c(promoteCarousel.getDeviceImages());
        PromoteTargetOneOf promoteTargetOneOf = promoteCarousel.getTarget();
        PromoteTargetOneOf.DiscriminatorEnum discriminatorEnum = promoteTargetOneOf.getDiscriminator();
        switch (discriminatorEnum) {
            case ARTICLE: {
                Article article = promoteTargetOneOf.getArticle();
                if (article == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", Article.class, discriminatorEnum, promoteTargetOneOf));
                    return Optional.empty();
                }
                return Optional.of(new bsi_0(string, string2, null, discriminatorEnum, arrayList, bsp_2.a(article), null));
            }
            case CATEGORY: {
                Category category = promoteTargetOneOf.getCategory();
                if (category == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", Category.class, discriminatorEnum, promoteTargetOneOf));
                    return Optional.empty();
                }
                return Optional.of(new bsi_0(string, string2, null, discriminatorEnum, arrayList, null, category.getId()));
            }
            case LINK: {
                String string3 = promoteTargetOneOf.getLink();
                if (string3 == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", String.class, discriminatorEnum, promoteTargetOneOf));
                    return Optional.empty();
                }
                return Optional.of(new bsi_0(string, string2, string3, discriminatorEnum, arrayList, null, null));
            }
        }
        b.warn((Object)String.format("Unknown/Unsupported discriminator %s to extract %s from %s", discriminatorEnum, bsv_0.class, promoteTargetOneOf));
        return Optional.empty();
    }

    @Nullable
    public static bsf_0 a(Article article) {
        ArrayList<bse_0> arrayList;
        if (!bsp_2.b(article)) {
            return null;
        }
        ArrayList<bsg_2> arrayList2 = bsg_2.b(article.getMedia());
        ArrayList<bSJ> arrayList3 = new ArrayList<bSJ>();
        List list = article.getSingleReferences();
        bsp_2.c(arrayList3, list);
        List list2 = article.getPromotions();
        if (list2 != null) {
            arrayList = new ArrayList<bse_0>();
            bsp_2.b(arrayList, list2);
        } else {
            arrayList = null;
        }
        Double d2 = null;
        Double d3 = null;
        bsz_1 bsz_12 = null;
        ArticlePaymentModeOneOf.DiscriminatorEnum discriminatorEnum = null;
        Double d4 = null;
        Double d5 = null;
        bsz_1 bsz_13 = null;
        boolean bl = false;
        boolean bl2 = bPL.a.e();
        for (ArticlePaymentModeOneOf articlePaymentModeOneOf : article.getPaymentModes()) {
            ArticlePaymentModeOneOf.DiscriminatorEnum discriminatorEnum2 = articlePaymentModeOneOf.getDiscriminator();
            switch (discriminatorEnum2) {
                case ARTICLEFREEPAYMENTMODE: {
                    bl = true;
                    break;
                }
                case ARTICLENONVIRTUALPAYMENTMODE: {
                    ArticleNonVirtualPaymentMode articleNonVirtualPaymentMode = articlePaymentModeOneOf.getArticleNonVirtualPaymentMode();
                    if (articleNonVirtualPaymentMode == null) {
                        b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", ArticleNonVirtualPaymentMode.class, discriminatorEnum2, articlePaymentModeOneOf));
                        break;
                    }
                    Price price = articleNonVirtualPaymentMode.getPrice();
                    bsz_1 bsz_14 = bsz_1.a(price.getCurrency());
                    if (bl2 || bsz_13 != null && bsz_13 != bsz_14 || d4 != null && !(d4 > price.getAmount())) break;
                    d4 = price.getAmount();
                    d5 = price.getOriginalAmount();
                    bsz_13 = bsz_14;
                    break;
                }
                case ARTICLEVIRTUALPAYMENTMODE: {
                    ArticleNonVirtualPaymentMode articleNonVirtualPaymentMode = articlePaymentModeOneOf.getArticleVirtualPaymentMode();
                    if (articleNonVirtualPaymentMode == null) {
                        b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", ArticleVirtualPaymentMode.class, discriminatorEnum2, articlePaymentModeOneOf));
                        break;
                    }
                    Price price = articleNonVirtualPaymentMode.getPrice();
                    bsz_1 bsz_14 = bsz_1.a(price.getCurrency());
                    VirtualPaymentModeId virtualPaymentModeId = articleNonVirtualPaymentMode.getPaymentModeId();
                    if (virtualPaymentModeId == VirtualPaymentModeId.OG) {
                        d2 = price.getAmount();
                        d3 = price.getOriginalAmount();
                        bsz_12 = bsz_14;
                        discriminatorEnum = virtualPaymentModeId;
                        break;
                    }
                    if (!bl2 || virtualPaymentModeId != VirtualPaymentModeId.SW || bsz_12 == bsz_1.a || bsz_12 != null && bsz_12 != bsz_14 || d2 != null && !(d2 > price.getAmount())) break;
                    d2 = price.getAmount();
                    d3 = price.getOriginalAmount();
                    bsz_12 = bsz_14;
                    discriminatorEnum = virtualPaymentModeId;
                    break;
                }
                default: {
                    b.warn((Object)String.format("Unknown/Unsupported discriminator %s to extract prices from %s", discriminatorEnum2, articlePaymentModeOneOf));
                }
            }
            if (!bl) continue;
            d2 = 0.0;
            d3 = 0.0;
            bsz_12 = bsz_1.a;
            discriminatorEnum = ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEFREEPAYMENTMODE;
            d4 = null;
            d5 = null;
            bsz_13 = null;
            break;
        }
        if (d2 == null && d4 == null) {
            b.warn((Object)String.format("No payment method found for following article id : %s", article.getId()));
            return null;
        }
        return new bsf_0(article.getId(), article.getKey(), article.getName(), bsp_2.c(article.getDescription()), article.getSubtitle(), d2 == null ? null : Double.valueOf(Hw.a(d2, 2)), d3, bsz_12, discriminatorEnum, -1, arrayList3, article.getSingleReferences(), arrayList2, arrayList, article.getCountdownTo() != null ? wt_0.a(Date.from(article.getCountdownTo().toInstant())) : wt_0.b(), Hw.a(Optional.ofNullable(d4).orElse(-1.0), 2), Optional.ofNullable(d5).orElse(-1.0), bsz_13);
    }

    public static boolean b(Article article) {
        List list = article.getMetadata();
        if (list == null) {
            return true;
        }
        block3: for (MetadataOneOf metadataOneOf : list) {
            MetadataOneOf.DiscriminatorEnum discriminatorEnum = metadataOneOf.getDiscriminator();
            switch (discriminatorEnum) {
                case STRINGMETADATA: {
                    StringMetadata stringMetadata = metadataOneOf.getStringMetadata();
                    if (stringMetadata == null) {
                        b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", StringMetadata.class, discriminatorEnum, metadataOneOf));
                        break;
                    }
                    if (!"in_game_requirements".equals(stringMetadata.getKey())) break;
                    if (bsp_2.a(stringMetadata.getValue(), article.getId())) continue block3;
                    return false;
                }
                default: {
                    b.warn((Object)String.format("Unknown/Unsupported discriminator %s to validate %s from %s", discriminatorEnum, Article.class, metadataOneOf));
                }
            }
        }
        return true;
    }

    private static void b(Collection<bse_0> collection, List<Promotion> list) {
        for (Promotion promotion : list) {
            String string = promotion.getTitle();
            String string2 = promotion.getDescription();
            collection.add(new bse_0(string, string2));
        }
    }

    private static void c(ArrayList<bSJ> arrayList, List<SingleReference> list) {
        for (SingleReference singleReference : list) {
            ReferenceOneOf referenceOneOf = singleReference.getReference();
            if (referenceOneOf == null) continue;
            bsp_2.a(arrayList, referenceOneOf, singleReference);
        }
    }

    @Nullable
    private static void a(ArrayList<bSJ> arrayList, ReferenceOneOf referenceOneOf, SingleReference singleReference) {
        ReferenceOneOf.DiscriminatorEnum discriminatorEnum = referenceOneOf.getDiscriminator();
        switch (discriminatorEnum) {
            case KARDREFERENCE: {
                KardReference kardReference = referenceOneOf.getKardReference();
                if (kardReference == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", KardReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bsp_2.a(arrayList, kardReference);
                break;
            }
            case GAMEACTIONREFERENCE: {
                GameActionReference gameActionReference = referenceOneOf.getGameActionReference();
                if (gameActionReference == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", GameActionReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bsp_2.a(arrayList, gameActionReference, (long)singleReference.getQuantity().intValue());
                break;
            }
            case CLASSICREFERENCE: {
                ClassicReference classicReference = referenceOneOf.getClassicReference();
                if (classicReference == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", ClassicReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bsp_2.a(arrayList, classicReference);
                break;
            }
            case SERVERREFERENCE: {
                ServerReference serverReference = referenceOneOf.getServerReference();
                if (serverReference == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", ServerReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bsp_2.a(arrayList, serverReference);
                break;
            }
            case WAVENITEMREFERENCE: {
                WavenItemReference wavenItemReference = referenceOneOf.getWavenItemReference();
                if (wavenItemReference == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", WavenItemReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bsp_2.a(arrayList, wavenItemReference);
                break;
            }
            case ACCOUNTSTATUSREFERENCE: {
                AccountStatusReference accountStatusReference = referenceOneOf.getAccountStatusReference();
                if (accountStatusReference == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", AccountStatusReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bsp_2.a(arrayList, accountStatusReference);
                break;
            }
            case VIRTUALSUBSCRIPTIONREFERENCE: {
                VirtualSubscriptionReference virtualSubscriptionReference = referenceOneOf.getVirtualSubscriptionReference();
                if (virtualSubscriptionReference == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", VirtualSubscriptionReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bsp_2.a(arrayList, virtualSubscriptionReference);
                break;
            }
            case VODREFERENCE: {
                VodReference vodReference = referenceOneOf.getVodReference();
                if (vodReference == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", VodReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bsp_2.a(arrayList, vodReference);
                break;
            }
            case WEBTOONREFERENCE: {
                WebtoonReference webtoonReference = referenceOneOf.getWebtoonReference();
                if (webtoonReference == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", WebtoonReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bsp_2.a(arrayList, webtoonReference);
                break;
            }
            case OGRINEREFERENCE: {
                OgrineReference ogrineReference = referenceOneOf.getOgrineReference();
                if (ogrineReference == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", OgrineReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bsp_2.a(arrayList, ogrineReference);
                break;
            }
            case OGRINETOKENREFERENCE: {
                OgrineTokenReference ogrineTokenReference = referenceOneOf.getOgrineTokenReference();
                if (ogrineTokenReference == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", OgrineReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bsp_2.a(arrayList, ogrineTokenReference);
                break;
            }
            case GOULTINEREFERENCE: {
                GoultineReference goultineReference = referenceOneOf.getGoultineReference();
                if (goultineReference == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", GoultineReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bsp_2.a(arrayList, goultineReference);
                break;
            }
            default: {
                b.warn((Object)String.format("Unknown/Unsupported discriminator %s to extract %s from %s", discriminatorEnum, bSJ.class, referenceOneOf));
            }
        }
    }

    private static void a(ArrayList<bSJ> arrayList, GameActionReference gameActionReference, long l) {
        GameActionDefinition gameActionDefinition = gameActionReference.getDefinition();
        for (GameActionActionOneOf gameActionActionOneOf : gameActionDefinition.getActions()) {
            String string = gameActionActionOneOf.getDiscriminator();
            if (fia.a.a().equalsIgnoreCase(string)) {
                WakfuItemAction wakfuItemAction = gameActionActionOneOf.getWakfuItemAction();
                if (wakfuItemAction == null) {
                    b.warn((Object)String.format("Missing %s with following discriminator %s in following %s", WakfuItemAction.class, string, gameActionActionOneOf));
                    break;
                }
                try {
                    bSJ bSJ2 = new bSJ(Integer.parseInt(wakfuItemAction.getItemId()), l, bsx_0.g);
                    arrayList.add(bSJ2);
                }
                catch (NumberFormatException numberFormatException) {
                    b.error((Object)("We have an " + WakfuItemAction.class + " with non numerical id, how ? In following action definition : " + gameActionDefinition.getId()), (Throwable)numberFormatException);
                }
                continue;
            }
            b.error((Object)("We have an action with a unhandled type : " + string + ", on action definition : " + gameActionDefinition.getId()));
        }
    }

    private static void a(ArrayList<bSJ> arrayList, KardReference kardReference) {
        bSJ bSJ2 = new bSJ(bsx_0.h);
        arrayList.add(bSJ2);
    }

    private static void a(ArrayList<bSJ> arrayList, ClassicReference classicReference) {
        bSJ bSJ2 = new bSJ(bsx_0.i);
        arrayList.add(bSJ2);
    }

    private static void a(ArrayList<bSJ> arrayList, ServerReference serverReference) {
        bSJ bSJ2 = new bSJ(bsx_0.i);
        bSJ2.a("server.id", serverReference.getTargetServerId());
        arrayList.add(bSJ2);
    }

    private static void a(ArrayList<bSJ> arrayList, WavenItemReference wavenItemReference) {
        bSJ bSJ2 = new bSJ(bsx_0.i);
        arrayList.add(bSJ2);
    }

    private static void a(Collection<bSJ> collection, AccountStatusReference accountStatusReference) {
        bSJ bSJ2 = new bSJ(bsx_0.d);
        String string = accountStatusReference.getStatus();
        String string2 = accountStatusReference.getType();
        bSJ2.a("STATUS", string);
        bSJ2.a("TYPE", string2);
        collection.add(bSJ2);
    }

    private static void a(ArrayList<bSJ> arrayList, VirtualSubscriptionReference virtualSubscriptionReference) {
        bSJ bSJ2 = new bSJ(bsx_0.c);
        bSJ2.a("server.id", virtualSubscriptionReference.getServer());
        arrayList.add(bSJ2);
    }

    private static void a(ArrayList<bSJ> arrayList, VodReference vodReference) {
        bSJ bSJ2 = new bSJ(bsx_0.i);
        arrayList.add(bSJ2);
    }

    private static void a(ArrayList<bSJ> arrayList, WebtoonReference webtoonReference) {
        bSJ bSJ2 = new bSJ(bsx_0.i);
        arrayList.add(bSJ2);
    }

    private static void a(ArrayList<bSJ> arrayList, OgrineReference ogrineReference) {
        bSJ bSJ2 = new bSJ(bsx_0.e);
        arrayList.add(bSJ2);
    }

    private static void a(ArrayList<bSJ> arrayList, OgrineTokenReference ogrineTokenReference) {
        bSJ bSJ2 = new bSJ(bsx_0.f);
        arrayList.add(bSJ2);
    }

    private static void a(ArrayList<bSJ> arrayList, GoultineReference goultineReference) {
        bSJ bSJ2 = new bSJ(bsx_0.i);
        arrayList.add(bSJ2);
    }

    private static String c(String string) {
        return Jsoup.parse((String)string).wholeText();
    }

    public static boolean a(bSt<?> bSt2) {
        String string = bSt2.f();
        if (string == null) {
            return true;
        }
        return enp_2.a.d(ens_2.al) || !string.equals("companions");
    }

    public static <T> boolean a(@Nullable String string, @NotNull T t) {
        if (string == null) {
            return true;
        }
        try {
            bsr_2 bsr_22 = (bsr_2)new GsonBuilder().create().fromJson(string, bsr_2.class);
            if (!bsr_22.a()) {
                return false;
            }
        }
        catch (Exception exception) {
            b.error((Object)String.format("Mapping error for following %s received from shop : \"%s\" (id : %s)", bsr_2.class, string, t), (Throwable)exception);
        }
        return true;
    }

    public static boolean b() {
        Optional optional = bhh_1.a(end_0.a);
        if (optional.isEmpty()) {
            return false;
        }
        Optional<Short> optional2 = ((eaf_0)optional.get()).a();
        if (optional2.isEmpty()) {
            return false;
        }
        short s2 = (short)enp_2.a.b(ens_2.p);
        return optional2.get() >= s2;
    }
}

