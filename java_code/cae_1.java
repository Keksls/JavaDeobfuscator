/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caE
 */
public final class cae_1
extends akk_2 {
    public cae_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getPlayerName";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("localPlayerName", null, akg_2.c, false)};
    }

    @Override
    protected void a(int n) {
        this.a(azu_0.j().k().dp());
    }
}

