/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public enum bFX implements Tz<bFZ>
{
    a(1, new bdx_0()),
    b(2, new bec_0()),
    c(3, new bfs_0()),
    d(4, new bFl()),
    e(5, new bcf_2()),
    f(6, new bgg_2()),
    g(7, new bch_1()),
    h(8, new bbc_1(), buq_0.d),
    i(80, new bas_2()),
    j(9, new bcp_2()),
    k(12, new bcb_1()),
    l(13, new bbl_2()),
    m(14, new bbq_2()),
    n(16, new bEQ(), buq_0.g),
    o(17, new bbe_1()),
    p(18, new baz_1()),
    q(19, new bEb(), buq_0.c),
    r(20, new bal_1()),
    s(21, new bdi_0(), buq_0.c),
    t(22, new beq_0()),
    u(23, new bfl_0()),
    v(24, new bar_2()),
    w(38, new bef_0()),
    x(29, new bEn()),
    y(30, new bDp()),
    z(31, new bac_1()),
    A(32, new bEM()),
    B(28, new bbf_2()),
    C(79, new bcz_2()),
    D(33, new bey_0()),
    E(34, new bbs_2()),
    F(36, new bcd_2()),
    G(37, new bbz_2()),
    H(35, new bcs_2()),
    I(39, new bdd_1(), buq_0.c),
    J(40, new bej_0()),
    K(42, new bfo_0()),
    L(43, new bbv_2()),
    M(44, new bcl_0()),
    N(45, new bFA()),
    O(46, new bay_2(), buq_0.c),
    P(26, new bFP(fjv.a), buq_0.h),
    Q(47, new bFP(fjv.b), buq_0.h),
    R(48, new bFP(fjv.d), buq_0.h),
    S(49, new bFP(fjv.c), buq_0.h),
    T(50, new bbz_1()),
    U(51, new bfi_0(), buq_0.k),
    V(52, new bav_2()),
    W(53, new bcm_0()),
    X(54, new bbh_1()),
    Y(55, new bai_1()),
    Z(56, new bfx_0()),
    aa(57, new bbu_2()),
    ab(58, new bbo_1()),
    ac(59, new bcw_1()),
    ad(60, new bdt_0()),
    ae(61, new bdl_0()),
    af(62, new bcj_1()),
    ag(63, new beu_0()),
    ah(65, new bct_1()),
    ai(66, new bav_1()),
    aj(67, new bDx()),
    ak(69, new bDT()),
    al(70, new bdn_0(fjv.e)),
    am(71, new bdn_0(fjv.f)),
    an(72, new bdf_1()),
    ao(73, new bDI()),
    ap(74, new bEY()),
    aq(75, new bet_0()),
    ar(76, new baf_1(), buq_0.l),
    as(77, new bdb_1(), buq_0.h),
    at(78, new bcp_1(), buq_0.d),
    au(81, new bEF(), buq_0.l),
    av(82, new bEJ(), buq_0.l),
    aw(83, new bDQ(), buq_0.j),
    ax(84, new bfh_0());

    private final short ay;
    private final abn_1<bFZ> az;
    private final buq_0 aA;

    private bFX(short s2, abn_1<bFZ> abn_12) {
        this(s2, abn_12, buq_0.a);
    }

    private bFX(short s2, abn_1<bFZ> abn_12, buq_0 buq_02) {
        this.ay = s2;
        this.az = abn_12;
        this.aA = buq_02;
    }

    @Override
    public String d() {
        return Short.toString(this.ay);
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public short a() {
        return this.ay;
    }

    public buq_0 c() {
        return this.aA;
    }

    @Override
    public abn_1<bFZ> b() {
        return this.az;
    }

    @Nullable
    public static bFX a(short s2) {
        for (bFX bFX2 : bFX.values()) {
            if (bFX2.ay != s2) continue;
            return bFX2;
        }
        return null;
    }

    @Override
    public String f() {
        return this.e();
    }
}

