/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJn
 */
public class fjn_2
extends fjh_2 {
    private final float a;
    private final float o;

    public fjn_2(float f2, float f3, fsQ fsQ2, int n, int n2, fjw_2 fjw_22) {
        super(null, null, fsQ2, n, n2, fjw_22);
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
            ((fsQ)this.c()).setListOffset(f2);
        }
        return true;
    }

    @Override
    public void a() {
        ((fsQ)this.c()).setListOffset(this.o);
        super.a();
    }

    public String toString() {
        return "[ListOffsetTween] (" + this.a + ") -> (" + this.o + ")";
    }
}

