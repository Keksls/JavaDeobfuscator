/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKb
 */
class akb_1
extends akk_2 {
    akb_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "randomFloat";
    }

    @Override
    public final akf_1[] e() {
        return ajk_2.B;
    }

    @Override
    public akf_1[] f() {
        return ajk_2.C;
    }

    @Override
    public final void a(int n) {
        float f2 = this.f(0);
        float f3 = this.f(1);
        float f4 = Hw.a(f2, f3);
        this.a(f4);
    }
}

