/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from djL
 */
class djl_0
extends akk_2 {
    djl_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "miniMapMarker";
    }

    @Override
    public String b() {
        return "Applique le marqueur de boussole sur la map et la minimap ? une position sp?cifi?e";
    }

    @Override
    public final akf_1[] e() {
        return dir_0.aD;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public final void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        int n4 = this.d(2);
        ble_1.E().a((float)n2, (float)n3, (float)n4, azu_0.j().k().T_(), "", (Object)this, bLs.g, anr_0.G);
    }
}

