/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class djO
extends akk_2 {
    djO(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getPropertyValueInt";
    }

    @Override
    public String b() {
        return "Fourni la valeur enti?re d'une propri?t? sp?cifi?e";
    }

    @Override
    public akf_1[] e() {
        return dir_0.U;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("propertyValue", null, akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        fit_1 fit_12;
        fyy_0 fyy_02;
        String string = this.i(0);
        String string2 = this.i(1);
        String string3 = this.i(2);
        boolean bl = false;
        if (n > 3) {
            bl = this.l(3);
        }
        if ((fyy_02 = fpm_0.b().h().d(string)) == null) {
            this.a(dir_0.a, "ElementMap inconnue " + string);
            return;
        }
        fit_1 fit_13 = fit_12 = bl ? fis_1.a().e(string2, string) : fis_1.a().f(string2);
        if (fit_12 == null) {
            this.a(dir_0.a, "Propri?t?e inconnue " + string2);
            return;
        }
        int n2 = fit_12.a(string3) == null ? fit_12.i() : fit_12.c(string3);
        this.q(n2);
    }
}

