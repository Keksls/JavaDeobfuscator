/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJS
 */
public class fjs_1
extends fjh_2 {
    private final int a;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private float t = 2.0f;

    public fjs_1(fvE fvE2, float f2, int n, int n2, fjw_2 fjw_22) {
        super(null, null, fvE2, n, n2, fjw_22);
        this.t = f2;
        this.a = fvE2.getScreenX() + fvE2.getWidth() / 2;
        this.o = fvE2.getScreenY() + fvE2.getHeight() / 2;
        this.p = fvE2.getWidth();
        this.q = fvE2.getHeight();
        this.s = (int)((float)this.q * this.t);
        this.r = (int)((float)this.p * this.t);
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c == null) {
            return true;
        }
        float f2 = this.c.a(azf_2.e.q(), azf_2.b.q(), this.d, this.e);
        float f3 = this.c.a(azf_2.e.r(), azf_2.b.r(), this.d, this.e);
        float f4 = this.c.a(azf_2.e.s(), azf_2.b.s(), this.d, this.e);
        float f5 = this.c.a(azf_2.e.p(), azf_2.b.p(), this.d, this.e);
        azf_2 azf_22 = new azf_2(f2, f3, f4, f5);
        ((fqt)((Object)this.m)).setModulationColor(azf_22);
        int n2 = (int)this.c.a(this.p, this.r, this.d, this.e);
        int n3 = (int)this.c.a(this.q, this.s, this.d, this.e);
        int n4 = this.a - n2 / 2;
        int n5 = this.o - n3 / 2;
        ((fvE)this.m).setSize(n2, n3);
        ((fvE)this.m).setPosition(n4, n5);
        return true;
    }

    @Override
    public void a() {
        ((fqt)((Object)this.m)).setModulationColor(azf_2.b);
        ((fvE)this.m).setSize(this.r, this.s);
        ((fvE)this.m).setPosition(this.a - this.r / 2, this.o - this.s / 2);
        super.a();
    }
}

