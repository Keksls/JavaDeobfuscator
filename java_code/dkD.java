/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkD
extends akk_2 {
    dkD(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeUnremovableDialog";
    }

    @Override
    public String b() {
        return "Removes a dialog from unremovableDialogs";
    }

    @Override
    public akf_1[] e() {
        return dir_0.M;
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
    }
}

