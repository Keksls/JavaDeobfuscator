/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from avk
 */
public abstract class avk_2 {
    private static int a = 1;
    protected int d = 0;
    protected final avi_2 e = new avi_2(avi_2.a);
    protected final avi_2 f = new avi_2(avi_2.b);
    protected float g;
    protected final float[] h = new float[]{0.0f, 1.0f, 0.0f};
    protected final afr_2 i;
    protected boolean j;
    protected float k = 1.0f;
    protected boolean l = true;
    protected boolean m;
    protected int n;
    protected int o = 0;
    private avl_2 b;

    protected avk_2() {
        this(new afr_2(0.0f, 0.0f, 0.0f));
    }

    protected avk_2(afr_2 afr_22) {
        this(afr_22, 3.0f);
    }

    protected avk_2(afr_2 afr_22, float f2) {
        this.d = a++;
        this.i = afr_22;
        this.g = f2;
    }

    public int d() {
        return this.d;
    }

    public void a(float f2, float f3, float f4) {
        this.h[0] = f2;
        this.h[1] = f3;
        this.h[2] = f4;
    }

    public float e() {
        return this.k;
    }

    public void b(float f2) {
        this.k = f2;
    }

    public boolean f() {
        return this.j;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public void a(int n) {
        if (this.e.d()) {
            this.e.a(n);
        }
        if (this.f.d()) {
            this.f.a(n);
        }
        this.n += n;
        if (this.o > 0 && this.n > this.o) {
            this.o = 0;
            this.n = 0;
            this.m = true;
            if (this.b != null) {
                this.b.a();
            }
        }
    }

    public float g() {
        return this.e.a();
    }

    public float h() {
        return this.e.b();
    }

    public float i() {
        return this.e.c();
    }

    public float j() {
        return this.f.a();
    }

    public float k() {
        return this.f.b();
    }

    public float l() {
        return this.f.c();
    }

    public void b(float f2, float f3, float f4) {
        this.e.a(f2, f3, f4);
    }

    public void c(float f2, float f3, float f4) {
        this.f.a(f2, f3, f4);
    }

    public void d(float f2, float f3, float f4) {
        this.f.a(f2, f3, f4);
    }

    public void a(float f2, float f3, float f4, int n) {
        this.e.a(f2, f3, f4, n);
    }

    public void b(float f2, float f3, float f4, int n) {
        this.f.a(f2, f3, f4, n);
    }

    public afr_2 c() {
        return this.i;
    }

    public void a(afr_2 afr_22) {
        this.i.a(afr_22);
    }

    public float m() {
        return this.g;
    }

    public void a(float f2) {
        assert (f2 >= 0.0f);
        this.g = f2;
    }

    public avi_2 n() {
        return this.e;
    }

    public avi_2 o() {
        return this.f;
    }

    public boolean b() {
        return this.l;
    }

    public void b(boolean bl) {
        this.l = bl;
    }

    public void b(int n) {
        if (this.l) {
            this.n = 0;
            this.o = n;
            this.a(0.0f, 0.0f, 0.0f, n);
            this.b(0.0f, 0.0f, 0.0f, n);
        } else {
            this.m = true;
        }
    }

    public boolean p() {
        return this.m;
    }

    public avl_2 q() {
        return this.b;
    }

    public void a(avl_2 avl_22) {
        this.b = avl_22;
    }
}

