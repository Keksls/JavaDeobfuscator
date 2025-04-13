/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djD
extends akk_2 {
    djD(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "displaySplashScreenAnimation";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aK;
    }

    @Override
    public String b() {
        return "Affiche une animation au centre de l'\u00e9cran (non modale)";
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        int n2 = this.d(1);
        String string2 = this.i(2);
        int n3 = this.d(3);
        dlx.a().a(new dlo(dly.h, string, n2, string2, n3));
    }
}

