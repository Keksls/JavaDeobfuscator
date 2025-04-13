/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKt
 */
public class bkt_0
implements ajh_1 {
    public static final String a = "expiredEntriesCount";
    public static final String b = "expiredEntriesCountText";
    public static final String d = "claimExpiredEntriesText";
    public static final String e = "kamasCount";
    public static final String f = "soldItemsCount";
    public static final String g = "soldItemsCountText";
    public static final String h = "claimKamasText";
    private int i = 0;
    private long j = 0L;
    private int k = 0;
    private int l = 0;

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "soldItemsCount": {
                return this.i;
            }
            case "kamasCount": {
                return this.j;
            }
            case "soldItemsCountText": {
                return bae.h().a("market.offers.sold.items", this.i);
            }
            case "claimKamasText": {
                return bae.h().a("market.offers.kama.claim", this.j);
            }
            case "expiredEntriesCount": {
                return this.l;
            }
            case "expiredEntriesCountText": {
                return bae.h().a("market.offers.expired.items", this.l);
            }
            case "claimExpiredEntriesText": {
                return bae.h().a("market.offers.expired.items.claim", this.l);
            }
        }
        return null;
    }

    public static void a() {
        fis_1.a().a((ajf_1)bky_0.a(), a, b, d, e, f, g, h, "canSellItem", "sellItemBtnText");
    }

    public void a(int n) {
        this.i = n;
    }

    public void a(long l) {
        this.j = l;
    }

    public void b(int n) {
        this.k = n;
    }

    public void c(int n) {
        this.l = n;
    }

    @Override
    public String[] d() {
        return new String[]{a, b, d, e, f, g, h};
    }

    public int b() {
        return this.i;
    }

    public long c() {
        return this.j;
    }

    public int e() {
        return this.k;
    }

    public int f() {
        return this.l;
    }

    public String toString() {
        return "MarketSalesInfoView(m_soldItemsCount=" + this.b() + ", m_kamasCount=" + this.c() + ", m_forSaleEntriesCount=" + this.e() + ", m_expiredEntriesCount=" + this.f() + ")";
    }
}

