/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djG
extends akk_2 {
    djG(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "displayTutorialMessage";
    }

    @Override
    public akf_1[] e() {
        return dir_0.j;
    }

    @Override
    public String b() {
        return "Utilise le syst?me d'affichage popup pour afficher un message titr?";
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        if (!((bvx_0)ans_0.D().h()).a(bWe.Z)) {
            return;
        }
        String string = bae.h().a(this.i(0), new Object[0]);
        String string2 = bae.h().a(this.i(1), new Object[0]);
        dhc dhc2 = new dhc(string, string2, blr_1.j);
        add_2.b().a(dhc2);
    }
}

