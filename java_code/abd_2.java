/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBD
 */
public final class abd_2 {
    private static final int a = 10;
    private int[] b;
    private int c;
    private int d;
    private int e;

    public abd_2() {
        this.b = new int[10];
        this.c = 10;
        this.d = 0;
        this.e = 10;
    }

    public abd_2(abd_2 abd_22) {
        this.c = this.d = abd_22.d;
        this.b = new int[abd_22.d];
        this.e = abd_22.e;
    }

    public abd_2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        this.b = new int[n];
        this.c = n;
        this.d = 0;
        this.e = 10;
    }

    public abd_2(int n, int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        if (n2 < 1) {
            throw new IllegalArgumentException("L'incr\u00e9ment de taille growth doit \u00eatre >= 1");
        }
        this.b = new int[n];
        this.c = n;
        this.d = 0;
        this.e = n2;
    }

    public void a(int n) {
        this.e(this.d + 1);
        this.b[this.d] = n;
        ++this.d;
    }

    public void a(int[] nArray) {
        int n = nArray.length;
        this.e(this.d + n);
        System.arraycopy(nArray, 0, this.b, this.d, n);
        this.d += n;
    }

    public void a(int[] nArray, int n) {
        this.e(this.d + n);
        System.arraycopy(nArray, 0, this.b, this.d, n);
        this.d += n;
    }

    public void a(int[] nArray, int n, int n2) {
        this.e(this.d + n2);
        System.arraycopy(nArray, n, this.b, this.d, n2);
        this.d += n2;
    }

    public void a(abd_2 abd_22) {
        this.a(abd_22.b, 0, abd_22.d);
    }

    public void b(int n) {
        if (n < 0 || n >= this.d) {
            throw new ArrayIndexOutOfBoundsException("Can't remove value outside of range (0, size). Size =" + this.d + " index : " + n);
        }
        if (n == this.d - 1) {
            --this.d;
            return;
        }
        System.arraycopy(this.b, n + 1, this.b, n, this.d - n - 1);
        --this.d;
    }

    public int c(int n) {
        return this.b[n];
    }

    public int d(int n) {
        if (n >= this.d) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.b[n];
    }

    public int a() {
        return this.d;
    }

    public void b() {
        this.d = 0;
    }

    public int[] c() {
        return this.b;
    }

    public int[] d() {
        int[] nArray = new int[this.d];
        System.arraycopy(this.b, 0, nArray, 0, this.d);
        return nArray;
    }

    private void e(int n) {
        if (n > this.c) {
            this.c = n + this.e;
            int[] nArray = new int[this.c];
            System.arraycopy(this.b, 0, nArray, 0, this.d);
            this.b = nArray;
        }
    }
}

