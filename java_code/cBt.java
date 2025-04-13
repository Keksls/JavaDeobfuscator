/*
 * Decompiled with CFR 0.152.
 */
public class cBt
extends Pw {
    private long a;
    private long b;

    public cBt(long l, long l2) {
        this.a = l;
        this.b = l2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        return this.a((byte)2, abx_22.c());
    }

    @Override
    public int a() {
        return 23972;
    }
}

