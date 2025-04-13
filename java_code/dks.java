/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dks
extends akk_2 {
    dks(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeEventListener";
    }

    @Override
    public String b() {
        return "Permet de retirer une fonction sur un ?v?nement sur un widget.";
    }

    @Override
    public akf_1[] e() {
        return dir_0.C;
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
        akx_2 akx_22 = this.m();
        fzu fzu2 = (fzu)anl_0.a().b(akx_22, string, string2, string3, string4);
        if (fzu2 == null) {
            this.a(dir_0.a, "Le Listener a d?j? ?t? enlev?");
            return;
        }
        fyb_02.removeEventListener(frd_02, fzu2, false);
        if (bl) {
            fyb_02.removeEventListener(frd_0.D, fzu2, false);
        }
    }
}

