/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dhV
 */
class dhv_0
extends akk_2 {
    dhv_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return new akf_1[]{new akf_1("alpha", "Alpha value between [0; 1]", akg_2.e, false)};
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        if (n != 1) {
            throw new LuaException("Invalid parameter count");
        }
        float f2 = this.f(0);
        cZb.a.a(f2);
    }

    @Override
    public String a() {
        return "setAlpha";
    }
}

