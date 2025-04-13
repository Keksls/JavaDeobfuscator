/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cdr
 */
public class cdr_1
implements ahk_0 {
    public static final cdr_1 a = new cdr_1();
    private static final Logger b = Logger.getLogger(cdr_1.class);
    private static final float c = 0.01f;
    private static final float d = 2.1f;
    private static final byte e = 0;
    private static final byte f = 1;
    acy_2<cdp_1> g = new acy_2();
    private final acy_2<cds_1> h = new acy_2();
    private int i = Integer.MIN_VALUE;
    private int j = Integer.MIN_VALUE;
    private ahq_0 k;
    private static final afr_2 l = new afr_2();

    private cdr_1() {
        for (cdu_1 cdu_12 : cdu_1.values()) {
            this.h.a(cdu_12.a(), new cds_1(this, cdu_12));
        }
    }

    public void a(short s2, short s3) {
        short s4;
        if (this.k == null) {
            this.k = ans_0.D().c().b();
        }
        if (this.i == s2 && this.j == s3) {
            return;
        }
        this.i = s2;
        this.j = s3;
        acy_2<cdp_1> acy_22 = new acy_2<cdp_1>();
        short s5 = (short)(s2 + 1);
        for (s4 = (short)(s2 - 1); s4 <= s5; s4 = (short)(s4 + 1)) {
            short s6 = (short)(s3 + 1);
            for (short s7 = (short)(s3 - 1); s7 <= s6; s7 = (short)(s7 + 1)) {
                int n = this.b(s4, s7);
                cdp_1 cdp_12 = this.g.g(n);
                if (cdp_12 == null) {
                    try {
                        cdp_12 = new cdp_1(s4, s7);
                    }
                    catch (Exception exception) {
                        continue;
                    }
                }
                acy_22.a(n, cdp_12);
            }
        }
        this.g = acy_22;
        for (s4 = this.h.d() - 1; s4 >= 0; --s4) {
            this.h.h(s4).a(this.g);
        }
    }

    public void a(int n, int n2) {
        for (int k = this.h.d() - 1; k >= 0; --k) {
            cds_1 cds_12 = this.h.h(k);
            if (cds_12.f) {
                if (this.a(cds_12, n, n2) == 0) {
                    this.b(cds_12, n, n2);
                    continue;
                }
                this.c(cds_12, n, n2);
                continue;
            }
            if (cds_12.e == 0) continue;
            cds_12.e = 0;
            cdw_0.n().a(new ceq_0(cds_12.b.b(), cds_12.b.c(), 0));
            b.debug((Object)("Aucune " + cds_12.b + " alentour"));
        }
    }

    private byte a(cds_1 cds_12, int n, int n2) {
        int n3 = this.b((short)XZ.a(n), (short)XZ.b(n2));
        cdp_1 cdp_12 = this.g.g(n3);
        if (cdp_12 == null) {
            return 0;
        }
        int n4 = (n % 18 + 18) % 18;
        int n5 = (n2 % 18 + 18) % 18;
        return cdp_12.b(cds_12.b.a(), n4, n5);
    }

    private void b(cds_1 cds_12, int n, int n2) {
        int n3;
        int n4;
        int n5 = cdp_1.b(n);
        int n6 = cdp_1.b(n2);
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        for (n4 = -1; n4 < 2; ++n4) {
            for (n3 = -1; n3 < 2; ++n3) {
                byte by;
                int n10 = n5 + n4;
                int n11 = n6 + n3;
                int n12 = this.b(cdp_1.f(n10), cdp_1.f(n11));
                cdp_1 cdp_12 = this.g.g(n12);
                if (cdp_12 == null || (by = cdp_12.a(cds_12.b.a(), n10, n11)) <= 0) continue;
                n7 += n4;
                n8 += n3;
                n9 += by;
            }
        }
        l.a(n7, n8, 0.0f);
        l.h();
        n4 = cdp_1.d(n5);
        n3 = cdp_1.d(n6);
        b.debug((Object)("[weight]OrigPos= " + n + ", " + n2));
        b.debug((Object)("[weight]CenterPos= " + n4 + ", " + n3));
        if (cds_12.e == 0) {
            cds_12.c.c((float)n4 + l.a() * 10.0f);
            cds_12.d.c((float)n3 + l.b() * 10.0f);
        } else {
            cds_12.c.e((float)n4 + l.a() * 10.0f);
            cds_12.d.e((float)n3 + l.b() * 10.0f);
        }
        b.debug((Object)("[weight]Pos= " + cds_12.c.b() + ", " + cds_12.d.b()));
        if (n9 == 0) {
            if (cds_12.e != 0) {
                cds_12.e = 0;
                cdw_0.n().a(new ceq_0(cds_12.b.b(), cds_12.b.c(), 0));
                b.debug((Object)("Aucune " + cds_12.b + " alentour"));
            }
        } else if (cds_12.e != 1) {
            cds_12.e = 1;
            cdw_0.n().a(new ceq_0(cds_12.b.b(), cds_12.b.c(), 75));
            b.debug((Object)("D\u00e9tection d'une " + cds_12.b + "\u00e9loign\u00e9e - Force=" + n9));
        }
    }

    private void c(cds_1 cds_12, int n, int n2) {
        int n3;
        int n4;
        int n5 = cdp_1.a(n);
        int n6 = cdp_1.a(n2);
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        for (n4 = -1; n4 < 2; ++n4) {
            for (n3 = -1; n3 < 2; ++n3) {
                int n10 = n5 + n4;
                int n11 = n6 + n3;
                int n12 = this.b(cdp_1.e(n10), cdp_1.e(n11));
                cdp_1 cdp_12 = this.g.g(n12);
                if (cdp_12 == null || !cdp_12.c(cds_12.b.a(), n10, n11)) continue;
                n7 += n4;
                n8 += n3;
                ++n9;
            }
        }
        l.a(n7, n8, 0.0f);
        l.h();
        n4 = cdp_1.c(n5);
        n3 = cdp_1.c(n6);
        b.debug((Object)("[pos]OrigPos= " + n + ", " + n2));
        b.debug((Object)("[pos]CenterPos= " + n4 + ", " + n3));
        if (cds_12.e == 0) {
            cds_12.c.c((float)n4 + l.a() * (float)(10 - n9));
            cds_12.d.c((float)n3 + l.b() * (float)(10 - n9));
        } else {
            cds_12.c.e((float)n4 + l.a() * (float)(10 - n9));
            cds_12.d.e((float)n3 + l.b() * (float)(10 - n9));
        }
        b.debug((Object)("[pos]Pos= " + cds_12.c.b() + ", " + cds_12.d.b()));
        if (cds_12.e != 1) {
            cds_12.e = 1;
            cdw_0.n().a(new ceq_0(cds_12.b.b(), cds_12.b.c(), 75));
            b.debug((Object)("D\u00e9tection d'un " + cds_12.b + " proche - Force=" + n9));
        }
    }

    public void a() {
        this.g.c();
        for (int k = this.h.d() - 1; k >= 0; --k) {
            cds_1 cds_12 = this.h.h(k);
            if (cds_12.e == 0) continue;
            cds_12.e = 0;
            cdw_0.n().a(new ceq_0(cds_12.b.b(), cds_12.b.c(), 0));
        }
        this.i = Integer.MIN_VALUE;
        this.j = Integer.MIN_VALUE;
    }

    private int b(short s2, short s3) {
        return Hw.c(s2, s3);
    }

    public void a(ahg_0 ahg_02, int n) {
        for (int k = this.h.d() - 1; k >= 0; --k) {
            cds_1 cds_12 = this.h.h(k);
            cds_12.c.a(n);
            cds_12.d.a(n);
        }
    }

    public void a(ahg_0 ahg_02, float f2, float f3) {
    }

    final float a(cdu_1 cdu_12) {
        cds_1 cds_12 = this.h.g(cdu_12.a());
        if (cds_12 == null) {
            return 0.0f;
        }
        return cds_12.c.a();
    }

    final float b(cdu_1 cdu_12) {
        cds_1 cds_12 = this.h.g(cdu_12.a());
        if (cds_12 == null) {
            return 0.0f;
        }
        return cds_12.d.a();
    }

    final float c(cdu_1 cdu_12) {
        return this.k.w().c();
    }
}

