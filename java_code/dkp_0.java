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
 * Renamed from dkp
 */
class dkp_0
extends akk_2 {
    dkp_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeCompass";
    }

    @Override
    public String b() {
        return "Retire la boussole";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aY;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        ble_1.E().G();
    }
}

