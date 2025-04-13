/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eCv
 */
public abstract class ecv_0
implements ecx_0 {
    private final int b;
    protected short a;
    private final byte c;

    public ecv_0(int n) {
        this(n, -1);
    }

    public ecv_0(int n, byte by) {
        this.b = n;
        this.c = by;
    }

    @Override
    public byte a() {
        return this.c;
    }

    @Override
    public int b() {
        return this.b;
    }

    @Override
    public short c() {
        return this.a;
    }
}

