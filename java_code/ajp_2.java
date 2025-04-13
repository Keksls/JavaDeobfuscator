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
 * Renamed from aJP
 */
class ajp_2
extends akk_2 {
    ajp_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "getTimer";
    }

    @Override
    public String b() {
        return "Return elapsed time since script start.";
    }

    @Override
    @Nullable
    public final akf_1[] e() {
        return null;
    }

    @Override
    public akf_1[] f() {
        return ajk_2.d;
    }

    @Override
    public final void a(int n) {
        this.q(this.m().e());
    }
}

