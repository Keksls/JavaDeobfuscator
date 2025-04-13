/*
 * Decompiled with CFR 0.152.
 */
public class cmy
extends Pw {
    private long a;
    private int b;
    private long c;

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

    public void b(int n) {
        this.b = n;
    }

    public void b(long l) {
        this.c = l;
    }

    @Override
    public int a() {
        return 12289;
    }
}

