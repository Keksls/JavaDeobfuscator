/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djv
extends akk_2 {
    djv(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "displayChallengeVarUpdateFlyingImage";
    }

    @Override
    public String b() {
        return "Affiche l'image volante d'update de variable de challenge";
    }

    @Override
    public akf_1[] e() {
        return dir_0.k;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        boolean bl = true;
        if (n >= 1) {
            bl = this.l(0);
        }
        blo_1.e().a(bl);
    }
}

