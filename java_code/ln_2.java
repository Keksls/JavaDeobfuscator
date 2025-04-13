/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Ln
 */
public class ln_2
implements kk_1,
ll_2 {
    private final kj_1 a = new kj_1();
    private final float[] b = new float[2];
    private final float[] c = new float[2];
    private final float[] d = new float[2];
    private final float[] e = new float[2];
    private lo_2 f = lo_2.c;

    @Override
    public kj_1 b() {
        return this.a;
    }

    public float[] a() {
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

    public lo_2 f() {
        return this.f;
    }

    public void a(lo_2 lo_22) {
        this.f = lo_22;
    }

    public String toString() {
        return "AttractionForce{" + this.a + ", m_intensity=" + Arrays.toString(this.b) + ", m_offsetX=" + Arrays.toString(this.c) + ", m_offsetY=" + Arrays.toString(this.d) + ", m_offsetZ=" + Arrays.toString(this.e) + ", m_axis=" + this.f + "}";
    }
}

