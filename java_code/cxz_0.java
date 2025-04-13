/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXZ
 */
class cxz_0
implements fsw_0 {
    final /* synthetic */ fvE a;
    final /* synthetic */ fsY b;
    final /* synthetic */ fru_0 c;
    final /* synthetic */ cXX d;

    cxz_0(cXX cXX2, fvE fvE2, fsY fsY2, fru_0 fru_02) {
        this.d = cXX2;
        this.a = fvE2;
        this.b = fsY2;
        this.c = fru_02;
    }

    @Override
    public boolean a() {
        this.a.setVisible(true);
        return false;
    }

    @Override
    public boolean b() {
        int n = this.b.getMapBackgroundStartX();
        int n2 = this.b.getMapBackgroundEndX();
        int n3 = this.b.getMapBackgroundStartY();
        int n4 = this.b.getMapBackgroundEndY();
        ayo_2 ayo_22 = this.b.getMapBackgroundPixmap();
        float f2 = (float)(n2 - n) / (float)ayo_22.e();
        float f3 = (float)(n4 - n3) / (float)ayo_22.d();
        float f4 = (float)this.b.getWidth() / f2;
        float f5 = (float)this.b.getHeight() / f3;
        float f6 = f4 / (float)ayo_22.e();
        float f7 = f5 / (float)ayo_22.d();
        float f8 = f6 * 0.8f;
        das_0.a(this.c, f8);
        int n5 = (int)((float)n * f6);
        int n6 = (int)((float)n3 * f7);
        this.c.setPosition((int)(f4 * 0.933f) - n5, (int)(f5 * 0.433f) - n6);
        return false;
    }
}

