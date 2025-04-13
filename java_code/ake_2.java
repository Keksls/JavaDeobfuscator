/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKe
 */
class ake_2
extends akk_2 {
    ake_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "setInterval";
    }

    @Override
    public String b() {
        return "Infinite timed execution of a function";
    }

    @Override
    public final akf_1[] e() {
        return ajk_2.j;
    }

    @Override
    public akf_1[] f() {
        return ajk_2.k;
    }

    @Override
    public final void a(int n) {
        akx_2 akx_22 = this.m();
        int n2 = this.d(0);
        String string = this.i(1);
        akr_2[] akr_2Array = this.a(2, n);
        int n3 = akx_22.a((int)n2, (int)-1, (String)string, (akr_2[])akr_2Array).a;
        this.q(n3);
    }
}

