/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.AccountStatusReference
 *  com.ankama.shopi.client.model.Article
 *  com.ankama.shopi.client.model.ArticleVirtualPaymentMode
 *  com.ankama.shopi.client.model.CartPaymentModeList
 *  com.ankama.shopi.client.model.CartPaymentModeOneOf
 *  com.ankama.shopi.client.model.CartPaymentModeOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.CartVirtualPaymentMode
 *  com.ankama.shopi.client.model.Category
 *  com.ankama.shopi.client.model.ChosenReferenceRequest
 *  com.ankama.shopi.client.model.ClassicReference
 *  com.ankama.shopi.client.model.GameActionReference
 *  com.ankama.shopi.client.model.GoultineReference
 *  com.ankama.shopi.client.model.KardReference
 *  com.ankama.shopi.client.model.Language
 *  com.ankama.shopi.client.model.OgrineReference
 *  com.ankama.shopi.client.model.OgrineTokenReference
 *  com.ankama.shopi.client.model.PaymentRequestOneOf
 *  com.ankama.shopi.client.model.PaymentRequestOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.Price
 *  com.ankama.shopi.client.model.ReferenceOneOf
 *  com.ankama.shopi.client.model.ReferenceOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ServerReference
 *  com.ankama.shopi.client.model.ShopKey
 *  com.ankama.shopi.client.model.SingleReference
 *  com.ankama.shopi.client.model.VirtualPaymentModeId
 *  com.ankama.shopi.client.model.VirtualPaymentRequest
 *  com.ankama.shopi.client.model.VirtualSubscriptionReference
 *  com.ankama.shopi.client.model.VodReference
 *  com.ankama.shopi.client.model.WavenItemReference
 *  com.ankama.shopi.client.model.WebtoonReference
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.ankama.shopi.client.model.AccountStatusReference;
import com.ankama.shopi.client.model.Article;
import com.ankama.shopi.client.model.ArticleVirtualPaymentMode;
import com.ankama.shopi.client.model.CartPaymentModeList;
import com.ankama.shopi.client.model.CartPaymentModeOneOf;
import com.ankama.shopi.client.model.CartVirtualPaymentMode;
import com.ankama.shopi.client.model.Category;
import com.ankama.shopi.client.model.ChosenReferenceRequest;
import com.ankama.shopi.client.model.ClassicReference;
import com.ankama.shopi.client.model.GameActionReference;
import com.ankama.shopi.client.model.GoultineReference;
import com.ankama.shopi.client.model.KardReference;
import com.ankama.shopi.client.model.Language;
import com.ankama.shopi.client.model.OgrineReference;
import com.ankama.shopi.client.model.OgrineTokenReference;
import com.ankama.shopi.client.model.PaymentRequestOneOf;
import com.ankama.shopi.client.model.Price;
import com.ankama.shopi.client.model.ReferenceOneOf;
import com.ankama.shopi.client.model.ServerReference;
import com.ankama.shopi.client.model.ShopKey;
import com.ankama.shopi.client.model.SingleReference;
import com.ankama.shopi.client.model.VirtualPaymentModeId;
import com.ankama.shopi.client.model.VirtualPaymentRequest;
import com.ankama.shopi.client.model.VirtualSubscriptionReference;
import com.ankama.shopi.client.model.VodReference;
import com.ankama.shopi.client.model.WavenItemReference;
import com.ankama.shopi.client.model.WebtoonReference;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from cbj
 */
public class cbj_1 {
    public static final ShopKey a = ShopKey.WAKFU_INGAME;
    public static final String b = "shopi";
    private static final Logger c = LoggerFactory.getLogger(cbj_1.class);

    public static boolean a() {
        String string = WakfuClient.a.n().s();
        if (string == null) {
            string = enp_2.a.e(ens_2.o);
        }
        return Objects.equals(b, string);
    }

