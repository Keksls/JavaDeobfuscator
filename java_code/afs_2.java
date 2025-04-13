/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFs
 */
public class afs_2 {
    private int b;
    private int c;
    private int d;

    public afs_2() {
        this(0, 0, 0);
    }

    public afs_2(afs_2 afs_22) {
        this(afs_22.b, afs_22.c, afs_22.d);
    }

    public afs_2(int[] nArray) {
        this(nArray[0], nArray[1], nArray[2]);
    }

    public afs_2(aff_1 aff_12, aff_1 aff_13) {
        this.b = aff_13.d() - aff_12.d();
        this.c = aff_13.e() - aff_12.e();
        this.d = aff_13.f() - aff_12.f();
    }

    public afs_2(int n, int n2, int n3) {
        this.b = n;
        this.c = n2;
        this.d = n3;
    }

    public afs_2(int n, int n2, int n3, int n4, int n5, int n6) {
        this.b = n4 - n;
        this.c = n5 - n2;
        this.d = n6 - n3;
    }

    public void a(int[] nArray) {
        this.b = nArray[0];
        this.c = nArray[1];
        this.d = nArray[2];
    }

    public int a() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public int b() {
        return this.c;
    }

    public void b(int n) {
        this.c = n;
    }

    public int c() {
        return this.d;
    }

    public void c(int n) {
        this.d = n;
    }

    public afs_2 a(afs_2 afs_22) {
        return new afs_2(afs_22.b + this.b, afs_22.c + this.c, afs_22.d + this.d);
    }

    public afs_2 b(afs_2 afs_22) {
        return new afs_2(this.b - afs_22.b, this.c - afs_22.c, this.d - afs_22.d);
    }

    public afs_2 c(afs_2 afs_22) {
        return new afs_2(this.b * afs_22.b + this.b * afs_22.c + this.b * afs_22.d, this.c * afs_22.b + this.c * afs_22.c + this.c * afs_22.d, this.d * afs_22.b + this.d * afs_22.c + this.d * afs_22.d);
    }

    public afs_2 d(int n) {
        return new afs_2(n * this.b, n * this.c, n * this.d);
    }

    public afs_2 a(float f2) {
        return new afs_2((int)(f2 * (float)this.b), (int)(f2 * (float)this.c), (int)(f2 * (float)this.d));
    }

    public float d(afs_2 afs_22) {
        return this.b * afs_22.c + this.c * afs_22.d + this.d * afs_22.b - afs_22.b * this.c - afs_22.c * this.d - afs_22.d * this.b;
    }

    public float e(afs_2 afs_22) {
        return this.b * afs_22.b + this.c * afs_22.c + this.d * afs_22.d;
    }

    public int d() {
        return this.b * this.b + this.c * this.c + this.d * this.d;
    }

    public int e() {
        int n = this.b * this.b + this.c * this.c + this.d * this.d;
        return Hw.d(n);
    }

    public afs_2 f() {
        int n = this.e();
        return this.d(1 / n);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof afs_2)) {
            return false;
        }
        afs_2 afs_22 = (afs_2)object;
        return afs_22.b == this.b && afs_22.c == this.c && afs_22.d == this.d;
    }

    public String toString() {
        return "[" + this.b + " ; " + this.c + " ; " + this.d + "]";
    }

    public static aej_2 a(float f2, float f3) {
        return afr_2.a(f2, f3);
    }

    public aej_2 g() {
        return afr_2.a(this.b, this.c);
    }

    public static aej_2 b(float f2, float f3) {
        return afr_2.b(f2, f3);
    }

    public aej_2 h() {
        return afr_2.b(this.b, this.c);
    }

    public aej_2 a(aej_2 aej_22) {
        int n = this.b + this.c;
        int n2 = this.b - this.c;
        int n3 = aej_22.m;
        int n4 = aej_22.n;
        if (n == 0) {
            n = n3 + n4;
        }
        if (n2 == 0) {
            n2 = n3 - n4;
        }
        if (n > 0) {
            if (n2 > 0) {
                return aej_2.b;
            }
            return aej_2.d;
        }
        if (n2 > 0) {
            return aej_2.h;
        }
        return aej_2.f;
    }

    public aej_2 b(aej_2 aej_22) {
        if (this.b == 0 && this.c == 0) {
            return aej_2.a(aej_22.l);
        }
        return this.h();
    }

    public int hashCode() {
        assert (false) : "Il n'est pas pr\u00e9vu que ces objets comparables servent de clef dans une HashTable/HashMap.";
        return super.hashCode();
    }
}

