/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAa
 */
public class aaa_2 {
    private aab_2 a;
    private long b;
    private long c;

    public aaa_2(aab_2 aab_22, long l) {
        this.a = aab_22;
        this.b = l;
        this.c = 0L;
    }

    public long a(long l) {
        long l2 = 1000000000L / this.b;
        long l3 = l - this.c;
        long l4 = l2 - l3;
        return l4 >= 0L ? l4 : 0L;
    }

    public long b(long l) {
        long l2 = 1000000000L / this.b;
        long l3 = l - this.c;
        this.c = l;
        return l3 / l2;
    }

    public aab_2 a() {
        return this.a;
    }

    public void a(aab_2 aab_22) {
        this.a = aab_22;
    }

    public long b() {
        return this.b;
    }

    public void c(long l) {
        this.b = l;
    }

    public long c() {
        return this.c;
    }

    public void d(long l) {
        this.c = l;
    }
}

