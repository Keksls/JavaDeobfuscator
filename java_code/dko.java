/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dko
extends akk_2 {
    dko(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeColorTween";
    }

    @Override
    public String b() {
        return "Retire les ColorTween sur le widget pass? en param?tre";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aa;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            this.a(dir_0.a, "Dialogue inconnu " + string);
            return;
        }
        String string2 = this.i(1);
        fyb_0 fyb_02 = fyy_02.a(string2);
        if (fyb_02 == null) {
            this.a(dir_0.a, "EventDispatcher inconnu " + string2 + " dans le dialog " + string);
            return;
        }
        if (!(fyb_02 instanceof fvE)) {
            this.a(dir_0.a, "l'EventDispatcher n'est pas du type Widget");
            return;
        }
        ((fvE)fyb_02).getAppearance().removeTweensOfType(fjp_2.class);
    }
}

