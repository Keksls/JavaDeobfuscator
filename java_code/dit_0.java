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
 * Renamed from diT
 */
class dit_0
extends akk_2 {
    dit_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addColorTween";
    }

    @Override
    public String b() {
        return "Ajoute un tween de changement de couleur de modulation sur le Widget pass? en param?tre.";
    }

    @Override
    public akf_1[] e() {
        return dir_0.Z;
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
        int n2 = this.d(2);
        int n3 = this.d(3);
        azf_2 azf_22 = new azf_2(new float[0]);
        azf_2 azf_23 = new azf_2(new float[0]);
        if (n == 12) {
            azf_22.a((float)this.e(4), (float)this.e(5), (float)this.e(6), (float)this.e(7));
            azf_23.a((float)this.e(8), (float)this.e(9), (float)this.e(10), (float)this.e(11));
        } else {
            azf_22.a(azf_2.e.i());
            azf_23.a(azf_2.q.i());
        }
        fqj fqj2 = ((fvE)fyb_02).getAppearance();
        fqj2.addTween(new fjp_2(azf_22, azf_23, fqj2, 0, n2, n3, fjw_2.b));
    }
}

