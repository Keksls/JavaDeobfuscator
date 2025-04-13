/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFq
 */
public class afq_2 {
    public float a;
    public float b;

    public afq_2() {
        this(0.0f, 0.0f);
    }

    public afq_2(afq_2 afq_22) {
        this(afq_22.a, afq_22.b);
    }

    public afq_2(float[] fArray) {
        this(fArray[0], fArray[1]);
    }

    public afq_2(afd_1 afd_12, afd_1 afd_13) {
        this.a = afd_13.a() - afd_12.a();
        this.b = afd_13.b() - afd_12.b();
    }

    public afq_2(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public afq_2(int n, int n2, int n3, int n4) {
        this.a = n3 - n;
        this.b = n4 - n2;
    }

    public void a(float[] fArray) {
        this.a = fArray[0];
        this.b = fArray[1];
    }

    public void a(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public void a(afq_2 afq_22) {
        this.a = afq_22.a;
        this.b = afq_22.b;
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

    public afq_2 b(afq_2 afq_22) {
        return new afq_2(afq_22.a + this.a, afq_22.b + this.b);
    }

    public void c(afq_2 afq_22) {
        this.a += afq_22.a;
        this.b += afq_22.b;
    }

    public final float d(afq_2 afq_22) {
        float f2 = this.a - afq_22.a;
        float f3 = this.b - afq_22.b;
        return f2 * f2 + f3 * f3;
    }

    public afq_2 e(afq_2 afq_22) {
        return new afq_2(this.a - afq_22.a, this.b - afq_22.b);
    }

    public void f(afq_2 afq_22) {
        this.a -= afq_22.a;
        this.b -= afq_22.b;
    }

    public afq_2 g(afq_2 afq_22) {
        return new afq_2(this.a * afq_22.a + this.a * afq_22.b, this.b * afq_22.a + this.b * afq_22.b);
    }

    public afq_2 c(float f2) {
        return new afq_2(f2 * this.a, f2 * this.b);
    }

    public void d(float f2) {
        this.a *= f2;
        this.b *= f2;
    }

    public afq_2 e(float f2) {
        return new afq_2((int)(f2 * this.a), (int)(f2 * this.b));
    }

    public float h(afq_2 afq_22) {
        return this.a * afq_22.b - afq_22.a * this.b;
    }

    public float i(afq_2 afq_22) {
        return this.a * afq_22.a + this.b * afq_22.b;
    }

    public float c() {
        return afq_2.c(this.a, this.b);
    }

    public float d() {
        return afq_2.b(this.a, this.b);
    }

    public afq_2 e() {
        return this.c(1.0f / this.d());
    }

    public void f() {
        float f2 = this.d();
        if (f2 == 0.0f) {
            f2 = 0.001f;
        }
        float f3 = 1.0f / f2;
        this.a *= f3;
        this.b *= f3;
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof afq_2)) {
            return false;
        }
        afq_2 afq_22 = (afq_2)object;
        return afq_22.a == this.a && afq_22.b == this.b;
    }

    public String toString() {
        return "V2 : [" + this.a + " ; " + this.b + "]";
    }

    public int hashCode() {
        long l = 31L * (31L + (long)this.a) + (long)this.b;
        return (int)(l ^ l >> 32);
    }

    public static float b(float f2, float f3) {
        return Hw.k(f2 * f2 + f3 * f3);
    }

    public static float c(float f2, float f3) {
        return f2 * f2 + f3 * f3;
    }
}

