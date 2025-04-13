/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCq
 */
public abstract class acq_2 {
    protected int[] a;
    protected int b;

    protected acq_2(int n) {
        this.a = new int[n];
        this.b = 0;
    }

    public boolean a(int n) {
        if (n > this.a.length) {
            int[] nArray = this.a;
            this.a = new int[n];
            System.arraycopy(nArray, 0, this.a, 0, nArray.length);
            return true;
        }
        return false;
    }

    protected final int b(int n) {
        for (int k = this.b - 1; k >= 0; --k) {
            if (n != this.a[k]) continue;
            return k;
        }
        return -1;
    }

    protected final int c(int n) {
        for (int k = this.b - 1; k >= 0; --k) {
            if (n != this.a[k]) continue;
            return -k - 1;
        }
        return this.b;
    }

    protected final void a() {
        if (this.b == this.a.length) {
            this.a(Math.max(this.a.length * 2, 1));
        }
    }

    public final boolean d(int n) {
        return this.b(n) != -1;
    }

    public final void b() {
        this.b = 0;
    }

    public void c() {
        this.b = 0;
    }

    public final int d() {
        return this.b;
    }

    public final int e(int n) {
        return this.a[n];
    }

    public void e() {
        int[] nArray = this.a;
        this.a = new int[this.b];
        System.arraycopy(nArray, 0, this.a, 0, this.b);
    }

    public final int[] f() {
        int n = this.d();
        int[] nArray = new int[n];
        for (int k = 0; k < n; ++k) {
            nArray[k] = this.e(k);
        }
        return nArray;
    }

    public final boolean g() {
        return this.d() == 0;
    }
}

