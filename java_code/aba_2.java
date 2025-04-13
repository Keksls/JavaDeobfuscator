/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBA
 */
public class aba_2 {
    private static final int e = 10;
    protected float[] a;
    protected int b;
    protected int c;
    protected int d;

    public aba_2() {
        this.a = new float[10];
        this.b = 10;
        this.c = 0;
        this.d = 10;
    }

    public aba_2(aba_2 aba_22) {
        this.b = this.c = aba_22.c;
        this.a = new float[aba_22.c];
        this.d = aba_22.d;
    }

    public aba_2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        this.a = new float[n];
        this.b = n;
        this.c = 0;
        this.d = 10;
    }

    public aba_2(int n, int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        if (n2 < 1) {
            throw new IllegalArgumentException("L'incr\u00e9ment de taille growth doit \u00eatre >= 1");
        }
        this.a = new float[n];
        this.b = n;
        this.c = 0;
        this.d = n2;
    }

    public void a(float f2) {
        this.b(this.c + 1);
        this.a[this.c] = f2;
        ++this.c;
    }

    public void a(float[] fArray) {
        int n = fArray.length;
        this.b(this.c + n);
        System.arraycopy(fArray, 0, this.a, this.c, n);
        this.c += n;
    }

    public void a(float[] fArray, int n) {
        this.b(this.c + n);
        System.arraycopy(fArray, 0, this.a, this.c, n);
        this.c += n;
    }

    public void a(float[] fArray, int n, int n2) {
        this.b(this.c + n2);
        System.arraycopy(fArray, n, this.a, this.c, n2);
        this.c += n2;
    }

    public void a(aba_2 aba_22) {
        this.a(aba_22.a, 0, aba_22.c);
    }

    public float a(int n) {
        if (n >= this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[n];
    }

    public int a() {
        return this.c;
    }

    public float[] b() {
        return this.a;
    }

    public float[] c() {
        float[] fArray = new float[this.c];
        System.arraycopy(this.a, 0, fArray, 0, this.c);
        return fArray;
    }

    private void b(int n) {
        if (n > this.b) {
            this.b = n + this.d;
            float[] fArray = new float[this.b];
            System.arraycopy(this.a, 0, fArray, 0, this.c);
            this.a = fArray;
        }
    }
}

