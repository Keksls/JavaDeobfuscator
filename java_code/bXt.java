/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bXt
extends akk_2 {
    public bXt(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addFleaModifiedListener";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("funcName", null, akg_2.c, false), new akf_1("params", null, akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        byd_0 byd_02 = new byd_0();
        String string = this.i(0);
        akr_2[] akr_2Array = this.a(1, n);
        akx_2 akx_22 = this.m();
        aln_2.a().a(byd_02, akx_22, string, akr_2Array, false);
    }
}

