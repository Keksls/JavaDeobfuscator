/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Ls
 */
public class ls_2
implements kk_1,
ll_2 {
    private final kj_1 a = new kj_1();
    private final float[] b = new float[2];

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

    public String toString() {
        return "CirclePath{" + this.a + ", m_radialSpeed=" + Arrays.toString(this.b) + "}";
    }
}

