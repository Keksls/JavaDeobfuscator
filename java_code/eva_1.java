/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVA
 */
public class eva_1 {
    private int a;
    private int b;
    private int c;
    private int d;

    eva_1() {
    }

    public eva_1 a(int n) {
        this.a = n;
        return this;
    }

    public eva_1 b(int n) {
        this.b = n;
        return this;
    }

    public eva_1 c(int n) {
        this.c = n;
        return this;
    }

    public eva_1 d(int n) {
        this.d = n;
        return this;
    }

    public evz_1 a() {
        return new evz_1(this.a, this.b, this.c, this.d);
    }

    public String toString() {
        return "SteleReward.SteleRewardBuilder(id=" + this.a + ", itemId=" + this.b + ", quantity=" + this.c + ", order=" + this.d + ")";
    }
}

