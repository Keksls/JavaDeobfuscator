/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djf
extends akk_2 {
    djf(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addListColorTween";
    }

    @Override
    public akf_1[] e() {
        return dir_0.X;
    }

    @Override
    public String b() {
        return "Ajoute un colorTween aux ?l?ments d'une liste";
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
        if (!(fyb_02 instanceof fsQ)) {
            this.a(dir_0.a, "l'EventDispatcher n'est pas du type Widget");
            return;
        }
        fsQ fsQ2 = (fsQ)fyb_02;
        String string3 = this.i(2);
        int n2 = this.d(3);
        int n3 = this.d(4);
        azf_2 azf_22 = new azf_2(new float[0]);
        azf_2 azf_23 = new azf_2(new float[0]);
        if (n == 13) {
            azf_22.a((float)this.e(5), (float)this.e(6), (float)this.e(7), (float)this.e(8));
            azf_23.a((float)this.e(9), (float)this.e(10), (float)this.e(11), (float)this.e(12));
        } else {
            azf_22.a(azf_2.e.i());
            azf_23.a(azf_2.q.i());
        }
        ArrayList<ftj_0> arrayList = fsQ2.getRenderables();
        for (ftj_0 ftj_02 : arrayList) {
            fvE fvE2;
            fyy_0 fyy_03;
            if (ftj_02 == null || (fyy_03 = ftj_02.getInnerElementMap()) == null || (fvE2 = (fvE)fyy_03.a(string3)) == null) continue;
            fqj fqj2 = fvE2.getAppearance();
            fqj2.addTween(new fjp_2(azf_22, azf_23, fqj2, 0, n2, n3, fjw_2.b));
        }
    }
}

