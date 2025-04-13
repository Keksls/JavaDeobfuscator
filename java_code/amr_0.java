/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amr
 */
public class amr_0
implements anb_0 {
    private final int b;
    private final long c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final float h;
    private final float i;

    public amr_0(int n, long l, int n2, int n3, int n4, int n5) {
        this(n, l, n2, n3, n4, n5, 1.0f, 1.0f);
    }

    public amr_0(int n, long l, int n2, int n3, int n4, int n5, float f2, float f3) {
        this.b = n;
        this.c = l;
        this.d = n2;
        this.e = n3;
        this.f = n4;
        this.g = n5;
        this.h = f2;
        this.i = f3;
    }

    public int a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public int h() {
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

