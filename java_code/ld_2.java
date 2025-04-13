/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from LD
 */
public class ld_2
implements kk_1,
ll_2 {
    private final kj_1 a = new kj_1();
    private final float[] b = new float[2];
    private final float[] c = new float[2];
    private final float[] d = new float[2];
    private boolean e = true;

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

    public boolean e() {
        return this.e;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public String toString() {
        return "LinearForce{" + this.a + ", m_forceX=" + Arrays.toString(this.b) + ", m_forceY=" + Arrays.toString(this.c) + ", m_forceZ=" + Arrays.toString(this.d) + ", m_applyOnVelocity=" + this.e + "}";
    }
}

