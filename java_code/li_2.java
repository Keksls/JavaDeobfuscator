/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from LI
 */
public class li_2
implements kk_1,
ll_2 {
    private final kj_1 a = new kj_1();
    private final float[] b = new float[2];
    private final float[] c = new float[2];
    private final float[] d = new float[2];

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

    public String toString() {
        return "Rotation{" + this.a + ", m_rotationX=" + Arrays.toString(this.b) + ", m_rotationY=" + Arrays.toString(this.c) + ", m_rotationZ=" + Arrays.toString(this.d) + "}";
    }
}

