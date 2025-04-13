/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eYP
 */
public class eyp_2 {
    private eyo_2 a;
    private int b;
    private boolean c;

    public eyp_2(eyo_2 eyo_22) {
        this.a = eyo_22;
    }

    public eyp_2(eyo_2 eyo_22, int n, boolean bl) {
        this.a = eyo_22;
        this.b = n;
        this.c = bl;
    }

    public eyo_2 a() {
        return this.a;
    }

    public void a(eyo_2 eyo_22) {
        this.a = eyo_22;
    }

    public int b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public String toString() {
        return "ShardOperationUnitResult{m_status=" + this.a + ", m_amount=" + this.b + ", m_consumeAmount=" + this.c + "}";
    }
}

