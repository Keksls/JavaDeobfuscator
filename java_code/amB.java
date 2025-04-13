/*
 * Decompiled with CFR 0.152.
 */
public class amB
implements anb_0 {
    private final long b;
    private final boolean c;
    private final float d;
    private final int e;
    private final float f;
    private final float g;

    public amB(long l) {
        this(l, false);
    }

    public amB(long l, boolean bl) {
        this(l, bl, 100.0f);
    }

    public amB(long l, boolean bl, float f2) {
        this(l, bl, f2, 1);
    }

    public amB(long l, boolean bl, float f2, int n) {
        this(l, bl, f2, n, 1.0f, 1.0f);
    }

    public amB(long l, boolean bl, float f2, int n, float f3, float f4) {
        this.b = l;
        this.c = bl;
        this.d = f2;
        this.e = n;
        this.f = f3;
        this.g = f4;
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

    @Override
    public float c() {
        return this.f;
    }

    @Override
    public float d() {
        return this.g;
    }
}

