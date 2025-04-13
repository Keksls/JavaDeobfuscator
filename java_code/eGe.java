/*
 * Decompiled with CFR 0.152.
 */
class eGe
implements efv_0 {
    private int b;
    private final epa_1 c;
    private final epa_1 d;
    final /* synthetic */ egd_0 a;

    eGe(egd_0 egd_02, epa_1 epa_12, epa_1 epa_13) {
        this.a = egd_02;
        this.c = epa_12;
        this.d = epa_13;
    }

    @Override
    public void a(rs_0 rs_02) {
        this.c.d(this.b);
        int n = rs_02.a() / this.a.y;
        int n2 = this.a.z > 0 ? Math.min(this.a.z, n) : n;
        if (this.a.A > Integer.MIN_VALUE) {
            n2 = Math.max(this.a.A, n2);
        }
        this.b = this.c.c(n2);
    }

    @Override
    public void a() {
        this.c.d(this.b);
    }

    @Override
    public void b() {
        this.d.b(this);
    }

    public String toString() {
        return "AddValueListener{m_lastValue=" + this.b + ", m_destCharac=" + this.c + "}";
    }
}

