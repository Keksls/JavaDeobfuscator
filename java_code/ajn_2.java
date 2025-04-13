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
 * Renamed from aJN
 */
class ajn_2
extends akk_2 {
    ajn_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "desinvoke";
    }

    @Override
    public String b() {
        return "Clear timed and waiting tasks (all or by taskId)";
    }

    @Override
    public final akf_1[] e() {
        return ajk_2.f;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    public final void a(int n) {
        int n2;
        akx_2 akx_22 = this.m();
        int n3 = n2 = n > 0 ? this.d(0) : -1;
        if (n2 == -1) {
            akx_22.i();
        } else {
            akx_22.a(n2);
        }
    }
}

