/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkU
extends akk_2 {
    dkU(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setWidgetEnabled";
    }

    @Override
    public String b() {
        return "Permet d'activer ou d?sactiver un widget (par exempel un bouton) dans une interface.";
    }

    @Override
    public akf_1[] e() {
        return dir_0.O;
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
        boolean bl = this.l(2);
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            this.a(dir_0.a, "Dialogue inconnu " + string);
            return;
        }
        fyb_0 fyb_02 = fyy_02.a(string2);
        if (fyb_02 == null) {
            this.a(dir_0.a, "ElementDispatcher inconnu " + string2 + " dans le dialog " + string);
            return;
        }
        if (!(fyb_02 instanceof fvE)) {
            this.a(dir_0.a, "le widget n'est pas du type Widget");
            return;
        }
        fvE fvE2 = (fvE)fyb_02;
        fvE2.setEnabled(bl);
    }
}

