/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from clp
 */
public class clp_0
extends Pw {
    private byte a;
    private long b;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13873;
    }

    public void a(byte by) {
        this.a = by;
    }

    public void a(long l) {
        this.b = l;
    }
}

