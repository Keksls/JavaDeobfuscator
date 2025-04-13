/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKf
 */
class akf_2
extends akk_2 {
    akf_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "substract";
    }

    @Override
    public final akf_1[] e() {
        return ajk_2.t;
    }

    @Override
    public akf_1[] f() {
        return ajk_2.u;
    }

    @Override
    public final void a(int n) {
        long l = this.g(0);
        long l2 = this.g(1);
        long l3 = l - l2;
        this.b(l3);
    }
}

