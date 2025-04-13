/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCB
 */
public class acb_2
extends aca_2 {
    private byte[] c;

    public acb_2() {
        this(10);
    }

    public acb_2(int n) {
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

    public void a(long l, byte by) {
        this.a();
        int n = this.b(l);
        if (n < 0) {
            n = -n - 1;
        } else {
            ++this.b;
            this.a[n] = l;
        }
        this.c[n] = by;
    }

    public byte d(long l) {
        if (this.b == 0) {
            return 0;
        }
        int n = this.a(l);
        if (n < 0) {
            return 0;
        }
        return this.c(n);
    }

    public byte c(int n) {
        byte by = this.c[n];
        this.a[n] = this.a[this.b - 1];
        this.c[n] = this.c[this.b - 1];
        --this.b;
        return by;
    }

    public byte e(long l) {
        int n = this.a(l);
        if (n < 0) {
            return 0;
        }
        return this.c[n];
    }

    public byte d(int n) {
        return this.c[n];
    }
}

