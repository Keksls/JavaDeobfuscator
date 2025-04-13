/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Hk
 */
public class hk_2 {
    private long a;
    private String b;
    private String c;
    private hp_2 d;
    private hp_2 e;
    private hl_2 f;
    private hn_2 g;

    hk_2() {
    }

    public hk_2 a(long l) {
        this.a = l;
        return this;
    }

    public hk_2 a(String string) {
        this.b = string;
        return this;
    }

    public hk_2 b(String string) {
        this.c = string;
        return this;
    }

    public hk_2 a(hp_2 hp_22) {
        this.d = hp_22;
        return this;
    }

    public hk_2 b(hp_2 hp_22) {
        this.e = hp_22;
        return this;
    }

    public hk_2 a(hl_2 hl_22) {
        this.f = hl_22;
        return this;
    }

    public hk_2 a(hn_2 hn_22) {
        this.g = hn_22;
        return this;
    }

    public hj_2 a() {
        return new hj_2(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return "Transaction.TransactionBuilder(uid=" + this.a + ", name=" + this.b + ", serverDenomination=" + this.c + ", source=" + this.d + ", target=" + this.e + ", content=" + this.f + ", miscData=" + this.g + ")";
    }
}

