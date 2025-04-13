/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCC
 */
public class acc_2
extends aca_2 {
    private double[] c;

    public acc_2() {
        this(10);
    }

    public acc_2(int n) {
        super(n);
        this.c = new double[n];
    }

    @Override
    public boolean a(int n) {
        int n2 = this.a.length;
        if (!super.a(n)) {
            return false;
        }
        double[] dArray = this.c;
        this.c = new double[n];
        System.arraycopy(dArray, 0, this.c, 0, n2);
        return true;
    }

    public void a(long l, double d2) {
        this.a();
        int n = this.b(l);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.b;
            this.a[n] = l;
        }
        this.c[n] = d2;
    }

    public double d(long l) {
        if (this.b == 0) {
            return 0.0;
        }
        int n = this.a(l);
        if (n < 0) {
            return 0.0;
        }
        return this.c(n);
    }

    public double c(int n) {
        double d2 = this.c[n];
        this.a[n] = this.a[this.b - 1];
        this.c[n] = this.c[this.b - 1];
        --this.b;
        return d2;
    }

    public double e(long l) {
        int n = this.a(l);
        if (n < 0) {
            return 0.0;
        }
        return this.c[n];
    }

    public double d(int n) {
        return this.c[n];
    }
}

