/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXB
 */
class bxb_0
extends akk_2 {
    public bxb_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "runOnEnterSellerMode";
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
        bxr_0 bxr_02 = new bxr_0();
        String string = this.i(0);
        akr_2[] akr_2Array = this.a(1, n);
        akx_2 akx_22 = this.m();
        aln_2.a().a(bxr_02, akx_22, string, akr_2Array, true);
    }
}

