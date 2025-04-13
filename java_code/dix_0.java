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
 * Renamed from diX
 */
class dix_0
extends akk_2 {
    dix_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addDialogUnloadedListener";
    }

    @Override
    public String b() {
        return "Permet de demander l'?x?cution d'un callback LUA lors de la fermeture d'une interface Xulor. Une fois ce callback appel?, il sera automatiquement d?senregistr?.";
    }

    @Override
    public akf_1[] e() {
        return dir_0.at;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        String string2 = this.i(1);
        akr_2[] akr_2Array = this.a(2, n);
        akx_2 akx_22 = this.m();
        diy_0 diy_02 = new diy_0(this, akx_22, string2, akr_2Array, string);
        anl_0.a().a(string, diy_02);
    }
}

