/*
 * Decompiled with CFR 0.152.
 */
public class cqK
extends Pw {
    private final long a;
    private final int b;
    private final fiO c;

    public cqK(long l, int n, fiO fiO2) {
        this.a = l;
        this.b = n;
        this.c = fiO2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.b(fiQ.a(this.c));
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12361;
    }
}

