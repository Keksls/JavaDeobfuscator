/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYU
extends akk_2 {
    final /* synthetic */ bYQ a;

    bYU(bYQ bYQ2, LuaState luaState) {
        this.a = bYQ2;
        super(luaState);
    }

    @Override
    public String a() {
        return "getTarget";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return bYQ.e;
    }

    @Override
    public void a(int n) {
        blx_1 blx_12 = this.a.h.s();
        if (blx_12 != null) {
            this.b(blx_12.a_());
        } else {
            this.l();
        }
    }
}

