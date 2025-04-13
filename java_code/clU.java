/*
 * Decompiled with CFR 0.152.
 */
public final class clU
extends Pw {
    private final long a;
    private final byte b;
    private final byte c;

    public clU(long l, byte by, byte by2) {
        this.a = l;
        this.b = by;
        this.c = by2;
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
        return 13838;
    }
}

