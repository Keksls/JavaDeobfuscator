/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCz
 */
public class acz_2
extends acq_2 {
    private short[] c;

    public acz_2() {
        this(10);
    }

    public acz_2(int n) {
        super(n);
        this.c = new short[n];
    }

    @Override
    public boolean a(int n) {
        int n2 = this.a.length;
        if (!super.a(n)) {
            return false;
        }
        short[] sArray = this.c;
        this.c = new short[n];
        System.arraycopy(sArray, 0, this.c, 0, n2);
        return true;
    }

    public void a(int n, short s2) {
        this.a();
        int n2 = this.c(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.b;
            this.a[n2] = n;
        }
        this.c[n2] = s2;
    }

    public short f(int n) {
        if (this.b == 0) {
            return 0;
        }
        int n2 = this.b(n);
        if (n2 < 0) {
            return 0;
        }
        short s2 = this.c[n2];
        this.a[n2] = this.a[this.b - 1];
        this.c[n2] = this.c[this.b - 1];
        --this.b;
        return s2;
    }

    public short g(int n) {
        int n2 = this.b(n);
        if (n2 < 0) {
            return 0;
        }
        return this.c[n2];
    }

    public short h(int n) {
        return this.c[n];
    }

    @Override
    public void e() {
        super.e();
        short[] sArray = this.c;
        this.c = new short[this.b];
        System.arraycopy(sArray, 0, this.c, 0, this.b);
    }
}

