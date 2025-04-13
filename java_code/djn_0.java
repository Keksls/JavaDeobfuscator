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
 * Renamed from djn
 */
class djn_0
extends akk_2 {
    djn_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "characterDisplayerClose";
    }

    @Override
    public String b() {
        return "Ferme une fenetre d'interface dans laquelle on place un perso";
    }

    @Override
    public akf_1[] e() {
        return dir_0.I;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        fpm_0.b().o(dir_0.a(n2));
    }
}

