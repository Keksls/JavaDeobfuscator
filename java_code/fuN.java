/*
 * Decompiled with CFR 0.152.
 */
public class fuN
extends fjh_2<Float> {
    public fuN(Float f2, Float f3, ful_0 ful_02, int n, int n2, fjw_2 fjw_22) {
        super(f2, f3, ful_02, n, n2, fjw_22);
    }

    public ful_0 b() {
        return (ful_0)super.c();
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c != null) {
            float f2 = this.c.a(((Float)this.j).floatValue(), ((Float)this.k).floatValue(), this.d, this.e);
            this.b().setZoom(f2);
        }
        return true;
    }

    @Override
    public void a() {
        this.b().setZoom(((Float)this.k).floatValue());
    }

    @Override
    public /* synthetic */ fvE c() {
        return this.b();
    }
}

