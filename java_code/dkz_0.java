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
 * Renamed from dkz
 */
class dkz_0
extends akk_2 {
    dkz_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removePropertyClient";
    }

    @Override
    public String b() {
        return "Supprime un element d'interface specifiee de la liste des clients d'une propriete";
    }

    @Override
    public akf_1[] e() {
        return dir_0.T;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
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
        fit_1 fit_13 = fit_12 = bl ? fis_1.a().e(string3, string) : fis_1.a().f(string3);
        if (fit_12 == null) {
            this.a(dir_0.a, "Propri?t?e inconnue " + string3);
            return;
        }
        fyb_0 fyb_02 = fyy_02.a(string2);
        if (fyb_02 == null) {
            this.a(dir_0.a, "ElementDispatcher inconnu " + string2 + " dans le dialog " + string);
            return;
        }
        fit_12.a(fyb_02);
    }
}

