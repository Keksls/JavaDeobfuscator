/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkh
extends akk_2 {
    dkh(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "openMRU";
    }

    @Override
    public akf_1[] e() {
        return dir_0.s;
    }

    @Override
    public String b() {
        return "Ouvre un MRU non d?fini sur un ?l?ment interactif du jeu";
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        cSN cSN2 = new cSN();
        long l = this.g(0);
        ahv ahv2 = ahs.d().b(l);
        if (ahv2 == null) {
            dir_0.a.warn((Object)("impossible de trouver l'interactiveElement d'id " + l));
            return;
        }
        dan.a(cSN2, ahv2);
        if (cSN2.c()) {
            cSN2.a();
        }
    }
}

