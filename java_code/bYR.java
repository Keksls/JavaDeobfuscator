/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYR
extends akk_2 {
    final /* synthetic */ bYQ a;

    bYR(bYQ bYQ2, LuaState luaState) {
        this.a = bYQ2;
        super(luaState);
    }

    @Override
    public String a() {
        return "getMonster";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return bYQ.a;
    }

    @Override
    public void a(int n) {
        bmv_1 bmv_12 = this.a.h.r();
        if (bmv_12 != null) {
            this.b(bmv_12.a_());
        } else {
            this.l();
        }
    }
}

