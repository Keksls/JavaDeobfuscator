/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class dkG
extends akk_2 {
    dkG(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setPosition";
    }

    @Override
    public String b() {
        return "D\u00e9place la fen\u00eatre \u00e0 la position indiqu\u00e9e (0,0 = coin en bas \u00e0 gauche)";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("dialogName", null, akg_2.c, false), new akf_1("x", null, akg_2.e, false), new akf_1("y", null, akg_2.e, false)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        if (n < 3) {
            dir_0.a.warn((Object)"setPosition: param\u00e8tres obligatoires");
            return;
        }
        String string = this.i(0);
        int n2 = this.d(1);
        int n3 = this.d(2);
        fyb_0 fyb_02 = fpm_0.b().k(string);
        if (fyb_02 instanceof fvk_0) {
            fvk_0 fvk_02 = (fvk_0)fyb_02;
            fvk_02.setPosition(n2, n3);
            fbf_2.a().a(fvk_02, n2, n3);
        } else {
            dir_0.a.error((Object)("Impossible de recuperer la fenetre '" + string + "' qui n'existe pas"));
        }
    }
}

