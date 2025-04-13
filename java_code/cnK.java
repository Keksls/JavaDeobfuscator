/*
 * Decompiled with CFR 0.152.
 */
public class cnK
extends Pw {
    private long a;
    private int b;
    private boolean c;
    private int e;

    public void a(long l) {
        this.a = l;
    }

    public void b(int n) {
        this.b = n;
    }

    public void c(int n) {
        this.e = n;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a((byte)(this.c ? 1 : 0));
        abx_22.a(this.e);
        return this.a((byte)3, abx_22.c());
    }

    public long c() {
        return this.a;
    }

    @Override
    public int a() {
        return 12630;
    }
}

