/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJl
 */
public class fjl_2
extends fjh_2<Float> {
    private final fxb_0 a;

    public fjl_2(Float f2, Float f3, fvE fvE2, int n, int n2, fjw_2 fjw_22, fxb_0 fxb_02, int n3) {
        super(f2, f3, fvE2, n, n2, fjw_22);
        this.a = fxb_02;
        this.d(n3);
        this.b(false);
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c == null) {
            return true;
        }
        float f2 = this.c.a(((Float)this.j).floatValue(), ((Float)this.k).floatValue(), this.d, this.e);
        this.a.a(afr_2.f, f2);
        return true;
    }
}

