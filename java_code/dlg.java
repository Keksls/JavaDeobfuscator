/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dlg
extends akk_2 {
    dlg(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "writeLocalisedInChat";
    }

    @Override
    public String b() {
        return "Ecrit dans le chat d'information de jeu le message lie a la clef de traduction specifiee";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aA;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string;
        if (n < 1) {
            dir_0.a.warn((Object)"On utilise writeLocalisedInChat sans argument !");
            return;
        }
        if (n == 1) {
            string = bae.h().a(this.i(0), new Object[0]);
        } else {
            String[] stringArray = new String[n - 1];
            for (int k = 1; k < n; ++k) {
                String string2;
                stringArray[k - 1] = string2 = this.k(k);
            }
            string = bae.h().a(this.i(0), stringArray);
        }
        aul_0.a().c(string);
    }
}

