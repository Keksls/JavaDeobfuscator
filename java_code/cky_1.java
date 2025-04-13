/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cky
 */
public class cky_1
extends Pw {
    private final byte a;
    private final int b;
    private final int c;

    public cky_1(byte by, int n, int n2) {
        this.a = by;
        this.b = n;
        this.c = n2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2(8);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return this.a(this.a, abx_22.c());
    }

    @Override
    public int a() {
        return 395;
    }
}

