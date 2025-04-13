/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.set.hash.TLongHashSet;
import org.jetbrains.annotations.Nullable;

public class btj
implements ajh_1 {
    public static final String a = "currentDifficulty";
    public static final String b = "isAutoDownscaled";
    public static final String d = "instanceName";
    public static final String e = "readOnly";
    public static final String f = "levelRange";
    public static final String g = "bossIllustrationUrl";
    public static final String h = "maxDifficulty";
    public static final String i = "canChangeDifficulty";
    public static final String j = "difficultyBonus";
    public static final String k = "bestDifficulty";
    public static final String l = "competitiveModeText";
    public static final String m = "maxDifficultyNormalMode";
    public static final String n = "canEnterDungeon";
    public static final String o = "isDifficultyAvailable";
    public static final String p = "isForcedDownscaled";
    public static final String q = "gameplayIcon";
    public static final String r = "helpTooltipText";
    public static final String s = "minAllowedStasis";
    public static final String t = "maxAllowedStasis";
    private int v;
    private final int w;
    private boolean x;
    private boolean y;
    private final boolean z;
    private final int A;
    private final ezb_2 B;
    private int C = Integer.MIN_VALUE;
    private int D = Integer.MAX_VALUE;
    public static final String[] u = new String[]{"currentDifficulty", "isAutoDownscaled", "instanceName", "readOnly", "levelRange", "bossIllustrationUrl", "maxDifficulty", "canChangeDifficulty", "difficultyBonus", "bestDifficulty", "competitiveModeText", "maxDifficultyNormalMode", "canEnterDungeon", "isForcedDownscaled", "gameplayIcon", "helpTooltipText", "isDifficultyAvailable", "minAllowedStasis", "maxAllowedStasis"};

    public btj(ezb_2 ezb_22, int n, boolean bl, boolean bl2, int n2) {
        this.B = ezb_22;
        this.c(n);
        this.x = ezb_22.h() || bl;
        this.z = bl2;
        this.w = n;
        this.A = n2;
    }

    @Override
    public String[] d() {
        return u;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.v;
        }
        if (string.equals(b)) {
            return this.x;
        }
        if (string.equals(d)) {
            return this.h();
        }
        if (string.equals(e)) {
            return this.y;
        }
        if (string.equals(f)) {
            return this.i();
        }
        if (string.equals(g)) {
            return this.j();
        }
        if (string.equals(h)) {
            if (!this.z) {
                return this.w;
            }
            return (short)(this.x || ees_0.a(this.B.a()) ? 10 : 10);
        }
        if (string.equals(i)) {
            return this.B.g() && !this.g();
        }
        if (string.equals(j)) {
            return bae.h().a(this.B.j(), this.v, this.B.k().a(), this.A, this.x ? 1 : 0);
        }
        if (string.equals(r)) {
            return bae.h().a("stasis.dungeon.help.difficulty", this.v, this.B.k().a(), this.A, this.x ? 1 : 0);
        }
        if (string.equals(k)) {
            return this.A;
        }
        if (string.equals(l)) {
            short s2 = this.B.c();
            short s3 = ezi_1.a(s2);
            return bae.h().a("stasis.dungeon.competitive", s3);
        }
        if (string.equals(m)) {
            return 10;
        }
        if (string.equals(n)) {
            if (!this.x) {
                return true;
            }
            if (!fis_1.a().c("hideDownscaling")) {
                return true;
            }
            short s4 = ezi_1.a(this.B.c());
            long l = azu_0.j().n().u();
            TLongHashSet tLongHashSet = euw_2.a.e(l);
            for (long l2 : tLongHashSet) {
                Object t = euw_2.a.d(l2);
                if (((epq_2)t).dt() <= s4) continue;
                return false;
            }
            return true;
        }
        if (string.equals(o)) {
            return this.B.g() && !this.g();
        }
        if (p.equals(string)) {
            return this.f();
        }
        if (q.equals(string)) {
            return btf.a(this.B.k());
        }
        if (s.equals(string)) {
            return this.C;
        }
        if (t.equals(string)) {
            return this.D;
        }
        return null;
    }

    public void a(int n) {
        this.C = n;
    }

    public void b(int n) {
        this.D = n;
    }

    private boolean g() {
        return eEF.b(this.B.a());
    }

    public final void c(int n) {
        this.v = Hw.a(n, 1, 10);
    }

    public void a(boolean bl) {
        this.x = this.B.h() || bl;
    }

    public boolean a() {
        return this.x;
    }

    public int b() {
        return this.v;
    }

    public void b(boolean bl) {
        this.y = bl;
    }

    public boolean c() {
        return this.y;
    }

    private String h() {
        return bae.h().a(137, (long)this.B.a(), new Object[0]);
    }

    private String i() {
        short s2 = this.B.c();
        short s3 = ezi_1.a(this.B.c());
        return bae.h().a("stasis.dungeon.level.range", (int)s2, (int)s3);
    }

    private String j() {
        return azs_0.a().c(this.B.a());
    }

    public ezb_2 e() {
        return this.B;
    }

    public boolean f() {
        return this.B.h() || this.g();
    }
}

