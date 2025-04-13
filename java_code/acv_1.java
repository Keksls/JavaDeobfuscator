/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCv
 */
public class acv_1
extends acq_2 {
    private int[] c;

    public acv_1() {
        this(10);
    }

    public acv_1(int n) {
        super(n);
        this.c = new int[n];
    }

    @Override
    public boolean a(int n) {
        int n2 = this.a.length;
        if (!super.a(n)) {
            return false;
        }
        int[] nArray = this.c;
        this.c = new int[n];
        System.arraycopy(nArray, 0, this.c, 0, n2);
        return true;
    }

    public void a(int n, int n2) {
        this.a();
        int n3 = this.c(n);
        if (n3 < 0) {
            n3 = -n3 - 1;
        } else {
            ++this.b;
            this.a[n3] = n;
        }
        this.c[n3] = n2;
    }

    public int f(int n) {
        if (this.b == 0) {
            return 0;
        }
        int n2 = this.b(n);
        if (n2 < 0) {
            return 0;
        }
        int n3 = this.c[n2];
        this.a[n2] = this.a[this.b - 1];
        this.c[n2] = this.c[this.b - 1];
        --this.b;
        return n3;
    }

    public int g(int n) {
        int n2 = this.b(n);
        if (n2 < 0) {
            return 0;
        }
        return this.c[n2];
    }

    public int h(int n) {
        return this.c[n];
    }

    @Override
    public void e() {
        super.e();
        int[] nArray = this.c;
        this.c = new int[this.b];
        System.arraycopy(nArray, 0, this.c, 0, this.b);
    }
}

