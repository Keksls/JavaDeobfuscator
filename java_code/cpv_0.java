/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cpv
 */
public class cpv_0
extends Pw {
    private final long a;
    private final long b;
    private final long c;

    public cpv_0(long l, long l2, long l3) {
        this.a = l;
        this.b = l2;
        this.c = l3;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12584;
    }
}

