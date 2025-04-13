/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJm
 */
public class fjm_2
extends fjh_2<Float> {
    private final fxb_0 a;

    public fjm_2(Float f2, Float f3, fvE fvE2, int n, int n2, fjw_2 fjw_22, fxb_0 fxb_02, int n3) {
        super(f2, f3, fvE2, n, n2, fjw_22);
        this.a = fxb_02;
        this.d(n3);
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
        this.a.a(f2, f2, 1.0f);
        return true;
    }

    @Override
    public void a() {
        super.a();
        this.a.a(((Float)this.k).floatValue(), 1.0f, 1.0f);
    }
}

