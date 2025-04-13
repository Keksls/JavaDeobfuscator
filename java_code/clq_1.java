/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clQ
 */
public final class clq_1
extends Pw {
    private long a;
    private short b;
    private byte c;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return this.a((byte)3, abx_22.c());
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(short s2) {
        this.b = s2;
    }

    @Override
    public int a() {
        return 13361;
    }

    public void a(byte by) {
        this.c = by;
    }
}

