/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bXk
extends akk_2 {
    bXk(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "Or";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("number", akg_2.b, false), new akf_1("number", akg_2.b, false)};
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("number", akg_2.b, false)};
    }

    @Override
    public void a(int n) {
        if (n == 2) {
            this.b(this.g(0) | this.g(1));
        }
    }
}

