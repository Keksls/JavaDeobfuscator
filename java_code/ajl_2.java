/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aJL
 */
class ajl_2
extends akk_2 {
    ajl_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "abs";
    }

    @Override
    public final akf_1[] e() {
        return ajk_2.v;
    }

    @Override
    public akf_1[] f() {
        return ajk_2.w;
    }

    @Override
    public final void a(int n) {
        long l = this.g(0);
        this.b(Math.abs(l));
    }
}

