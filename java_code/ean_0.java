/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eAn
 */
public abstract class ean_0
implements gr_0 {
    protected final long c;
    protected final byte d;
    protected final apc_2 e;
    protected final boolean f;
    private final boolean a;
    protected final long g;
    protected final boolean h;

    protected ean_0(long l, byte by, apc_2 apc_22, boolean bl, boolean bl2, long l2, boolean bl3) {
        this.c = l;
        this.d = by;
        this.e = apc_22;
        this.f = bl;
        this.a = bl2;
        this.g = l2;
        this.h = bl3;
    }

    public long e() {
        return this.c;
    }

    public byte f() {
        return this.d;
    }

    public boolean g() {
        return this.a;
    }
}

