/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class bLf
implements ajh_1 {
    public static final String a = "countText";
    public static final String b = "hasPreviousResults";
    public static final String d = "hasNextResults";
    public static final String e = "searchResults";
    public static final String f = "totalCount";
    public static final String g = "totalCountText";
    public static final String h = "totalCountTextOffer";
    public static final String i = "totalCountTextAlt";
    public static final String j = "totalCountTextOfferAlt";
    public static final String[] k = new String[]{"countText", "hasPreviousResults", "hasNextResults", "searchResults", "totalCount", "totalCountText", "totalCountTextAlt", "totalCountTextOfferAlt", "totalCountTextOffer"};
    private List<ajh_1> l = new ArrayList<ajh_1>();
    private final int m;
    private int n;
    private int o;

    public bLf(int n) {
        this.m = n;
    }

    public void a(mu mu2, List<ajh_1> list) {
        this.n = mu2.c() < this.m ? 0 : (mu2.c() - 1) / this.m;
        this.o = mu2.g();
        this.l = list;
        fis_1.a().a((ajf_1)this, k);
    }

    public int a() {
        return Math.max(0, this.n - 1) * this.m;
    }

    public int b() {
        return Math.max(0, Math.min(this.h() - 1, this.n + 1)) * this.m;
    }

    public int c() {
        if (this.o > 0 && this.o % this.m == 0) {
            return this.m * (this.o / this.m - 1);
        }
        return this.m * (this.o / this.m);
    }

    public int e() {
        return this.n * this.m;
    }

    public int a(int n) {
        if (this.b(n)) {
            return this.a();
        }
        return this.e();
    }

    private boolean b(int n) {
        return (this.o - n) % this.m == 0;
    }

    private int h() {
        return (int)Math.ceil((double)this.o / (double)this.m);
    }

    public void f() {
        this.n = 0;
        this.o = 0;
        this.l = List.of();
        fis_1.a().a((ajf_1)this, k);
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "countText": {
                int n = this.h() == 0 ? 0 : this.n + 1;
                return bae.h().a("pageNumber", n, this.h());
            }
            case "hasNextResults": {
                if (this.l.isEmpty()) {
                    return false;
                }
                return this.n < this.h() - 1;
            }
            case "hasPreviousResults": {
                if (this.l.isEmpty()) {
                    return false;
                }
                return this.n > 0;
            }
            case "searchResults": {
                return this.l;
            }
            case "totalCount": {
                return this.o;
            }
            case "totalCountText": {
                return bae.h().a("market.search.result.count", this.o);
            }
            case "totalCountTextOffer": {
                return bae.h().a("market.offer.search.result.count", this.o);
            }
            case "totalCountTextAlt": {
                return bae.h().a("market.currently.for.sale", this.o);
            }
            case "totalCountTextOfferAlt": {
                return bae.h().a("market.current.offers", this.o);
            }
        }
        return null;
    }

    @Override
    public String[] d() {
        return k;
    }

    public int g() {
        return this.o;
    }
}

