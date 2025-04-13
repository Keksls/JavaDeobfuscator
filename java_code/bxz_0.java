/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXz
 */
class bxz_0
extends akk_2 {
    public bxz_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeInteractiveElementActivationListener";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("elementId", null, akg_2.b, false), new akf_1("actionType", "Name of a field on InteractiveElementAction", akg_2.c, false)};
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
        akx_2 akx_22 = this.m();
        aln_2.a().a(byg_02, akx_22);
    }
}

