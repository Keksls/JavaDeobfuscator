/*
 * Decompiled with CFR 0.152.
 */
public class bNE
extends bNz {
    private final double e;

    public bNE(boolean bl, long l, double d2, double d3) {
        this(bl, l, d2, d3, false);
    }

    public bNE(boolean bl, long l, double d2, double d3, boolean bl2) {
        super(bl, l, d2, bl2);
        this.e = d3;
    }

    @Override
    public double a(long l) {
        return this.c + (double)(l - this.b) * this.e;
    }

    @Override
    public void a(long l, ftv ... ftvArray) {
    }

    @Override
    public void a(ftv ... ftvArray) {
        long l = (long)((1.0 - this.c) / this.e);
        for (ftv ftv2 : ftvArray) {
            ftv2.setInitialValue(this.a ? 1.0f - (float)this.c : (float)this.c);
            ftv2.setTweenDuration(l);
            ftv2.setValue(this.a ? 0.0f : 1.0f);
        }
    }
}

