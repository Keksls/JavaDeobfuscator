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
 * Renamed from dib
 */
class dib_0
extends akk_2 {
    dib_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return new akf_1[]{new akf_1("blocking", "Block (or not) the mouse out of the vignette position", akg_2.f, false)};
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
        boolean bl = this.l(0);
        cZb.a.a(bl);
    }

    @Override
    public String a() {
        return "setMouseBlocked";
    }
}

