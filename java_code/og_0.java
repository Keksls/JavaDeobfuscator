/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.DoubleMath
 *  com.google.common.primitives.Longs
 */
import com.google.common.math.DoubleMath;
import com.google.common.primitives.Longs;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Renamed from OG
 */
public class og_0
implements oj_0 {
    private SortedSet<Long> a;
    private short b;
    private short c;
    private long[] d;
    private final long e;
    private final long f;

    protected og_0(long[] lArray, int n, int n2, long l, long l2, double d2) {
        this.a(lArray, n, n2, d2);
        this.e();
        this.e = l;
        this.f = l2;
    }

    private void e() {
        List list = Longs.asList((long[])this.d);
        this.a = Collections.unmodifiableSortedSet(new TreeSet(list));
    }

    private void a(long[] lArray, int n, int n2, double d2) {
        int n3 = Math.min(n2 - n + 1, lArray.length);
        this.c = (short)n;
        this.b = (short)(this.c + n3 - 1);
        this.d = new long[n3];
        if (DoubleMath.fuzzyEquals((double)d2, (double)1.0, (double)0.0)) {
            System.arraycopy(lArray, 0, this.d, 0, n3);
        } else {
            for (int k = 0; k < n3; ++k) {
                long l;
                long l2 = lArray[k];
                double d3 = (double)l2 * d2;
                this.d[k] = l = Math.round(d3);
            }
        }
        this.f();
    }

    private void f() {
        for (int k = 0; k < this.d.length - 1; ++k) {
            if (this.d[k + 1] == this.d[k]) {
                throw new IllegalArgumentException(this.c(k));
            }
            if (this.d[k + 1] >= this.d[k]) continue;
            throw new IllegalArgumentException(this.b(k));
        }
    }

    @Override
    public short a() {
        return this.b;
    }

    @Override
    public short b() {
        return this.c;
    }

    private long g() {
        return this.f;
    }

    private long h() {
        return this.e;
    }

    @Override
    public long a(int n) {
        if (n < this.c) {
            return this.h();
        }
        if (n > this.b) {
            return this.g();
        }
        return this.d[n - this.c];
    }

    @Override
    public long a(short s2, float f2) {
        short s3 = (short)((float)s2 + f2);
        float f3 = f2 % 1.0f;
        if (s2 < this.c) {
            return this.h();
        }
        if (s2 > this.b) {
            return this.g();
        }
        return (long)((float)this.d[s2 - this.c] + (float)this.b(s3) * f2);
    }

    @Override
    public short a(long l) {
        return (short)(this.a.headSet(l + 1L).size() + this.c - 1);
    }

    @Override
    public long c() {
        return this.a((int)this.c);
    }

    @Override
    public long d() {
        return this.a((int)this.b);
    }

    @Override
    public boolean a(short s2) {
        return s2 >= this.c && s2 <= this.b;
    }

    @Override
    public boolean b(long l) {
        return l >= this.c() && l <= this.d();
    }

    @Override
    public float a(short s2, long l) {
        long l2 = this.b(s2);
        if (l2 == 0L) {
            return 0.0f;
        }
        float f2 = (float)this.a(l, s2) / (float)l2;
        return Math.max(0.0f, Math.min(f2, 1.0f));
    }

    @Override
    public long c(long l) {
        return this.a(l, this.a(l));
    }

    private long a(long l, short s2) {
        long l2 = l - this.a((int)s2);
        return Math.max(0L, Math.min(l2, this.b(s2)));
    }

    @Override
    public long b(short s2) {
        if (s2 < this.c || s2 >= this.b) {
            return 0L;
        }
        return this.a(s2 + 1) - this.a((int)s2);
    }

    private String b(int n) {
        return "Tableau mal tri\u00e9 \u00e0 " + n + " - " + this.getClass().getSimpleName();
    }

    private String c(int n) {
        return "Tableau contenant une valeur double \u00e0 " + n + " - " + this.getClass().getSimpleName();
    }
}

