/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class djA
extends akk_2 {
    djA(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "displayDungeonResultSplashText";
    }

    @Override
    public String b() {
        return "[DONJON SHUKRUTE] Affiche le r?sultat du donjon en fonction de la position sur le podium du groupe de joueur";
    }

    @Override
    public akf_1[] e() {
        return dir_0.aQ;
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
        cYe.a().a((short)this.d(0));
    }
}

