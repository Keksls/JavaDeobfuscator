/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQD
 */
public final class eqd_0 {
    private final int a;
    private final wx_0 b;
    private final wx_0 c;
    private final int d;
    private final eqh_0 e;
    private final eqa_0 f;

    public eqd_0(int n, long l, long l2, int n2, eqh_0 eqh_02, eqa_0 eqa_02) {
        this.a = n;
        this.b = ww_0.b(l);
        this.c = ww_0.b(l2);
        this.d = n2;
        this.e = eqh_02;
        this.f = eqa_02;
    }

    public int a() {
        return this.a;
    }

    public wx_0 b() {
        return this.b;
    }

    public boolean c() {
        return this.b().e();
    }

    public wx_0 d() {
        return this.c;
    }

    public boolean e() {
        return this.d().e();
    }

    public eqh_0 f() {
        return this.e;
    }

    public int g() {
        return this.d;
    }

    public eqa_0 h() {
        return this.f;
    }

    public String toString() {
        return "GuildBonusDefinition{m_id=" + this.a + ", m_learningDuration=" + this.b + ", m_duration=" + this.c + ", m_cost=" + this.d + ", m_effect=" + this.e + ", m_type=" + this.f + "}";
    }
}

