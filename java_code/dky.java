/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dky
extends akk_2 {
    dky(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeProperty";
    }

    @Override
    public String b() {
        return "Supprime une propri?t? Xulor";
    }

    @Override
    public akf_1[] e() {
        return dir_0.S;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        String string = this.i(0);
        dir_0.bk.remove((Object)string);
        fis_1.a().a(string);
    }
}

