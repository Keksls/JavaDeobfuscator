/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caC
 */
public final class cac_1
extends akk_2 {
    public cac_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getPlayerInstanceId";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("localPlayerInstanceId", null, akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        this.b(azu_0.j().k().T_());
    }
}

