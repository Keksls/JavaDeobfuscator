/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caG
 */
public class cag_1
extends akk_2 {
    public cag_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getPlayerRealLevel";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("localPlayerRealLevel", null, akg_2.b, false)};
    }

    @Override
    protected void a(int n) {
        this.q(azu_0.j().k().dt());
    }
}

