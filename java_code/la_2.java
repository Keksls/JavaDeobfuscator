/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from LA
 */
public class la_2
implements ll_2 {
    private final int[] a = new int[2];
    private final int[] b = new int[2];

    public int[] a() {
        return this.a;
    }

    public void a(int n, int n2) {
        this.a[0] = n;
        this.a[1] = n2;
    }

    public int[] b() {
        return this.b;
    }

    public void b(int n, int n2) {
        this.b[0] = n;
        this.b[1] = n2;
    }

    public String toString() {
        return "LifeCondition{m_lifeEnd=" + Arrays.toString(this.a) + ", m_lifeStart=" + Arrays.toString(this.b) + "}";
    }
}

