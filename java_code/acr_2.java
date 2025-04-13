/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCr
 */
public class acr_2
extends acq_2 {
    private boolean[] c;

    public acr_2() {
        this(10);
    }

    public acr_2(int n) {
        super(n);
        this.c = new boolean[n];
    }

    @Override
    public boolean a(int n) {
        int n2 = this.a.length;
        if (!super.a(n)) {
            return false;
        }
        boolean[] blArray = this.c;
        this.c = new boolean[n];
        System.arraycopy(blArray, 0, this.c, 0, n2);
        return true;
    }

    public void a(int n, boolean bl) {
        this.a();
        int n2 = this.c(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.b;
            this.a[n2] = n;
        }
        this.c[n2] = bl;
    }

    public boolean f(int n) {
        if (this.b == 0) {
            return false;
        }
        int n2 = this.b(n);
        if (n2 < 0) {
            return false;
        }
        boolean bl = this.c[n2];
        this.a[n2] = this.a[this.b - 1];
        this.c[n2] = this.c[this.b - 1];
        --this.b;
        return bl;
    }

    public boolean g(int n) {
        int n2 = this.b(n);
        if (n2 < 0) {
            return false;
        }
        return this.c[n2];
    }

    public boolean h(int n) {
        return this.c[n];
    }

    @Override
    public void e() {
        super.e();
        boolean[] blArray = this.c;
        this.c = new boolean[this.b];
        System.arraycopy(blArray, 0, this.c, 0, this.b);
    }
}

