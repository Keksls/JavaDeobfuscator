/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cev
 */
public enum cev_2 {
    a(new ayi_0(2, -2, -29, 527L)),
    b(new ayi_0(2, 72, -17, 527L)),
    c(new ayi_0(2, 34, 30, 527L)),
    d(new ayi_0(2, -192, -29, 527L)),
    e(new awd_0(29716, 1, false), new ayi_0(2, 31, -104, 793L)),
    f(new ayi_0(2, 3, 50, 527L)),
    g(new awd_0(27083, 29997, false)),
    h(new awd_0(27093, 29997, false)),
    i(new awd_0(28028, 10, false), new awd_0(28029, 10, false), new awd_0(28030, 10, false), new awd_0(28789, 10, false), new awd_0(28790, 10, false), new awd_0(29549, 10, false), new awd_0(29594, 10, false), new awd_0(29616, 10, false), new awd_0(29668, 10, false), new awd_0(29669, 10, false), new awd_0(29670, 10, false), new awd_0(29671, 10, false), new awd_0(29672, 10, false), new awd_0(29673, 10, false), new awd_0(29674, 10, false), new awd_0(29675, 10, false), new awd_0(29676, 10, false), new awd_0(29714, 10, false), new awd_0(29715, 10, false), new awd_0(29716, 10, false), new awd_0(29717, 10, false), new awd_0(29718, 10, false), new awd_0(29719, 10, false), new awd_0(31011, 10, false), new awd_0(31218, 10, false), new awd_0(31389, 10, false), new awd_0(31573, 10, false)),
    j(new aYr(1, -1L, 31319, "")),
    k(new aYr(1, -1L, 20825, "")),
    l(new aVz(1000000000L)),
    m(new aWv(3, new String[0]), new aWv(3, new String[0])),
    n(new aWv(4, new String[0])),
    o(new aYO(0, 9999, false)),
    p(new aWv(9, new String[0])),
    q(new aWc(1, 1)),
    r(new aWc(1, 1069)),
    s(new aye_0(9, "107")),
    t(new avp_0((short)230), new awa_0(6, new String[0]));

    private final aXj[] u;

    private cev_2(aXj ... aXjArray) {
        this.u = aXjArray;
    }

    public void a() {
        for (aXj aXj2 : this.u) {
            if (!aXj2.a()) continue;
            aXj2.b();
        }
    }

    public aXj[] b() {
        return this.u;
    }
}

