/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhq
 */
public final class bhq_2 {
    private final ekk_0 a;
    private String b;
    private String c;
    private String d;
    private int e = 1;
    private String f;
    private short g;

    public bhq_2(ekk_0 ekk_02) {
        this.a = ekk_02;
    }

    public bhq_2 a(String string) {
        this.b = string;
        return this;
    }

    public bhq_2 b(String string) {
        this.c = string;
        return this;
    }

    public bhq_2 c(String string) {
        this.d = string;
        return this;
    }

    public bhq_2 a(String string, int n) {
        this.d = string;
        this.e = n;
        return this;
    }

    public bhq_2 d(String string) {
        this.f = string;
        return this;
    }

    public bhq_2 a(short s2) {
        this.g = s2;
        return this;
    }

    public bhp_2 a() {
        bhp_2 bhp_22 = new bhp_2(this.a);
        bhp_22.c(this.d);
        bhp_22.a(this.f);
        bhp_22.a(this.e);
        bhp_22.d(this.b);
        bhp_22.e(this.c);
        bhp_22.a(this.g);
        return bhp_22;
    }
}

