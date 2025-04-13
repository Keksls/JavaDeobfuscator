/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cmU
 */
public class cmu_0
extends Pw {
    private long a;
    private int b;
    private int c;
    private short e;
    private boolean f;
    private byte g = 1;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.e);
        abx_22.a(this.f ? (byte)1 : 0);
        abx_22.a(this.g);
        return this.a((byte)3, abx_22.c());
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(int n, int n2, short s2) {
        this.b = n;
        this.c = n2;
        this.e = s2;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public void a(byte by) {
        this.g = by;
    }

    @Override
    public int a() {
        return 13120;
    }
}

