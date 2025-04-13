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
 * Renamed from djX
 */
class djx_0
extends akk_2 {
    djx_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "isBarLockedMode";
    }

    @Override
    public String b() {
        return "Indique si le controlCenter (barres, coeur,...) est verouill?e ou non";
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return null;
    }

    @Override
    public akf_1[] f() {
        return dir_0.aL;
    }

    @Override
    protected void a(int n) {
        this.a(((bvx_0)ans_0.D().h()).a(bWe.R));
    }
}

