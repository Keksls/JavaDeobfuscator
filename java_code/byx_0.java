/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYx
 */
class byx_0
extends akk_2 {
    byx_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeIECreationCallback";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("callbackId", null, akg_2.e, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        ahs.d().d(l);
    }
}

