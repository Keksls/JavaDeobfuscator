/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aFB
 */
public class afb_2
implements afj_2 {
    protected static final Logger a = Logger.getLogger(afb_2.class);
    private afr_2 b = new afr_2();
    private afr_2 c = new afr_2();
    private afr_2 d = new afr_2();
    private afr_2 e = new afr_2();
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private boolean o;
    private long p;
    private long q;

    public afb_2() {
        this.o = true;
    }

    public afb_2(afb_2 afb_22) {
        this.b.a(afb_22.b.a(), afb_22.b.b(), afb_22.b.c());
        this.c.a(afb_22.c.a(), afb_22.c.b(), afb_22.c.c());
        this.d.a(afb_22.d.a(), afb_22.d.b(), afb_22.d.c());
        this.e.a(afb_22.e.a(), afb_22.e.b(), afb_22.e.c());
        this.p = afb_22.d();
        this.q = afb_22.c();
        this.o = true;
    }

    @Override
    public void b(long l) {
        this.p = l;
    }

    @Override
    public long d() {
        return this.p;
    }

    @Override
    public void c_(long l) {
        this.q = l;
    }

    @Override
    public long c() {
        return this.q;
    }

    @Override
    public afr_2 a() {
        return this.b;
    }

    @Override
    public void a(afr_2 afr_22) {
        this.b = afr_22;
        this.o = true;
    }

    @Override
    public afr_2 e() {
        return this.c;
    }

    @Override
    public void b(afr_2 afr_22) {
        this.c = afr_22;
        this.o = true;
    }

    @Override
    public afr_2 b() {
        return this.d;
    }

    @Override
    public void c(afr_2 afr_22) {
        this.d = afr_22;
        this.o = true;
    }

    @Override
    public afr_2 f() {
        return this.e;
    }

    @Override
    public void d(afr_2 afr_22) {
        this.e = afr_22;
        this.o = true;
    }

    private void h() {
        float f2 = 1.0f;
        float f3 = this.b.a();
        float f4 = this.b.b();
        float f5 = f3 + this.c.a() * 1.0f;
        float f6 = f4 + this.c.b() * 1.0f;
        float f7 = this.d.a();
        float f8 = this.d.b();
        float f9 = f7 - this.e.a() * 1.0f;
        float f10 = f8 - this.e.b() * 1.0f;
        this.f = f7 - 3.0f * f9 + 3.0f * f5 - f3;
        this.g = 3.0f * f9 - 6.0f * f5 + 3.0f * f3;
        this.h = 3.0f * f5 - 3.0f * f3;
        this.i = f3;
        this.j = f8 - 3.0f * f10 + 3.0f * f6 - f4;
        this.k = 3.0f * f10 - 6.0f * f6 + 3.0f * f4;
        this.l = 3.0f * f6 - 3.0f * f4;
        this.m = f4;
        this.n = this.d.c() - this.b.c();
        this.o = false;
    }

    @Override
    public afr_2 a(long l) {
        if (this.o) {
            this.h();
        }
        if (l < this.p) {
            l = this.p;
        } else if (l > this.q) {
            l = this.q;
        }
        float f2 = (float)(l - this.p) / (float)(this.q - this.p);
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        return new afr_2(this.f * f4 + this.g * f3 + this.h * f2 + this.i, this.j * f4 + this.k * f3 + this.l * f2 + this.m, this.b.c() + this.n * f2);
    }

    @Override
    public long g() {
        return this.q - this.p;
    }

    @Override
    public List<int[]> a(int n) {
        int n2 = 0;
        int n3 = 0;
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        int[] nArray = null;
        for (long k = this.p; k < this.q; k += (long)n) {
            afr_2 afr_22 = this.a(k);
            int n4 = (int)afr_22.a();
            int n5 = (int)afr_22.b();
            int n6 = (int)afr_22.c();
            if (k > this.p && n4 == n2 && n5 == n3) continue;
            nArray = new int[]{n4, n5, n6};
            arrayList.add(nArray);
            n2 = n4;
            n3 = n5;
        }
        if (!(arrayList.isEmpty() || nArray == null || (float)nArray[0] == this.d.a() && (float)nArray[1] == this.d.b() && (float)nArray[2] == this.d.c())) {
            nArray = new int[]{(int)this.d.a(), (int)this.d.b(), (int)this.d.c()};
            arrayList.add(nArray);
        }
        return arrayList;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " (duration:" + (this.q - this.p) + ") > from=" + this.b + ", to=" + this.d + ", initVel=" + this.c + ", finalVel=" + this.e + ", initialTime=" + this.p + ", finalTime=" + this.q + ".";
    }
}

