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

class dkv
extends akk_2 {
    dkv(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeListColorTween";
    }

    @Override
    public akf_1[] e() {
        return dir_0.Y;
    }

    @Override
    public String b() {
        return "Supprime un colorTween des ?l?ments d'une liste";
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
        String string3 = this.i(2);
        fsQ fsQ2 = (fsQ)fyb_02;
        ArrayList<ftj_0> arrayList = fsQ2.getRenderables();
        for (ftj_0 ftj_02 : arrayList) {
            fvE fvE2;
            fyy_0 fyy_03;
            if (ftj_02 == null || (fyy_03 = ftj_02.getInnerElementMap()) == null || (fvE2 = (fvE)fyy_03.a(string3)) == null) continue;
            fvE2.getAppearance().removeTweensOfType(fjp_2.class);
        }
    }
}

