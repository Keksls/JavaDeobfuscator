/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cof
 */
public class cof_0
extends Pw {
    private final String a;
    private final long b;
    private final long c;
    private final long e;
    private final long f;
    private final Integer g;
    private final short h;

    public cof_0(String string, long l, long l2, long l3, long l4, Integer n, short s2) {
        this.a = string;
        this.b = l;
        this.c = l2;
        this.e = l3;
        this.f = l4;
        this.g = n;
        this.h = s2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = Cz.a(this.a);
        abx_22.a((byte)byArray.length);
        abx_22.b(byArray);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.e);
        abx_22.a(this.f);
        abx_22.a(this.g);
        abx_22.a(this.h);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13353;
    }
}

