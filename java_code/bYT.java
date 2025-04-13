/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYT
extends akk_2 {
    final /* synthetic */ bYQ a;

    bYT(bYQ bYQ2, LuaState luaState) {
        this.a = bYQ2;
        super(luaState);
    }

    @Override
    public String a() {
        return "getResourcePosition";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return bYQ.f;
    }

    @Override
    public void a(int n) {
        long l = this.a.h.t();
        this.q(Hw.g(l));
        this.q(Hw.h(l));
    }
}

