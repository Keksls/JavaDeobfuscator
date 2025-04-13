/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from byo
 */
public class byo_2
implements ajh_1 {
    private static final Logger u = Logger.getLogger(byo_2.class);
    public static final String a = "characterId";
    public static final String b = "name";
    public static final String d = "smileyDescriptorLibrary";
    public static final String e = "flagIconUrl";
    public static final String f = "level";
    public static final String g = "guildPoints";
    public static final String h = "conquestPoints";
    public static final String i = "rank";
    public static final String j = "isLocalPlayer";
    public static final String k = "isConnected";
    public static final String l = "backgroundColor";
    public static final String m = "canBan";
    public static final String n = "canChangeRank";
    public static final String o = "ranks";
    public static final String p = "isFriend";
    public static final String q = "hasRightToChangeMemberRank";
    public static final String r = "lastConnection";
    public static final String s = "lastConnectionAsString";
    private final erl_1 v;
    public static final String[] t = new String[]{"characterId", "name", "smileyDescriptorLibrary", "flagIconUrl", "level", "guildPoints", "conquestPoints", "rank", "isLocalPlayer", "isConnected", "backgroundColor", "canBan", "canChangeRank", "ranks", "isFriend", "hasRightToChangeMemberRank", "lastConnection", "lastConnectionAsString"};

    public byo_2(erl_1 erl_12) {
        this.v = erl_12;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.v.a();
        }
        if (string.equals(b)) {
            return this.h() ? this.l() : this.v.f();
        }
        if (string.equals(d)) {
            boolean bl = this.v.a() == azu_0.j().k().a_();
            byte by = this.v.h();
            return bl ? byp_2.a().a(by) : bxj_1.a(this.v.j(), this.v.i(), (int)this.v.h());
        }
        if (string.equals(f)) {
            long l = this.v.e();
            return azu_0.j().k().du().a(l);
        }
        if (string.equals(h)) {
            return Cz.a(0);
        }
        if (string.equals(g)) {
            return Cz.a(this.v.c());
        }
        if (string.equals(i)) {
            return byp_2.a().a(this.v.d());
        }
        if (string.equals(o)) {
            byp_2 byp_22 = byp_2.a();
            ArrayList<byj_2> arrayList = new ArrayList<byj_2>();
            for (byj_2 byj_22 : byp_22.f()) {
                ern_1 ern_12 = byp_2.a().p();
                if (ern_12 == null || !ern_12.a(eQt.c, byj_22.i().d())) continue;
                arrayList.add(byj_22);
            }
            return arrayList;
        }
        if (string.equals(n)) {
            return (!this.n() || byp_2.a().q()) && byp_2.a().p().a(eQt.d);
        }
        if (string.equals(j)) {
            return this.a();
        }
        if (string.equals(k)) {
            return this.h();
        }
        if (string.equals(l)) {
            if (this.n()) {
                return "1,0.97,0.7,0.9";
            }
            if (this.h()) {
                return "1,1,1,0.9";
            }
            return "1,1,1,0.3";
        }
        if (string.equals(q)) {
            byp_2 byp_23 = byp_2.a();
            if (byp_23.h() == null) {
                return false;
            }
            if (byp_23.h().m() == 1) {
                return false;
            }
            ern_1 ern_13 = byp_23.p();
            if (ern_13 == null) {
                return false;
            }
            byj_2 byj_23 = byp_2.a().a(this.v.d());
            return !this.n() && ern_13.a(eQt.c, byj_23.i().d());
        }
        if (string.equals(m)) {
            ern_1 ern_14 = byp_2.a().p();
            if (ern_14 == null) {
                return false;
            }
            byj_2 byj_24 = byp_2.a().a(this.v.d());
            return !this.n() && ern_14.a(eQt.b, byj_24.i().d());
        }
        if (string.equals(e)) {
            int n = this.v.k();
            return azs_0.a().m(n == 0 ? -1 : n);
        }
        if (string.equals(p)) {
            return aUL.a().e().a(this.v.a()) != null;
        }
        if (string.equals(r)) {
            return this.m();
        }
        if (string.equals(s)) {
            return bae.h().a("guild.lastConnectionDays", this.m());
        }
        return null;
    }

    private String l() {
        return bvs_0.a(((bvx_0)ans_0.D().h()).m(), this.v.f(), this.v.o(), this.v.m());
    }

    private long m() {
        return (wc_0.p().s() - this.v.l()) / 86400000L;
    }

    private boolean n() {
        return this.b() == byp_2.a().v();
    }

    public boolean a() {
        return azu_0.j().k().a_() == this.v.a();
    }

    public long b() {
        return this.v.d();
    }

    public int c() {
        return this.v.c();
    }

    public short e() {
        oj_0 oj_02 = azu_0.j().k().du();
        return oj_02.a(this.v.e());
    }

    public String f() {
        return this.v.f() == null ? "" : this.v.f();
    }

    public long g() {
        return this.v.a();
    }

    public boolean h() {
        return this.v.g();
    }

    public byte i() {
        return this.v.h();
    }

    public byte j() {
        return this.v.i();
    }

    public short k() {
        return this.v.j();
    }
}

