/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clV
 */
public class clv_0
extends Pw {
    private final long a;
    private final byte[] b;

    public clv_0(long l, byte[] byArray) {
        this.a = l;
        this.b = byArray;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b.length);
        abx_22.b(this.b);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13880;
    }
}

