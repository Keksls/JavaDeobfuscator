/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aJO
 */
class ajo_2
extends akk_2 {
    ajo_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getIntFromTwoShort";
    }

    @Override
    public akf_1[] e() {
        return ajk_2.O;
    }

    @Override
    public akf_1[] f() {
        return ajk_2.P;
    }

    @Override
    protected void a(int n) {
        short s2 = Hw.c(this.g(0));
        short s3 = Hw.c(this.g(1));
        this.q(Hw.c(s2, s3));
    }
}

