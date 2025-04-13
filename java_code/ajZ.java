/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajZ
extends akk_2 {
    ajZ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removePointLight";
    }

    @Override
    public String b() {
        return "Supprime une lumi?re ponctuelle";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("lightId", "Id de la lumi?re", akg_2.d, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        aed.a.b(ajV.c(n2));
        ajV.d(n2);
    }
}

