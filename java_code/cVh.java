/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class cVh
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cVh.class);
    static final cVh i = new cVh();
    private bia_1 j;
    protected biw_2 b;
    final Deque<biw_2> c = new LinkedList<biw_2>();
    protected fso d;
    private ArrayList<fqt> k;
    protected fbx_1 e;
    private biq_2 l;
    private long m;
    protected static final int f = 10000;
    protected final ArrayList<biw_2> g = new ArrayList(3);
    protected cvo_0 h = cvo_0.b;

    public boolean a() {
        return this.h == cvo_0.a || this.h == cvo_0.c;
    }

    public boolean c() {
        return this.h == cvo_0.a || this.h == cvo_0.b;
    }

    public boolean d() {
        if (this.j == null) {
            return false;
        }
        return this.j.c();
    }

    public static cVh e() {
        return i;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19582: {
                dfe_0 dfe_02 = (dfe_0)adt_12;
                bin_2 bin_22 = dfe_02.k();
                cVh.a(null);
                if (bin_22 == null || bin_22 instanceof bix_2) {
                    bin_22 = this.j.f();
                }
                this.j.a(bin_22);
                return false;
            }
            case 18114: {
                dff_0 dff_02 = (dff_0)adt_12;
                biw_2 biw_22 = dff_02.k();
                this.c(biw_22);
                return false;
            }
            case 18390: {
                anw_1 anw_12 = (anw_1)adt_12;
                this.m = anw_12.d();
                bin_2 bin_23 = this.j.g();
                if (fpm_0.b().q("questDialog")) {
                    this.j = biz_2.a.b(this.m);
                } else if (fpm_0.b().q("achievementsDialog")) {
                    this.j = biz_2.a.c(this.m);
                }
                this.j.a(this.j.b(bin_23.g()));
                fis_1.a().a("achievementsManager", this.j);
                biw_2 biw_23 = (biw_2)fis_1.a().e("selectedAchievement");
                if (biw_23 != null) {
                    biw_2 biw_24 = biz_2.a.b(this.m, biw_23.i());
                    this.c(biw_24);
                }
                return false;
            }
            case 18531: {
                anw_1 anw_13 = (anw_1)adt_12;
                int n = anw_13.c();
                boolean bl = anw_13.i();
                cVh.a(n, bl);
                return false;
            }
            case 16906: {
                anw_1 anw_14 = (anw_1)adt_12;
                int n = anw_14.c();
                bmr_1 bmr_12 = azu_0.j().k();
                if (!bmr_12.dE().d()) {
                    aUh.b("chat.notify.questSharedWithNobody", new Object[0]);
                } else {
                    clf_0 clf_02 = new clf_0(n);
                    azu_0.j().K().c(clf_02);
                }
                return false;
            }
            case 17688: {
                anw_1 anw_15 = (anw_1)adt_12;
                int n = anw_15.c();
                azu_0.j().k().eK().x(n);
                return false;
            }
        }
        return true;
    }

    public static void a(int n, boolean bl) {
        bhr_1 bhr_12 = azu_0.j().k().eK();
        boolean bl2 = bhr_12.a(n, bl);
        if (bl2 && !bhr_12.p(n)) {
            cVh.b(n, bl);
        }
    }

    private static void b(int n, boolean bl) {
        cle_1 cle_12 = new cle_1(n, bl);
        azu_0.j().K().c(cle_12);
    }

    private boolean c(biw_2 biw_22) {
        if (biw_22 == null) {
            biw_22 = this.j.e();
            this.j.a(this.j.f());
        }
        if (biw_22 == null) {
            return true;
        }
        cVh.a(biw_22);
        fis_1.a().a("overQuickAchievement", biw_22);
        fis_1.a().a((ajf_1)this.j.g(), "achievementsQuickList");
        return false;
    }

    public static boolean f() {
        boolean bl = !fbf_2.a().a("followedAchievementsDialog") || fbf_2.a().b("followedAchievementsDialog");
        String string = bl ? "verticalFollowedAchievementsDialog" : "followedAchievementsDialog";
        return fpm_0.b().q(string);
    }

    public static void a(boolean bl) {
        String string;
        boolean bl2 = !fbf_2.a().a("followedAchievementsDialog") || fbf_2.a().b("followedAchievementsDialog");
        String string2 = string = bl2 ? "verticalFollowedAchievementsDialog" : "followedAchievementsDialog";
        if (bl) {
            dem.a();
            fvk_0 fvk_02 = (fvk_0)fpm_0.b().a(string, cfi_0.a(string), 40976L, (short)10000);
            fbf_2.a().a(fvk_02, false);
            fvk_02.setEnableResizeEvents(true);
            fvk_02.setHorizontalDialog("followedAchievementsDialog");
            fvk_02.setVerticalDialog("verticalFollowedAchievementsDialog");
            fvk_02.addEventListener(frd_0.P, new cVi(fvk_02), false);
            fpm_0.b().a("wakfu.followedAchievements", cHa.class);
        } else {
            fpm_0.b().a(string, true);
            fpm_0.b().e("wakfu.followedAchievements");
        }
    }

    public static void a(int n) {
        ado_1.a().a(new cVj(n), 500L, 1);
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
        if (bl) {
            return;
        }
        this.m = azu_0.j().k().a_();
        cgu_2.a().a(this);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.b = null;
        this.k = null;
        this.d = null;
        fpm_0.b().o("achievementUnlockedDialog");
        this.k();
        cgu_2.a().b(this);
    }

    public void b(boolean bl) {
        if (bl) {
            if (fpm_0.b().q("questDialog")) {
                cVh.d(true);
            } else {
                this.a(true, this.b);
            }
        } else if (fpm_0.b().q("achievementsDialog")) {
            cVh.d(false);
        } else {
            this.a(false, this.b);
        }
    }

    private void k() {
        this.j = null;
        this.b = null;
        this.l = null;
        this.c.clear();
        this.e = null;
        fis_1.a().a("achievementsManager");
        fis_1.a().a("selectedAchievement");
        fis_1.a().a("overQuickAchievement");
        fpm_0.b().e("wakfu.achievements");
    }

    private static void d(boolean bl) {
        fpm_0.b().o(bl ? "questDialog" : "achievementsDialog");
        cdw_0.n().c(600046L);
    }

    public void a(boolean bl, biw_2 biw_22) {
        biw_2 biw_23;
        String string;
        String string2;
        bmr_1 bmr_12 = azu_0.j().k();
        this.m = bmr_12.a_();
        this.h = cvo_0.b;
        if (bl) {
            this.j = biz_2.a.b(this.m);
            string2 = "questDialog";
            string = "achievementsDialog";
        } else {
            this.j = biz_2.a.c(this.m);
            string2 = "achievementsDialog";
            string = "questDialog";
        }
        if (biw_22 == null) {
            biw_23 = null;
        } else {
            biw_2 biw_24 = biw_23 = bl == biw_22.a() ? biw_22 : null;
        }
        if (biw_23 != null) {
            this.j.a(biz_2.a.c(this.m, biw_23.v()));
        }
        fis_1.a().a("selectedAchievement", biw_23);
        fis_1.a().a("overQuickAchievement", biw_23);
        fis_1.a().a("achievementsManager", this.j);
        if (fpm_0.b().q(string)) {
            fpm_0.b().o(string);
        }
        if (!fpm_0.b().q(string2)) {
            fpm_0.b().a(string2, cfi_0.a(string2), 1L, (short)10000);
        }
        fis_1.a().a("displayedAchievement", (Object)biw_23, string2);
        bmk_1 bmk_12 = bzg_1.a.a(bmr_12);
        fis_1.a().a("characterSheet", (Object)bmk_12, string2);
        fpm_0.b().a("wakfu.achievements", cfp_0.class);
        cdw_0.n().c(600045L);
    }

    public void a(bim_2 bim_22) {
        op_0 op_02;
        boolean bl = false;
        if (!fpm_0.b().q("questDescriptionDialog")) {
            fpm_0.b().a("questDescriptionDialog", cfi_0.a("questDescriptionDialog"), 1L, (short)10000);
            bl = true;
        }
        int n = bim_22.i();
        op_0 op_03 = op_02 = bim_22.h() == 1 ? OQ.a.b(n) : null;
        if (op_02 == null) {
            if (this.l != null) {
                this.l = null;
                bl = true;
            }
        } else {
            if (this.l == null) {
                this.l = new biq_2();
                bl = true;
            }
            this.l.a(op_02);
        }
        if (bl) {
            fis_1.a().a("questListBar", (Object)this.l, "questDescriptionDialog");
        }
        fis_1.a().a("displayedAchievement", (Object)bim_22, "questDescriptionDialog");
    }

    public void b(bim_2 bim_22) {
        int n = bim_22.i();
        op_0 op_02 = OQ.a.b(n);
        if (op_02 == null) {
            a.warn((Object)("On essaye de charger une description de liste de qu$ete pour une qu\u00eate qui n'est pas dans une suite, id=" + n));
            return;
        }
        boolean bl = false;
        if (!fpm_0.b().q("questListBarDialog")) {
            fpm_0.b().a("questListBarDialog", cfi_0.a("questListBarDialog"), 8193L, (short)10000);
            bl = true;
        }
        if (this.l == null) {
            this.l = new biq_2();
            bl = true;
        }
        this.l.a(op_02);
        this.l.a(n);
        if (bl) {
            fis_1.a().a("questListBar", (Object)this.l, "questListBarDialog");
        }
        fis_1.a().a("displayedAchievement", (Object)bim_22, "questListBarDialog");
    }

    public void g() {
        fpm_0.b().o("questListBarDialog");
        this.l = null;
    }

    public void a(bhj_1 bhj_12) {
        biw_2 biw_22 = biz_2.a.b(this.m, bhj_12.a());
        if (biw_22 == null) {
            return;
        }
        if (this.b != null) {
            this.c.addLast(biw_22);
        } else {
            this.b(biw_22);
        }
        bin_2 bin_22 = biz_2.a.c(this.m, bhj_12.o().a());
        if (bin_22 != null) {
            fis_1.a().a((ajf_1)bin_22, bin_22.d());
        }
    }

    public static void a(biw_2 biw_22) {
        fis_1.a().a("selectedAchievement", biw_22);
        if (biw_22 != null) {
            String string;
            boolean bl = biw_22.v() == 4;
            String string2 = string = bl ? "questDialog" : "achievementsDialog";
            if (fpm_0.b().q(string)) {
                fis_1.a().a("displayedAchievement", (Object)biw_22, string);
            }
        }
    }

    protected void b(biw_2 biw_22) {
        this.b = biw_22;
        fis_1.a().a("unlockedAchievement", biw_22);
        if (!fpm_0.b().q("achievementUnlockedDialog") || this.d == null) {
            this.d = (fso)fpm_0.b().a("achievementUnlockedDialog", cfi_0.a("achievementUnlockedDialog"), 8194L, (short)10000);
        }
        if (this.d != null) {
            if (this.e != null) {
                this.d.getAppearance().c(this.e);
            }
            this.e = new fbx_1();
            this.e.onCheckOut();
            this.e.setFile("6001037.xps");
            this.e.setAlignment(frs_0.e);
            this.d.getAppearance().add(this.e);
        }
        this.c(true);
    }

    private void l() {
        this.k = new ArrayList();
        fyy_0 fyy_02 = this.d.getElementMap();
        this.k.add(((fvE)fyy_02.a("mainContainer")).getAppearance());
        this.k.add(((fvE)fyy_02.a("splashContainer")).getAppearance());
        this.k.add(((fvE)fyy_02.a("text")).getAppearance());
        this.k.add(((fvE)fyy_02.a("icon")).getAppearance());
        this.k.add(((fvE)fyy_02.a("starIcon")).getAppearance());
        this.k.add(((fvE)fyy_02.a("nameText")).getAppearance());
    }

    private void e(boolean bl) {
        fyy_0 fyy_02 = this.d.getElementMap();
        ((fvE)fyy_02.a("mainContainer")).setNonBlocking(bl);
    }

    public void c(boolean bl) {
        int n;
        int n2;
        if (this.d == null) {
            a.warn((Object)"on tente de fade l'interface de d\u00e9bloquage d'exploit alors qu'elle n'est pas charg\u00e9e");
            return;
        }
        if (this.k == null) {
            this.l();
        }
        this.e(!bl);
        fyy_0 fyy_02 = this.d.getElementMap();
        fyb_0 fyb_02 = fyy_02.a("mainContainer");
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
            fyb_02.removeTweensOfType(fjo_2.class);
            fjo_2 fjo_22 = new fjo_2(azf_22, azf_23, this.k, 0, 500, 1, fjw_2.b);
            fjo_22.a(new cvk_0(this, bl));
            fyb_02.addTween(fjo_22);
        }
    }

    public bia_1 h() {
        return this.j;
    }

    public cvo_0 i() {
        return this.h;
    }

    public void a(cvo_0 cvo_02) {
        this.h = cvo_02;
        fis_1.a().a((ajf_1)this.j.g(), "achievements", "categories");
    }

    public long j() {
        return this.m;
    }
}

