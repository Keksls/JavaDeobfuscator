/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZU
 */
final class bzu_0
extends cap_2 {
    private static final Logger a = Logger.getLogger(bzu_0.class);
    private static final String c = "getAreaId";
    private static final String d = "Return the area ID of the fighter given as parameter";
    private static final akf_1[] g = new akf_1[]{new akf_1("fighterId", null, akg_2.b, false)};
    private static final akf_1[] h = new akf_1[]{new akf_1("areaId", null, akg_2.b, false)};

    bzu_0(LuaState luaState, bbo_0 bbo_02) {
        super(luaState, bbo_02);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return g;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return h;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        int n2 = this.b.C();
        if (n2 == -1) {
            this.a(a, "Fight Id introuvable : " + n2);
            this.l();
            return;
        }
        bwh_0 bwh_02 = bwj_1.a().a(n2);
        if (bwh_02 == null) {
            this.a(a, "Fight introuvable");
            this.l();
            return;
        }
        sr_0 sr_02 = bwh_02.i().b(l);
        if (sr_02 == null) {
            this.a(a, "Area introuvable : " + l);
            this.l();
            return;
        }
        this.b(sr_02.A());
    }

    @Override
    public String b() {
        return d;
    }

    @Override
    public String a() {
        return c;
    }
}

