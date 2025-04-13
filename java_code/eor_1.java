/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOR
 */
public class eor_1 {
    private final int a;
    private final apc_2 b;
    private final int c;
    private final int d;

    public eor_1(int n, apc_2 apc_22, int n2, short s2) {
        this.a = n;
        this.b = apc_22;
        this.c = n2;
        this.d = s2;
    }

    public int a() {
        return this.a;
    }

    public apc_2 b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public String toString() {
        return "FightChallengeReward{m_id=" + this.a + ", m_criterion=" + this.b + ", m_xpLevel=" + this.c + ", m_dropLevel=" + this.d + "}";
    }
}

