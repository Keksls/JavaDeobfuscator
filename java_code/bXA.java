/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bXA
extends akk_2 {
    public bXA(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "runOnBagLinked";
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
        bXh bXh2 = new bXh();
        String string = this.i(0);
        akr_2[] akr_2Array = this.a(1, n);
        akx_2 akx_22 = this.m();
        aln_2.a().a(bXh2, akx_22, string, akr_2Array, true);
    }
}

