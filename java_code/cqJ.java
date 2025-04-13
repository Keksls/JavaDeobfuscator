/*
 * Decompiled with CFR 0.152.
 */
public class cqJ
extends Pw {
    private final long a;
    private final int b;
    private final String c;

    public cqJ(long l, int n, String string) {
        this.a = l;
        this.b = n;
        this.c = string;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        byte[] byArray = Cz.a(this.c);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12920;
    }
}

