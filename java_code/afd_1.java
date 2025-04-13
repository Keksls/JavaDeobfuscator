/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFd
 */
public class afd_1 {
    public float a;
    public float b;

    public afd_1() {
    }

    public afd_1(afd_1 afd_12) {
        this.b(afd_12);
    }

    public afd_1(float f2, float f3) {
        this.b(f2, f3);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        afd_1 afd_12 = (afd_1)object;
        return this.a == afd_12.a && this.b == afd_12.b;
    }

    public final int hashCode() {
        long l = 31L * (31L + (long)this.a) + (long)this.b;
        return (int)(l ^ l >> 32);
    }

    public String toString() {
        return "{Point2i : (" + this.a + ", " + this.b + ") @" + Integer.toHexString(this.hashCode()) + "}";
    }

    public final boolean a(float f2, float f3) {
        return this.a == f2 && this.b == f3;
    }

    public final boolean a(afd_1 afd_12) {
        return this.a == afd_12.a && this.b == afd_12.b;
    }

    public final void b(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public final void b(afd_1 afd_12) {
        this.a = afd_12.a;
        this.b = afd_12.b;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final void a(float f2) {
        this.a = f2;
    }

    public final void b(float f2) {
        this.b = f2;
    }
}

