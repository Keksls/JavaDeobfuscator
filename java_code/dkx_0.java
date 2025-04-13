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
 * Renamed from dkX
 */
class dkx_0
extends akk_2 {
    dkx_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "startCountdown";
    }

    @Override
    public String b() {
        return "Affiche un compte ? rebours g?n?rique";
    }

    @Override
    public akf_1[] e() {
        return dir_0.n;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        int n2 = this.d(0);
        wu_0 wu_02 = n >= 2 ? wt_0.b(this.g(1)) : wc_0.p().a();
        blm_2.a().a(n2, wu_02);
    }
}