    public static Language b() {
        Language language = Language.fromValue((String)bae.h().f().i());
        if (language == Language.UNKNOWN_DEFAULT_OPEN_API) {
            return Language.EN;
        }
        return language;
    }

    public static List<bss_0<?, ?>> a(List<Article> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return list.stream().map(bsp_2::a).filter(Objects::nonNull).filter(bss_0::o).collect(Collectors.toList());
    }

    public static List<bSt<?>> b(List<Category> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        List<bsh_0> list2 = list.stream().map(cbj_1::a).filter(Objects::nonNull).collect(Collectors.toList());
        for (bsh_0 bsh_02 : list2) {
            cbj_1.a(bsh_02, list2);
        }
        return new ArrayList(list2);
    }

    @Nullable
    private static bsh_0 a(@NotNull Category category) {
        bsh_0 bsh_02 = new bsh_0(category.getId(), category.getName(), category.getDescription(), category.getImage().getUri().toString(), bSu.a, category.getKey(), category.getParentCategoryId());
        if (!bsp_2.a(bsh_02)) {
            return null;
        }
        return bsh_02;
    }

    private static void a(bsh_0 bsh_02, List<bsh_0> list) {
        for (bsh_0 bsh_03 : list) {
            if (!Objects.equals(bsh_02.a(), bsh_03.g())) continue;
            bsh_02.a(bsh_03);
            bsh_03.b(bsh_02);
        }
    }

