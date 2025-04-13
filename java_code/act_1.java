/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCt
 */
public class act_1
extends acq_2 {
    private double[] c;

    public act_1() {
        this(10);
    }

    public act_1(int n) {
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

    public void a(int n, double d2) {
        this.a();
        int n2 = this.c(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.b;
            this.a[n2] = n;
        }
        this.c[n2] = d2;
    }

    public double f(int n) {
        if (this.b == 0) {
            return 0.0;
        }
        int n2 = this.b(n);
        if (n2 < 0) {
            return 0.0;
        }
        double d2 = this.c[n2];
        this.a[n2] = this.a[this.b - 1];
        this.c[n2] = this.c[this.b - 1];
        --this.b;
        return d2;
    }

    public double g(int n) {
        int n2 = this.b(n);
        if (n2 < 0) {
            return 0.0;
        }
        return this.c[n2];
    }

    public double h(int n) {
        return this.c[n];
    }

    @Override
    public void e() {
        super.e();
        double[] dArray = this.c;
        this.c = new double[this.b];
        System.arraycopy(dArray, 0, this.c, 0, this.b);
    }
}

