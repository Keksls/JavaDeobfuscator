/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cKB
 */
public class ckb_2
extends fjg_2<int[]> {
    private final float[] o;
    private final float[] p;
    private final float[] q;
    private final int[] r;
    private final int[] s;
    private final int[] t;
    private final csa_1 u;
    final /* synthetic */ ckw_2 a;

    public ckb_2(ckw_2 ckw_22, int[] nArray, int[] nArray2, int[] nArray3, float[] fArray, float[] fArray2, float[] fArray3, int[] nArray4, int[] nArray5, ckw_2 ckw_23, int n, int n2, int n3, fjw_2 fjw_22) {
        this.a = ckw_22;
        this.a(nArray);
        this.b(nArray2);
        this.a(ckw_23);
        this.c(n);
        this.b(n2);
        this.d(n3);
        this.a(fjw_22);
        this.o = fArray;
        this.p = fArray2;
        this.q = fArray3;
        this.s = nArray4;
        this.r = nArray5;
        this.t = nArray3;
        this.u = ckw_22.k.R();
        ckw_22.F = true;
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c != null) {
            int n2;
            int n3;
            Object object;
            int n4;
            int n5 = this.a.getDecorator().getMesh().f().d();
            int[] nArray = (int[])this.j;
            int[] nArray2 = (int[])this.k;
            int n6 = this.a.getDecorator().getMesh().f().e();
            int n7 = this.a.getAppearance().getContentWidth() - n6;
            float[] fArray = new float[this.o.length];
            int[] nArray3 = new int[nArray.length];
            for (n4 = 0; n4 < nArray.length; ++n4) {
                nArray3[n4] = (int)this.c.a(nArray[n4], nArray2[n4], this.d, this.e);
                fArray[n4] = this.c.a(this.o[n4], this.p[n4], this.d, this.e);
            }
            for (n4 = 0; n4 < nArray3.length && n4 < this.a.t.size(); ++n4) {
                fsM fsM2 = this.a.t.get(n4);
                int n8 = frs_0.e.b(fsM2.getHeight(), n5) - n5;
                fsM2.setPosition(frs_0.e.a(fsM2.getWidth(), n6) + 6 + n7, nArray3[n4] + n8);
            }
            n4 = this.a.getDecorator().getMesh().f().d();
            for (ftj_0 ftj_02 : this.a.r) {
                object = ((csa_1)ftj_02.getItemValue()).cn();
                int n9 = object != null ? object.k() : 1;
                n3 = object != null ? object.j() : 0;
                n2 = 0;
                for (int n10 : this.r) {
                    if (n10 == n9) break;
                    ++n2;
                }
                int n11 = frs_0.e.b(ftj_02.getHeight(), n4);
                int n12 = nArray3.length == 0 ? 0 : (n2 == nArray3.length ? nArray3[nArray3.length - 1] - n4 + n11 : nArray3[n2] - n4 + n11);
                int n13 = 0;
                if (n2 + 1 < nArray3.length) {
                    int n10;
                    n10 = nArray3[n2 + 1] - nArray3[n2] - (int)((float)n4 * 0.5f);
                    n13 = (int)((float)n3 / (float)this.a.E * (float)n10);
                }
                ftj_02.setPosition(12 + n7, n12 + n13);
            }
            int n14 = this.a.r.size();
            for (int k = 0; k < n14; ++k) {
                object = this.a.r.get(k);
                ftj_0 ftj_03 = this.a.s.get(k);
                n3 = ((fvE)object).getX() - ((fvE)object).getWidth();
                n2 = ((fvE)object).getY();
                n3 = ckw_2.getAdjustedX(ftj_03, n3, n2, k, this.a.s, this.u);
                ftj_03.setPosition(n3, n2);
                if (ftj_03.getItemValue() != this.u) continue;
                this.a.u.setPosition(n3 - this.a.u.getWidth(), n2);
            }
            this.a.getDecorator().setPixelSeparations(nArray3, this.r, fArray);
        }
        return true;
    }

    @Override
    public void a() {
        int n;
        int n2;
        Object object;
        int n3;
        int[] nArray = this.t;
        int n4 = this.a.getDecorator().getMesh().f().d();
        int n5 = this.a.getDecorator().getMesh().f().e();
        int n6 = this.a.getAppearance().getContentWidth() - n5;
        this.a.getDecorator().setPixelSeparations(nArray, this.s, this.q);
        for (n3 = 0; n3 < nArray.length && n3 < this.a.t.size(); ++n3) {
            fsM fsM2 = this.a.t.get(n3);
            int n7 = frs_0.e.b(fsM2.getHeight(), n4) - n4;
            fsM2.setPosition(frs_0.e.a(fsM2.getWidth(), n5) + 6 + n6, nArray[n3] + n7);
        }
        n3 = this.a.getDecorator().getMesh().f().d();
        for (ftj_0 ftj_02 : this.a.r) {
            object = ((csa_1)ftj_02.getItemValue()).cn();
            int n8 = object != null ? object.k() : 1;
            n2 = object != null ? object.j() : 0;
            n = frs_0.e.b(ftj_02.getHeight(), n3);
            int n9 = 0;
            for (int n10 : this.s) {
                if (n10 == n8) break;
                ++n9;
            }
            int n11 = -n3 + n;
            if (n9 < nArray.length) {
                n11 += nArray[n9];
            }
            int n12 = 0;
            if (n9 + 1 < nArray.length) {
                int n13 = nArray[n9 + 1] - nArray[n9] - (int)((float)n3 * 0.5f);
                n12 = (int)((float)n2 / (float)this.a.E * (float)n13);
            }
            ftj_02.setPosition(12 + n6, n11 + n12);
        }
        int n14 = this.a.r.size();
        for (int k = 0; k < n14; ++k) {
            object = this.a.r.get(k);
            ftj_0 ftj_03 = this.a.s.get(k);
            n2 = ((fvE)object).getX() - ((fvE)object).getWidth();
            n = ((fvE)object).getY();
            n2 = ckw_2.getAdjustedX(ftj_03, n2, n, k, this.a.s, this.u);
            ftj_03.setPosition(n2, n);
            if (ftj_03.getItemValue() != this.u) continue;
            this.a.u.setPosition(n2 - this.a.u.getWidth(), n);
        }
        this.a.e();
        this.a.F = false;
        super.a();
    }
}

