/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from age
 */
public class age_0
extends agb_0 {
    public age_0(float f2, float f3, float f4, float f5) {
        super(f2, f3, f4, f5);
        assert (this.a(-1, 1, agg_0.c) == this.b(-1, 1, agg_0.b));
        assert (this.a(-1, 1, agg_0.d) == this.b(-1, 1, agg_0.c));
    }

    @Override
    public float a(int n, int n2, float f2, agg_0 agg_02) {
        int n3 = n2 - n;
        return (float)n + (float)n3 * f2;
    }

    @Override
    protected float b(int n, int n2, agg_0 agg_02) {
        assert (agg_02 != agg_0.a && agg_02 != agg_0.e);
        switch (agg_02) {
            case b: {
                return (float)n2 + 1.0f;
            }
            case c: {
                return (float)n2 + 1.0f;
            }
            case d: {
                return n2;
            }
        }
        throw new IllegalArgumentException("phase de suat incorrect " + agg_02);
    }

    @Override
    protected float a(int n, int n2, agg_0 agg_02) {
        assert (agg_02 != agg_0.a && agg_02 != agg_0.e);
        switch (agg_02) {
            case b: {
                return n;
            }
            case c: {
                return (float)n2 + 1.0f;
            }
            case d: {
                return (float)n2 + 1.0f;
            }
        }
        throw new IllegalArgumentException("phase de suat incorrect " + agg_02);
    }
}

