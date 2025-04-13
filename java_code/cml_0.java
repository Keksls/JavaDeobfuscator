/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cmL
 */
public class cml_0
extends Pw {
    private final long a;
    private final int b;
    private final int c;
    private final short e;
    private final long f;

    public cml_0(long l, int n, int n2, short s2, long l2) {
        this.a = l;
        this.c = n2;
        this.b = n;
        this.e = s2;
        this.f = l2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2(26);
        abx_22.a(this.c);
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.e);
        abx_22.a(this.f);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12417;
    }
}

