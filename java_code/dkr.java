/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkr
extends akk_2 {
    dkr(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeDialogUnloadedListener";
    }

    @Override
    public String b() {
        return "Annule l'effet d'un UI.addDialogUnloadedListener";
    }

    @Override
    public akf_1[] e() {
        return dir_0.av;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        anl_0.a().a(string);
    }
}

