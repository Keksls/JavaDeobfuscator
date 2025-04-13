/*
 * Decompiled with CFR 0.152.
 */
public class eQu {
    private long a;
    private String b;
    private long c;
    private short d;

    public eQu a(long l) {
        this.a = l;
        return this;
    }

    public eQu a(String string) {
        this.b = Cz.a(string, 16);
        return this;
    }

    public eQu b(long l) {
        this.c = l;
        return this;
    }

    public eQu a(short s2) {
        this.d = s2;
        return this;
    }

    public short a() {
        return this.d;
    }

    public long b() {
        return this.a;
    }

    public ern_1 c() {
        eQv eQv2 = new eQv(this.a);
        eQv2.a(this.b);
        eQv2.b(this.c);
        eQv2.a(this.d);
        return eQv2;
    }
}

