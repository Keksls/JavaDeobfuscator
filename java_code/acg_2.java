/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCG
 */
public class acg_2
extends aca_2 {
    private long[] c;

    public acg_2() {
        this(10);
    }

    public acg_2(int n) {
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

    public void a(long l, long l2) {
        this.a();
        int n = this.b(l);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.b;
            this.a[n] = l;
        }
        this.c[n] = l2;
    }

    public long d(long l) {
        if (this.b == 0) {
            return 0L;
        }
        int n = this.a(l);
        if (n < 0) {
            return 0L;
        }
        return this.c(n);
    }

    public long c(int n) {
        long l = this.c[n];
        this.a[n] = this.a[this.b - 1];
        this.c[n] = this.c[this.b - 1];
        --this.b;
        return l;
    }

    public long e(long l) {
        int n = this.a(l);
        if (n < 0) {
            return 0L;
        }
        return this.c[n];
    }

    public long d(int n) {
        return this.c[n];
    }
}

