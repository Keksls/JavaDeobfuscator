/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Ly
 */
public class ly_2
implements kk_1,
ll_2 {
    private final kj_1 a = new kj_1();
    private final int[] b = new int[2];
    private final int[] c = new int[2];
    private final int[] d = new int[2];
    private final int[] e = new int[2];
    private final int[] f = new int[2];
    private final int[] g = new int[2];
    private final int[] h = new int[2];
    private final float[] i = new float[2];
    private final float[] j = new float[2];
    private final float[] k = new float[2];
    private final float[] l = new float[2];
    private final float[] m = new float[2];
    private final float[] n = new float[2];
    private final float[] o = new float[2];
    private final float[] p = new float[2];
    private final float[] q = new float[2];
    private final float[] r = new float[2];
    private final float[] s = new float[2];
    private final float[] t = new float[2];
    private final int[] u = new int[2];
    private final int[] v = new int[2];
    private boolean w;

    @Override
    public kj_1 b() {
        return this.a;
    }

    public int[] a() {
        return this.b;
    }

    public void a(int n, int n2) {
        this.b[0] = n;
        this.b[1] = n2;
    }

    public int[] c() {
        return this.c;
    }

    public void b(int n, int n2) {
        this.c[0] = n;
        this.c[1] = n2;
    }

    public int[] d() {
        return this.d;
    }

    public void c(int n, int n2) {
        this.d[0] = n;
        this.d[1] = n2;
    }

    public int[] e() {
        return this.e;
    }

    public void d(int n, int n2) {
        this.e[0] = n;
        this.e[1] = n2;
    }

    public int[] f() {
        return this.f;
    }

    public void e(int n, int n2) {
        this.f[0] = n;
        this.f[1] = n2;
    }

    public int[] g() {
        return this.g;
    }

    public void f(int n, int n2) {
        this.g[0] = n;
        this.g[1] = n2;
    }

    public int[] h() {
        return this.h;
    }

    public void g(int n, int n2) {
        this.h[0] = n;
        this.h[1] = n2;
    }

    public float[] i() {
        return this.i;
    }

    public void a(float f2, float f3) {
        this.i[0] = f2;
        this.i[1] = f3;
    }

    public float[] j() {
        return this.j;
    }

    public void b(float f2, float f3) {
        this.j[0] = f2;
        this.j[1] = f3;
    }

    public float[] k() {
        return this.k;
    }

    public void c(float f2, float f3) {
        this.k[0] = f2;
        this.k[1] = f3;
    }

    public float[] l() {
        return this.l;
    }

    public void d(float f2, float f3) {
        this.l[0] = f2;
        this.l[1] = f3;
    }

    public float[] m() {
        return this.m;
    }

    public void e(float f2, float f3) {
        this.m[0] = f2;
        this.m[1] = f3;
    }

    public float[] n() {
        return this.n;
    }

    public void f(float f2, float f3) {
        this.n[0] = f2;
        this.n[1] = f3;
    }

    public float[] o() {
        return this.o;
    }

    public void g(float f2, float f3) {
        this.o[0] = f2;
        this.o[1] = f3;
    }

    public float[] p() {
        return this.p;
    }

    public void h(float f2, float f3) {
        this.p[0] = f2;
        this.p[1] = f3;
    }

    public float[] q() {
        return this.q;
    }

    public void i(float f2, float f3) {
        this.q[0] = f2;
        this.q[1] = f3;
    }

    public float[] r() {
        return this.r;
    }

    public void j(float f2, float f3) {
        this.r[0] = f2;
        this.r[1] = f3;
    }

    public float[] s() {
        return this.s;
    }

    public void k(float f2, float f3) {
        this.s[0] = f2;
        this.s[1] = f3;
    }

    public float[] t() {
        return this.t;
    }

    public void l(float f2, float f3) {
        this.t[0] = f2;
        this.t[1] = f3;
    }

    public int[] u() {
        return this.u;
    }

    public void h(int n, int n2) {
        this.u[0] = n;
        this.u[1] = n2;
    }

    public int[] v() {
        return this.v;
    }

    public void i(int n, int n2) {
        this.v[0] = n;
        this.v[1] = n2;
    }

    public boolean w() {
        return this.w;
    }

    public void a(boolean bl) {
        this.w = bl;
    }

    public String toString() {
        return "Emitter{" + this.a + ", m_levelCondition=" + Arrays.toString(this.b) + ", m_spawnFrequency=" + Arrays.toString(this.c) + ", m_spawnFrequencyRandom=" + Arrays.toString(this.d) + ", m_maxParticlesCount=" + Arrays.toString(this.e) + ", m_maxParticlesPerSpawn=" + Arrays.toString(this.f) + ", m_particleLifeTime=" + Arrays.toString(this.g) + ", m_particleLifeTimeRandom=" + Arrays.toString(this.h) + ", m_particleOffsetX=" + Arrays.toString(this.i) + ", m_particleOffsetRandomX=" + Arrays.toString(this.j) + ", m_particleOffsetY=" + Arrays.toString(this.k) + ", m_particleOffsetRandomY=" + Arrays.toString(this.l) + ", m_particleOffsetZ=" + Arrays.toString(this.m) + ", m_particleOffsetRandomZ=" + Arrays.toString(this.n) + ", m_particleVelocityX=" + Arrays.toString(this.o) + ", m_particleVelocityRandomX=" + Arrays.toString(this.p) + ", m_particleVelocityY=" + Arrays.toString(this.q) + ", m_particleVelocityRandomY=" + Arrays.toString(this.r) + ", m_particleVelocityZ=" + Arrays.toString(this.s) + ", m_particleVelocityRandomZ=" + Arrays.toString(this.t) + ", m_startSpawnTime=" + Arrays.toString(this.u) + ", m_endSpawnTime=" + Arrays.toString(this.v) + ", m_geocentric=" + this.w + "}";
    }
}

