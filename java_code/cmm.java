/*
 * Decompiled with CFR 0.152.
 */
public class cmm
extends Pw {
    private final long a;

    public cmm(long l) {
        this.a = l;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2(8);
        abx_22.a(this.a);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13111;
    }
}

