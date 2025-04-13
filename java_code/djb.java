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

class djb
extends akk_2 {
    djb(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addEventListener";
    }

    @Override
    public String b() {
        return "Permet d'ajouter une fonction sur un ?v?nement sur un widget. On ne peut pas enregistrer 2 fois la m?me fonction pour un m?me type d'?v?nement sur un widget d'un dialogue";
    }

    @Override
    public akf_1[] e() {
        return dir_0.B;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        frd_0 frd_02;
        String string = this.i(0);
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            this.a(dir_0.a, "Dialogue inconnu " + string);
            return;
        }
        String string2 = this.i(1);
        fyb_0 fyb_02 = fyy_02.a(string2);
        if (fyb_02 == null) {
            this.a(dir_0.a, "ElementDispatcher inconnu " + string2 + " dans le dialog " + string);
            return;
        }
        String string3 = this.i(2);
        boolean bl = "MOUSE_CLICKED_AND_DOUBLE_CLICKED".equals(string3);
        try {
            frd_02 = bl ? frd_0.C : frd_0.valueOf(string3);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.a(dir_0.a, "Unknown event type " + string3 + " for dialog " + string);
            return;
        }
        String string4 = this.i(3);
        akr_2[] akr_2Array = this.a(4, n);
        akx_2 akx_22 = this.m();
        fzu fzu2 = (fzu)anl_0.a().a(akx_22, string, string2, string3, string4);
        if (fzu2 == null) {
            fzu2 = new did_0(akx_22, string4, akr_2Array);
            anl_0.a().a(akx_22, string, string2, string3, string4, fzu2);
            fyb_02.addEventListener(frd_02, fzu2, false);
            if (bl) {
                fyb_02.addEventListener(frd_0.D, fzu2, false);
            }
        } else {
            ((did_0)fzu2).a(akr_2Array);
            ArrayList<fzu> arrayList = fyb_02.getListeners(frd_02, false);
            if (arrayList == null || !arrayList.contains(fzu2)) {
                fyb_02.addEventListener(frd_02, fzu2, false);
                if (bl) {
                    fyb_02.addEventListener(frd_0.D, fzu2, false);
                }
            }
        }
    }
}

