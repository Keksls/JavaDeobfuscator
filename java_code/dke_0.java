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
 * Renamed from dkE
 */
class dke_0
extends akk_2 {
    dke_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setLocalPropertyStringValue";
    }

    @Override
    public akf_1[] e() {
        return dir_0.R;
    }

    @Override
    public String b() {
        return "Applique une valeure String ? une propri?t? xulor";
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        String string = this.i(0);
        String string2 = this.i(1);
        String string3 = this.i(2);
        dir_0.bk.add((Object)string);
        fit_1 fit_12 = fis_1.a().f(string);
        if (fit_12 == null) {
            fit_12 = new fit_1(string, fpm_0.b().h().d(string2));
            fit_12.a(true);
            fis_1.a().a(fit_12);
        }
        fit_12.a((Object)string3, false);
    }
}

