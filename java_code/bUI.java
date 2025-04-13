/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

class bUI
extends fbj_0 {
    static final Logger b = Logger.getLogger(bUI.class);
    private final bUJ c = new bUJ(this);
    private static final boolean d = false;
    private static final int e = 3000;
    private long f = -1L;
    private long g = -1L;

    bUI(bUH bUH2) {
        super(bUH2);
    }

    @Override
    public void run() {
        long l = wc_0.p().e();
        int n = this.a.A();
        super.run();
        if (n != this.a.A()) {
            ((bUH)this.a).b(n);
            this.c.a(false);
        }
        if (this.g != -1L) {
            long l2 = this.g();
            daj_0.a().a(3000);
            this.c.a(l2 - this.g);
            this.f = l;
            this.g = -1L;
        }
        if (this.f != -1L && l - this.f > 3000L) {
            this.c.a(0L);
            this.f = -1L;
        }
        if (this.g() <= 0L) {
            this.c();
        }
        this.f();
    }

    @Override
    public void a(int n, int n2) {
        this.g = this.a(n2);
        super.a(n, n2);
    }

    @Override
    public boolean c() {
        b.info((Object)"Purgation de peine termin\u00e9e");
        super.c();
        this.d();
        clb_1 clb_12 = new clb_1();
        clb_12.b(10006703);
        azu_0.j().K().c(clb_12);
        return false;
    }

    @Override
    public void d() {
        b.info((Object)"Purgation de peine stopp\u00e9e");
        bmr_1 bmr_12 = azu_0.j().k();
        ((bUH)bmr_12.fE()).D();
        fis_1.a().a("jailFlag", (Object)null);
        if (azu_0.j().c(daj_0.a())) {
            azu_0.j().b(daj_0.a());
        }
        ado_1.a().b(this);
    }

    @Override
    public void e() {
        b.info((Object)("Purgation de peine d\u00e9marr\u00e9e avec une dur\u00e9e de " + this.g() + "ms"));
        fis_1.a().a("jailFlag", this.c);
        if (!azu_0.j().c(daj_0.a())) {
            azu_0.j().a(daj_0.a());
        }
    }

    public void f() {
        fis_1.a().a((ajf_1)this.c, "remainingTime");
    }

    static /* synthetic */ fda a(bUI bUI2) {
        return bUI2.a;
    }
}

