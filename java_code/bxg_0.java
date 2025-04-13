/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXG
 */
class bxg_0
extends akk_2 {
    public bxg_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setFightTurnStartedListener";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("playerId", "Listener id trigger on playerId's turn", akg_2.b, false), new akf_1("funcName", null, akg_2.c, false), new akf_1("params", null, akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        byc_0 byc_02 = new byc_0(l);
        String string = this.i(1);
        akr_2[] akr_2Array = this.a(2, n);
        akx_2 akx_22 = this.m();
        aln_2.a().a(byc_02, akx_22, string, akr_2Array, false);
    }
}

