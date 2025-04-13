/*
 * Decompiled with CFR 0.152.
 */
public class eQi {
    private int a;
    private final wt_0 b = new wt_0(wt_0.c);
    private final wt_0 c = new wt_0(wt_0.c);

    public eQi a(int n) {
        this.a = n;
        return this;
    }

    public eQi a(wu_0 wu_02) {
        this.b.a(wu_02);
        return this;
    }

    public eQi b(wu_0 wu_02) {
        this.c.a(wu_02);
        return this;
    }

    public erh_1 a() {
        eQj eQj2 = new eQj(this.a);
        eQj2.a(this.b);
        eQj2.b(this.c);
        return eQj2;
    }

    public String toString() {
        return "GuildBonusBuilder{m_bonusId=" + this.a + ", m_buyDate=" + this.b + ", m_activationDate=" + this.c + "}";
    }
}

