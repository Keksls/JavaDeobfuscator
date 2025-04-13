/*
 * Decompiled with CFR 0.152.
 */
public class adM
extends adN {
    private final int a;
    private final air_0 b = new air_0();
    private int c;
    private final float[] d;
    private int e;

    public adM(float[] fArray, int n, long l) {
        super(1.0f);
        this.d = fArray;
        this.a = n * 1000;
        this.e = (int)(l / (long)this.a) % this.d.length;
        this.b.b(1.0f / ((float)n * 0.5f));
        this.b.c(this.d[this.e]);
    }

    public adM(int n, long l) {
        this(adM.b(100), n, l);
    }

    public static float[] b(int n) {
        aen_2 aen_22 = new aen_2(0.55f, 0.35f, n);
        float[] fArray = new float[n];
        for (int k = 0; k < n; ++k) {
            fArray[k] = Hw.b((float)aen_22.a(), 0.0f, 1.0f);
        }
        return fArray;
    }

    public static float[] a(int n, float f2, float f3) {
        aen_2 aen_22 = new aen_2(0.55f, 0.35f, n);
        float[] fArray = new float[n];
        for (int k = 0; k < n; ++k) {
            fArray[k] = Hw.b((float)aen_22.a(), f2, f3);
        }
        return fArray;
    }

    @Override
    public boolean a(int n) {
        this.c += n;
        if (this.c > this.a) {
            this.c = 0;
            ++this.e;
            if (this.e >= this.d.length) {
                this.e = 0;
            }
            this.b.e(this.d[this.e]);
        }
        this.b.a(n);
        return super.a(n);
    }

    @Override
    public float a() {
        return super.a() * this.b.a();
    }
}

