/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djK
extends akk_2 {
    djK(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "followAchievement";
    }

    @Override
    public String b() {
        return "Active (ou non) le suivi pour une qu\u00eate pr\u00e9cise";
    }

    @Override
    public akf_1[] e() {
        return dir_0.g;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        boolean bl = this.l(1);
        cVh.a(n2, bl);
    }
}

