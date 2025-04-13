/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKI
 */
final class aki_2
extends akg_2 {
    @Override
    public boolean a(LuaState luaState, int n) {
        return luaState.isObject(n) || luaState.isNumber(n);
    }
}

