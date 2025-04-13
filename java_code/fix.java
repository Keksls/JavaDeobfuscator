/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public final class fix {
    private static final int a = 1;
    private final Map<eps_0, fiq_0> b = new HashMap<eps_0, fiq_0>(1);
    private fiq_0 c;
    private fiq_0 d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private float i;
    private float j;
    private float k;
    private float l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public fix() {
    }

    public fix(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(eps_0.c, f2, f3);
        this.a(eps_0.d, f6, f7);
        this.a(eps_0.e, f4, f5);
    }

    public void a(eps_0 eps_02, float f2, float f3) {
        if (f2 == 0.0f && f3 == 0.0f) {
            return;
        }
        this.b.put(eps_02, new fiq_0(f2, f3));
    }

    public float a(eps_0 eps_02) {
        fiq_0 fiq_02 = this.b.get(eps_02);
        if (fiq_02 == null) {
            return 0.0f;
        }
        return fiq_02.a();
    }

    public float b(eps_0 eps_02) {
        fiq_0 fiq_02 = this.b.get(eps_02);
        if (fiq_02 == null) {
            return 0.0f;
        }
        return fiq_02.b();
    }

    public int a(eps_0 eps_02, int n) {
        fiq_0 fiq_02 = this.b.get(eps_02);
        return fiq_02 == null ? 0 : fiq_02.a(n);
    }

    public Map<eps_0, fiq_0> a() {
        return this.b;
    }

    public fiq_0 b() {
        return this.d;
    }

    public void a(float f2, float f3) {
        this.d = new fiq_0(f2, f3);
    }

    public fiq_0 c() {
        return this.c;
    }

    public void b(float f2, float f3) {
        this.c = new fiq_0(f2, f3);
    }

    public boolean d() {
        return this.e;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public boolean e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public void b(boolean bl) {
        this.f = bl;
    }

    public void c(boolean bl) {
        this.g = bl;
    }

    public boolean g() {
        return this.h;
    }

    public void d(boolean bl) {
        this.h = bl;
    }

    public float h() {
        return this.i;
    }

    public void a(float f2) {
        this.i = f2;
    }

    public float i() {
        return this.j;
    }

    public void b(float f2) {
        this.j = f2;
    }

    public float j() {
        return this.k;
    }

    public void c(float f2) {
        this.k = f2;
    }

    public float k() {
        return this.l;
    }

    public void d(float f2) {
        this.l = f2;
    }

    public boolean l() {
        return this.m;
    }

    public void e(boolean bl) {
        this.m = bl;
    }

    public boolean m() {
        return this.n;
    }

    public void f(boolean bl) {
        this.n = bl;
    }

    public boolean n() {
        return this.o;
    }

    public void g(boolean bl) {
        this.o = bl;
    }

    public boolean o() {
        return this.p;
    }

    public void h(boolean bl) {
        this.p = bl;
    }
}

