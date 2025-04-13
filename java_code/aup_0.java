/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aUp
 */
public enum aup_0 {
    a(-1, Integer.MAX_VALUE, null, null, "", false, false, null, null),
    b(1, 10, "vicinityPipe", new fyr_0(elw_1.ct), "chat.pipeName.vicinity", false, true, aUe.a, null),
    c(2, 20, "privatePipe", new fyr_0(elw_1.cu), "chat.pipeName.private", false, true, aUe.b, null),
    d(3, 30, "gameErrorPipe", new fyr_0(elw_1.cn), "chat.pipeName.gameError", false, false, null, null),
    e(4, 40, "gameInformationPipe", new fyr_0(elw_1.co), "chat.pipeName.gameInformation", false, true, null, null),
    f(5, 50, "partyPipe", new fyr_0(elw_1.cv), "chat.pipeName.group", true, true, aUe.c, null),
    g(6, 60, "guildPipe", new fyr_0(elw_1.cw), "chat.pipeName.guild", true, true, aUe.d, null),
    h(7, 70, "tradePipe", new fyr_0(elw_1.cx), "chat.pipeName.trade", true, true, aUe.e, eog_0.c),
    i(8, 80, "politicPipe", new fyr_0(elw_1.cy), "chat.pipeName.politic", true, true, null, null),
    j(10, 100, "adminPipe", azf_2.A, "chat.pipeName.admin", true, false, aUe.j, eog_0.a),
    k(11, 110, "allPipe", new fyr_0(elw_1.cs), "chat.pipeName.all", false, false, null, eog_0.b),
    l(13, 130, "battlegroundPipe", new fyr_0(elw_1.cz), "chat.pipeName.battleground", true, true, aUe.f, null),
    m(14, 140, "intergamePipe", new fyr_0(elw_1.cA), "chat.pipeName.intergame", true, true, aUe.g, null),
    n(15, 150, "frCommunityChannel", new fyr_0(elw_1.cB), "chat.pipeName.community.fr", true, true, aUe.l, eog_0.d, Ow.a),
    o(16, 151, "enCommunityChannel", new fyr_0(elw_1.cC), "chat.pipeName.community.en", true, true, aUe.m, eog_0.e, Ow.b),
    p(17, 152, "esCommunityChannel", new fyr_0(elw_1.cD), "chat.pipeName.community.es", true, true, aUe.n, eog_0.f, Ow.c),
    q(18, 153, "ptCommunityChannel", new fyr_0(elw_1.cE), "chat.pipeName.community.pt", true, true, aUe.o, eog_0.g, Ow.d),
    r(19, 190, "frRecruitmentChannel", new fyr_0(elw_1.cF), "chat.pipeName.recruitment.fr", true, true, aUe.q, eog_0.h, Ow.a),
    s(20, 191, "enRecruitmentChannel", new fyr_0(elw_1.cG), "chat.pipeName.recruitment.en", true, true, aUe.r, eog_0.i, Ow.b),
    t(21, 192, "esRecruitmentChannel", new fyr_0(elw_1.cH), "chat.pipeName.recruitment.es", true, true, aUe.s, eog_0.j, Ow.c),
    u(22, 193, "ptRecruitmentChannel", new fyr_0(elw_1.cI), "chat.pipeName.recruitment.pt", true, true, aUe.t, eog_0.k, Ow.d);

    public static final List<aup_0> v;
    public static final List<aup_0> w;
    public static final List<aup_0> x;
    private static final List<aup_0> y;
    private static final List<aup_0> z;
    private final int A;
    private final int B;
    private final String C;
    private final azj_2 D;
    private final String E;
    private final boolean F;
    private final boolean G;
    private final aUe H;
    private final eog_0 I;
    private final Ow J;

    private aup_0(int n2, int n3, String string2, azj_2 azj_22, String string3, boolean bl, boolean bl2, aUe aUe2, eog_0 eog_02) {
        this(n2, n3, string2, azj_22, string3, bl, bl2, aUe2, eog_02, null);
    }

    private aup_0(int n2, int n3, String string2, azj_2 azj_22, String string3, boolean bl, boolean bl2, aUe aUe2, eog_0 eog_02, Ow ow) {
        this.A = n2;
        this.B = n3;
        this.C = string2;
        this.D = azj_22;
        this.E = bae.h().a(string3, new Object[0]);
        this.F = bl;
        this.G = bl2;
        this.H = aUe2;
        this.I = eog_02;
        this.J = ow;
    }

    public int a() {
        return this.A;
    }

    public int b() {
        return this.B;
    }

    public String c() {
        return this.C;
    }

    public azj_2 d() {
        return this.D;
    }

    @Nullable
    public String e() {
        if (this.D == null) {
            return null;
        }
        return fkm_1.a(this.D);
    }

    public String f() {
        return this.E;
    }

    public boolean g() {
        return this.G;
    }

    public boolean h() {
        return this.F;
    }

    public aUe i() {
        return this.H;
    }

    public eog_0 j() {
        return this.I;
    }

    @Nullable
    public Ow k() {
        return this.J;
    }

    public boolean l() {
        return y.contains((Object)this);
    }

    public boolean m() {
        return z.contains((Object)this);
    }

    public static aup_0 a(int n) {
        for (aup_0 aup_02 : aup_0.values()) {
            if (aup_02.A != n) continue;
            return aup_02;
        }
        return a;
    }

    public static aup_0 a(Ow ow) {
        for (aup_0 aup_02 : y) {
            if (aup_02.J != ow) continue;
            return aup_02;
        }
        return a;
    }

    public static aup_0 b(Ow ow) {
        for (aup_0 aup_02 : z) {
            if (aup_02.J != ow) continue;
            return aup_02;
        }
        return a;
    }

    public static aup_0 a(eog_0 eog_02) {
        for (aup_0 aup_02 : aup_0.values()) {
            if (aup_02.I != eog_02) continue;
            return aup_02;
        }
        return a;
    }

    static {
        v = List.of(b, c, m, d, e, f, g, h, i, j, k, l, n, o, p, q, r, s, t, u);
        w = List.of(c, m, d, j, k);
        x = List.of(b, h, i, l, n, o, p, q, r, s, t, u);
        y = List.of(n, o, p, q);
        z = List.of(r, s, t, u);
    }
}

