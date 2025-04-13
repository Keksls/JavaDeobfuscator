/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from czf
 */
public class czf_1
extends Pw {
    private byte a;
    private long b;
    private int c;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return this.a((byte)6, abx_22.c());
    }

    public void a(long l) {
        this.b = l;
    }

    public void b(int n) {
        this.c = n;
    }

    public void a(byte by) {
        this.a = by;
    }

    @Override
    public int a() {
        return 15211;
    }
}

