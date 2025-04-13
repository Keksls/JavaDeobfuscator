/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bWn
 */
public abstract class bwn_2
implements ajh_1,
fgw_0<bmr_0> {
    public static final String a = "animation";
    public static final String b = "animName";
    public static final String d = "currentProtector";
    public static final String e = "challengeInventory";
    public static final String f = "climateInventory";
    public static final String g = "challengeObjInventory";
    public static final String h = "climateObjInventory";
    public static final String i = "tax";
    public static final String j = "walletHandler";
    public static final String k = "zoology";
    public static final String l = "hasMoneyBaseChallenges";
    public static final String m = "baseChallenges";
    public static final String n = "availableChallenges";
    public static final String o = "boughtChallenges";
    public static final String p = "numBoughtChallenges";
    public static final String q = "numAvailableChallenges";
    public static final String r = "boughtClimates";
    public static final String s = "buffList";
    public static final String t = "buffTooltip";
    public static final String u = "buffTitle";
    public static final String v = "unsatisfiedRegionalState";
    public static final String w = "halfSatisfiedRegionalState";
    public static final String x = "satisfiedRegionalState";
    public static final String y = "unsatisfiedGlobalState";
    public static final String z = "halfSatisfiedGlobalState";
    public static final String A = "satisfiedGlobalState";
    public static final String B = "unsatisfiedStateIcon";
    public static final String C = "halfSatisfiedStateIcon";
    public static final String D = "satisfiedStateIcon";
    public static final String E = "globalStateIcon";
    public static final String F = "nation";
    public static final String G = "isStatic";
    public static final String H = "name";
    public static final String I = "description";
    public static final String J = "job";
    public static final String K = "sex";
    public static final String L = "height";
    public static final String M = "weight";
    public static final String N = "customDescription";
    public static final String O = "secrets";
    public static final String P = "numSecrets";
    public static final String Q = "unlockedSecrets";
    public static final String R = "territoryName";
    public static final String S = "territoryRecommendedLevel";
    public static final String T = "illustrationUrl";
    public static final String[] U = new String[]{"boughtClimates", "boughtChallenges", "currentProtector", "animation", "challengeInventory", "climateInventory", "walletHandler", "challengeObjInventory", "climateObjInventory", "nation", "isStatic", "job", "sex", "height", "weight", "customDescription", "secrets", "buffList", "illustrationUrl", "territoryRecommendedLevel"};
    public static final byte V = 2;

    public void a() {
        fgV.a.a(this);
    }

    @Override
    public void a(bmr_0 bmr_02) {
    }

    @Override
    public String[] d() {
        return U;
    }

    @Override
    public Object b(String string) {
        if (string.equals(G)) {
            return this.c();
        }
        if (string.equals(H)) {
            return bae.h().a(48, (long)this.b(), new Object[0]);
        }
        if (string.equals(T)) {
            return azs_0.a().v(eee_0.b.a(this.b()));
        }
        return null;
    }

    public abstract int b();

    public abstract boolean c();

    protected void e() {
        fis_1.a().a((ajf_1)this, U);
    }

    @Nullable
    public abu f() {
        return this.a(this.b(), bnm_0.a);
    }

    @Nullable
    public abstract abu a(int var1, bnm_0 var2);

    @Nullable
    public abstract bmf_0 g();
}

