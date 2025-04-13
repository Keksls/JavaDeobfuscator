/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNo
 */
public class bno_0
implements ajh_1 {
    public static final String a = "animatedElement";
    public static final String b = "animName";
    public static final String d = "name";
    public static final String e = "score";
    public static final String f = "ranking";
    public static final String g = "rank";
    public static final String h = "smiley";
    public static final String i = "guildName";
    public static final String j = "level";
    public static final String k = "currentStreakDescription";
    public static final String l = "maxStreakDescription";
    public static final String m = "totalMatches";
    public static final String n = "1v1Matches";
    public static final String o = "2v2Matches";
    public static final String p = "3v3Matches";
    public static final String q = "4v4Matches";
    public static final String r = "5v5Matches";
    public static final String s = "6v6Matches";
    public static final String t = "allMatches";
    public static final String u = "pvpRankIconUrl";
    public static final String v = "pvpRankPassportIconUrl";
    public static final String w = "nationId";
    private static final String[] x = new String[]{"animatedElement", "name", "score", "ranking", "rank", "smiley", "guildName", "level", "currentStreakDescription", "maxStreakDescription", "totalMatches", "1v1Matches", "2v2Matches", "3v3Matches", "4v4Matches", "5v5Matches", "6v6Matches", "allMatches", "nationId", "pvpRankIconUrl", "pvpRankPassportIconUrl"};
    private fgZ y;
    private bxj_1 z;
    private final ArrayList<bns_0> A = new ArrayList();
    private biI B;
    private static final TLongObjectHashMap<bno_0> C = new TLongObjectHashMap();
    private static final abj_2<Long, bno_0> D = new abj_2(50);

    public static void a() {
        D.a();
        C.clear();
    }

    public static bno_0 a(faU faU2, boolean bl) {
        fgZ fgZ2 = new fgZ(faU2.a_(), faU2.fE().n());
        eac_0 eac_02 = new eac_0(faU2.a_());
        fgZ2.a(eac_02);
        eac_02.a(faU2.U_());
        eac_02.a(faU2.dp());
        eac_02.a(faU2.gO());
        eac_02.a(faU2.gX());
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl2 = bmr_12.a_() == fgZ2.a();
        bno_0 bno_02 = bno_0.a(fgZ2);
        if (bno_02 == null) {
            bno_0 bno_03 = bl2 ? bno_0.a(fgZ2, bmr_12.bv()) : bno_0.b(fgZ2);
            bno_03.c();
            return bno_03;
        }
        if (bl) {
            bno_02.c();
        }
        return bno_02;
    }

    public static bno_0 a(fgZ fgZ2, boolean bl) {
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl2 = bmr_12.a_() == fgZ2.a();
        bno_0 bno_02 = bno_0.a(fgZ2);
        if (bno_02 == null) {
            return bl2 ? bno_0.a(fgZ2, bmr_12.bv()) : bno_0.b(fgZ2);
        }
        if (bl) {
            bno_02.d(fgZ2);
            return bno_02;
        }
        bno_02.c(fgZ2);
        return bno_02;
    }

    private static bno_0 a(fgZ fgZ2) {
        bno_0 bno_02 = (bno_0)C.get(fgZ2.a());
        return bno_02 == null ? D.a(fgZ2.a()) : bno_02;
    }

    private static bno_0 b(fgZ fgZ2) {
        bno_0 bno_02 = new bno_0(fgZ2);
        D.a(fgZ2.a(), bno_02);
        return bno_02;
    }

    private static bno_0 a(fgZ fgZ2, biI biI2) {
        bno_0 bno_02 = new bno_0(fgZ2);
        bno_02.B = biI2;
        C.put(fgZ2.a(), (Object)bno_02);
        return bno_02;
    }

    private bno_0(fgZ fgZ2) {
        this.y = fgZ2;
        this.z = bxj_1.a(fgZ2.g(), fgZ2.h(), xg_0.a.a());
        if (this.y.k() != null) {
            this.B = biG.a(this.y);
        }
        for (fgX fgX2 : fgX.values()) {
            this.A.add(new bns_0(fgX2, fgZ2));
        }
    }

    private void c(fgZ fgZ2) {
        this.y = fgZ2;
        this.z = bxj_1.a(fgZ2.g(), fgZ2.h(), xg_0.a.a());
        if (this.y.k() != null) {
            this.B = biG.a(this.y);
        }
        fis_1.a().a((ajf_1)this, x);
        for (fgX fgX2 : fgX.values()) {
            this.A.get(fgX2.a()).a(fgZ2);
        }
    }

    private void d(fgZ fgZ2) {
        this.y = fgZ2;
        this.z = bxj_1.a(fgZ2.g(), fgZ2.h(), xg_0.a.a());
        if (this.y.k() != null) {
            this.B = biG.a(this.y);
        }
        for (fgX fgX2 : fgX.values()) {
            this.A.get(fgX2.a()).a(fgZ2);
        }
    }

    public fgZ b() {
        return this.y;
    }

    @Override
    public String[] d() {
        return x;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(u)) {
            int n = this.y.q();
            fgY fgY2 = this.y.t();
            return azs_0.a().a("pvpRankIconsPath", "defaultIconPath", n, fgY2.c());
        }
        if (string.equals(v)) {
            int n = this.y.q();
            fgY fgY3 = this.y.t();
            return azs_0.a().a("pvpRankPassportIconsPath", "defaultIconPath", n, fgY3.c());
        }
        if (string.equals(w)) {
            return this.y.q();
        }
        if (string.equals(a)) {
            return this.B;
        }
        if (string.equals(b)) {
            return "AnimEmote-Victoire";
        }
        if (string.equals(d)) {
            return this.y.f();
        }
        if (string.equals(e)) {
            return this.y.u();
        }
        if (string.equals(f)) {
            int n = this.y.v();
            return n == -1 ? "-" : Integer.valueOf(n + 1);
        }
        if (string.equals(g)) {
            return bae.h().a("nation.pvpRank." + this.y.y(), new Object[0]);
        }
        if (string.equals(h)) {
            return this.z;
        }
        if (string.equals(j)) {
            return this.y.m();
        }
        if (string.equals(m)) {
            return this.A.get(fgX.a.a());
        }
        if (string.equals(n)) {
            return this.A.get(fgX.b.a());
        }
        if (string.equals(o)) {
            return this.A.get(fgX.c.a());
        }
        if (string.equals(p)) {
            return this.A.get(fgX.d.a());
        }
        if (string.equals(q)) {
            return this.A.get(fgX.e.a());
        }
        if (string.equals(r)) {
            return this.A.get(fgX.f.a());
        }
        if (string.equals(s)) {
            return this.A.get(fgX.g.a());
        }
        if (string.equals(t)) {
            return this.A;
        }
        if (string.equals(k)) {
            return "x" + this.y.A();
        }
        if (string.equals(l)) {
            return "x" + this.y.B();
        }
        return null;
    }

    public void c() {
        cAh cAh2 = new cAh(this.y.a());
        azu_0.j().K().c(cAh2);
    }

    public String toString() {
        return "PvpLadderEntryView{m_entry=" + this.y + ", m_smiley=" + this.z + "}";
    }
}

