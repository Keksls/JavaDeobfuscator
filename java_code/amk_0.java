/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amk
 */
public class amk_0
implements anb_0 {
    private final long b;
    private final boolean c;
    private final float d;
    private final int e;
    private final long f;
    private final float g;
    private final float h;

    public amk_0(long l) {
        this(l, false);
    }

    public amk_0(long l, boolean bl) {
        this(l, bl, 100.0f);
    }

    public amk_0(long l, boolean bl, float f2) {
        this(l, bl, f2, 0);
    }

    public amk_0(long l, boolean bl, float f2, int n) {
        this(l, bl, f2, n, 0L);
    }

    public amk_0(long l, boolean bl, float f2, int n, long l2) {
        this(l, bl, f2, n, 0L, 1.0f, 1.0f);
    }

    public amk_0(long l, boolean bl, float f2, int n, long l2, float f3, float f4) {
        this.b = l;
        this.c = bl;
        this.d = f2;
        this.e = n;
        this.f = l2;
        this.g = f3;
        this.h = f4;
    }

    public long a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public float e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public long g() {
        return this.f;
    }

    @Override
    public float c() {
        return this.g;
    }

    @Override
    public float d() {
        return this.h;
    }
}

