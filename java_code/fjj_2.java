/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJj
 */
public class fjj_2
extends fjh_2 {
    private final float a;
    private final float o;

    public fjj_2(float f2, float f3, frO frO2, int n, int n2, fjw_2 fjw_22) {
        super(null, null, frO2, n, n2, fjw_22);
        this.a = f2;
        this.o = f3;
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c != null) {
            float f2 = this.c.a(this.a, this.o, this.d, this.e);
            ((frO)this.c()).setScale(f2);
        }
        return true;
    }

    @Override
    public void a() {
        ((frO)this.c()).setScale(this.o);
        super.a();
    }

    public String toString() {
        return "[AnimatedElementViewerScaleTween] (" + this.a + ") -> (" + this.o + ")";
    }
}

