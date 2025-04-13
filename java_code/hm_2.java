/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Hm
 */
public class hm_2 {
    private Integer a;
    private Long b;
    private Long c;
    private String d;
    private Integer e;
    private Long f;
    private Long g;

    hm_2() {
    }

    public hm_2 a(Integer n) {
        this.a = n;
        return this;
    }

    public hm_2 a(Long l) {
        this.b = l;
        return this;
    }

    public hm_2 b(Long l) {
        this.c = l;
        return this;
    }

    public hm_2 a(String string) {
        this.d = string;
        return this;
    }

    public hm_2 b(Integer n) {
        this.e = n;
        return this;
    }

    public hm_2 c(Long l) {
        this.f = l;
        return this;
    }

    public hm_2 d(Long l) {
        this.g = l;
        return this;
    }

    public hl_2 a() {
        return new hl_2(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return "TransactionContent.TransactionContentBuilder(itemId=" + this.a + ", itemFromUid=" + this.b + ", itemToUid=" + this.c + ", details=" + this.d + ", quantity=" + this.e + ", kamas=" + this.f + ", ogrines=" + this.g + ")";
    }
}

