/*
 * Decompiled with CFR 0.152.
 */
public class bND
extends bNz {
    private static final short e = 500;
    private long f;
    private boolean g;
    private final float h;
    private final float i;

    public bND(boolean bl, long l, double d2) {
        super(bl, l, d2, false);
        this.h = this.a ? 1.0f - (float)this.c : (float)this.c;
        this.i = Hw.b(this.a ? this.h * 0.9f : this.h * 1.1f, 0.0f, 1.0f);
    }

    @Override
    public void a(ftv ... ftvArray) {
        for (ftv ftv2 : ftvArray) {
            ftv2.setTweenDuration(0L);
            ftv2.setTweenFunction(fjw_2.b);
            ftv2.setInitialValue(this.h);
        }
        this.f = this.b - 500L;
        this.g = true;
    }

    @Override
    public void a(long l, ftv ... ftvArray) {
        if (this.f + 500L <= l) {
            this.f += 500L;
            for (ftv ftv2 : ftvArray) {
                ftv2.setTweenDuration(Math.max(0L, this.f - l + 500L));
                ftv2.setValue(this.g ? this.i : this.h);
            }
            this.g = !this.g;
        }
    }

    @Override
    public double a(long l) {
        return this.c;
    }
}

