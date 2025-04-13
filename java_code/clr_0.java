/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clR
 */
public final class clr_0
extends Pw {
    private final long a;
    private final byte b;
    private final String c;

    public clr_0(long l, byte by, String string) {
        this.a = l;
        this.b = by;
        this.c = string;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2(9 + this.c.length());
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12875;
    }
}

