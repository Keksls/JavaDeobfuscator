/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMJ
 */
public class amj_2 {
    private int a;
    private int b;

    public amj_2(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public amj_2(afe_1 afe_12) {
        this.a = afe_12.a();
        this.b = afe_12.b();
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final void a(int n, int n2) {
        this.a += n;
        this.b += n2;
    }

    public final void a(amj_2 amj_22) {
        this.a += amj_22.a;
        this.b += amj_22.b;
    }

    public final void b(amj_2 amj_22) {
        this.a -= amj_22.a;
        this.b -= amj_22.b;
    }

    public final void b(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public String toString() {
        return "Coord(" + this.a + ";" + this.b + ")";
    }

    public final int hashCode() {
        long l = 31L * (31L + (long)this.a) + (long)this.b;
        return (int)(l ^ l >> 32);
    }

    public final boolean c(int n, int n2) {
        return this.a == n && this.b == n2;
    }

    public final boolean c(amj_2 amj_22) {
        return this.a == amj_22.a && this.b == amj_22.b;
    }
}

