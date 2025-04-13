/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dki
extends akk_2 {
    dki(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "openMRUWithAction";
    }

    @Override
    public akf_1[] e() {
        return dir_0.r;
    }

    @Override
    public String b() {
        return "Ouvre une MRU qui lance un script sur un ?l?ment interactif du jeu";
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
        int n2 = this.d(1);
        int n3 = this.d(2);
        ahv ahv2 = ahs.d().b(l);
        if (ahv2 == null) {
            dir_0.a.warn((Object)("impossible de trouver l'interactiveElement d'id " + l));
            return;
        }
        cUw cUw2 = (cUw)cSY.H.c().v();
        cUw2.b(n3);
        cUw2.a(n2);
        cSS[] cSSArray = new cSS[]{cUw2};
        cSN2.a(cSSArray, (abz_0)ahv2);
        if (cSN2.c()) {
            cSN2.a();
        }
    }
}

