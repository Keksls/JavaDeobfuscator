/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bTF
 */
public class btf_2
implements agw_0 {
    private static final Logger b = Logger.getLogger(btf_2.class);
    public static final btf_2 a = new btf_2();

    public void a(YK yK) {
        try {
            this.b();
            this.a();
            this.c();
            this.d();
            this.f();
            this.e();
            eta_2.b();
            btc_2.a().b();
        }
        catch (Exception exception) {
            b.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            yK.b(this);
        }
    }

    @Override
    public String m_() {
        return null;
    }

    private void a() {
        asw_2.a().a(new ars_0(), (T ars_02) -> {
            Object object;
            aRT[] aRTArray;
            etz_2 etz_22 = new etz_2((short)ars_02.c(), ars_02.d(), ars_02.e(), ars_02.h(), ars_02.g(), ars_02.i(), ars_02.f(), ars_02.j());
            eti_2.a.a(etz_22);
            for (aRT aRT4 : aRTArray = ars_02.k()) {
                object = new eth_2(aRT4.b(), new aff_1(aRT4.c(), aRT4.d(), aRT4.e()));
                etz_22.a((eth_2)object);
            }
            this.a((ars_0)ars_02, etz_22);
            for (int n : ars_02.m()) {
                object = bgh_0.a().c(n);
                if (object != null) {
                    etz_22.a((efh_0)object);
                    continue;
                }
                b.error((Object)("Probl\u00e8me de chargmeent de Building " + ars_02.c()));
            }
            for (arv_0 arv_02 : ars_02.n()) {
                etz_22.c(arv_02.a());
            }
        });
    }

    private void b() {
        asw_2.a().a(new ary_0(), (T ary_02) -> {
            ety_2 ety_22 = new ety_2((short)ary_02.c(), ary_02.d(), ary_02.e(), ary_02.g(), ary_02.f());
            eti_2.a.a(ety_22);
        });
    }

    private void a(ars_0 ars_02, etz_2 etz_22) {
        aru_0[] aru_0Array = ars_02.l();
        if (aru_0Array.length != 0) {
            acv_1 acv_12 = new acv_1();
            for (aru_0 aru_02 : aru_0Array) {
                acv_12.a(aru_02.a(), aru_02.b());
            }
            etz_22.a(acv_12);
        }
    }

    private void c() {
        asw_2.a().a(new asa_0(), (T asa_02) -> {
            asb_0[] asb_0Array;
            btz_1 btz_12 = new btz_1(asa_02.d());
            bta_2.a.a(btz_12);
            for (asb_0 asb_02 : asb_0Array = asa_02.e()) {
                aff_1 aff_12 = new aff_1(asb_02.h(), asb_02.i(), asb_02.j());
                btz_12.a(new btb_2(asb_02.b(), asb_02.f(), asb_02.c(), asb_02.d(), asb_02.e(), aff_12, aej_2.a(asb_02.g())));
            }
        });
    }

    private void d() {
        asw_2.a().a(new aRW(), (T aRW2) -> {
            etk_2 etk_22 = new etk_2((short)aRW2.c(), aRW2.f(), aRW2.d(), aRW2.e(), aRW2.g(), aRW2.h());
            bte_2.a.a(aRW2.c(), aRW2.j());
            for (aRX aRX2 : aRW2.k()) {
                etk_22.a(aRX2.a(), aRX2.b());
            }
            eti_2.a.a(etk_22);
        });
    }

    private void e() {
        asw_2.a().a(new asc_0(), (T asc_02) -> {
            etn_2 etn_22 = new etn_2((short)asc_02.c(), (short)asc_02.d(), asc_02.e(), asc_02.f(), -1);
            eti_2.a.a(etn_22);
            bte_2.a.b(asc_02.f(), asc_02.g());
        });
    }

    private void f() {
        asw_2.a().a(new aRZ(), (T aRZ2) -> {
            etg_2 etg_22 = new etg_2(aRZ2.d(), (short)aRZ2.e(), (short)aRZ2.f(), aRZ2.g(), aRZ2.h());
            eti_2.a.a(etg_22);
        });
    }
}

