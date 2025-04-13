/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePj
 */
public class epj_0
implements epi_0 {
    public static final int a = 0;
    public static final int b = 1;
    protected final eov_1<epa_1> c;
    protected final eps_0 d;
    protected final int e;
    protected final float f;

    public epj_0(eov_1<epa_1> eov_12, eps_0 eps_02, float f2, int n) {
        this.c = eov_12;
        this.f = f2;
        this.d = eps_02;
        this.e = n;
    }

    @Override
    public void a(epb_0 epb_02, int n) {
        epa_1 epa_12 = this.c.b(this.d);
        block0 : switch (epb_02) {
            case a: {
                int n2 = (int)Math.floor(this.f * (float)n);
                if (epa_12 != null) {
                    switch (this.e) {
                        case 0: {
                            epa_12.c(n2);
                            break;
                        }
                        case 1: {
                            epa_12.g(epa_12.u() + n2);
                        }
                    }
                }
                break;
            }
            case b: {
                if (epa_12 == null) break;
                int n3 = (int)Math.floor(this.f * (float)n);
                switch (this.e) {
                    case 0: {
                        epa_12.d(n3);
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

