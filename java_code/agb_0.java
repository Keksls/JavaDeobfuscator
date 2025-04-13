/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from agb
 */
public abstract class agb_0 {
    protected static final float a = 1.0f;
    protected static Logger b = Logger.getLogger(agb_0.class);
    final float[] c;

    public agb_0(float f2, float f3, float f4, float f5) {
        this.c = new float[]{f2, f3, f4, f5};
    }

    public agg_0 a(float f2) {
        assert (f2 >= 0.0f && f2 <= 1.0f);
        if (f2 < this.c[0]) {
            return agg_0.a;
        }
        if (f2 < this.c[1]) {
            return agg_0.b;
        }
        if (f2 < this.c[2]) {
            return agg_0.c;
        }
        if (f2 < this.c[3]) {
            return agg_0.d;
        }
        return agg_0.e;
    }

    public float a(int n, int n2, float f2, agg_0 agg_02) {
        assert (this.a(f2) == agg_02);
        assert (agg_02 != agg_0.a && agg_02 != agg_0.e);
        float f3 = this.a(n, n2, agg_02);
        float f4 = this.b(n, n2, agg_02);
        int n3 = agg_02.ordinal();
        float f5 = (f2 - this.c[n3 - 1]) / (this.c[n3] - this.c[n3 - 1]);
        return Hw.a(f3, f4, f5);
    }

    protected abstract float a(int var1, int var2, agg_0 var3);

    protected abstract float b(int var1, int var2, agg_0 var3);
}

