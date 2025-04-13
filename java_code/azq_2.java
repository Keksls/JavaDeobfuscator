/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azq
 */
public final class azq_2 {
    private float[] b;
    private int c;

    public azq_2(int n) {
        this.b = new float[n * n];
        this.c = n;
    }

    public azq_2(float[] fArray) {
        this.a(fArray);
    }

    public final void a(float[] fArray) {
        assert (Math.sqrt(fArray.length) == (double)((int)Math.sqrt(fArray.length)));
        this.c = (int)Math.sqrt(fArray.length);
        this.b = fArray;
    }

    public final float[] a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }
}

