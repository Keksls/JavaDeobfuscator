/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class djN
extends akk_2 {
    djN(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getPosition";
    }

    @Override
    public String b() {
        return "Indique la position de la fen\u00eatre (0,0 = coin en bas \u00e0 gauche)";
    }

    @Override
    public akf_1[] e() {
        return dir_0.bi;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("x", null, akg_2.e, false), new akf_1("y", null, akg_2.e, false)};
    }

    @Override
    protected void a(int n) {
        if (n < 1) {
            dir_0.a.warn((Object)"getPosition: param\u00e8tres obligatoires");
            return;
        }
        String string = this.i(0);
        String string2 = this.i(1);
        fyb_0 fyb_02 = fpm_0.b().k(string);
        if (fyb_02 instanceof fvE) {
            fvE fvE2 = (fvE)fyb_02;
            if (n == 1) {
                this.q(fvE2.getScreenX());
                this.q(fvE2.getScreenY());
                return;
            }
            fyy_0 fyy_02 = fpm_0.b().h().d(string);
            if (fyy_02 == null) {
                this.a(dir_0.a, "Dialogue inconnu " + string);
                return;
            }
            fyb_0 fyb_03 = fyy_02.a(string2);
            if (fyb_03 instanceof fvE) {
                fvE fvE3 = (fvE)fyb_03;
                this.q(fvE3.getScreenX());
                this.q(fvE3.getScreenY());
            } else {
                this.a(dir_0.a, "Le widget '" + string2 + "' n'existe pas ou n'est pas du type Widget");
            }
        } else {
            dir_0.a.error((Object)("Impossible de recuperer la fenetre '" + string + "' qui n'existe pas"));
        }
    }
}

