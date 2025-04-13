/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cov
 */
public class cov_0
extends Pw {
    private final short a;
    private final long b;

    public cov_0(afp afp2, amb_1 amb_12) {
        this.a = afp2.h();
        this.b = amb_12.a();
    }

    public cov_0(short s2, long l) {
        this.a = s2;
        this.b = l;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12326;
    }
}

