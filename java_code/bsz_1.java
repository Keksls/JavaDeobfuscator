/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.Currency
 *  gnu.trove.map.hash.THashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.shopi.client.model.Currency;
import gnu.trove.map.hash.THashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSz
 */
public enum bsz_1 {
    a(0, "OGR", null, false),
    b(1, "KRZ", null, false),
    c(2, "USD", "USD", true),
    d(3, "EUR", "EUR", true),
    e(4, "GBP", "GBP", true),
    f(5, "BRL", "BRL", true),
    g(6, "RUB", "RUB", true),
    h(7, "AUD", "AUD", true),
    i(8, "CAD", "CAD", true),
    j(9, "IDR", "IDR", true),
    k(10, "JPY", "JPY", true),
    l(11, "MYR", "MYR", true),
    m(12, "MXN", "MXN", true),
    n(13, "NZD", "NZD", true),
    o(14, "NOK", "NOK", true),
    p(15, "PHP", "PHP", true),
    q(16, "SGD", "SGD", true),
    r(17, "KRW", "KRW", true),
    s(18, "THB", "THB", true),
    t(19, "TRY", "TRY", true),
    u(20, "UAH", "UAH", true),
    v(21, "CHF", "CHF", true),
    w(22, "AED", "AED", true),
    x(23, "BDT", "BDT", true),
    y(24, "PLN", "PLN", true),
    z(25, "BGN", "BGN", true),
    A(26, "SEK", "SEK", true),
    B(27, "COP", "COP", true),
    C(28, "CLP", "CLP", true),
    D(29, "DKK", "DKK", true),
    E(30, "CRC", "CRC", true),
    F(31, "PEN", "PEN", true),
    G(32, "CZK", "CZK", true),
    H(33, "DZD", "DZD", true),
    I(34, "ILS", "ILS", true),
    J(35, "HKD", "HKD", true),
    K(36, "HUF", "HUF", true),
    L(37, "ISK", "ISK", true),
    M(38, "KES", "KES", true),
    N(39, "MWK", "MWK", true),
    O(40, "QAR", "QAR", true),
    P(41, "RON", "RON", true),
    Q(42, "SAR", "SAR", true),
    R(43, "TWD", "TWD", true),
    S(44, "UYU", "UYU", true),
    T(45, "VND", "VND", true),
    U(46, "MAD", "MAD", true),
    V(47, "MMK", "MMK", true);

    private static final Map<String, bsz_1> W;
    private static final Map<String, bsz_1> X;
    private final byte Y;
    private final String Z;
    private final String aa;
    private final boolean ab;

    private bsz_1(@Nullable int n2, String string2, String string3, boolean bl) {
        this.aa = string3;
        this.ab = bl;
        this.Y = Hw.b((long)n2);
        this.Z = string2;
    }

    public byte a() {
        return this.Y;
    }

    @NotNull
    public String b() {
        return this.Z;
    }

    public String c() {
        return azs_0.a().a("currencyIconUrl", "defaultIconPath", this.Y);
    }

    public String d() {
        return this.aa;
    }

    public boolean e() {
        return this.ab;
    }

    public String f() {
        return "";
    }

    @Nullable
    public Currency g() {
        Currency currency = Currency.fromValue((String)this.Z);
        if (currency == Currency.UNKNOWN_DEFAULT_OPEN_API) {
            return null;
        }
        return currency;
    }

    @Nullable
    public static bsz_1 a(String string) {
        return W.get(string);
    }

    @Nullable
    public static bsz_1 a(Currency currency) {
        return W.get(currency.getValue());
    }

    @Nullable
    public static bsz_1 b(String string) {
        return bsz_1.a(string, true);
    }

    public static bsz_1 a(String string, boolean bl) {
        bsz_1 bsz_12 = X.get(string);
        return bsz_12 != null || bl ? bsz_12 : c;
    }

    static {
        W = new THashMap();
        X = new THashMap();
        for (bsz_1 bsz_12 : bsz_1.values()) {
            W.put(bsz_12.Z, bsz_12);
            if (bsz_12.aa == null) continue;
            X.put(bsz_12.aa, bsz_12);
        }
    }
}

