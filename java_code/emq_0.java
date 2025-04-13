/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TShortProcedure
 *  gnu.trove.set.hash.TShortHashSet
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TShortProcedure;
import gnu.trove.set.hash.TShortHashSet;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from emQ
 */
public enum emq_0 implements emo_0
{
    a(96, 180, 310, 312),
    b(359),
    c(407),
    d(304),
    e(243, 364, 144, 189, 68),
    f(34, 291),
    g(203),
    h(80),
    i(412),
    j(372),
    k(93, 481, 255, 365, 92, 114, 466),
    l(478),
    m(389, 197, 27, 271, 61, 461, 37, 443, 408, 28, 379, 120, 319, 394, 240, 79, 306, 455, 89, 115, 486, 36, 224, 301, 14),
    n(469),
    o(473, 431),
    p(201, 143, 176, 62),
    q(74, 259, 485, 380, 299, 321, 40),
    r(437),
    s(283, 422, 200),
    t(183, 202),
    u(71),
    v(31),
    w(198),
    x(402, 429, 99, 314, 279, 249, 454, 88, 169),
    y(298),
    z(4),
    A(190),
    B(484),
    C(276),
    D(483, 151),
    E(256, 444, 277),
    F(new short[0]),
    G(30),
    H(253, 25, 150, 231),
    I(275),
    J(167),
    K(129),
    L(90),
    M(350),
    N(449),
    O(160),
    P(489),
    Q(302),
    R(300),
    S(246),
    T(107),
    U(95, 344, 173, 411),
    V(6, 238, 12, 32, 121),
    W(332, 64, 311, 390, 222, 433, 206, 128),
    X(103, 228, 241),
    Y(331),
    Z(414, 424, 223),
    aa(8, 232, 499, 328, 141, 313, 191),
    ab(82, 416, 467, 142, 388, 225, 435, 261, 329, 315, 378, 112, 9, 178),
    ac(363),
    ad(274, 47),
    ae(470, 323, 13, 165),
    af(194),
    ag(131),
    ah(159, 210),
    ai(new short[0]),
    aj(374, 110, 475, 419, 106, 288, 289, 352, 215, 24, 474, 11),
    ak(161),
    al(284, 396, 340),
    am(136),
    an(5),
    ao(49, 445),
    ap(458),
    aq(139, 441),
    ar(45),
    as(342, 126),
    at(72, 168, 440, 138),
    au(158),
    av(123),
    aw(349),
    ax(20, 405, 188, 170, 355, 426, 221, 410, 385, 199, 297, 400),
    ay(397),
    az(213, 218, 140, 185, 377),
    aA(23),
    aB(245, 118, 63, 15, 495, 381, 125, 204, 226, 423, 398, 492),
    aC(326, 35),
    aD(134, 286, 157, 317, 174, 43, 192, 137, 395, 250, 420, 181, 196),
    aE(220),
    aF(166, 46, 2, 162, 211, 290, 56, 418, 401, 280, 230, 468, 442, 59, 227, 281, 257),
    aG(451, 464, 51, 270, 29, 207),
    aH(490),
    aI(360, 26, 122, 208, 278, 425),
    aJ(498, 386, 153, 10, 293, 262, 184),
    aK(152, 266),
    aL(148, 58),
    aM(488),
    aN(40),
    aO(111, 50, 496, 345, 480, 307),
    aP(346, 127, 236),
    aQ(334),
    aR(1),
    aS(3, 75),
    aT(403, 494, 438),
    aU(358),
    aV(251),
    aW(102, 460, 130),
    aX(182, 216, 101, 371),
    aY(new short[0]),
    aZ(new short[0]),
    ba(new short[0]),
    bb(new short[0]),
    bc(new short[0]),
    bd(new short[0]),
    be(new short[0]),
    bf(new short[0]),
    bg(new short[0]),
    bh(new short[0]),
    bi(new short[0]),
    bj(new short[0]),
    bk(new short[0]),
    bl(new short[0]),
    bm(new short[0]),
    bn(new short[0]),
    bo(new short[0]),
    bp(new short[0]),
    bq(new short[0]),
    br(new short[0]),
    bs(new short[0]),
    bt(new short[0]);

    private final TShortHashSet bu = new TShortHashSet();

    private emq_0(short ... sArray) {
        this.bu.addAll(sArray);
    }

    @Nullable
    public static emq_0 a(short s2) {
        emR emR2 = new emR(s2);
        for (emq_0 emq_02 : emq_0.values()) {
            if (emq_02.bu.forEach((TShortProcedure)emR2)) continue;
            return emq_02;
        }
        return null;
    }
}

