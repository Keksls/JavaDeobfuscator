/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkt
extends akk_2 {
    dkt(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String b() {
        return "Enl?ve le marqueur de boussole de la map et de la miniMap";
    }

    @Override
    public final String a() {
        return "removeMiniMapMarker";
    }

    @Override
    public final akf_1[] e() {
        return dir_0.aE;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public final void a(int n) {
        ble_1.E().B();
    }
}

