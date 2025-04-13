/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cze
 */
public class cze_1
extends Pw {
    private byte a;
    private int b;
    private int c;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return this.a((byte)6, abx_22.c());
    }

    public void b(int n) {
        this.b = n;
    }

    public void a(byte by) {
        this.a = by;
    }

    public void c(int n) {
        this.c = n;
    }

    @Override
    public int a() {
        return 14348;
    }
}

