/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clI
 */
public final class cli_0
extends Pw {
    private final long a;
    private final byte b;
    private final int c;

    public cli_0(long l) {
        this.a = l;
        this.b = (byte)-1;
        this.c = -1;
    }

    public cli_0(long l, byte by, int n) {
        this.a = l;
        this.b = by;
        this.c = n;
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
        return 13259;
    }
}

