/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djt
extends akk_2 {
    djt(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "displayBackground";
    }

    @Override
    public String b() {
        return "Ouvre l'interface d'affichage background (Affiche, St?le, Livre, etc..)";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aP;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        cWa cWa2 = cWa.a();
        cWa2.a(this.d(0));
        azu_0.j().a(cWa2);
    }
}

