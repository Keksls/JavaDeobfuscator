/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class btb
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "levelRange";
    public static final String d = "location";
    public static final String e = "isLocked";
    public static final String f = "lockDesc";
    public static final String g = "isDifficultyAvailable";
    public static final String h = "bestDifficulty";
    public static final String i = "bossIllustrationUrl";
    public static final String j = "crownStyle";
    public static final String k = "crownDesc";
    public static final String l = "recordBorder";
    public static final String m = "shards";
    public static final String n = "borderEasy";
    public static final String o = "borderNormal";
    public static final String p = "borderHard";
    public static final String q = "borderExpert";
    public static final String r = "borderMaster";
    public static final String s = "laurelBronze";
    public static final String t = "laurelSilver";
    public static final String u = "laurelGold";
    public static final String v = "isOgrest";
    public static final String w = "ladderType";
    public static final String x = "hasRewards";
    public static final String y = "mysteryBoxEasy";
    public static final String z = "mysteryBoxNormal";
    public static final String A = "mysteryBoxHard";
    public static final String B = "mysteryBoxExpert";
    public static final String C = "mysteryBoxMaster";
    public static final String D = "mysteryBoxEasyAmount";
    public static final String E = "mysteryBoxNormalAmount";
    public static final String F = "mysteryBoxHardAmount";
    public static final String G = "mysteryBoxExpertAmount";
    public static final String H = "mysteryBoxMasterAmount";
    public static final String I = "gameplayIcon";
    public static final String J = "gameplayDescription";
    public static final String K = "canFindOnMap";
    public static final String L = "hasStele";
    protected static final byte M = 0;
    protected static final byte N = 1;
    protected static final byte O = 2;
    private final int P;
    private final int Q;

    public btb(int n) {
        this.P = n;
        this.Q = fas.a.c(n);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.n();
        }
        if (string.equals(b)) {
            ani_2 ani_22 = new ani_2();
            ani_22.a(this.o());
            return bae.h().a("levelShort.custom", ani_22.r());
        }
        if (string.equals(d)) {
            return this.r();
        }
        if (string.equals(e)) {
            return this.t();
        }
        if (string.equals(f)) {
            String string2 = bte.a(azu_0.j().k(), this.Q);
            if (string2.length() == 0) {
                return null;
            }
            ani_2 ani_23 = new ani_2();
            ani_23.a().a((CharSequence)string2).b();
            return ani_23.r();
        }
        if (string.equals(g)) {
            return this.c();
        }
        if (string.equals(h)) {
            bmr_1 bmr_12 = azu_0.j().k();
            return bmr_12.fk().a(this.P);
        }
        if (string.equals(i)) {
            return this.u();
        }
        if (string.equals(j)) {
            return this.e();
        }
        if (string.equals(k)) {
            return this.f();
        }
        if (string.equals(l)) {
            return this.g();
        }
        if (string.equals(m)) {
            Object r2 = eyo_1.g().d(27083);
            return new bht_1((ezr_0<bhg_0>)r2);
        }
        if (string.equals(n)) {
            return azs_0.a().s(String.valueOf(1));
        }
        if (string.equals(o)) {
            return azs_0.a().s(String.valueOf(2));
        }
        if (string.equals(p)) {
            return azs_0.a().s(String.valueOf(3));
        }
        if (string.equals(q)) {
            return azs_0.a().s(String.valueOf(4));
        }
        if (string.equals(r)) {
            return azs_0.a().s(String.valueOf(5));
        }
        if (string.equals(s)) {
            return azs_0.a().t(String.valueOf(1));
        }
        if (string.equals(t)) {
            return azs_0.a().t(String.valueOf(2));
        }
        if (string.equals(u)) {
            return azs_0.a().t(String.valueOf(3));
        }
        if (string.equals(v)) {
            return this.v();
        }
        if (string.equals(x)) {
            return this.l();
        }
        if (string.equals(y)) {
            return this.a((short)eer_0.b.a());
        }
        if (string.equals(z)) {
            return this.a((short)eer_0.c.a());
        }
        if (string.equals(A)) {
            return this.a((short)eer_0.d.a());
        }
        if (string.equals(B)) {
            return this.a((short)eer_0.e.a());
        }
        if (string.equals(C)) {
            return this.a((short)eer_0.f.a());
        }
        if (string.equals(D)) {
            return "x" + this.b((short)eer_0.b.a());
        }
        if (string.equals(E)) {
            return "x" + this.b((short)eer_0.c.a());
        }
        if (string.equals(F)) {
            return "x" + this.b((short)eer_0.d.a());
        }
        if (string.equals(G)) {
            return "x" + this.b((short)eer_0.e.a());
        }
        if (string.equals(H)) {
            return "x" + this.b((short)eer_0.f.a());
        }
        if (string.equals(w)) {
            return this.h();
        }
        if (string.equals(I)) {
            return this.i();
        }
        if (string.equals(J)) {
            return this.j();
        }
        if (string.equals(K)) {
            return blf_1.a(this.q(), false) != null;
        }
        if (string.equals(L)) {
            return this.a();
        }
        return null;
    }

    protected boolean a() {
        return this.b() > 0;
    }

    public int b() {
        ezb_2 ezb_22 = ezd_2.a.a(this.P);
        if (ezb_22 == null) {
            return -1;
        }
        return ezb_22.l();
    }

    protected boolean c() {
        ezb_2 ezb_22 = ezd_2.a.a(this.P);
        return ezb_22 != null && ezb_22.g();
    }

    protected String e() {
        ezb_2 ezb_22 = ezd_2.a.a(this.P);
        if (!ezb_22.g() || this.w()) {
            return "DungeonLadderNoCrown";
        }
        bmr_1 bmr_12 = azu_0.j().k();
        int n = bmr_12.fk().a(this.P);
        return btf.b(n);
    }

    @NotNull
    protected String f() {
        ezb_2 ezb_22 = ezd_2.a.a(this.P);
        if (!ezb_22.g() || this.w()) {
            return bae.h().a("dungeon.ladder.crown.desc.no", new Object[0]);
        }
        bmr_1 bmr_12 = azu_0.j().k();
        int n = bmr_12.fk().a(this.P);
        eer_0 eer_02 = eer_0.b(n);
        int n2 = eer_02.b() + 1;
        if (n2 > eer_0.d.b()) {
            return bae.h().a("dungeon.ladder.crown.desc.complete", new Object[0]);
        }
        String string = bae.h().a("stasis.dungeon.difficulty" + n2, new Object[0]);
        return bae.h().a("dungeon.ladder.crown.desc", string);
    }

    protected String g() {
        ezb_2 ezb_22 = ezd_2.a.a(this.P);
        if (!ezb_22.g() || this.w()) {
            return azs_0.a().q(String.valueOf(0));
        }
        bmr_1 bmr_12 = azu_0.j().k();
        int n = bmr_12.fk().a(this.P);
        return btf.a(n);
    }

    protected int h() {
        if (this.w()) {
            return 1;
        }
        return 0;
    }

    @Nullable
    protected String i() {
        ezb_2 ezb_22 = ezd_2.a.a(this.P);
        if (ezb_22 == null || ezb_22.k() == null) {
            return null;
        }
        return btf.a(ezb_22.k());
    }

    @Nullable
    protected String j() {
        ezb_2 ezb_22 = ezd_2.a.a(this.P);
        if (ezb_22 == null || ezb_22.k() == null) {
            return null;
        }
        return bae.h().a("dungeon.gameplay." + ezb_22.k().a(), new Object[0]);
    }

    protected ezc_2 k() {
        ezb_2 ezb_22 = ezd_2.a.a(this.P);
        if (ezb_22 == null) {
            return null;
        }
        return ezb_22.k();
    }

    public boolean l() {
        ezb_2 ezb_22 = ezd_2.a.a(this.P);
        return ezb_22 != null && ezb_22.g();
    }

    public int m() {
        return this.P;
    }

    public String n() {
        return bae.h().a(137, (long)this.P, new Object[0]);
    }

    public short o() {
        ezb_2 ezb_22 = ezd_2.a.a(this.P);
        return ezb_22 != null ? ezb_22.c() : (short)0;
    }

    public bht_1 a(int n2) {
        return eED.a.a(this.P, (short)n2).map(Cm::a).map(n -> (bjw_1)eyo_1.g().d((int)n)).map(bht_1::new).orElse(null);
    }

    public int a(btm btm2) {
        return this.b(btm2.g());
    }

    public int b(int n) {
        return eED.a.a(this.P, (short)n).map(Cm::b).orElse(0);
    }

    public long p() {
        ezb_2 ezb_22 = ezd_2.a.a(this.P);
        return ezb_22 != null ? ezb_22.b() : 0L;
    }

    public long q() {
        return this.p();
    }

    protected String r() {
        ezb_2 ezb_22 = ezd_2.a.a(this.P);
        if (ezb_22 == null) {
            return "";
        }
        return bae.h().a(77, ezb_22.b(), new Object[0]);
    }

    public boolean s() {
        short s2 = azu_0.j().k().dr();
        return s2 >= this.o();
    }

    public boolean t() {
        return this.x().e(this.Q);
    }

    private fam_0 x() {
        return azu_0.j().k().cB();
    }

    public String u() {
        return azs_0.a().c(this.P);
    }

    public boolean v() {
        return this.P == 131;
    }

    public boolean w() {
        return eEF.b(this.P);
    }
}

