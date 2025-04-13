/*
 * Decompiled with CFR 0.152.
 */
public enum cSY implements aqk_2
{
    a(2, new ctg_0(emr_2.b)),
    b(3, new cTR()),
    c(4, new cTz()),
    d(5, new ctt_0()),
    e(6, new ctg_0(emr_2.k)),
    f(7, new ctg_0(emr_2.l)),
    g(9, new ctg_0(emr_2.m)),
    h(8, new ctg_0(emr_2.n)),
    i(11, new cTt()),
    j(12, new ctr_0()),
    k(13, new cts_0()),
    l(14, new cUD()),
    m(18, new cTl()),
    n(28, new cTX()),
    o(29, new cTn(false)),
    p(30, new cTa()),
    q(31, new cTj()),
    r(32, new cTj()),
    s(33, new cTe()),
    t(34, new ctc_0()),
    u(36, new cTP()),
    v(37, new cto_0()),
    w(41, new cTF()),
    x(42, new cue_0()),
    y(43, new ctp_0()),
    z(44, new cUp()),
    A(46, new cUf()),
    B(47, new cUu()),
    C(49, new cUr(fkd.a)),
    D(50, new cUr(fkd.b)),
    E(50, new cUt()),
    F(51, new cTY()),
    G(53, new cUE()),
    H(54, new cUw()),
    I(55, new cSZ()),
    J(57, new cTc()),
    K(61, new cUa()),
    L(62, new cUi()),
    M(63, new cUC()),
    N(64, new cuk_0()),
    O(65, new cTn(true)),
    P(66, new cUq()),
    Q(66, new ctz_0()),
    R(67, new ctb_0()),
    S(68, new cuj_0()),
    T(69, new cTI()),
    U(70, new cub_0()),
    V(71, new ctj_0()),
    W(72, new ctu_0()),
    X(73, new cte_0()),
    Y(74, new ctw_0()),
    Z(75, new ctv_0()),
    aa(76, new cuf_0()),
    ab(78, new cTd()),
    ac(81, new ctd_0()),
    ad(82, new cSX()),
    ae(85, new ctg_0(emr_2.v)),
    af(87, new ctg_0(emr_2.c)),
    ag(90, new ctf_0()),
    ah(91, new ctl_0()),
    ai(94, new cUx()),
    aj(95, new cTv()),
    ak(96, new cTG()),
    al(97, new cTH()),
    am(99, new ctm_0()),
    an(100, new cTu()),
    ao(101, new cSV()),
    ap(102, new ctq_0()),
    aq(103, new cTk()),
    ar(104, new cul_0()),
    as(105, new cum_0()),
    at(106, new cUn()),
    au(107, new cUv()),
    av(108, new cTB()),
    aw(109, new cTQ());

    private final int ax;
    private boolean ay = true;
    private final cSS az;

    public static void a(boolean bl) {
        cSY[] cSYArray = cSY.values();
        int n = cSYArray.length;
        for (int k = 0; k < n; ++k) {
            cSYArray[k].ay = bl;
        }
    }

    private cSY(int n2, cSS cSS2) {
        this.ax = n2;
        this.az = cSS2;
    }

    @Override
    public String d() {
        return this.toString();
    }

    @Override
    public String e() {
        return this.toString();
    }

    public <A extends cSS> A a() {
        cSS cSS2 = this.az.v();
        cSS2.b(this.ay);
        return (A)cSS2;
    }

    public int b() {
        return this.ax;
    }

    public cSS c() {
        return this.az;
    }

    public boolean g() {
        return this.ay;
    }

    public void b(boolean bl) {
        this.ay = bl;
    }

    @Override
    public String f() {
        return this.e();
    }

    public static cSY a(int n) {
        cSY[] cSYArray = cSY.values();
        for (int k = 0; k < cSYArray.length; ++k) {
            cSY cSY2 = cSYArray[k];
            if (cSY2.b() != n) continue;
            return cSY2;
        }
        return null;
    }
}

