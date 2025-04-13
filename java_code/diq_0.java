/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from diQ
 */
class diq_0
extends akk_2 {
    private static final String a = "getFollowedAchievementIndex";
    private static final String b = "Retourne l'index de l'achievement dans l'ui de suivi de qu\u00eate";
    private static final akf_1[] c = new akf_1[]{new akf_1("AchievementId", akg_2.d, false)};
    private static final akf_1[] d = new akf_1[]{new akf_1("Index in UI", akg_2.d, false)};

    diq_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return c;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return d;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        int n3 = diq_0.b(n2);
        if (n3 < 0) {
            this.l();
        } else {
            this.q(n3);
        }
    }

    private static int b(int n) {
        String string = fpm_0.b().q("followedAchievementsDialog") ? "followedAchievementsDialog" : "verticalFollowedAchievementsDialog";
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            return -1;
        }
        fus_0 fus_02 = (fus_0)fyy_02.a("achievementsList");
        ArrayList<Object> arrayList = fus_02.getItems();
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            bim_2 bim_22 = (bim_2)arrayList.get(k);
            if (bim_22 == null || bim_22.i() != n) continue;
            return k;
        }
        return -1;
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public String b() {
        return b;
    }
}

