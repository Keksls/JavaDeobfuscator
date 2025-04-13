/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from aCo
 */
public abstract class aco_2 {
    protected byte[] a;
    protected int b;

    protected aco_2(int n) {
        this.a = new byte[n];
        this.b = 0;
    }

    public boolean a(int n) {
        if (n > this.a.length) {
            byte[] byArray = this.a;
            this.a = new byte[n];
            System.arraycopy(byArray, 0, this.a, 0, byArray.length);
            return true;
        }
        return false;
    }

    protected final int a(byte by) {
        for (int k = this.b - 1; k >= 0; --k) {
            if (by != this.a[k]) continue;
            return k;
        }
        return -1;
    }

    protected final int b(byte by) {
        for (int k = this.b - 1; k >= 0; --k) {
            if (by != this.a[k]) continue;
            return -k - 1;
        }
        return this.b;
    }

    protected final void a() {
        if (this.b == this.a.length) {
            this.a(this.a.length * 2);
        }
    }

    public final boolean c(byte by) {
        return this.a(by) != -1;
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

    public final byte b(int n) {
        return this.a[n];
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        aco_2 aco_22 = (aco_2)object;
        if (this.b != aco_22.b) {
            return false;
        }
        return Arrays.equals(this.a, aco_22.a);
    }

    public int hashCode() {
        int n = this.a != null ? Arrays.hashCode(this.a) : 0;
        n = 31 * n + this.b;
        return n;
    }
}

