/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caA
 */
public final class caa_1
extends akk_2 {
    public caa_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getPlayerFightId";
    }

    @Override
    public String b() {
        return "Return ID of the current or observed fight for the local player character";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("localPlayerFightId", null, akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        this.q(azu_0.j().k().cQ());
    }
}

