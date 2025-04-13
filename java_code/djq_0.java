/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from djQ
 */
class djq_0
extends akk_2 {
    djq_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getWindowSize";
    }

    @Override
    public String b() {
        return "Fourni la taille d'une fen?tre sp?cifi?e";
    }

    @Override
    public akf_1[] e() {
        return dir_0.au;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("x", null, akg_2.e, false), new akf_1("y", null, akg_2.e, false)};
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        if (string == null || string.isEmpty()) {
            this.q(ans_0.D().a().n());
            this.q(ans_0.D().a().o());
            return;
        }
        if (n == 1) {
            fyb_0 fyb_02 = fpm_0.b().k(string);
            if (fyb_02 instanceof fvE) {
                fvE fvE2 = (fvE)fyb_02;
                fjf_2 fjf_22 = fvE2.getSize();
                this.q(fjf_22.width);
                this.q(fjf_22.height);
            } else {
                this.q(0);
                this.q(0);
                dir_0.a.error((Object)("Impossible de r?cup?rer la taille de la fen?tre '" + string + "' qui n'existe pas"));
            }
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            this.a(dir_0.a, "Dialogue inconnu " + string);
            return;
        }
        String string2 = this.i(1);
        fyb_0 fyb_03 = fyy_02.a(string2);
        if (fyb_03 instanceof fvE) {
            fjf_2 fjf_23 = ((fvE)fyb_03).getSize();
            this.q(fjf_23.width);
            this.q(fjf_23.height);
        } else {
            this.a(dir_0.a, "Le widget '" + string2 + "' n'existe pas ou n'est pas du type Widget");
        }
    }
}

