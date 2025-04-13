/*
 * Decompiled with CFR 0.152.
 */
public class clW
extends Pw {
    private final long a;
    private final byte b;

    public clW(long l, byte by) {
        this.a = l;
        this.b = by;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2(9);
        abx_22.a(this.a);
        abx_22.a(this.b);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12776;
    }
}

