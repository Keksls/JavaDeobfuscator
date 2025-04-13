/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCI
 */
public class aci_2
extends aca_2 {
    private short[] c;

    public aci_2() {
        this(10);
    }

    public aci_2(int n) {
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

    public void a(long l, short s2) {
        this.a();
        int n = this.b(l);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.b;
            this.a[n] = l;
        }
        this.c[n] = s2;
    }

    public short d(long l) {
        if (this.b == 0) {
            return 0;
        }
        int n = this.a(l);
        if (n < 0) {
            return 0;
        }
        return this.c(n);
    }

    public short c(int n) {
        short s2 = this.c[n];
        this.a[n] = this.a[this.b - 1];
        this.c[n] = this.c[this.b - 1];
        --this.b;
        return s2;
    }

    public short e(long l) {
        int n = this.a(l);
        if (n < 0) {
            return 0;
        }
        return this.c[n];
    }

    public short d(int n) {
        return this.c[n];
    }
}

