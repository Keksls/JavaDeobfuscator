/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from LF
 */
public class lf_2
implements ll_2 {
    private lg_2 a;
    private final int[] b = new int[2];
    private boolean c;

    public lg_2 a() {
        return this.a;
    }

    public void a(lg_2 lg_22) {
        this.a = lg_22;
    }

    public int[] b() {
        return this.b;
    }

    public void a(int n, int n2) {
        this.b[0] = n;
        this.b[1] = n2;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public String toString() {
        return "PositionCondition{m_condition=" + this.a + ", m_value=" + Arrays.toString(this.b) + ", m_useSystemAsReference=" + this.c + "}";
    }
}

