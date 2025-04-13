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
 * Renamed from dhX
 */
class dhx_0
extends akk_2 {
    dhx_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return new akf_1[]{new akf_1("red", "Red value between [0; 1]", akg_2.e, false), new akf_1("green", "Green value between [0; 1]", akg_2.e, false), new akf_1("blue", "Blue value between [0; 1]", akg_2.e, false)};
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        if (n != 3) {
            throw new LuaException("Invalid parameter count");
        }
        float f2 = this.f(0);
        float f3 = this.f(1);
        float f4 = this.f(2);
        cZb.a.a(f2, f3, f4);
    }

    @Override
    public String a() {
        return "setColor";
    }
}

