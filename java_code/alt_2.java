/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aLt
 */
final class alt_2
extends alr_2 {
    private static final String b = "executeActionsWithSpecialId";
    private static final String c = "Execute toutes les actions qui correspondent ? un effet dont l'id (id de l'effet, pas du type de l'effet) est pass? en param?tre";
    private static final akf_1[] d = new akf_1[]{new akf_1("actionId", null, akg_2.d, false)};

    alt_2(LuaState luaState, akx_1 akx_12) {
        super(luaState, akx_12);
    }

    @Override
    public String a() {
        return b;
    }

    @Override
    public akf_1[] e() {
        return d;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        aku_1 aku_12 = this.a.b(n2);
        while (aku_12 != null) {
            this.a.a(aku_12, false);
            aku_12 = this.a.b(n2);
        }
    }

    @Override
    public String b() {
        return c;
    }
}

