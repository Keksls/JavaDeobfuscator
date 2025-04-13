/*
 * Decompiled with CFR 0.152.
 */
public class clx
extends Pw {
    private byte a;
    private short b;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2(3);
        abx_22.a(this.a);
        abx_22.a(this.b);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12319;
    }

    public void a(byte by) {
        this.a = by;
    }

    public void a(short s2) {
        this.b = s2;
    }
}

