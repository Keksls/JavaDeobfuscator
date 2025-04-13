/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFr
 */
public class afr_2 {
    private static final float i = (float)Math.PI;
    private static final float j = 0.3926991f;
    private static final float k = 1.1780972f;
    private static final float l = 1.9634955f;
    private static final float m = 2.7488937f;
    private static final float n = 0.7853982f;
    private static final float o = 2.3561945f;
    public float a;
    public float b;
    public float c;
    public static final afr_2 d = new afr_2(1.0f, 0.0f, 0.0f);
    public static final afr_2 e = new afr_2(0.0f, 1.0f, 0.0f);
    public static final afr_2 f = new afr_2(0.0f, 0.0f, 1.0f);
    public static final afr_2 g = new afr_2();

    public afr_2() {
        this(0.0f, 0.0f, 0.0f);
    }

    public afr_2(afr_2 afr_22) {
        this(afr_22.a, afr_22.b, afr_22.c);
    }

    public afr_2(aff_1 aff_12, aff_1 aff_13) {
        this(aff_13.d() - aff_12.d(), aff_13.e() - aff_12.e(), aff_13.f() - aff_12.f());
    }

    public afr_2(float[] fArray) {
        this(fArray[0], fArray[1], fArray[2]);
    }

    public afr_2(int[] nArray) {
        this(nArray[0], nArray[1], nArray[2]);
    }

