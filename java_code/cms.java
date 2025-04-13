/*
 * Decompiled with CFR 0.152.
 */
public class cms
extends Pw {
    private final long a;
    private final int b;
    private final long c;

    public cms(long l, int n, long l2) {
        this.a = l;
        this.b = n;
        this.c = l2;
    }

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
        return 13728;
    }
}

