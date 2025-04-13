/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dkP
extends akk_2 {
    dkP(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setBattlegroundCenter";
    }

    @Override
    public akf_1[] e() {
        return dir_0.y;
    }

    @Override
    public String b() {
        return "Sp?cifie la position du centre du battleground d'un combat d'entra?nement";
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        cTj cTj2;
        int n2 = this.d(0);
        if (n2 == cSY.q.b()) {
            cTj2 = (cTj)cSY.q.c();
        } else if (n2 == cSY.r.b()) {
            cTj2 = (cTj)cSY.r.c();
        } else {
            dir_0.a.error((Object)"Il n'y a que 2 actions diff?rentes de combat d'entrainement");
            return;
        }
        cTj2.a(new aff_1(this.d(1), this.d(2), (short)this.d(3)));
    }
}

