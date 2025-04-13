/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBB
 */
public final class abb_2 {
    public static final int a = -1;
    private int e;
    private int[] f;
    public int b;
    public int c;

    public abb_2(int n) {
        this.f = new int[n];
        this.b();
    }

    public final int a() {
        if (this.e >= this.f.length) {
            return -1;
        }
        int n = this.e;
        this.e = this.f[this.e];
        --this.b;
        ++this.c;
        return n;
    }

    public final void a(int n) {
        this.f[n] = this.e;
        this.e = n;
        ++this.b;
        --this.c;
    }

    public final void b() {
        this.e = 0;
        int n = this.f.length;
        for (int k = 0; k < n; ++k) {
            this.f[k] = k + 1;
        }
        this.b = n;
        this.c = 0;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.f.length;
    }

    public final void b(int n) {
        assert (n > this.f.length);
        int[] nArray = new int[n];
        for (int k = this.f.length; k < nArray.length; ++k) {
            nArray[k] = k + 1;
        }
        System.arraycopy(this.f, 0, nArray, 0, this.f.length);
        this.f = nArray;
        this.b = n - this.c;
    }
}

