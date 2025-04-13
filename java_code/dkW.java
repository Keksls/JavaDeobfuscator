/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkW
extends akk_2 {
    dkW(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setWindowMovable";
    }

    @Override
    public String b() {
        return "Permet de verrouiller ou d?verrouiller une fen?tre de l'interface.";
    }

    @Override
    public akf_1[] e() {
        return dir_0.N;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        boolean bl = this.l(1);
        fyb_0 fyb_02 = fpm_0.b().k(string);
        if (fyb_02 instanceof fvk_0) {
            fvk_0 fvk_02 = (fvk_0)fyb_02;
            fvk_02.setMovable(bl);
        } else {
            dir_0.a.error((Object)("Impossible de trouver la fen?tre '" + string + "' pour la rendre movable=" + bl));
        }
    }
}

