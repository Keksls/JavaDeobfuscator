/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cop
 */
public class cop_0
extends Pw {
    private long a;
    private long b;
    private byte c;
    private short e;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.e);
        return this.a((byte)3, abx_22.c());
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.b = l;
    }

    public void a(short s2) {
        this.e = s2;
    }

    public void a(byte by) {
        this.c = by;
    }

    @Override
    public int a() {
        return 13750;
    }
}

