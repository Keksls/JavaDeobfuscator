/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caB
 */
public final class cab_1
extends akk_2 {
    public cab_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getPlayer";
    }

    @Override
    public String b() {
        return "Return local player id";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("localPlayerId", null, akg_2.b, false)};
    }

    @Override
    protected void a(int n) {
        this.b(azu_0.j().k().a_());
    }
}

