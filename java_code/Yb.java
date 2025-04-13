/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableRangeMap
 *  com.google.common.collect.ImmutableRangeMap$Builder
 *  com.google.common.collect.Range
 */
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import java.security.SecureRandom;
import java.util.Random;

public class Yb {
    private final Ye[] a;
    private final Random b = new SecureRandom();
    private Yd c = new Yd();

    public Yb() {
        long l = wb_0.f.g() / 7200L;
        this.a = new Ye[(int)l];
        int n = 0;
        while ((long)n < l) {
            this.a[n] = new Ye(n);
            ++n;
        }
    }

    public int a() {
        return this.a.length;
    }

    public Ye b() {
        return this.a[this.a.length - 1];
    }

    public Ye c() {
        return this.a[0];
    }

    public void a(Yd yd) {
        this.c = yd;
    }

    public Yd d() {
        return this.c;
    }

    public float e() {
        return this.c.b();
    }

    public float f() {
        return this.c.c();
    }

    public Ye a(int n) {
        return this.a[n];
    }

    private void h() {
        for (Ye ye : this.a) {
            ye.b(0.0f);
            ye.c(0.0f);
        }
    }

    private void i() {
        float f2 = this.c.b();
        float f3 = this.c.c();
        float f4 = this.c.d();
        float f5 = this.c.e();
        for (Ye ye : this.a) {
            if (ye.b() == 0) {
                ye.b(f2 + this.b.nextFloat() * (f3 - f2));
            } else {
                float f6 = this.a[ye.b() - 1].e();
                ye.b(Math.max(f2, f6 - (float)((int)(f4 + this.b.nextFloat() * (f5 - f4)))));
            }
            ye.c(Math.min(f3, ye.d() + (float)((int)(f4 + this.b.nextFloat() * (f5 - f4)))));
        }
    }

    private void j() {
        for (Ye ye : this.a) {
            ye.a(0.0f);
        }
    }

    private void k() {
        float f2 = this.c.f();
        float f3 = this.c.g();
        for (Ye ye : this.a) {
            ye.a(f2 + this.b.nextFloat() * (f3 - f2));
            ye.a(f2, f3);
        }
    }

    public void g() {
        this.l();
        this.m();
    }

    private void l() {
        ImmutableRangeMap.Builder builder = ImmutableRangeMap.builder();
        int n = 0;
        int n2 = 0;
        for (Yf yf : Yf.values()) {
            int n3 = Math.max(1, this.c.a(yf));
            builder.put(Range.closedOpen((Comparable)Integer.valueOf(n2), (Comparable)Integer.valueOf(n2 + n3)), (Object)yf);
            n2 += n3;
            n += n3;
        }
        ImmutableRangeMap immutableRangeMap = builder.build();
        for (Ye ye : this.a) {
            int n4 = this.b.nextInt(n);
            ye.a((Yf)((Object)immutableRangeMap.get((Comparable)Integer.valueOf(n4))));
        }
        this.n();
    }

    private void m() {
        this.h();
        this.i();
    }

    private void n() {
        this.j();
        this.k();
    }
}

