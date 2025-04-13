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
 * Renamed from dhW
 */
class dhw_0
extends akk_2 {
    dhw_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return new akf_1[]{new akf_1("translation", "Key of the translation text", akg_2.c, false), new akf_1("callback", "Callback function when clicking on the button (remove the focus if not defined)", akg_2.c, true), new akf_1("params", "Parameters of the callback function", akg_2.h, true)};
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        akr_2[] akr_2Array;
        if (n < 1) {
            throw new LuaException("Invalid parameter count");
        }
        String string = this.i(0);
        cZb.a.a(string);
        if (n >= 2) {
            akr_2Array = this.i(1);
            cZb.a.a(this.m());
            cZb.a.b((String)akr_2Array);
        }
        if (n >= 3) {
            akr_2Array = this.a(2, n);
            cZb.a.a(akr_2Array);
        }
    }

    @Override
    public String a() {
        return "setButton";
    }
}

