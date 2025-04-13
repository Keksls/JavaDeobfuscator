/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from djd
 */
class djd_0
extends akk_2 {
    djd_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addLODListener";
    }

    @Override
    public String b() {
        return "Ajoute une ?coute sur le changement de niveau de d?tails du jeu";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aU;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n2) {
        if (n2 < 1) {
            dir_0.a.warn((Object)"On utilise addLODListener sans argument !");
            return;
        }
        String string = this.i(0);
        akx_2 akx_22 = this.m();
        ans_0.D().a((int n) -> akx_22.a(string, new akr_2[]{new akr_2(n)}, new akq_1[0]));
    }
}

