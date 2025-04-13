/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cnR
 */
public class cnr_0
extends Pw {
    private final long a;
    private final int b;

    public cnr_0(long l, int n) {
        this.a = l;
        this.b = n;
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
        return 12498;
    }
}

