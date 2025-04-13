/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFe
 */
public class afe_1 {
    private int a;
    private int b;

    public afe_1() {
    }

    public afe_1(afe_1 afe_12) {
        this.b(afe_12);
    }

    public afe_1(int n, int n2) {
        this.b(n, n2);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        afe_1 afe_12 = (afe_1)object;
        return this.a == afe_12.a && this.b == afe_12.b;
    }

    public final int hashCode() {
        long l = 31L * (31L + (long)this.a) + (long)this.b;
        return (int)(l ^ l >> 32);
    }

    public String toString() {
        return "{Point2i : (" + this.a + ", " + this.b + ") @" + Integer.toHexString(this.hashCode()) + "}";
    }

    public final boolean a(int n, int n2) {
        return this.a == n && this.b == n2;
    }

    public final boolean a(afe_1 afe_12) {
        return this.a == afe_12.a && this.b == afe_12.b;
    }

    public final void b(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public final void b(afe_1 afe_12) {
        this.a = afe_12.a;
        this.b = afe_12.b;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final void a(int n) {
        this.a = n;
    }

    public final void b(int n) {
        this.b = n;
    }
}

