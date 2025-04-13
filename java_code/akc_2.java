/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKc
 */
class akc_2
extends akk_2 {
    akc_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "registerWaitingTask";
    }

    @Override
    public String b() {
        return "Register a waiting task";
    }

    @Override
    public final akf_1[] e() {
        return ajk_2.L;
    }

    @Override
    public akf_1[] f() {
        return ajk_2.M;
    }

    @Override
    public final void a(int n) {
        akx_2 akx_22 = this.m();
        String string = this.i(0);
        akr_2[] akr_2Array = this.a(1, n);
        int n2 = akx_22.a(string, akr_2Array);
        this.q(n2);
    }
}

