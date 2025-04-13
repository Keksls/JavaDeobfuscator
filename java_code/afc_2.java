/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aFC
 */
public class afc_2
implements afg_1,
afj_2 {
    private afr_2 a = new afr_2();
    private afr_2 b = new afr_2();
    private afr_2 c = new afr_2();
    private afr_2 d = new afr_2();
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private boolean q;
    private long r;
    private long s;

    public afc_2() {
        this.q = true;
    }

    public afc_2(afc_2 afc_22) {
        this.a.a(afc_22.a.a(), afc_22.a.b(), afc_22.a.c());
        this.b.a(afc_22.b.a(), afc_22.b.b(), afc_22.b.c());
        this.c.a(afc_22.c.a(), afc_22.c.b(), afc_22.c.c());
        this.d.a(afc_22.d.a(), afc_22.d.b(), afc_22.d.c());
        this.r = afc_22.d();
        this.s = afc_22.c();
        this.q = true;
    }

    @Override
    public afr_2 a(long l, aej_2 aej_22, apl_1 apl_12) {
        return afd_2.a(this, l, aej_22, apl_12);
    }

    @Override
    public void b(long l) {
        this.r = l;
    }

    @Override
    public void c(long l) {
        this.r += l;
        this.s += l;
    }

    @Override
    public long d() {
        return this.r;
    }

    @Override
    public boolean b_(long l) {
        return false;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " (duration:" + (this.s - this.r) + ") > from=" + this.a + ", to=" + this.c + ", initVel=" + this.b + ", finalVel=" + this.d + ".";
    }

    @Override
    public void c_(long l) {
        this.s = l;
    }

    @Override
    public long c() {
        return this.s;
    }

    @Override
    public afr_2 a() {
        return this.a;
    }

    @Override
    public void a(afr_2 afr_22) {
        this.a = afr_22;
        this.q = true;
    }

    @Override
    public afr_2 e() {
        return this.b;
    }

    @Override
    public void b(afr_2 afr_22) {
        this.b = afr_22;
        this.q = true;
    }

    @Override
    public afr_2 b() {
        return this.c;
    }

    @Override
    public void c(afr_2 afr_22) {
        this.c = afr_22;
        this.q = true;
    }

    @Override
    public afr_2 f() {
        return this.d;
    }

    @Override
    public void d(afr_2 afr_22) {
        this.d = afr_22;
        this.q = true;
    }

    private void h() {
        float f2 = 1.0f;
        float f3 = this.a.a();
        float f4 = this.a.b();
        float f5 = this.a.c();
        float f6 = f3 + this.b.a() * 1.0f;
        float f7 = f4 + this.b.b() * 1.0f;
        float f8 = f5 + this.b.c() * 1.0f;
        float f9 = this.c.a();
        float f10 = this.c.b();
        float f11 = this.c.c();
        float f12 = f9 - this.d.a() * 1.0f;
        float f13 = f10 - this.d.b() * 1.0f;
        float f14 = f11 - this.d.c() * 1.0f;
        this.e = f9 - 3.0f * f12 + 3.0f * f6 - f3;
        this.f = 3.0f * f12 - 6.0f * f6 + 3.0f * f3;
        this.g = 3.0f * f6 - 3.0f * f3;
        this.h = f3;
        this.i = f10 - 3.0f * f13 + 3.0f * f7 - f4;
        this.j = 3.0f * f13 - 6.0f * f7 + 3.0f * f4;
        this.k = 3.0f * f7 - 3.0f * f4;
        this.l = f4;
        this.m = f11 - 3.0f * f14 + 3.0f * f8 - f5;
        this.n = 3.0f * f14 - 6.0f * f8 + 3.0f * f5;
        this.o = 3.0f * f8 - 3.0f * f5;
        this.p = f5;
        this.q = false;
    }

    @Override
    public afr_2 a(long l) {
        if (this.q) {
            this.h();
        }
        if (l < this.r) {
            l = this.r;
        } else if (l > this.s) {
            l = this.s;
        }
        float f2 = (float)(l - this.r) / (float)(this.s - this.r);
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        return new afr_2(this.e * f4 + this.f * f3 + this.g * f2 + this.h, this.i * f4 + this.j * f3 + this.k * f2 + this.l, this.m * f4 + this.n * f3 + this.o * f2 + this.p);
    }

    @Override
    public long g() {
        return this.s - this.r;
    }

    @Override
    public List<int[]> a(int n) {
        int n2 = 0;
        int n3 = 0;
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        int[] nArray = null;
        for (long k = this.r; k < this.s; k += (long)n) {
            afr_2 afr_22 = this.a(k);
            int n4 = (int)afr_22.a();
            int n5 = (int)afr_22.b();
            int n6 = (int)afr_22.c();
            if (k > this.r && n4 == n2 && n5 == n3) continue;
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
}

