/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCs
 */
public class acs_2
extends acq_2 {
    private byte[] c;

    public acs_2() {
        this(10);
    }

    public acs_2(int n) {
        super(n);
        this.c = new byte[n];
    }

    @Override
    public boolean a(int n) {
        int n2 = this.a.length;
        if (!super.a(n)) {
            return false;
        }
        byte[] byArray = this.c;
        this.c = new byte[n];
        System.arraycopy(byArray, 0, this.c, 0, n2);
        return true;
    }

    public void a(int n, byte by) {
        this.a();
        int n2 = this.c(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.b;
            this.a[n2] = n;
        }
        this.c[n2] = by;
    }

    public byte f(int n) {
        if (this.b == 0) {
            return 0;
        }
        int n2 = this.b(n);
        if (n2 < 0) {
            return 0;
        }
        byte by = this.c[n2];
        this.a[n2] = this.a[this.b - 1];
        this.c[n2] = this.c[this.b - 1];
        --this.b;
        return by;
    }

    public byte g(int n) {
        int n2 = this.b(n);
        if (n2 < 0) {
            return 0;
        }
        return this.c[n2];
    }

    public byte h(int n) {
        return this.c[n];
    }

    @Override
    public void e() {
        super.e();
        byte[] byArray = this.c;
        this.c = new byte[this.b];
        System.arraycopy(byArray, 0, this.c, 0, this.b);
    }
}

