/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCu
 */
public class acu_1
extends acq_2 {
    private float[] c;

    public acu_1() {
        this(10);
    }

    public acu_1(int n) {
        super(n);
        this.c = new float[n];
    }

    @Override
    public boolean a(int n) {
        int n2 = this.a.length;
        if (!super.a(n)) {
            return false;
        }
        float[] fArray = this.c;
        this.c = new float[n];
        System.arraycopy(fArray, 0, this.c, 0, n2);
        return true;
    }

    public void a(int n, float f2) {
        this.a();
        int n2 = this.c(n);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.b;
            this.a[n2] = n;
        }
        this.c[n2] = f2;
    }

    public float f(int n) {
        if (this.b == 0) {
            return 0.0f;
        }
        int n2 = this.b(n);
        if (n2 < 0) {
            return 0.0f;
        }
        float f2 = this.c[n2];
        this.a[n2] = this.a[this.b - 1];
        this.c[n2] = this.c[this.b - 1];
        --this.b;
        return f2;
    }

    public float g(int n) {
        int n2 = this.b(n);
        if (n2 < 0) {
            return 0.0f;
        }
        return this.c[n2];
    }

    public float h(int n) {
        return this.c[n];
    }

    @Override
    public void e() {
        super.e();
        float[] fArray = this.c;
        this.c = new float[this.b];
        System.arraycopy(fArray, 0, this.c, 0, this.b);
    }
}

