/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bXC
extends akk_2 {
    public bXC(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "runOnInstanceLoaded";
    }

    @Override
    public String b() {
        return "Execute the function on instance load end";
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
        ace_0 ace_02 = ans_0.D().c();
        if (ace_02 != null) {
            abY abY2 = ace_02.b();
            abY2.a(azu_0.j().k().bv());
            akx_2 akx_22 = this.m();
            String string = this.i(0);
            akr_2[] akr_2Array = this.a(1, n);
            int n2 = akx_22.a(string, akr_2Array);
            abY2.a(abY2.u());
            abY2.a(new bXD(this, abY2, akx_22, n2));
        } else {
            this.a(bxs_0.e(), "No scene");
        }
    }
}

