/*
 * Decompiled with CFR 0.152.
 */
class fsE
extends fjh_2<Float> {
    private int o;
    final /* synthetic */ fsd_0 a;

    public fsE(fsd_0 fsd_02, Float f2, Float f3, int n, int n2, fjw_2 fjw_22, int n3) {
        this.a = fsd_02;
        super(f2, f3, fsd_02, n, n2, fjw_22);
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
        double d2 = 4.71238898038469;
        double d3 = 1.5707963267948966;
        if (this.o == 0 && (double)f2 >= 1.5707963267948966) {
            ++this.o;
            this.a.g();
        } else if (this.o == 1 && (double)f2 < 1.5707963267948966) {
            this.o = 0;
        }
        this.a.i.a(this.a.p ? afr_2.d : afr_2.e, f2);
        return true;
    }

    @Override
    public void a() {
        super.a();
        this.a.i.a(this.a.p ? afr_2.d : afr_2.e, ((Float)this.k).floatValue());
    }
}

