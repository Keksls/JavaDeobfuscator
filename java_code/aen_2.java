/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

/*
 * Renamed from aEN
 */
public class aen_2 {
    protected final double a;
    protected final double b;
    protected final double c;
    protected final Random d;

    public aen_2(double d2, double d3) {
        this(d2, d3, System.currentTimeMillis());
    }

    public aen_2(double d2, double d3, long l) {
        this.a = d2;
        this.b = d3;
        this.c = this.b * this.b;
        this.d = new Hx(l);
    }

    public double a(double d2) {
        double d3 = d2 - this.a;
        double d4 = 1.0 / Math.sqrt(Math.PI * 2 * this.c);
        return d4 * Math.exp(-(d3 * d3) / (2.0 * this.c));
    }

    public double a() {
        double d2 = this.d.nextGaussian();
        return this.a + this.b * d2;
    }

    public String toString() {
        return "CraftDistribution{m_mean=" + this.a + ", m_deviation=" + this.b + ", m_variance=" + this.c + "}";
    }
}

