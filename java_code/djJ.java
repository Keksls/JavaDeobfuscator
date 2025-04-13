/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djJ
extends akk_2 {
    djJ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "enableEvent";
    }

    @Override
    public String b() {
        return "Permet de d?sactiver/r?activer des ?v?nements sur un widget.";
    }

    @Override
    public akf_1[] e() {
        return dir_0.F;
    }

    @Override
    @Nullable
    public akf_1[] f() {
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
            this.a(dir_0.a, "ElementDispatcher inconnu " + string2 + " dans le dialog " + string);
            return;
        }
        String string3 = this.i(2);
        try {
            frd_0 frd_02 = frd_0.valueOf(string3);
            fyb_02.enableEvent(frd_02, this.l(3));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.a(dir_0.a, "Type d'evenement inconnu " + string3 + " pour le dialog " + string);
        }
    }
}

