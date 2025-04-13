/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clH
 */
public class clh_1
extends Pw {
    private final long a;
    private final byte b;

    public clh_1(long l, byte by) {
        this.a = l;
        this.b = by;
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
        return 12752;
    }
}

