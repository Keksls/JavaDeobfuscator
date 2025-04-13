/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXE
 */
class bxe_0
extends akk_2 {
    public bxe_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "runOnInteractiveElementActivation";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("elementId", null, akg_2.b, false), new akf_1("actionType", "Name of a field on InteractiveElementAction", akg_2.c, false), new akf_1("funcName", null, akg_2.c, false), new akf_1("params", null, akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        short s2 = Tv.valueOf(this.i(1)).a();
        byg_0 byg_02 = new byg_0(l, s2);
        String string = this.i(2);
        akr_2[] akr_2Array = this.a(3, n);
        akx_2 akx_22 = this.m();
        aln_2.a().a(byg_02, akx_22, string, akr_2Array, true);
    }
}

