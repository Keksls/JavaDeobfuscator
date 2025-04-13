/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCx
 */
public class acx_2
extends acq_2 {
    private long[] c;

    public acx_2() {
        this(10);
    }

    public acx_2(int n) {
        super(n);
        this.c = new long[n];
    }

    @Override
    public boolean a(int n) {
        int n2 = this.a.length;
        if (!super.a(n)) {
            return false;
        }
        long[] lArray = this.c;
        this.c = new long[n];
        System.arraycopy(lArray, 0, this.c, 0, n2);
        return true;
    }

    public void a(int n, long l) {
        this.a();
        int n2 = this.c(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.b;
            this.a[n2] = n;
        }
        this.c[n2] = l;
    }

    public long f(int n) {
        if (this.b == 0) {
            return 0L;
        }
        int n2 = this.b(n);
        if (n2 < 0) {
            return 0L;
        }
        long l = this.c[n2];
        this.a[n2] = this.a[this.b - 1];
        this.c[n2] = this.c[this.b - 1];
        --this.b;
        return l;
    }

    public long g(int n) {
        int n2 = this.b(n);
        if (n2 < 0) {
            return 0L;
        }
        return this.c[n2];
    }

    public long h(int n) {
        return this.c[n];
    }

    @Override
    public void e() {
        super.e();
        long[] lArray = this.c;
        this.c = new long[this.b];
        System.arraycopy(lArray, 0, this.c, 0, this.b);
    }
}

