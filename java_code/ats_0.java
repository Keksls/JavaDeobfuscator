/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aTs
 */
public class ats_0
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected short d;
    protected short e;
    protected boolean f;
    protected boolean g;
    protected boolean h;
    protected boolean i;
    protected short j;
    protected int[] k;
    protected int[] l;
    protected att_0[] m;
    protected short n;
    protected int o;
    protected HashMap<Long, int[]> p;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public short f() {
        return this.d;
    }

    public short g() {
        return this.e;
    }

    public boolean h() {
        return this.f;
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.i;
    }

    public short l() {
        return this.j;
    }

    public int[] m() {
        return this.k;
    }

    public int[] n() {
        return this.l;
    }

    public att_0[] o() {
        return this.m;
    }

    public short p() {
        return this.n;
    }

    public int q() {
        return this.o;
    }

    public HashMap<Long, int[]> r() {
        return this.p;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = 0;
        this.o = 0;
        this.p = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.d();
        this.e = asc_22.d();
        this.f = asc_22.c();
        this.g = asc_22.c();
        this.h = asc_22.c();
        this.i = asc_22.c();
        this.j = asc_22.d();
        this.k = asc_22.k();
        this.l = asc_22.k();
        int n2 = asc_22.f();
        this.m = new att_0[n2];
        for (n = 0; n < n2; ++n) {
            this.m[n] = new att_0();
            this.m[n].a(asc_22);
        }
        this.n = asc_22.d();
        this.o = asc_22.f();
        n = asc_22.f();
        this.p = new HashMap(n);
        for (int k = 0; k < n; ++k) {
            long l = asc_22.h();
            int[] nArray = asc_22.k();
            this.p.put(l, nArray);
        }
    }

    @Override
    public final int a() {
        return enK.ah.a();
    }
}

