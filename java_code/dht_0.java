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
 * Renamed from dhT
 */
class dht_0
extends akk_2 {
    dht_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return new akf_1[]{new akf_1("duration", "Duration (ms) of the linear interpolation", akg_2.e, false), new akf_1("left", "Offset to the left vignette side", akg_2.e, false), new akf_1("bottom", "Offset to the bottom vignette side", akg_2.e, false), new akf_1("right", "Offset to the right vignette side", akg_2.e, false), new akf_1("top", "Offset to the top vignette side", akg_2.e, false)};
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        if (n != 5) {
            throw new LuaException("Invalid parameter count");
        }
        long l = this.g(0);
        float f2 = this.f(1);
        float f3 = this.f(2);
        float f4 = this.f(3);
        float f5 = this.f(4);
        cZb.a.a(l, f2, f3, f4, f5);
    }

    @Override
    public String a() {
        return "movePosition";
    }
}

