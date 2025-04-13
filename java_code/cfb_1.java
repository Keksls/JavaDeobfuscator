/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cfB
 */
public class cfb_1
implements ahr_1 {
    private static final Logger b = Logger.getLogger(cfb_1.class);
    public static final cfb_1 a = new cfb_1();
    private bpz_2 c;

    private static void a(cus_2 cus_22) {
        esm_2 esm_22 = cus_22.e();
        byte[] byArray = cus_22.b();
        byte[] byArray2 = cus_22.c();
        long[] lArray = cus_22.d();
        cci_2.a.a(esm_22);
        cci_2.a.a(byArray);
        cci_2.a.b(byArray2);
        cci_2.a.a(esm_22.g(), lArray);
    }

    private void a(cuw_1 cuw_12) {
        etk_1 etk_12;
        try {
            etk_12 = etl_1.a.a(cuw_12.b());
        }
        catch (etf_1 etf_12) {
            b.error((Object)"Exception raised", (Throwable)etf_12);
            return;
        }
        etk_12.b(cuw_12.c());
    }

    private static void a(esz_1 esz_12) {
        String string = null;
        switch (esz_12) {
            case n: {
                if (azu_0.j().c(ddZ.d())) {
                    string = "havenWorldErrorWait";
                    break;
                }
                string = "havenWorldMoneyNeeded";
                break;
            }
            case b: 
            case c: {
                string = "havenWorldErrorWait";
                break;
            }
            case A: 
            case r: 
            case z: 
            case B: 
            case G: 
            case H: 
            case t: {
                b.error((Object)"L'action dans l'\u00e9diteur de havre monde a \u00e9chou\u00e9 !");
                string = "havenWorldErrorWait";
                azu_0.j().b(ddZ.d());
                break;
            }
            case F: {
                b.error((Object)"L'action dans l'\u00e9diteur de havre monde a \u00e9chou\u00e9 !");
                string = "havenWorld.error.iePresent";
                break;
            }
            case o: 
            case m: {
                b.error((Object)"L'action dans l'\u00e9diteur de havre monde a \u00e9chou\u00e9 ! hack?");
                string = "havenWorldErrorWait";
                azu_0.j().b(ddZ.d());
                break;
            }
            case E: {
                b.error((Object)"L'action dans l'\u00e9diteur de havre monde a \u00e9chou\u00e9 !");
                string = "havenWorldErrorMovingBuilding";
                ddZ.d().f();
                break;
            }
            default: {
                b.error((Object)("Code d'erreur d'havre monde non g\u00e9r\u00e9 " + esz_12));
            }
        }
        if (string != null) {
            fpm_0.b().a(bae.h().a(string, new Object[0]), cfn_0.a(8), 1027L, 7, 1);
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 12447: {
                cus_2 cus_22 = (cus_2)adt_12;
                cfb_1.a(cus_22);
                return false;
            }
            case 12823: {
                cuh_1 cuh_12 = (cuh_1)adt_12;
                this.a(cuh_12);
                return false;
            }
            case 12610: {
                cuu_1 cuu_12 = (cuu_1)adt_12;
                this.a(cuu_12);
                return false;
            }
            case 12566: {
                this.a((cuy_2)adt_12);
                return false;
            }
            case 13095: {
                this.a((cuv_1)adt_12);
                return false;
            }
            case 13254: {
                cua_1 cua_12 = (cua_1)adt_12;
                esl_1 esl_12 = cua_12.b();
                if (cua_12.c() != esz_1.a) {
                    String string = bae.h().a("havenWorldForbidden", new Object[0]);
                    fpm_0.b().a(string, cfn_0.a(8), 1027L, 102, 1);
                    return false;
                }
                if (this.c == null) {
                    return false;
                }
                this.c.i().a(esl_12);
                if (this.c.g()) {
                    this.c.a();
                } else {
                    this.c.a(false, true);
                }
                return false;
            }
            case 12546: {
                cuf_1 cuf_12 = (cuf_1)adt_12;
                esz_1 esz_12 = cuf_12.c();
                if (esz_12 == esz_1.a) {
                    esl_2 esl_22 = cuf_12.b();
                    if (azu_0.j().c(ddZ.d())) {
                        ddZ.d().a(esl_22);
                    }
                } else {
                    if (azu_0.j().c(ddZ.d())) {
                        esl_2 esl_23 = cuf_12.b();
                        ddZ.d().a(esl_23, esz_12);
                    }
                    cfb_1.a(esz_12);
                    return false;
                }
                ddZ.d().i();
                return false;
            }
            case 13832: {
                cui_1 cui_12 = (cui_1)adt_12;
                if (this.c == null || this.c.i() == null) {
                    return false;
                }
                esl_1 esl_13 = this.c.i().a();
                if (esl_13.a() != cui_12.b()) {
                    return false;
                }
                esn_1 esn_12 = new esn_1(esl_13);
                esn_12.c(cui_12.c());
                return false;
            }
            case 15705: {
                cas_0 cas_02 = (cas_0)adt_12;
                long l = cas_02.b();
                ddZ.d().c(l);
                if (azu_0.j().c(ddZ.d())) {
                    ddZ.d().f();
                }
                return false;
            }
            case 13256: {
                this.a((cuw_1)adt_12);
                return false;
            }
            case 1173: {
                cat_0 cat_02 = (cat_0)adt_12;
                List<esm_2> list = cat_02.b();
                cza_0.a().a(list);
                cza_0.a().a(cat_02.c());
                return false;
            }
            case 12745: {
                cuz_2 cuz_22 = (cuz_2)adt_12;
                String string = bae.h().a("notification.havenWorld.closingText", cuz_22.b());
                dbo_0.a.a(string, 8);
            }
        }
        return true;
    }

    private void a(cuv_1 cuv_12) {
        ccy_2 ccy_22 = cci_2.a.e();
        ccy_22.a(cuv_12.b(), cuv_12.c());
    }

    private void a(cuu_1 cuu_12) {
        ccy_2 ccy_22 = cci_2.a.e();
        ccy_22.a(cuu_12.b());
    }

    private void a(cuy_2 cuy_22) {
        ccy_2 ccy_22 = cci_2.a.e();
        ccy_22.a(cuy_22.b());
    }

    private void a(cuh_1 cuh_12) {
        short s2 = cuh_12.b();
        short s3 = cuh_12.c();
        short s4 = cuh_12.d();
        short s5 = cuh_12.e();
        short s6 = cuh_12.f();
        short s7 = cuh_12.g();
        ccy_2 ccy_22 = cci_2.a.e();
        ccy_22.a(s2, s3, s4, s5, s6, s7);
        if (this.c == null || this.c.i() == null) {
            return;
        }
        esl_1 esl_12 = this.c.i().a();
        esn_1 esn_12 = new esn_1(esl_12);
        if (esl_12.a(s2, s3) == null) {
            esn_12.a(s2, s3);
        }
        esn_12.b(s2, s3, s4, s5, s6, s7);
        if (azu_0.j().c(ddZ.d())) {
            ddZ.d().f();
        }
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    public void a(bpz_2 bpz_22) {
        this.c = bpz_22;
    }
}

