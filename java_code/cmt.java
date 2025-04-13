/*
 * Decompiled with CFR 0.152.
 */
public class cmt
extends Pw {
    private final long a;
    private final boolean b;

    public cmt(long l, boolean bl) {
        this.a = l;
        this.b = bl;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13547;
    }
}

