/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCD
 */
public class acd_2
extends aca_2 {
    private float[] c;

    public acd_2() {
        this(10);
    }

    public acd_2(int n) {
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

    public void a(long l, float f2) {
        this.a();
        int n = this.b(l);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.b;
            this.a[n] = l;
        }
        this.c[n] = f2;
    }

    public float d(long l) {
        if (this.b == 0) {
            return 0.0f;
        }
        int n = this.a(l);
        if (n < 0) {
            return 0.0f;
        }
        return this.c(n);
    }

    public float c(int n) {
        float f2 = this.c[n];
        this.a[n] = this.a[this.b - 1];
        this.c[n] = this.c[this.b - 1];
        --this.b;
        return f2;
    }

    public float e(long l) {
        int n = this.a(l);
        if (n < 0) {
            return 0.0f;
        }
        return this.c[n];
    }

    public float d(int n) {
        return this.c[n];
    }
}

