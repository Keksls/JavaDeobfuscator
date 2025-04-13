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
 * Renamed from dhZ
 */
class dhz_0
extends akk_2 {
    dhz_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return new akf_1[]{new akf_1("duration", "Duration of arrival animation in milliseconds", akg_2.d, false)};
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
        int n2 = this.d(0);
        cZb.a.b(n2);
    }

    @Override
    public String a() {
        return "setFadeInDuration";
    }
}

