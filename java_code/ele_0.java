/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eLe
 */
public enum ele_0 implements aqk_2,
aqs_2
{
    a(0, "GLYPH", ekn_0.w),
    b(1, "HOUR", eko_0.w),
    c(2, "BEACON", ekf_0.x),
    d(3, "TRAP", ekr_0.w),
    e(4, "AURA", ekc_0.w),
    f(5, "BATTLEGROUND_BORDER", eke_0.w),
    g(6, "SIMPLE", ekq_0.w),
    h(7, "WALL", eks_0.y),
    i(8, "WARP", ekt_0.w),
    j(9, "BOMB", ekh_0.x),
    k(12, "ENUTROF_DEPOSIT", ekj_0.w),
    l(13, "LOOT_AREA", ekp_0.w),
    m(14, "SIMPLE_WITH_REM", eku_0.w),
    n(15, "FAKE_FIGHTER", ekl_0.J),
    o(16, "BARREL", ekd_0.x),
    p(18, "BOMB_COMBO", ekg_0.w),
    q(19, "GATE", ekm_0.w),
    r(20, "ARTIFACT", ekb_0.w);

    private final int s;
    private final String t;
    private final sy_0 u;

    private ele_0(int n2, String string2, sy_0 sy_02) {
        this.s = n2;
        this.t = string2;
        this.u = sy_02;
    }

    public int a() {
        return this.s;
    }

    @Override
    public String d() {
        return this.t;
    }

    @Override
    public String e() {
        return this.t;
    }

    @Override
    public aqr_2 c_() {
        return this.u;
    }

    public static ele_0 a(int n) {
        for (ele_0 ele_02 : ele_0.values()) {
            if (ele_02.a() != n) continue;
            return ele_02;
        }
        return null;
    }

    @Override
    public String f() {
        return null;
    }
}

