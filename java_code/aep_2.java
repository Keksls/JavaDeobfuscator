/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Comparator;

/*
 * Renamed from aEP
 */
public class aep_2 {
    private final long a;
    private final boolean b;
    private final aes_2[] c;
    private double d = 0.0;
    private long e;
    private int f = 0;
    private static final Comparator<aes_2> g = new aeq_2();
    private static final Comparator<aes_2> h = new aer_2();

    private aep_2(long l, double[] dArray, long[] lArray) {
        if (l < 0L || l >= 0x1000000000000L) {
            throw new IllegalArgumentException("capital must lie bewteen 0 and 2^48-1");
        }
        this.a = l;
        if (dArray == null) {
            throw new IllegalArgumentException("weights must not be null.");
        }
        if (dArray.length == 0) {
            throw new IllegalArgumentException("weights must be non-empty.");
        }
        this.b = lArray != null;
        this.c = new aes_2[dArray.length];
        for (int k = 0; k < dArray.length; ++k) {
            this.c[k] = this.a(dArray[k], k, this.b ? lArray[k] : Long.MAX_VALUE);
        }
        if (Double.compare(this.d, 0.0) != 1) {
            throw new IllegalArgumentException("The elements of weights must not be all 0.");
        }
    }

    private aes_2 a(double d2, int n, long l) {
        if (Double.compare(d2, 0.0) == -1) {
            throw new IllegalArgumentException("All elements of weights must be positive or 0.");
        }
        this.d += d2;
        return new aes_2(d2, n, l);
    }

    private long a() {
        return this.a - this.e;
    }

    private long[] b() {
        this.c();
        this.d();
        return this.g();
    }

    private void c() {
        if (!this.b) {
            return;
        }
        Arrays.sort(this.c, g);
        for (aes_2 aes_22 : this.c) {
            double d2 = (double)this.a() / this.d;
            if (aes_22.a() >= d2) break;
            aes_22.d();
            this.e += aes_22.c();
            this.d -= aes_22.e();
            ++this.f;
        }
    }

    private void d() {
        if (this.f == this.c.length) {
            return;
        }
        this.e();
        if (this.e == this.a) {
            return;
        }
        this.f();
    }

    private void e() {
        long l = this.a();
        for (int k = this.f; k < this.c.length; ++k) {
            aes_2 aes_22 = this.c[k];
            aes_22.a((double)l * (aes_22.e() / this.d));
            this.e += aes_22.c();
        }
    }

    private void f() {
        if (this.a() < 0L || this.a() >= (long)(this.c.length - this.f)) {
            throw new IllegalStateException("Unrecoverable state");
        }
        Arrays.sort(this.c, this.f, this.c.length, h);
        int n = 0;
        while ((long)n < this.a()) {
            this.c[this.f + n % (this.c.length - this.f)].f();
            ++n;
        }
    }

    private long[] g() {
        long[] lArray = new long[this.c.length];
        for (aes_2 aes_22 : this.c) {
            lArray[aes_22.b()] = aes_22.c();
        }
        return lArray;
    }

    public static long[] a(long l, double[] dArray, long[] lArray) {
        if (lArray == null) {
            throw new IllegalArgumentException("capacities must not be null.");
        }
        if (dArray.length != lArray.length) {
            throw new IllegalArgumentException("weights and capacities must have identical length.");
        }
        return new aep_2(l, dArray, lArray).b();
    }

    public static long[] a(long l, double[] dArray) {
        return new aep_2(l, dArray, null).b();
    }
}

