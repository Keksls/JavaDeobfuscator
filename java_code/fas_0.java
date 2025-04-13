/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from faS
 */
public enum fas_0 implements aqk_2
{
    a(0, "NONE"),
    b(1, "DRAGOTURKEY"),
    c(2, "GOBALL"),
    d(3, "BOOWOLF"),
    e(4, "DRHELLER"),
    f(5, "DRAGON"),
    g(6, "TOFU"),
    h(7, "BOUNE"),
    i(8, "CHACHA"),
    j(9, "GODRON"),
    k(10, "MECHA"),
    l(11, "FLYING_CARPET"),
    m(12, "SOAPBOX"),
    n(13, "REPTILIAN"),
    o(14, "BOAT"),
    p(15, "MOTORCYCLE"),
    q(16, "DEER"),
    r(17, "ELEPHANT"),
    s(18, "TIGER");

    private final int t;
    private final String u;

    private fas_0(int n2, String string2) {
        this.t = n2;
        this.u = string2;
    }

    public int a() {
        return this.t;
    }

    @Override
    public String d() {
        return String.valueOf(this.t);
    }

    @Override
    public String e() {
        return this.u;
    }

    @Override
    public String f() {
        return null;
    }

    @NotNull
    public static fas_0 a(byte by) {
        for (fas_0 fas_02 : fas_0.values()) {
            if (fas_02.t != by) continue;
            return fas_02;
        }
        return a;
    }
}

