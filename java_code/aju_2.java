/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aJU
 */
class aju_2
extends akk_2 {
    aju_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "isGreater";
    }

    @Override
    public final akf_1[] e() {
        return ajk_2.p;
    }

    @Override
    public akf_1[] f() {
        return ajk_2.q;
    }

    @Override
    public final void a(int n) {
        long l;
        long l2 = this.g(0);
        boolean bl = l2 > (l = this.g(1));
        this.a(bl);
    }
}

