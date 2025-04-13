/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Lq
 */
public class lq_2
implements ll_2 {
    protected int a;
    protected final float[] b = new float[]{64.0f, 64.0f};
    protected final float[] c = new float[]{64.0f, 64.0f};
    protected final float[] d = new float[]{1.0f, 1.0f};
    protected final float[] e = new float[2];
    protected final float[] f = new float[]{1.0f, 1.0f};
    protected final float[] g = new float[2];
    protected boolean h;
    protected final float[] i = new float[2];
    protected final float[] j = new float[2];
    protected final float[] k = new float[]{1.0f, 1.0f};
    protected final float[] l = new float[2];
    protected final float[] m = new float[]{1.0f, 1.0f};
    protected final float[] n = new float[2];
    protected final float[] o = new float[]{1.0f, 1.0f};
    protected final float[] p = new float[2];
    protected final float[] q = new float[]{1.0f, 1.0f};
    protected final float[] r = new float[2];
    protected final float[] s = new float[2];
    protected final float[] t = new float[2];
    protected final float[] u = new float[2];
    protected float v;
    protected float w;
    protected float x;
    protected float y;
    protected int z;
    protected int A;
    private final int[] B = new int[]{-1, -1};
    private final float[] C = new float[]{1.0f, 1.0f};

    public int a() {
        return this.a;
    }

    public void a(int n) {
        this.a = n;
    }

    public float[] b() {
        return this.b;
    }

    public void a(float f2, float f3) {
        this.b[0] = f2;
        this.b[1] = f3;
    }

    public float[] c() {
        return this.c;
    }

    public void b(float f2, float f3) {
        this.c[0] = f2;
        this.c[1] = f3;
    }

    public float[] d() {
        return this.d;
    }

    public void c(float f2, float f3) {
        this.d[0] = f2;
        this.d[1] = f3;
    }

    public float[] e() {
        return this.e;
    }

    public void d(float f2, float f3) {
        this.e[0] = f2;
        this.e[1] = f3;
    }

    public float[] f() {
        return this.f;
    }

    public void e(float f2, float f3) {
        this.f[0] = f2;
        this.f[1] = f3;
    }

    public float[] g() {
        return this.g;
    }

    public void f(float f2, float f3) {
        this.g[0] = f2;
        this.g[1] = f3;
    }

    public boolean h() {
        return this.h;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public float[] i() {
        return this.i;
    }

    public void g(float f2, float f3) {
        this.i[0] = f2;
        this.i[1] = f3;
    }

    public float[] j() {
        return this.j;
    }

    public void h(float f2, float f3) {
        this.j[0] = f2;
        this.j[1] = f3;
    }

    public float[] k() {
        return this.k;
    }

    public void i(float f2, float f3) {
        this.k[0] = f2;
        this.k[1] = f3;
    }

    public float[] l() {
        return this.l;
    }

    public void j(float f2, float f3) {
        this.l[0] = f2;
        this.l[1] = f3;
    }

    public float[] m() {
        return this.m;
    }

    public void k(float f2, float f3) {
        this.m[0] = f2;
        this.m[1] = f3;
    }

    public float[] n() {
        return this.n;
    }

    public void l(float f2, float f3) {
        this.n[0] = f2;
        this.n[1] = f3;
    }

    public float[] o() {
        return this.o;
    }

    public void m(float f2, float f3) {
        this.o[0] = f2;
        this.o[1] = f3;
    }

    public float[] p() {
        return this.p;
    }

    public void n(float f2, float f3) {
        this.p[0] = f2;
        this.p[1] = f3;
    }

    public float[] q() {
        return this.q;
    }

    public void o(float f2, float f3) {
        this.q[0] = f2;
        this.q[1] = f3;
    }

    public float[] r() {
        return this.r;
    }

    public void p(float f2, float f3) {
        this.r[0] = f2;
        this.r[1] = f3;
    }

    public float[] s() {
        return this.s;
    }

    public void q(float f2, float f3) {
        this.s[0] = f2;
        this.s[1] = f3;
    }

    public float[] t() {
        return this.t;
    }

    public void r(float f2, float f3) {
        this.t[0] = f2;
        this.t[1] = f3;
    }

    public float[] u() {
        return this.u;
    }

    public void s(float f2, float f3) {
        this.u[0] = f2;
        this.u[1] = f3;
    }

    public float v() {
        return this.v;
    }

    public void a(float f2) {
        this.v = f2;
    }

    public float w() {
        return this.w;
    }

    public void b(float f2) {
        this.w = f2;
    }

    public float x() {
        return this.x;
    }

    public void c(float f2) {
        this.x = f2;
    }

    public float y() {
        return this.y;
    }

    public void d(float f2) {
        this.y = f2;
    }

    public int z() {
        return this.z;
    }

    public void b(int n) {
        this.z = n;
    }

    public int A() {
        return this.A;
    }

    public void c(int n) {
        this.A = n;
    }

    public int[] B() {
        return this.B;
    }

    public void a(int n, int n2) {
        this.B[0] = n;
        this.B[1] = n2;
    }

    public float[] C() {
        return this.C;
    }

    public void t(float f2, float f3) {
        this.C[0] = f2;
        this.C[1] = f3;
    }

    public String toString() {
        return "Bitmap{m_bitmapId=" + this.a + ", m_hotX=" + Arrays.toString(this.b) + ", m_hotY=" + Arrays.toString(this.c) + ", m_scaleX=" + Arrays.toString(this.d) + ", m_scaleRandomX=" + Arrays.toString(this.e) + ", m_scaleY=" + Arrays.toString(this.f) + ", m_scaleRandomY=" + Arrays.toString(this.g) + ", m_scaleRandomKeepRatio=" + this.h + ", m_rotation=" + Arrays.toString(this.i) + ", m_rotationRandom=" + Arrays.toString(this.j) + ", m_redColor=" + Arrays.toString(this.k) + ", m_redColorRandom=" + Arrays.toString(this.l) + ", m_greenColor=" + Arrays.toString(this.m) + ", m_greenColorRandom=" + Arrays.toString(this.n) + ", m_blueColor=" + Arrays.toString(this.o) + ", m_blueColorRandom=" + Arrays.toString(this.p) + ", m_alphaColor=" + Arrays.toString(this.q) + ", m_alphaColorRandom=" + Arrays.toString(this.r) + ", m_rotationX=" + Arrays.toString(this.s) + ", m_rotationY=" + Arrays.toString(this.t) + ", m_rotationZ=" + Arrays.toString(this.u) + ", m_textureTop=" + this.v + ", m_textureLeft=" + this.w + ", m_textureBottom=" + this.x + ", m_textureRight=" + this.y + ", m_halfHeight=" + this.z + ", m_halfWidth=" + this.A + "}";
    }
}

