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
 * Renamed from djE
 */
class dje_0
extends akk_2 {
    dje_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "displaySplashScreenImage";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aJ;
    }

    @Override
    public String b() {
        return "Affiche une image au centre de l'?cran (non modale)";
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        try {
            if (n < 1) {
                dir_0.a.warn((Object)"On utilise displaySplashScreenImage sans argument !");
                return;
            }
            fpm_0.b().a("splashScreenDialog", cfi_0.a("splashScreenDialog"), 1L, (short)15000);
            fis_1.a().a("splashScreenIconUrl", (Object)this.i(0));
        }
        catch (Exception exception) {
            dir_0.a.error((Object)"Exception lev?e lors det l'ajout d'un message de personnage sp?cial", (Throwable)exception);
        }
    }
}

