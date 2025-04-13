/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYi
 */
class byi_0
extends akk_2 {
    byi_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addIECreationCallback";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("interactiveElementId", null, akg_2.e, false), new akf_1("funcName", null, akg_2.c, false), new akf_1("Parameters", null, akg_2.h, true)};
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
        if (ahs.d().b(n2) != null) {
            akx_22.a(string, akr_2Array, new akq_1[0]);
        }
        ahs.d().b(new bYj(this, n2, akx_22, string, akr_2Array), (long)n2);
        this.q(n2);
    }
}

