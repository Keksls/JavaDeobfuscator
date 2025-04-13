/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePl
 */
public final class epl_1
extends epj_0 {
    private final int g;
    private int h;

    public epl_1(eov_1<epa_1> eov_12, eps_0 eps_02, float f2, int n, int n2) {
        super(eov_12, eps_02, f2, n);
        this.g = n2;
    }

    @Override
    public void a(epb_0 epb_02, int n) {
        epa_1 epa_12 = (epa_1)this.c.b(this.d);
        if (epa_12 == null) {
            return;
        }
        block0 : switch (epb_02) {
            case a: {
                int n2 = (int)Math.floor(this.f * (float)n);
                n2 = Math.min(n2, this.g - this.h);
                if (n2 <= 0) {
                    return;
                }
                switch (this.e) {
                    case 0: {
                        this.h += epa_12.c(n2);
                        break;
                    }
                    case 1: {
                        epa_12.g(epa_12.u() + n2);
                    }
                }
                break;
            }
            case b: {
                int n3 = (int)Math.floor(this.f * (float)n);
                n3 = Math.min(n3, this.h);
                if (n3 <= 0) {
                    return;
                }
                switch (this.e) {
                    case 0: {
                        this.h -= epa_12.d(n3);
                        break block0;
                    }
                    case 1: {
                        epa_12.g(epa_12.u() - n3);
                    }
                }
            }
        }
    }
}

