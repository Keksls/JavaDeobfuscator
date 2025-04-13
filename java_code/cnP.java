/*
 * Decompiled with CFR 0.152.
 */
public final class cnP
extends Pw {
    private final long a;
    private final byte b;
    private final short[] c;

    public cnP(long l, byte by, short[] sArray) {
        this.a = l;
        this.b = by;
        this.c = sArray;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a((byte)this.c.length);
        for (short s2 : this.c) {
            abx_22.a(s2);
        }
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12317;
    }
}