    public afr_2(float f2, float f3, float f4) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
    }

    public afr_2(int n, int n2, short s2, int n3, int n4, short s3) {
        this.a = n3 - n;
        this.b = n4 - n2;
        this.c = s3 - s2;
    }

    public float a() {
        return this.a;
    }

    public void a(float f2) {
        this.a = f2;
    }

    public float b() {
        return this.b;
    }

    public void b(float f2) {
        this.b = f2;
    }

    public float c() {
        return this.c;
    }

    public void c(float f2) {
        this.c = f2;
    }

    public void a(float f2, float f3, float f4) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
    }

    public void a(int[] nArray) {
        this.a = nArray[0];
        this.b = nArray[1];
        this.c = nArray[2];
    }

    public void a(afr_2 afr_22) {
        if (afr_22 == null) {
            return;
        }
        this.a = afr_22.a;
        this.b = afr_22.b;
        this.c = afr_22.c;
    }

    public void b(afr_2 afr_22) {
        if (afr_22 == null) {
            return;
        }
        this.a += afr_22.a;
        this.b += afr_22.b;
        this.c += afr_22.c;
    }

    public void c(afr_2 afr_22) {
        if (afr_22 == null) {
            return;
        }
        this.a -= afr_22.a;
        this.b -= afr_22.b;
        this.c -= afr_22.c;
    }

    public void a(double d2) {
        this.a = (float)((double)this.a * d2);
        this.b = (float)((double)this.b * d2);
        this.c = (float)((double)this.c * d2);
    }

    public boolean b(float f2, float f3, float f4) {
        boolean bl = this.d(f2);
        boolean bl2 = this.e(f3);
        boolean bl3 = this.f(f4);
        return bl || bl2 || bl3;
    }

    public boolean d(float f2) {
        if (-f2 <= this.a && this.a <= f2) {
            return false;
        }
        float f3 = Math.abs(f2);
        float f4 = Math.abs(this.a);
        this.c = this.c * f3 / f4;
        this.b = this.b * f3 / f4;
        this.a = this.a > f2 ? f2 : -f2;
        return true;
    }

    public boolean e(float f2) {
        if (-f2 <= this.b && this.b <= f2) {
            return false;
        }
        float f3 = Math.abs(f2);
        float f4 = Math.abs(this.b);
        this.c = this.c * f3 / f4;
        this.a = this.a * f3 / f4;
        this.b = this.b > f2 ? f2 : -f2;
        return true;
    }

    public boolean f(float f2) {
        if (-f2 <= this.c && this.c <= f2) {
            return false;
        }
        float f3 = Math.abs(f2);
        float f4 = Math.abs(this.c);
        this.b = this.b * f3 / f4;
        this.a = this.a * f3 / f4;
        this.c = this.c > f2 ? f2 : -f2;
        return true;
    }

    public afr_2 d(afr_2 afr_22) {
        return new afr_2(afr_22.a + this.a, afr_22.b + this.b, afr_22.c + this.c);
    }

    public afr_2 e(afr_2 afr_22) {
        return new afr_2(this.a - afr_22.a, this.b - afr_22.b, this.c - afr_22.c);
    }

    public afr_2 f(afr_2 afr_22) {
        return new afr_2(this.a * afr_22.a + this.a * afr_22.b + this.a * afr_22.c, this.b * afr_22.a + this.b * afr_22.b + this.b * afr_22.c, this.c * afr_22.a + this.c * afr_22.b + this.c * afr_22.c);
    }

    public afr_2 g(float f2) {
        return new afr_2(f2 * this.a, f2 * this.b, f2 * this.c);
    }

    public float g(afr_2 afr_22) {
        return this.a * afr_22.a + this.b * afr_22.b + this.c * afr_22.c;
    }

    public float a(afs_2 afs_22) {
        return this.a * (float)afs_22.a() + this.b * (float)afs_22.b() + this.c * (float)afs_22.c();
    }

    public float h(afr_2 afr_22) {
        return this.a * afr_22.b + this.b * afr_22.c + this.c * afr_22.a - afr_22.a * this.b - afr_22.b * this.c - afr_22.c * this.a;
    }

    public float d() {
        return this.a * this.a + this.b * this.b + this.c * this.c;
    }

    public float e() {
        return (float)Math.sqrt(this.a * this.a + this.b * this.b + this.c * this.c);
    }

    public float f() {
        return afq_2.b(this.a, this.b);
    }

    public afr_2 g() {
        float f2 = this.e();
        if (f2 == 0.0f) {
            return new afr_2(this.a, this.b, this.c);
        }
        return this.g(1.0f / f2);
    }

    public void h() {
        float f2 = this.e();
        if (f2 == 0.0f) {
            return;
        }
        this.a((double)(1.0f / f2));
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof afr_2)) {
            return false;
        }
        afr_2 afr_22 = (afr_2)object;
        return afr_22.a == this.a && afr_22.b == this.b && afr_22.c == this.c;
    }

    public String toString() {
        return "[" + this.a + " ; " + this.b + " ; " + this.c + "]";
    }

    public static aej_2 a(float f2, float f3) {
        float f4 = -((float)Math.atan2(f3, f2));
        aej_2 aej_22 = f4 < 2.7488937f && f4 >= 1.9634955f ? aej_2.g : (f4 < 1.9634955f && f4 >= 1.1780972f ? aej_2.h : (f4 < 1.1780972f && f4 >= 0.3926991f ? aej_2.a : (f4 < 0.3926991f && f4 >= -0.3926991f ? aej_2.b : (f4 < -0.3926991f && f4 >= -1.1780972f ? aej_2.c : (f4 < -1.1780972f && f4 >= -1.9634955f ? aej_2.d : (f4 < -1.9634955f && f4 >= -2.7488937f ? aej_2.e : aej_2.f))))));
        return aej_22;
    }

    public aej_2 i() {
        return afr_2.a(this.a, this.b);
    }

    public static aej_2 b(float f2, float f3) {
        if (f2 == 0.0f && f3 == 0.0f) {
            return aej_2.k;
        }
        float f4 = -((float)Math.atan2(f3, f2));
        aej_2 aej_22 = f4 < 2.3561945f && f4 >= 0.7853982f ? aej_2.h : (f4 < 0.7853982f && f4 >= -0.7853982f ? aej_2.b : (f4 < -0.7853982f && f4 >= -2.3561945f ? aej_2.d : aej_2.f));
        return aej_22;
    }

    public aej_2 j() {
        return afr_2.b(this.a, this.b);
    }

    public afr_2 k() {
        return new afr_2(-this.a, -this.b, -this.c);
    }

    public int hashCode() {
        assert (false) : "Il n'est pas pr\u00e9vu que ces objets comparables servent de clef dans une HashTable/HashMap.";
        return super.hashCode();
    }
}

