/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCJ
 */
public abstract class acj_2 {
    protected short[] a;
    protected int b;

    public acj_2(int n) {
        this.a = new short[n];
        this.b = 0;
    }

    public boolean a(int n) {
        if (n > this.a.length) {
            short[] sArray = this.a;
            this.a = new short[n];
            System.arraycopy(sArray, 0, this.a, 0, sArray.length);
            return true;
        }
        return false;
    }

    protected final int a(short s2) {
        for (int k = this.b - 1; k >= 0; --k) {
            if (s2 != this.a[k]) continue;
            return k;
        }
        return -1;
    }

    protected final int b(short s2) {
        for (int k = this.b - 1; k >= 0; --k) {
            if (s2 != this.a[k]) continue;
            return -k - 1;
        }
        return this.b;
    }

    protected final void a() {
        if (this.b == this.a.length) {
            this.a(this.a.length * 2);
        }
    }

    public final boolean c(short s2) {
        return this.a(s2) != -1;
    }

    public final void b() {
        this.b = 0;
    }

    public void c() {
        this.b = 0;
    }

    public final int d() {
        return this.b;
    }

    public final short b(int n) {
        return this.a[n];
    }
}