    @Nullable
    public static ChosenReferenceRequest a(@NotNull SingleReference singleReference) {
        ReferenceOneOf referenceOneOf = singleReference.getReference();
        if (referenceOneOf == null) {
            return null;
        }
        ChosenReferenceRequest chosenReferenceRequest = new ChosenReferenceRequest().lineNumber(singleReference.getLineNumber()).quantity(singleReference.getQuantity());
        ReferenceOneOf.DiscriminatorEnum discriminatorEnum = referenceOneOf.getDiscriminator();
        switch (discriminatorEnum) {
            case KARDREFERENCE: {
                KardReference kardReference = referenceOneOf.getKardReference();
                if (kardReference == null) {
                    c.warn(String.format("Missing %s with following discriminator %s in following %s", KardReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(kardReference.getId());
                break;
            }
            case GAMEACTIONREFERENCE: {
                GameActionReference gameActionReference = referenceOneOf.getGameActionReference();
                if (gameActionReference == null) {
                    c.warn(String.format("Missing %s with following discriminator %s in following %s", GameActionReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(gameActionReference.getId());
                break;
            }
            case CLASSICREFERENCE: {
                ClassicReference classicReference = referenceOneOf.getClassicReference();
                if (classicReference == null) {
                    c.warn(String.format("Missing %s with following discriminator %s in following %s", ClassicReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(classicReference.getId());
                break;
            }
            case SERVERREFERENCE: {
                ServerReference serverReference = referenceOneOf.getServerReference();
                if (serverReference == null) {
                    c.warn(String.format("Missing %s with following discriminator %s in following %s", ServerReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(serverReference.getId());
                break;
            }
            case WAVENITEMREFERENCE: {
                WavenItemReference wavenItemReference = referenceOneOf.getWavenItemReference();
                if (wavenItemReference == null) {
                    c.warn(String.format("Missing %s with following discriminator %s in following %s", WavenItemReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(wavenItemReference.getId());
                break;
            }
            case ACCOUNTSTATUSREFERENCE: {
                AccountStatusReference accountStatusReference = referenceOneOf.getAccountStatusReference();
                if (accountStatusReference == null) {
                    c.warn(String.format("Missing %s with following discriminator %s in following %s", AccountStatusReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(accountStatusReference.getId());
                break;
            }
            case VIRTUALSUBSCRIPTIONREFERENCE: {
                VirtualSubscriptionReference virtualSubscriptionReference = referenceOneOf.getVirtualSubscriptionReference();
                if (virtualSubscriptionReference == null) {
                    c.warn(String.format("Missing %s with following discriminator %s in following %s", VirtualSubscriptionReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(virtualSubscriptionReference.getId());
                break;
            }
            case VODREFERENCE: {
                VodReference vodReference = referenceOneOf.getVodReference();
                if (vodReference == null) {
                    c.warn(String.format("Missing %s with following discriminator %s in following %s", VodReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(vodReference.getId());
                break;
            }
            case WEBTOONREFERENCE: {
                WebtoonReference webtoonReference = referenceOneOf.getWebtoonReference();
                if (webtoonReference == null) {
                    c.warn(String.format("Missing %s with following discriminator %s in following %s", WebtoonReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(webtoonReference.getId());
                break;
            }
            case OGRINEREFERENCE: {
                OgrineReference ogrineReference = referenceOneOf.getOgrineReference();
                if (ogrineReference == null) {
                    c.warn(String.format("Missing %s with following discriminator %s in following %s", OgrineReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(ogrineReference.getId());
                break;
            }
            case OGRINETOKENREFERENCE: {
                OgrineTokenReference ogrineTokenReference = referenceOneOf.getOgrineTokenReference();
                if (ogrineTokenReference == null) {
                    c.warn(String.format("Missing %s with following discriminator %s in following %s", OgrineTokenReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(ogrineTokenReference.getId());
                break;
            }
            case GOULTINEREFERENCE: {
                GoultineReference goultineReference = referenceOneOf.getGoultineReference();
                if (goultineReference == null) {
                    c.warn(String.format("Missing %s with following discriminator %s in following %s", GoultineReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(goultineReference.getId());
                break;
            }
            default: {
                c.warn(String.format("Unknown/Unsupported discriminator %s to extract %s from %s", discriminatorEnum, ChosenReferenceRequest.class, referenceOneOf));
                return null;
            }
        }
        return chosenReferenceRequest;
    }

    @Nullable
    public static PaymentRequestOneOf a(@NotNull CartPaymentModeList cartPaymentModeList) {
        PaymentRequestOneOf paymentRequestOneOf = null;
        block7: for (CartPaymentModeOneOf cartPaymentModeOneOf : cartPaymentModeList.getValues()) {
            CartPaymentModeOneOf.DiscriminatorEnum discriminatorEnum = cartPaymentModeOneOf.getDiscriminator();
            switch (discriminatorEnum) {
                case CARTFREEPAYMENTMODE: {
                    return new PaymentRequestOneOf().discriminator(PaymentRequestOneOf.DiscriminatorEnum.FREE);
                }
                case CARTVIRTUALPAYMENTMODE: {
                    CartVirtualPaymentMode cartVirtualPaymentMode = cartPaymentModeOneOf.getCartVirtualPaymentMode();
                    if (cartVirtualPaymentMode == null) {
                        c.warn(String.format("Missing %s with following discriminator %s in following %s", ArticleVirtualPaymentMode.class, discriminatorEnum, cartPaymentModeOneOf));
                        continue block7;
                    }
                    VirtualPaymentModeId virtualPaymentModeId = cartVirtualPaymentMode.getPaymentModeId();
                    switch (virtualPaymentModeId) {
                        case SW: 
                        case OG: {
                            Price price = cartVirtualPaymentMode.getPrice();
                            paymentRequestOneOf = new PaymentRequestOneOf().discriminator(PaymentRequestOneOf.DiscriminatorEnum.VIRTUAL).virtualPaymentRequest(new VirtualPaymentRequest().paymentModeId(virtualPaymentModeId).amount(price.getAmount()).currency(price.getCurrency()));
                            continue block7;
                        }
                    }
                    c.warn(String.format("Unknown/Unsupported paymentMode %s to order a cart from client", virtualPaymentModeId));
                    continue block7;
                }
            }
            c.warn(String.format("Unknown/Unsupported discriminator %s to order a from client", discriminatorEnum));
        }
        return paymentRequestOneOf;
    }
}

