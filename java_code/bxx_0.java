/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXx
 */
class bxx_0
extends akk_2 {
    public bxx_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeFightTurnStartedListener";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("playerId", null, akg_2.d, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        byc_0 byc_02 = new byc_0(n2);
        aln_2.a().b(byc_02);
    }
}

