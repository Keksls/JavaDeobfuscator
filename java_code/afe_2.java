/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aFE
 */
public class afe_2
implements afj_2 {
    private final afr_2 a = new afr_2();
    private final afr_2 b = new afr_2();
    private final afr_2 c = new afr_2();
    private final afr_2 d = new afr_2();
    private long e;
    private long f;

    public afe_2() {
        this.f = 0L;
        this.e = 0L;
    }

    public afe_2(afe_2 afe_22) {
        this.a.a(afe_22.a.a(), afe_22.a.b(), afe_22.a.c());
        this.b.a(afe_22.b.a(), afe_22.b.b(), afe_22.b.c());
        this.c.a(afe_22.c.a(), afe_22.c.b(), afe_22.c.c());
        this.d.a(afe_22.d.a(), afe_22.d.b(), afe_22.d.c());
        this.e = afe_22.d();
        this.f = afe_22.c();
    }

    @Override
    public void b(long l) {
        this.e = l;
    }

    @Override
    public long d() {
        return this.e;
    }

    @Override
    public void c_(long l) {
        this.f = l;
    }

    @Override
    public long c() {
        return this.f;
    }

    @Override
    public afr_2 a() {
        return this.a;
    }

    @Override
    public afr_2 e() {
        return this.b;
    }

    @Override
    public afr_2 b() {
        return this.c;
    }

    @Override
    public afr_2 f() {
        return this.d;
    }

    @Override
    public void a(afr_2 afr_22) {
        this.a.a(afr_22);
    }

    @Override
    public void b(afr_2 afr_22) {
        this.b.a(afr_22);
    }

    @Override
    public void c(afr_2 afr_22) {
        this.c.a(afr_22);
    }

    @Override
    public void d(afr_2 afr_22) {
        this.d.a(afr_22);
    }

    @Override
    public afr_2 a(long l) {
        if (l < this.e) {
            l = this.e;
        }
        if (this.f == this.e || this.d.e() == 0.0f && l >= this.f) {
            return new afr_2(this.c);
        }
        float f2 = (float)(l - this.e) / (float)(this.f - this.e);
        return new afr_2(this.a.a() + this.b.a() * f2, this.a.b() + this.b.b() * f2, this.a.c() + this.b.c() * f2);
    }

    public double d(long l) {
        return (double)(l - this.e) / (double)(this.f - this.e);
    }

    @Override
    public long g() {
        return this.f - this.e;
    }

    @Override
    public List<int[]> a(int n) {
        int n2 = 0;
        int n3 = 0;
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        int[] nArray = null;
        for (long k = this.e; k < this.f; k += (long)n) {
            afr_2 afr_22 = this.a(k);
            int n4 = (int)afr_22.a();
            int n5 = (int)afr_22.b();
            int n6 = (int)afr_22.c();
            if (k > this.e && n4 == n2 && n5 == n3) continue;
            nArray = new int[]{n4, n5, n6};
            arrayList.add(nArray);
            n2 = n4;
            n3 = n5;
        }
        if (!(arrayList.isEmpty() || nArray == null || (float)nArray[0] == this.c.a() && (float)nArray[1] == this.c.b() && (float)nArray[2] == this.c.c())) {
            nArray = new int[]{(int)this.c.a(), (int)this.c.b(), (int)this.c.c()};
            arrayList.add(nArray);
        }
        return arrayList;
    }

    public void e(long l) {
        this.e += l;
        this.f += l;
    }

    public List<afe_2> a(double d2) {
        double d3 = this.c.e(this.a).f();
        int n = (int)Math.ceil(d3 / d2);
        ArrayList<afe_2> arrayList = new ArrayList<afe_2>(n);
        if (n == 0) {
            arrayList.add(this);
            return arrayList;
        }
        double d4 = d3 / (double)n;
        long l = this.g() / (long)n;
        afr_2 afr_22 = this.c.e(this.a);
        afr_22.h();
        afr_2 afr_23 = this.a;
        long l2 = this.e;
        for (int k = 0; k < n; ++k) {
            afe_2 afe_22 = new afe_2();
            afe_22.a(afr_23);
            afe_22.b(l2);
            if (k != n - 1) {
                afe_22.d(this.b);
                afr_2 afr_24 = afr_23.d(afr_22.g((float)d4));
                afe_22.c(afr_24);
                afe_22.c_(l2 + l);
            } else {
                afe_22.c_(this.f);
                afe_22.d(this.d);
                afe_22.c(this.c);
            }
            afe_22.b(afe_22.b().e(afe_22.a()));
            l2 += l;
            afr_23 = afe_22.b();
            arrayList.add(afe_22);
        }
        return arrayList;
    }

    public double h() {
        return this.c.e(this.a).f();
    }

    public String toString() {
        return this.getClass().getSimpleName() + " (duration:" + (this.f - this.e) + ") > from=" + this.a + ", to=" + this.c + ", initVel=" + this.b + ", finalVel=" + this.d + ", initialTime=" + this.e + ", finalTime=" + this.f;
    }
}

