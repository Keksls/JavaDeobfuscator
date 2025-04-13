/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amm
 */
public class amm_0
implements anb_0 {
    private final long b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final float h;
    private final float i;

    public amm_0(long l, int n, int n2, int n3) {
        this(l, n, n2, n3, false);
    }

    public amm_0(long l, int n, int n2, int n3, boolean bl) {
        this(l, n, n2, n3, bl, false);
    }

    public amm_0(long l, int n, int n2, int n3, boolean bl, boolean bl2) {
        this(l, n, n2, n3, bl, bl2, 1.0f, 1.0f);
    }

    public amm_0(long l, int n, int n2, int n3, boolean bl, boolean bl2, float f2, float f3) {
        this.b = l;
        this.c = n;
        this.d = n2;
        this.e = n3;
        this.f = bl;
        this.g = bl2;
        this.h = f2;
        this.i = f3;
    }

    public long a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public boolean g() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    @Override
    public float c() {
        return this.h;
    }

    @Override
    public float d() {
        return this.i;
    }
}

