/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cmS
 */
public final class cms_0
extends Pw {
    private final int a;
    private final boolean b;

    public cms_0(int n, boolean bl) {
        this.a = n;
        this.b = bl;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b ? (byte)1 : 0);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12891;
    }
}

