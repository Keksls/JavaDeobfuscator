/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dji
extends akk_2 {
    dji(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addSpellSelectionListener";
    }

    @Override
    public String b() {
        return "Ajoute une ?coute sur la s?lection d'un sort";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aS;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        if (n < 1) {
            dir_0.a.warn((Object)"On utilise addSpellSelectionListener sans argument !");
            return;
        }
        boolean bl = this.l(0);
        String string = this.i(1);
        akr_2[] akr_2Array = this.a(2, n);
        akx_2 akx_22 = this.m();
        dih_0 dih_02 = (dih_0)anl_0.a().a(akx_22, null, null, null, string);
        if (dih_02 == null) {
            dih_02 = new dih_0(akx_22, string, akr_2Array, bl);
            anl_0.a().a(akx_22, null, null, null, string, dih_02);
            cZa.a().a(dih_02);
        } else {
            dih_02.a(akr_2Array);
            dih_0 dih_03 = cZa.a().f();
            if (dih_03 == null || dih_03 != dih_02) {
                cZa.a().a(dih_02);
            }
        }
    }
}

