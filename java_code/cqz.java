/*
 * Decompiled with CFR 0.152.
 */
public class cqz
extends Pw {
    private int a;
    private byte b;
    private long c;
    private boolean e;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a((byte)(this.e ? 1 : 0));
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12524;
    }

    public int c() {
        return this.a;
    }

    public void b(int n) {
        this.a = n;
    }

    public void a(long l) {
        this.c = l;
    }

    public void a(byte by) {
        this.b = by;
    }

    public void a(boolean bl) {
        this.e = bl;
    }
}

