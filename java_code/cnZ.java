/*
 * Decompiled with CFR 0.152.
 */
public class cnZ
extends Pw {
    private long a;
    private byte b;
    private long c;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13693;
    }

    public void a(byte by) {
        this.b = by;
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.c = l;
    }
}

