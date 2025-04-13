/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkq
extends akk_2 {
    dkq(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeDialogLoadedListener";
    }

    @Override
    public String b() {
        return "Annule l'effet d'un UI.addDialogLoadedListener";
    }

    @Override
    public akf_1[] e() {
        return dir_0.ax;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        anl_0.a().b(string);
    }
}

