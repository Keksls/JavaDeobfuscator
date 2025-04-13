/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Lt
 */
public class lt_2
implements kk_1,
ll_2 {
    private final kj_1 a = new kj_1();
    private final float[] b = new float[2];
    private final float[] c = new float[2];
    private final float[] d = new float[2];
    private final float[] e = new float[2];
    private final float[] f = new float[2];

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

    public float[] f() {
        return this.f;
    }

    public void e(float f2, float f3) {
        this.f[0] = f2;
        this.f[1] = f3;
    }

    public String toString() {
        return "ColorFader{" + this.a + ", m_red=" + Arrays.toString(this.b) + ", m_green=" + Arrays.toString(this.c) + ", m_blue=" + Arrays.toString(this.d) + ", m_alpha=" + Arrays.toString(this.e) + ", m_speed=" + Arrays.toString(this.f) + "}";
    }
}

