/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCA
 */
public abstract class aca_2 {
    protected long[] a;
    protected int b;

    protected aca_2(int n) {
        this.a = new long[n];
        this.b = 0;
    }

    public boolean a(int n) {
        if (n > this.a.length) {
            int n2 = this.a.length;
            long[] lArray = this.a;
            this.a = new long[n];
            System.arraycopy(lArray, 0, this.a, 0, n2);
            return true;
        }
        return false;
    }

    protected int a(long l) {
        for (int k = this.b - 1; k >= 0; --k) {
            if (l != this.a[k]) continue;
            return k;
        }
        return -1;
    }

    protected int b(long l) {
        for (int k = this.b - 1; k >= 0; --k) {
            if (l != this.a[k]) continue;
            return -k - 1;
        }
        return this.b;
    }

    protected void a() {
        if (this.b == this.a.length) {
            this.a(this.a.length * 2);
        }
    }

    public final boolean c(long l) {
        return this.a(l) != -1;
    }

    public void b() {
        this.b = 0;
    }

    public void c() {
        this.b = 0;
    }

    public int d() {
        return this.b;
    }

    public long b(int n) {
        return this.a[n];
    }
}

