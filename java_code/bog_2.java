/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from boG
 */
public class bog_2 {
    public static final float a = 0.003921569f;
    private final azj_2 b;

    public bog_2(float f2, float f3, float f4) {
        this.b = new azf_2(f2, f3, f4, 1.0f);
    }

    public bog_2(int n) {
        this.b = new azf_2(n);
    }

    public float a() {
        return this.b.q();
    }

    public float b() {
        return this.b.r();
    }

    public float c() {
        return this.b.s();
    }

    public azj_2 d() {
        return this.b;
    }

    public float[] e() {
        return new float[]{this.a(this.a()), this.a(this.b()), this.a(this.c()), 1.0f};
    }

    private float a(float f2) {
        return Math.max(f2, 0.003921569f) * 1.25f;
    }

    public static void a(bog_2 bog_22, abu abu2, atm_1 atm_12, boolean bl) {
        bog_2.a(bog_22, abu2, atm_12.b(), bl);
    }

    private static void a(bog_2 bog_22, abu abu2, int n, boolean bl) {
        float[] fArray = bog_22 != null ? bog_22.e() : null;
        abu2.a(n, fArray, bl);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        return Objects.equals(this.b, ((bog_2)object).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "CharacterColor{m_color=" + this.b + "}";
    }
}

