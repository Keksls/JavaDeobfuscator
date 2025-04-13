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
 * Renamed from djs
 */
class djs_0
extends akk_2 {
    djs_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "closeMRU";
    }

    @Override
    public String b() {
        return "Ferme le MRU courant s'il est affich?";
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return null;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        dir_0.a.info((Object)"Fermeture de tous les MRU");
        dan.a().d();
    }
}

