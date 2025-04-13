/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aJS
 */
class ajs_2
extends akk_2 {
    ajs_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "invoke";
    }

    @Override
    public String b() {
        return "Register a timed task";
    }

    @Override
    public final akf_1[] e() {
        return ajk_2.e;
    }

    @Override
    public akf_1[] f() {
        return ajk_2.g;
    }

    @Override
    public final void a(int n) {
        akx_2 akx_22 = this.m();
        int n2 = this.d(0);
        int n3 = this.d(1);
        String string = this.i(2);
        akr_2[] akr_2Array = this.a(3, n);
        akb_2 akb_22 = akx_22.a(n2, n3, string, akr_2Array);
        this.q(akb_22.b());
    }
}

