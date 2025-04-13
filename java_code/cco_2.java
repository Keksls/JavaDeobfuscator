/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cco
 */
public class cco_2
implements ajh_1 {
    public static final int a = -1;
    public static final int b = -2;
    public static final int d = 1009;
    private static final Logger f = Logger.getLogger(cco_2.class);
    private long g;
    private aeo_0 h;
    private int i = -1;
    private boolean j;
    private ccp_1 k;
    private aoc_0 l;
    private String m;
    private int n;
    private static final cco_2 o = new cco_2();
    public final String e = "zoneName";

    public void a(boolean bl) {
        this.a(bl, 5000);
    }

    private void a(boolean bl, int n) {
        boolean bl2;
        boolean bl3 = bl2 = this.j != bl;
        if (bl2) {
            this.b(n);
        }
        this.j = bl;
        if (bl2) {
            this.h = this.a(this.h);
            cdw_0.n().q();
        }
        if (this.h != null) {
            this.a(this.h.g);
        }
    }

    private void a(int n) {
        if (this.j) {
            n = -2;
        }
        if (n == this.i) {
            return;
        }
        this.g();
        if (n != -1) {
            if (n == -2) {
                this.f();
            } else {
                aNL.a.b(n);
            }
        }
        this.i = n;
    }

    private void f() {
        cbt_1 cbt_12 = cbt_1.a;
        cbt_12.a(fjt_0.h);
        cbt_12.b(0.9f);
        cbt_12.a(true);
        this.k = new ccp_1();
        this.k.a();
    }

    private void b(int n) {
        if (!this.j) {
            return;
        }
        this.k.a(n);
        brf_0 brf_02 = brh_0.a().g().a();
        cbt_1 cbt_12 = cbt_1.a;
        cbt_12.a(false);
        if (brf_02 != null) {
            cbt_12.a(brf_02.h(), n);
            cbt_12.b(brf_02.g());
        }
    }

    private void g() {
        if (this.i != -1) {
            ZI.a.b(this.i);
            aNL.a.a(this.i);
            this.i = -1;
        }
    }

    public void a(long l) {
        ZI.a.a();
        this.g();
        this.g = l;
    }

    private void h() {
        if (this.l == null) {
            return;
        }
        cct_1 cct_12 = ccs_1.a().a((short)yz_0.d());
        float f2 = cct_12 == null ? 0.0f : (float)cct_12.s;
        float f3 = azu_0.j().k().L();
        short s2 = this.l.a();
        short s3 = this.l.b();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (int n4 = -1; n4 < 2; n4 = (int)((short)(n4 + 1))) {
            for (int k = -1; k < 2; ++k) {
                aoc_0 aoc_02 = (aoc_0)aew_0.a().d((short)(s2 + n4), (short)(s3 + k));
                if (aoc_02 == null) continue;
                float f4 = aoc_02.k() * 100.0f;
                n2 += (int)((float)n4 * f4);
                n3 += (int)((float)k * f4);
                n = (int)((float)n + f4);
            }
        }
        n = (int)((float)n / 9.0f);
        afr_2 afr_22 = new afr_2(n2, n3, 0.0f).g();
        cdw_0.n().a(new ceq_0(new alz_1(afr_22.a() * 10.0f, afr_22.b() * 10.0f, f3 - f2, true, 0), cep_0.a, n));
    }

    public void a(int n, int n2) {
        this.l = (aoc_0)aew_0.a().a(n, n2);
        this.h();
        cdr_1.a.a((short)(n / 18), (short)(n2 / 18));
        ZI.a.b();
        aNL.a.b();
    }

    public static cco_2 a() {
        return o;
    }

    private aeo_0 a(aeo_0 aeo_02) {
        if (aeo_02 == null) {
            return null;
        }
        if (!this.j) {
            return aes_0.a().a(aeo_02.a);
        }
        aeo_02 = new aeo_0(aeo_02.a, aeo_02.b, aeo_02.c, aeo_02.d, aeo_02.e, cdg_0.N.a(), -2, aeo_02.h);
        return aeo_02;
    }

    public aeo_0 b() {
        return this.h;
    }

    public void b(int n, int n2) {
        if (this.l == null) {
            return;
        }
        if (!this.l.a(n, n2)) {
            this.l = (aoc_0)aew_0.a().a(n, n2);
            if (this.l != null) {
                this.h();
                cdr_1.a.a(this.l.a(), this.l.b());
            }
        }
        cdr_1.a.a(n, n2);
        int n3 = this.c(n, n2);
        if (this.h != null && n3 == this.h.a) {
            return;
        }
        aes_0 aes_02 = aes_0.a();
        aeo_0 aeo_02 = aes_02.a(n3);
        if (aeo_02 != null) {
            cdw_0 cdw_02 = cdw_0.n();
            cdw_02.a((short)aeo_02.c);
            try {
                if (aeo_02.d) {
                    cdw_02.f(aeo_02.e);
                } else {
                    cdw_02.f(-1);
                }
            }
            catch (Exception exception) {
                f.error((Object)"Exception :", (Throwable)exception);
            }
            String string = bae.h().a(54, (long)n3, new Object[0]);
            if (!string.equals(this.m)) {
                this.m = string;
                this.a(n, n2, n3);
            }
        } else {
            this.m = "";
        }
        fis_1.a().a((ajf_1)this, "zoneName");
        aeo_02 = this.a(aeo_02);
        if (aeo_02 == null ^ this.h == null || aeo_02 != null && aeo_02.f != this.h.f) {
            cdw_0.n().q();
        }
        this.a(aeo_02 == null ? -1 : aeo_02.g);
        this.h = aeo_02;
    }

    private int c(int n, int n2) {
        if (this.l == null) {
            f.error((Object)("La map de coord cell(" + n + "," + n2 + ") n'est pas charg\u00e9e "));
            return -1;
        }
        if (cci_2.a.g()) {
            return 1009;
        }
        return this.l.b(n, n2);
    }

    public final void b(boolean bl) {
        int n;
        if (this.h == null) {
            return;
        }
        abY abY2 = ans_0.D().c().b();
        int n2 = n = bl ? abY2.b() : 0;
        if (this.n == n) {
            return;
        }
        this.n = n;
        if (!bae.h().a(88, (long)n)) {
            return;
        }
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)this.m);
        if (this.n != 0) {
            ani_22.m();
            ani_22.a().a(14);
            ani_22.a((CharSequence)bae.h().a(88, (long)n, new Object[0]));
            ani_22.b();
        }
        this.b(ani_22, 100, this.h.a);
    }

    private boolean a(ani_2 ani_22, int n, int n2) {
        aeo_0 aeo_02 = aes_0.a().a(n2);
        short s2 = aeo_02.h;
        if (s2 <= 0) {
            return false;
        }
        dlx.a().a(new dlu(dly.d, ani_22.r(), n, 2500, s2));
        return true;
    }

    private void b(ani_2 ani_22, int n, int n2) {
        String string = this.c(n2);
        if (string == null) {
            return;
        }
        dlx.a().a(new dlq(dly.c, ani_22.r(), n, 2500, string));
    }

    private void a(int n, int n2, int n3) {
        fgy_0 fgy_02;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.bz() != null) {
            return;
        }
        if (this.m == null || this.m.length() == 0) {
            // empty if block
        }
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)this.m);
        bmf_0 bmf_02 = bme_0.a.a(n, n2);
        ani_22.m();
        if (bmf_02 != null && (fgy_02 = bmf_02.h()) != null) {
            ani_22.a().a(14);
            int n4 = fgy_02.F();
            bUH bUH2 = (bUH)bmr_12.fE();
            faX faX2 = fbc_0.a.a(n4);
            if (faX2 != null) {
                ani_22.a(bUK.a(bUH2, faX2).w());
            } else {
                ani_22.a(bUK.a(bUH2, faX.i).w());
            }
            ani_22.a((CharSequence)bae.h().a(39, (long)n4, new Object[0]));
            ani_22.b();
        }
        if (!this.a(ani_22, 500, n3)) {
            this.b(ani_22, 500, n3);
        }
    }

    private String c(int n) {
        aeo_0 aeo_02 = aes_0.a().a(n);
        cdg_0 cdg_02 = cdg_0.a(aeo_02.f);
        if (cdg_02.b()) {
            return "AnimAmbiance-" + cdg_02.a();
        }
        cct_1 cct_12 = ccs_1.a().a(this.g);
        int n2 = cct_12.d;
        if (n2 == 0) {
            return null;
        }
        return "AnimInstance-" + n2;
    }

    public void c() {
        this.l = null;
        this.m = "";
        this.h = null;
        this.a(false, 0);
        this.g();
    }

    @Override
    public String[] d() {
        return new String[]{"zoneName"};
    }

    @Override
    public Object b(String string) {
        if (string.equalsIgnoreCase("zoneName")) {
            return this.m != null && this.m.length() > 0 ? this.m : null;
        }
        return null;
    }

    public String e() {
        return this.m;
    }
}

