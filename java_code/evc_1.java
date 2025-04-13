/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from eVC
 */
public class evc_1 {
    private int a;
    private int b;
    private int c;
    private List<evz_1> d;
    private List<evz_1> e;
    private short f;

    evc_1() {
    }

    public evc_1 a(int n) {
        this.a = n;
        return this;
    }

    public evc_1 b(int n) {
        this.b = n;
        return this;
    }

    public evc_1 c(int n) {
        this.c = n;
        return this;
    }

    public evc_1 a(List<evz_1> list) {
        this.d = list;
        return this;
    }

    public evc_1 b(List<evz_1> list) {
        this.e = list;
        return this;
    }

    public evc_1 a(short s2) {
        this.f = s2;
        return this;
    }

    public evb_1 a() {
        return new evb_1(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public String toString() {
        return "SteleRewardTier.SteleRewardTierBuilder(id=" + this.a + ", requiredDifficulty=" + this.b + ", freeRewardsCount=" + this.c + ", staticRewards=" + this.d + ", dynamicRewards=" + this.e + ", dynamicRewardsCount=" + this.f + ")";
    }
}

