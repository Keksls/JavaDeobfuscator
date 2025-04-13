/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkC
extends akk_2 {
    dkC(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "removeSpellSelectionListener";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aT;
    }

    @Override
    public String b() {
        return "Supprime l'?coute de la s?lection d'un sort par une fonction script";
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        if (n < 1) {
            dir_0.a.warn((Object)"On utilise removeSpellSelectionListener sans argument !");
            return;
        }
        String string = this.i(0);
        akx_2 akx_22 = this.m();
        anl_0.a().b(akx_22, null, null, null, string);
        cZa.a().a((dih_0)null);
    }
}

