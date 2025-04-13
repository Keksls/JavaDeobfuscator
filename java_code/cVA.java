/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class cVA
implements ahr_1,
ena_1 {
    protected static final Logger a = Logger.getLogger(cVA.class);
    private static final cVA b = new cVA();
    fbx_1 c;
    fso d;
    ArrayList<fqt> e;
    final LinkedList<String> f = new LinkedList();
    private static final int g = 2500;
    bgm h;
    boolean i;
    boolean j;
    boolean k;
    private cVQ l;
    private Runnable m;
    private int n = -1;
    private cVR o;
    amj_1 p;
    private boolean q;
    private int r = -1;
    private ans_1 s;

    public static cVA h() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            if (this.h == null) {
                a.error((Object)"Impossible de charger l'affichage du donjon arcade, il manque les donn\u00e9es !");
                return;
            }
            bmr_1 bmr_12 = azu_0.j().k();
            bvx_2 bvx_22 = bmr_12.bz();
            if (bvx_22 == null) {
                bmr_12.l(true);
                return;
            }
            this.a(bvx_22);
        }
    }

    public void a(bvx_2 bvx_22) {
        azu_0.j().k().l(false);
        bvx_22.a(this);
        this.s = new cvb_0(this);
        fpm_0.b().a(this.s);
        fis_1.a().a("arcadeDungeon", this.h);
        fpm_0.b().a("arcadeDungeonDialog", cfi_0.a("arcadeDungeonDialog"), 8192L, (short)10000);
        fpm_0.b().a("wakfu.arcadeDungeon", cFB.class);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.r = -1;
            this.l = null;
            this.i = false;
            this.j = false;
            this.k = false;
            if (this.p != null) {
                this.p.f(true);
                this.p.a(0.0f, 100.0f);
                this.p = null;
            }
            ado_1.a().b(this.m);
            fpm_0.b().b(this.s);
            fis_1.a().a("arcadeDungeon");
            fpm_0.b().o("arcadeDungeonDialog");
            fpm_0.b().e("wakfu.arcadeDungeon");
        }
    }

    public void a(int n) {
        this.r = azu_0.j().k().dr();
        this.h = new bgm(bgt.a.b(n));
        this.h.a();
        this.o = new cVR(this);
        azu_0.j().a(b);
    }

    public void a(String string) {
        if (fis_1.a().e("splashText") != null) {
            this.f.addLast(string);
        } else {
            fis_1.a().a("splashText", (Object)string);
            if (!fpm_0.b().q("splashMessageDialog") || this.d == null) {
                this.d = (fso)fpm_0.b().a("splashMessageDialog", cfi_0.a("splashMessageDialog"), 8210L, (short)10000);
            }
            if (this.d != null) {
                if (this.c != null) {
                    this.d.getAppearance().c(this.c);
                }
                this.c = new fbx_1();
                this.c.onCheckOut();
                this.c.setFile("6001037.xps");
                this.c.setAlignment(frs_0.e);
                this.d.getAppearance().add(this.c);
            }
            this.a(true);
        }
    }

    private void o() {
        this.e = new ArrayList();
        fyy_0 fyy_02 = this.d.getElementMap();
        this.e.add(((fvE)fyy_02.a("mainContainer")).getAppearance());
        this.e.add(((fvE)fyy_02.a("text")).getAppearance());
    }

    private void b(boolean bl) {
        fyy_0 fyy_02 = this.d.getElementMap();
        ((fvE)fyy_02.a("mainContainer")).setNonBlocking(bl);
    }

    public void a(boolean bl) {
        int n;
        int n2;
        if (this.d == null) {
            a.warn((Object)"on tente de fade un splashScreen alors qu'il n'est pas charg\u00e9");
            return;
        }
        if (this.e == null) {
            this.o();
        }
        this.b(!bl);
        fyy_0 fyy_02 = this.d.getElementMap();
        fyb_0 fyb_02 = fyy_02.a("mainContainer");
        fqt fqt2 = this.e.get(0);
        if (bl) {
            n2 = azf_2.b.i();
            n = azf_2.e.i();
        } else {
            n2 = azf_2.e.i();
            n = azf_2.b.i();
        }
        if (n2 != n) {
            if (bl) {
                cdw_0.n().z();
            } else {
                cdw_0.n().A();
            }
            azf_2 azf_22 = new azf_2(n2);
            azf_2 azf_23 = new azf_2(n);
            String string = (String)fis_1.a().e("splashText");
            fyb_02.removeTweensOfType(fjo_2.class);
            fjo_2 fjo_22 = new fjo_2(azf_22, azf_23, this.e, 0, 500, 1, fjw_2.b);
            fjo_22.a(new cvg_0(this, bl, string));
            fyb_02.addTween(fjo_22);
        }
    }

    public bgm i() {
        return this.h;
    }

    public void j() {
        if (this.o != null) {
            this.o.b();
        }
        if (fpm_0.b().q("arcadeDungeonResultDialog")) {
            return;
        }
        fvk_0 fvk_02 = (fvk_0)fpm_0.b().a("arcadeDungeonResultDialog", cfi_0.a("arcadeDungeonResultDialog"), 257L, (short)10000);
        fvk_02.a(new cvj_0(this, fvk_02));
        azu_0.j().k().bz().b(this);
        cdw_0.n().c(600137L);
    }

    public void k() {
        if (this.l == cVQ.a) {
            return;
        }
        this.l = cVQ.a;
        fyy_0 fyy_02 = fpm_0.b().h().d("arcadeDungeonResultDialog");
        if (fyy_02 == null) {
            return;
        }
        fuk_0 fuk_02 = (fuk_0)fyy_02.a("monsterCount");
        int n = this.h.j();
        ado_1.a().a(new cVK(this, fuk_02), 50L, n + 1);
        fuk_0 fuk_03 = (fuk_0)fyy_02.a("eventCount");
        int n2 = this.h.l();
        ado_1.a().a(new cVL(this, fuk_03), 50L, n2 + 1);
        fuk_0 fuk_04 = (fuk_0)fyy_02.a("challengeCount");
        int n3 = this.h.i();
        ado_1.a().a(new cVM(this, fuk_04), 50L, n3 + 1);
        ftQ ftQ2 = (ftQ)fyy_02.a("monsterScore");
        ftQ2.setNumber(this.h.k());
        ftQ2.a(new cVN(this, ftQ2));
        ftQ ftQ3 = (ftQ)fyy_02.a("eventScore");
        ftQ3.setNumber(this.h.m());
        ftQ3.a(new cVO(this, ftQ3));
        ftQ ftQ4 = (ftQ)fyy_02.a("challengeScore");
        ftQ4.setNumber(this.h.h());
        ftQ4.a(new cVP(this, ftQ4));
        this.p = cdw_0.n().a(600146L, true);
        if (this.p != null) {
            this.p.c(0.0f);
            this.p.a(1.0f, 100.0f);
        }
    }

    void p() {
        if (this.l == cVQ.b) {
            return;
        }
        this.l = cVQ.b;
        fyy_0 fyy_02 = fpm_0.b().h().d("arcadeDungeonResultDialog");
        if (fyy_02 == null) {
            return;
        }
        ftQ ftQ2 = (ftQ)fyy_02.a("finalScore");
        fsQ fsQ2 = (fsQ)fyy_02.a("rewardsList");
        ftQ2.setNumber(this.h.r());
        ftQ2.a(new cvc_0(this, ftQ2));
        int n = this.h.c();
        if (n > 0) {
            this.m = new cvd_0(this, fsQ2);
            ado_1.a().a(this.m, ftQ2.getTotalDuration() / (long)n, n);
        }
    }

    private void a(fsk_0 fsk_02) {
        azf_2 azf_22 = azf_2.e;
        azf_2 azf_23 = azf_2.b;
        fjp_2 fjp_22 = new fjp_2(azf_22, azf_23, fsk_02, 0, 500, 4, fjw_2.b);
        fjp_22.a(new cve_0(this, fsk_02, fjp_22));
        fsk_02.addTween(fjp_22);
    }

    void q() {
        if (this.l == cVQ.c) {
            return;
        }
        this.l = cVQ.c;
        fyy_0 fyy_02 = fpm_0.b().h().d("arcadeDungeonResultDialog");
        if (fyy_02 == null) {
            return;
        }
        fvE fvE2 = (fvE)fyy_02.a("containerStamp");
        int n = 600131;
        String string = null;
        switch (this.h.u()) {
            case a: {
                string = "6001046.xps";
                n = 600130;
                break;
            }
            case b: {
                string = "6001047.xps";
                n = 600130;
                break;
            }
            case c: {
                string = "6001048.xps";
                n = 600131;
                break;
            }
            case d: {
                string = "6001049.xps";
                n = 600131;
                break;
            }
        }
        if (string == null) {
            return;
        }
        cdw_0.n().c((long)n);
        fbx_1 fbx_12 = new fbx_1();
        fbx_12.onCheckOut();
        fbx_12.setFile(string);
        fbx_12.setAlignment(frs_0.e);
        fvE2.getAppearance().add(fbx_12);
    }

    public void l() {
        this.n = -1;
        this.q = false;
        this.h.e();
        if (this.h.f() == 1) {
            cdw_0.n().c(600136L);
        } else {
            cdw_0.n().c(600147L);
        }
        b.a(bae.h().a("arcadeDungeon.round", this.h.f()));
    }

    public void m() {
        this.h.s();
        String string = bae.h().a("notification.arcadeDungeonWaveTitle", new Object[0]);
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)bae.h().a("notification.arcadeDungeonWaveText", this.h.t()));
        if (this.n == -1 && this.q) {
            this.n = 6;
        }
        if (this.n != -1) {
            --this.n;
            ani_22.m();
            String string2 = bae.h().a("notification.arcadeDungeonRemainingTurnText", this.n);
            ani_22.i().a().a(azf_2.h.x()).a((CharSequence)string2).b().j();
        }
        add_2.b().a(new dhc(string, ani_22.r(), blr_1.g));
    }

    boolean r() {
        return this.i && this.j && this.k;
    }

    public void b(int n) {
        int n2 = this.h.n();
        int n3 = Math.round((float)n2 * 0.2f);
        this.h.c(n3);
        this.f(n3);
        String string = bae.h().a("notification.arcadeDungeonEventSucceededTitle", new Object[0]);
        String string2 = bae.h().a("notification.arcadeDungeonEventSucceededText", bgt.a.c(n), n3);
        add_2.b().a(new dhc(string, string2, blr_1.g));
        this.a(azu_0.j().k(), n3);
    }

    public void c(int n) {
        bgq bgq2 = this.h.a(n);
        bgq2.b(false);
        bgq2.a(true);
        String string = bae.h().a("notification.arcadeDungeonChallengeFailedTitle", new Object[0]);
        String string2 = bae.h().a("notification.arcadeDungeonChallengeFailedText", bgq2.a());
        add_2.b().a(new dhc(string, string2, blr_1.g));
        aul_0.a().c(string2);
    }

    public void d(int n) {
        bgq bgq2 = this.h.a(n);
        bgq2.b(true);
        bgq2.a(true);
        int n2 = bgq2.c();
        this.h.d(n2);
        this.f(n2);
        String string = bae.h().a("notification.arcadeDungeonChallengeSucceededTitle", new Object[0]);
        String string2 = bae.h().a("notification.arcadeDungeonChallengeSucceededText", n2, bgq2.a(), bgq2.b());
        add_2.b().a(new dhc(string, string2, blr_1.g));
        aul_0.a().c(string2);
        this.a(azu_0.j().k(), n2);
    }

    public void e(int n) {
        bgq bgq2 = this.h.a(n);
        bgq2.a(false);
    }

    @Override
    public void b() {
        cdw_0.n().c(600134L);
    }

    @Override
    public void c() {
    }

    @Override
    public void a() {
    }

    @Override
    public void d() {
    }

    @Override
    public void e() {
    }

    @Override
    public void bj_() {
    }

    public void a(epq_2 epq_22) {
    }

    public void b(epq_2 epq_22) {
    }

    public void c(epq_2 epq_22) {
        bmv_1 bmv_12;
        if (epq_22 instanceof bmv_1 && (bmv_12 = (bmv_1)epq_22).f(erl_2.F)) {
            b.a(bae.h().a("arcadeDungeon.boss", bmv_12.dp()));
            cdw_0.n().c(600136L);
            this.q = true;
        }
    }

    public void d(epq_2 epq_22) {
        if (epq_22 instanceof bmv_1) {
            bvx_2 bvx_22 = azu_0.j().k().bz();
            if (bvx_22 == null || bvx_22.z()) {
                return;
            }
            bmv_1 bmv_12 = (bmv_1)epq_22;
            if (!bmv_12.a(erl_2.K)) {
                return;
            }
            int n = bmv_12.da();
            this.h.b(n);
            this.f(n);
            this.a(epq_22, n);
        }
    }

    private void a(epq_2 epq_22, int n) {
        zx_0 zx_02 = new zx_0(0, 20);
        zu_0 zu_02 = new zu_0(ayq_1.a("WCI", 5, 20), "+" + n, zx_02, 3000);
        zu_02.b(azf_2.v.q(), azf_2.v.r(), azf_2.v.s(), azf_2.v.p());
        zu_02.a(epq_22);
        HashSet<za_0> hashSet = zd_0.a().a(epq_22);
        if (hashSet != null) {
            zu_02.g(hashSet.size() * 600);
        }
        zd_0.a().a(zu_02);
    }

    public void e(epq_2 epq_22) {
    }

    public void f(epq_2 epq_22) {
    }

    @Override
    public void a(ekk_0 ekk_02) {
    }

    public void g(epq_2 epq_22) {
        if (epq_22 instanceof bmr_1) {
            this.j();
        }
    }

    @Override
    public void g() {
        this.j();
    }

    private void f(int n) {
        if (n < 1) {
            return;
        }
        int n2 = this.h.o();
        if (this.o == null) {
            this.o = new cVR(this);
        }
        if (this.o.a()) {
            this.o.a(n2, n);
        } else {
            this.o.a(n);
        }
        ado_1.a().a(this.o, (long)Math.max(25, 75 - Math.max(1, this.o.c()) * 25));
    }

    public int n() {
        return this.r;
    }
}

