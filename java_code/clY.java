/*
 * Decompiled with CFR 0.152.
 */
public class clY
extends Pw {
    private final long a;
    private final long b;

    public clY(long l, long l2) {
        this.a = l;
        this.b = l2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2(16);
        abx_22.a(this.a);
        abx_22.a(this.b);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12981;
    }
}

