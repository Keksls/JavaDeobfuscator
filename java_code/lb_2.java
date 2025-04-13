/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from LB
 */
public class lb_2
implements kk_1,
ll_2 {
    private final kj_1 a = new kj_1();
    private final float[] b = new float[]{1.0f, 1.0f};
    private final float[] c = new float[]{1.0f, 1.0f};
    private final float[] d = new float[]{1.0f, 1.0f};
    private final float[] e = new float[2];
    private final float[] f = new float[]{3.0f, 3.0f};

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
        return "EditableLight{" + this.a + ", m_colorRed=" + Arrays.toString(this.b) + ", m_colorGreen=" + Arrays.toString(this.c) + ", m_colorBlue=" + Arrays.toString(this.d) + ", m_intensity=" + Arrays.toString(this.e) + ", m_range=" + Arrays.toString(this.f) + "}";
    }
}

