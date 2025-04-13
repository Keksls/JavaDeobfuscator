/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYk
extends akk_2 {
    bYk(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addIEDestructionCallback";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("interactiveElementId", null, akg_2.e, false), new akf_1("Function name", null, akg_2.c, false), new akf_1("Parameters", null, akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("callbackId", null, akg_2.e, false)};
    }

    @Override
    protected void a(int n) {
        akx_2 akx_22 = this.m();
        int n2 = this.d(0);
        String string = this.i(1);
        akr_2[] akr_2Array = this.a(2, n);
        ahs.d().b(new bYl(this, n2, akx_22, string, akr_2Array), (long)n2);
        this.q(n2);
    }
}

