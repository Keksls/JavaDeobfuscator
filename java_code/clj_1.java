/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clJ
 */
public final class clj_1
extends Pw {
    private byte a;
    private long b;
    private short c;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return this.a((byte)3, abx_22.c());
    }

    public void a(long l) {
        this.b = l;
    }

    public void a(byte by) {
        this.a = by;
    }

    public void a(short s2) {
        this.c = s2;
    }

    @Override
    public int a() {
        return 12313;
    }
}

