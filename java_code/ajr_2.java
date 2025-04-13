/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aJR
 */
class ajr_2
extends akk_2 {
    ajr_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "interrupt";
    }

    @Override
    public String b() {
        return "Kill script";
    }

    @Override
    public final akf_1[] e() {
        return ajk_2.l;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public final void a(int n) {
        akx_2 akx_22 = this.m();
        if (akx_22 != null) {
            if (n == 1) {
                akx_22.a(this.d(0));
            } else {
                akx_22.f();
            }
        }
    }
}

