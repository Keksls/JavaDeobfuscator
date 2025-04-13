/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aLw
 */
final class alw_2
extends alr_2 {
    private static final akf_1[] b = new akf_1[]{new akf_1("actionId", null, akg_2.d, false)};
    private static final akf_1[] c = new akf_1[]{new akf_1("actionExists", null, akg_2.f, false)};
    private static final String d = "executeFirstActionWithSpecialId";
    private static final String g = "Execute la premi?re action qui correspond ? un effet dont l'id (id de l'effet, pas du type de l'effet) est pass? en param?tre";

    alw_2(LuaState luaState, akx_1 akx_12) {
        super(luaState, akx_12);
    }

    @Override
    public String a() {
        return d;
    }

    @Override
    public akf_1[] e() {
        return b;
    }

    @Override
    public akf_1[] f() {
        return c;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        aku_1 aku_12 = this.a.b(n2);
        if (aku_12 != null) {
            this.a.a(aku_12, false);
            this.a(true);
        } else {
            this.a(false);
        }
    }

    @Override
    public String b() {
        return g;
    }
}

