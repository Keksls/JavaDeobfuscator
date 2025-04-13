/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bKp
implements ajh_1 {
    public static final String a = "purchasedItemsCount";
    public static final String b = "purchasedItemsCountText";
    public static final String d = "retrievePurchasedItemsText";
    public static final String e = "expiredOffersCount";
    public static final String f = "expiredOffersCountText";
    public static final String g = "claimExpiredOffersText";
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private long l = 0L;

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "purchasedItemsCount": {
                return this.i;
            }
            case "purchasedItemsCountText": {
                return bae.h().a("market.offers.purchased.items", this.h, this.i);
            }
            case "retrievePurchasedItemsText": {
                return bae.h().a("market.offers.retrieve.purchased.items", this.i);
            }
            case "expiredOffersCount": {
                return this.k;
            }
            case "expiredOffersCountText": {
                return bae.h().a("market.offers.expired.offers", this.k, this.l);
            }
            case "claimExpiredOffersText": {
                return bae.h().a("market.offers.kama.claim", this.l);
            }
        }
        return null;
    }

    public static void a() {
        fis_1.a().a((ajf_1)bky_0.a(), a, b, d, e, f, g, "canCreateOffer", "createOfferBtnText");
    }

    public void a(int n) {
        this.h = n;
    }

    public void b(int n) {
        this.i = n;
    }

    public void c(int n) {
        this.j = n;
    }

    public void d(int n) {
        this.k = n;
    }

    public void a(long l) {
        this.l = l;
    }

    @Override
    public String[] d() {
        return new String[]{a, b, d, e, f, g};
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public int e() {
        return this.j;
    }

    public int f() {
        return this.k;
    }

    public long g() {
        return this.l;
    }

    public String toString() {
        return "MarketOffersInfoView(m_purchasesCount=" + this.b() + ", m_totalPurchasedItemsCount=" + this.c() + ", m_currentOffersCount=" + this.e() + ", m_expiredOffersCount=" + this.f() + ", m_expiredOffersTotalKamas=" + this.g() + ")";
    }
}

