/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCE
 */
public class ace_2
extends aca_2 {
    private int[] c;

    public ace_2() {
        this(10);
    }

    public ace_2(int n) {
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

    public void a(long l, int n) {
        this.a();
        int n2 = this.b(l);
        if (n2 < 0) {
            n2 = -n2 - 1;
        } else {
            ++this.b;
            this.a[n2] = l;
        }
        this.c[n2] = n;
    }

    public int d(long l) {
        if (this.b == 0) {
            return 0;
        }
        int n = this.a(l);
        if (n < 0) {
            return 0;
        }
        return this.c(n);
    }

    public int c(int n) {
        int n2 = this.c[n];
        this.a[n] = this.a[this.b - 1];
        this.c[n] = this.c[this.b - 1];
        --this.b;
        return n2;
    }

    public int e(long l) {
        int n = this.a(l);
        if (n < 0) {
            return 0;
        }
        return this.c[n];
    }

    public int d(int n) {
        return this.c[n];
    }
}

