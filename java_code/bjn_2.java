/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJN
 */
public class bjn_2
implements Uo {
    private final long a;
    private final long b;
    private final eyz_0 c;

    public bjn_2(long l, long l2, eyz_0 eyz_02) {
        this.a = l;
        this.b = l2;
        this.c = eyz_02;
    }

    @Override
    public void a(Uk uk) {
        if (!(uk instanceof um_0)) {
            return;
        }
        um_0 um_02 = (um_0)uk;
        exk_2 exk_22 = (exk_2)um_02.c();
        if (um_02.a() != Ui.c) {
            return;
        }
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(this.b);
        if (bmr_12 == null) {
            return;
        }
        if (bmr_12.cG() != this.c) {
            return;
        }
        ul_0 ul_02 = uk.b();
        if (ul_02 == ul_0.a || ul_02 == ul_0.b) {
            um_0 um_03 = (um_0)uk;
            if (um_03.c() instanceof exk_2) {
                bmr_12.cg().a(exk_22, um_03);
                exk_22.P();
                cdw_0.n().a(exh_2.a((byte)um_03.d()));
            }
            int n = exk_22.aT_();
            aln_2.a().c(new bym_0(n));
        } else if (ul_02 == ul_0.c || ul_02 == ul_0.d) {
            ffu_0 ffu_02;
            Object object;
            um_0 um_04 = (um_0)uk;
            if (um_04.c() instanceof exk_2) {
                int n = bmr_12.c(eps_0.b);
                if (exk_22.T().x() != 0) {
                    object = bhe_0.a().a(exk_22.T().x());
                    bmr_12.a(exk_22, (exo_2)object);
                } else {
                    bmr_12.d(exk_22);
                }
                bmr_12.bI();
                bmr_12.a_(eps_0.b).b(n);
                bmr_12.cg().c(exk_22);
                exk_22.P();
            }
            if (exk_22.aQ_() && (ffu_02 = exk_22.f()).a().k() && euv_2.a.b(this.a) == this.b && (object = bmr_12.eE()) instanceof bqi_2) {
                bmr_12.dN();
            }
        }
    }
}

