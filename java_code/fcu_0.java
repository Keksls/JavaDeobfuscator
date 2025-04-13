/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fcu
 */
public enum fcu_0 implements aqk_2
{
    a(1L, "Gouverneur"),
    b(2L, "Vice-gouverneur"),
    c(3L, "Pr\u00e9v\u00f4t"),
    d(4L, "G\u00e9n\u00e9ral"),
    e(5L, "M\u00e9t\u00e9orologiste"),
    f(6L, "Tr\u00e9sorier"),
    g(7L, "Challenger"),
    h(8L, "Espion"),
    i(9L, "Assassin"),
    j(10L, "Zoologiste");

    private final byte k;
    private final long l;
    private final String m;
    private float n;
    private int o;
    private apc_2 p = null;

    private fcu_0(long l, String string2) {
        this.k = (byte)l;
        this.l = 1 << (int)l;
        this.m = string2;
    }

    public static fcu_0 a(long l) {
        for (fcu_0 fcu_02 : fcu_0.values()) {
            if (fcu_02.a() != l) continue;
            return fcu_02;
        }
        return null;
    }

    public long a() {
        return this.l;
    }

    @Override
    public String d() {
        return String.valueOf(this.l);
    }

    @Override
    public String e() {
        return this.m;
    }

    @Override
    public String f() {
        return null;
    }

    public void a(apc_2 apc_22) {
        this.p = apc_22;
    }

    public apc_2 b() {
        return this.p;
    }

    public void a(float f2) {
        this.n = f2;
    }

    public float c() {
        return this.n;
    }

    public byte g() {
        return this.k;
    }

    public int h() {
        return this.o;
    }

    public void a(int n) {
        this.o = n;
    }

    public String toString() {
        return "NationRank{m_baseId=" + this.k + ", m_id=" + this.l + ", m_label='" + this.m + "', m_pdcLossFactor=" + this.n + ", m_citizenScoreLine=" + this.o + ", m_criterion=" + this.p + "}";
    }
}

