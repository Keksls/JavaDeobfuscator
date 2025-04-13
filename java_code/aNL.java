/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

public class aNL {
    private static final azf_2 b = new azf_2(0.8f, 0.4f, 0.5f, 0.8f);
    public static final aNL a = new aNL();
    private final TIntArrayList c = new TIntArrayList();

    private aNL() {
    }

    public void a() {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            aNM.a(this.c.getQuick(k));
        }
        this.c.clear();
    }

    public void a(int n) {
        this.a();
    }

    public void b() {
        this.a();
    }

    public void b(int n) {
        wu_0 wu_02 = wn_0.a.a();
        switch (n) {
            case 42: {
                this.k();
                return;
            }
            case 48: {
                this.d();
                return;
            }
            case 49: {
                this.c();
                return;
            }
            case 50: {
                this.a(cbq_1.f);
                return;
            }
            case 54: {
                aNM.a(new adN(1.0f));
                return;
            }
            case 55: {
                this.a(new adN(1.0f));
                return;
            }
            case 56: {
                this.a(new adM(25, wu_02.h()));
                return;
            }
            case 57: {
                this.c(new adM(adM.a(10, 0.3f, 1.0f), 10, wu_02.h()));
                return;
            }
            case 58: {
                this.d(new adM(adM.a(10, 0.3f, 1.0f), 10, wu_02.h()));
                return;
            }
        }
        int n2 = (int)YX.a();
        switch (n2) {
            case 98: 
            case 99: 
            case 101: 
            case 115: 
            case 141: {
                this.e();
                return;
            }
            case 575: 
            case 576: {
                this.e(new adN(1.0f));
                return;
            }
            case 237: 
            case 240: 
            case 243: 
            case 247: 
            case 248: 
            case 249: 
            case 250: 
            case 251: 
            case 252: 
            case 253: 
            case 254: 
            case 255: 
            case 256: 
            case 257: 
            case 258: 
            case 259: 
            case 301: 
            case 302: {
                this.g();
                return;
            }
            case 210: 
            case 213: 
            case 214: 
            case 215: 
            case 216: 
            case 217: {
                this.h();
                return;
            }
            case 323: {
                this.c();
                return;
            }
            case 327: {
                this.c();
                this.b(b, new cce_2());
                return;
            }
            case 336: 
            case 339: {
                this.a(b);
                return;
            }
            case 370: 
            case 371: {
                this.i();
                return;
            }
            case 524: {
                this.c();
                return;
            }
            case 802: {
                this.b(new adN(1.0f));
                return;
            }
        }
    }

    private void c() {
        this.c.add(aNM.j());
    }

    private void d() {
        this.c.add(aNM.h());
    }

    private void e() {
        this.c.add(aNM.c());
    }

    private void f() {
        aNM.f();
    }

    private void g() {
        aNM.g();
    }

    private void h() {
        this.c.add(aNM.i());
        adD adD2 = new adD();
        adD2.a(this.j().b());
        adD2.a(new aeh_2(-18.0f, 18.0f, -18.0f, 18.0f, -18.0f, 18.0f));
        adD2.c(1000);
        adD2.a(1.0f, 1.0f, 0.0f, 1.0f, 0.1f);
        adD2.a(10.0f, 500.0f, 5000.0f, 0.4f, 2.0f, 0.02f);
        adD2.d(100);
        aui_1.a().a(adD2);
        this.c.add(adD2.f());
    }

    private void a(azj_2 azj_22) {
        this.b(azj_22, new cbq_1());
    }

    private void a(azj_2 azj_22, cbq_1 cbq_12) {
        this.b(azj_22, cbq_12);
    }

    private void b(azj_2 azj_22, cbq_1 cbq_12) {
        cbq_12.a(azj_22);
        cbq_12.a(true);
        cbq_12.a(this.j().b());
        aui_1.a().a(cbq_12);
        this.c.add(cbq_12.f());
    }

    private void a(adN adN2) {
        cbz_2 cbz_22 = new cbz_2();
        cbz_22.a(true);
        cbz_22.a(adN2);
        cbz_22.a(this.j().b());
        aui_1.a().a(cbz_22);
        this.c.add(aNM.d(adN2));
    }

    private void b(adN adN2) {
        this.c.add(aNM.e(adN2));
    }

    private void c(adN adN2) {
        this.c.add(aNM.b(adN2));
    }

    private void d(adN adN2) {
        this.c.add(aNM.c(adN2));
    }

    private void e(adN adN2) {
        cbp_2 cbp_22 = new cbp_2();
        cbp_22.a(true);
        cbp_22.a(adN2);
        cbp_22.a(this.j().b());
        aui_1.a().a(cbp_22);
    }

    private void i() {
        cbt_1.a.a(fjt_0.e);
        cbt_1.a.b(0.9f);
    }

    private ace_0 j() {
        return ans_0.D().c();
    }

    private void f(adN adN2) {
        cbh_1 cbh_12 = new cbh_1();
        cbh_12.a(true);
        cbh_12.a(adN2);
        cbh_12.a(this.j().b());
        aui_1.a().a(cbh_12);
        this.c.add(aNM.f(adN2));
    }

    private void k() {
        adO adO2 = new adO(5000, 17500, 7500);
        adO2.a(0.6f);
        this.c.add(aNM.a(adO2));
        this.c.add(aNM.e());
        this.a(new azf_2(0.6f, 0.6f, 0.6f, 0.4f), new cbi_1());
    }
}

