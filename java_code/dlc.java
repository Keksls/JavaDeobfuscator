/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dlc
extends akk_2 {
    dlc(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "unloadDialog";
    }

    @Override
    public String b() {
        return "Supprime un dialogue";
    }

    @Override
    public akf_1[] e() {
        return dir_0.K;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        fpm_0.b().n(string);
        fpm_0.b().o(string);
    }
}

