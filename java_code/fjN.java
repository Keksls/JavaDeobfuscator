/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class fjN {
    private int a;
    private float b;
    private final List<fjP> c = new ArrayList<fjP>();

    public fjN() {
        this(0);
    }

    public fjN(int n) {
        this.d(n);
    }

    public int a() {
        return this.a;
    }

    public float b() {
        return this.b;
    }

    static double a(int n) {
        return (double)(-Integer.signum(n)) * StrictMath.expm1((double)(-Math.abs(n)) / fjO.d);
    }

    public static fjN a(float f2) {
        int n = (int)((double)Math.signum(f2) * fjO.d * StrictMath.log1p(-Math.abs(f2)));
        return new fjN(n);
    }

    private void d(int n) {
        this.b(this.a + n);
    }

    public void b(int n) {
        this.a = fjN.e(n);
        this.b = (float)fjN.a(this.a);
        for (int k = 0; k < this.c.size(); ++k) {
            this.c.get(k).a();
        }
    }

    private static int e(int n) {
        return Hw.a(n, -10000, 10000);
    }

    public void c(int n) {
        int n2 = (int)(fjN.a(this.b, Integer.signum(n)) * (double)n);
        this.d(n2);
    }

    static double a(float f2, int n) {
        if ((float)n * f2 > 0.0f) {
            return 1.0;
        }
        return 1.0 + Math.max(0.0, 4.0 * ((double)Math.abs(f2) - 0.5));
    }

    public boolean a(fjP fjP2) {
        return !this.c.contains(fjP2) && this.c.add(fjP2);
    }

    public boolean b(fjP fjP2) {
        return this.c.remove(fjP2);
    }

    public String toString() {
        return "WakfuGauge{m_actionValue=" + this.a + ", m_userFriendlyValue=" + this.b + "}";
    }
}

