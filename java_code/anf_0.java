/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anf
 */
public class anf_0 {
    private long[] a;
    private byte[] b;
    private float[] c;
    private float[] d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private int i;

    public anf_0() {
    }

    public anf_0(arf_1 arf_12) {
        this.a(arf_12);
    }

    public void a(arf_1 arf_12) {
        int n = arf_12.c();
        this.a = new long[n];
        this.b = new byte[n];
        this.c = new float[n];
        this.d = new float[n];
        for (int k = 0; k < n; ++k) {
            this.a[k] = arf_12.j();
            this.b[k] = arf_12.a();
            if (!arf_12.l()) continue;
            this.c[k] = arf_12.d();
            this.d[k] = arf_12.d();
        }
        this.e = arf_12.l();
        this.f = arf_12.c();
        this.g = arf_12.c();
        this.h = arf_12.l();
        this.i = arf_12.c();
    }

    public void a(gk_0 gk_02) {
        int n = this.a != null ? this.a.length : 0;
        gk_02.a(n);
        for (int k = 0; k < n; ++k) {
            gk_02.c(this.a[k]);
            gk_02.a(this.b[k]);
            if (this.c[k] != this.d[k] || this.c[k] != 0.0f) {
                gk_02.a(true);
                gk_02.a(this.c[k]);
                gk_02.a(this.d[k]);
                continue;
            }
            gk_02.a(false);
        }
        gk_02.a(this.e);
        gk_02.a(this.f);
        gk_02.a(this.g);
        gk_02.a(this.h);
        gk_02.a(this.i);
    }

    public long[] a() {
        return this.a;
    }

    public byte[] b() {
        return this.b;
    }

    public boolean c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }

    public boolean f() {
        return this.h;
    }

    public int g() {
        return this.i;
    }

    public void a(int n) {
        this.i = n;
    }

    public void a(long[] lArray) {
        this.a = lArray;
    }

    public void a(byte[] byArray) {
        this.b = byArray;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public void b(int n) {
        this.f = n;
    }

    public void c(int n) {
        this.g = n;
    }

    public void b(boolean bl) {
        this.h = bl;
    }

    public void a(float[] fArray) {
        this.d = fArray;
    }

    public float[] h() {
        return this.d;
    }

    public void b(float[] fArray) {
        this.c = fArray;
    }

    public float[] i() {
        return this.c;
    }

    public boolean j() {
        if (this.a == null) {
            return this.b == null;
        }
        return this.b().length == this.a().length;
    }

    public boolean k() {
        if (this.a == null) {
            return this.c == null;
        }
        if (this.c == null) {
            return false;
        }
        return this.i().length == this.a().length;
    }

    public boolean l() {
        if (this.a == null) {
            return this.d == null;
        }
        if (this.d == null) {
            return false;
        }
        return this.h().length == this.h().length;
    }
}

