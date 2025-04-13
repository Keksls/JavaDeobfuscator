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
 * Renamed from diS
 */
class dis_0
extends akk_2 {
    dis_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "activateFollowAchievement";
    }

    @Override
    public String b() {
        return "Active/D\u00e9sactive le suivi des qu\u00eates";
    }

    @Override
    public akf_1[] e() {
        return dir_0.be;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        if (n < 1) {
            return;
        }
        fis_1.a().a("followAchievementsEnabled", this.l(0));
    }
}

