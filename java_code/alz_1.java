/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLZ
 */
public final class alz_1
implements alo_1 {
    private final float b;
    private final float c;
    private final float d;
    private final boolean e;
    private final int f;
    public static final double a = 4.8;

    public alz_1(float f2, float f3, float f4) {
        this(f2, f3, f4, false, 0);
    }

    public alz_1(float f2, float f3, float f4, boolean bl) {
        this(f2, f3, f4, bl, 0);
    }

    public alz_1(float f2, float f3, float f4, boolean bl, int n) {
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = bl;
        this.f = n;
    }

    @Override
    public float o() {
        return this.b - this.c;
    }

    @Override
    public float p() {
        return -(this.b + this.c);
    }

    @Override
    public float q() {
        return (float)((double)this.d / 4.8);
    }

    @Override
    public boolean r() {
        return this.e;
    }

    @Override
    public int s() {
        return this.f;
    }
}

