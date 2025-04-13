/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.HashSet;
import java.util.Optional;

/*
 * Renamed from blo
 */
public class blo_1 {
    private int a;
    private bls_2 b;
    private eod_0 c;
    private static final String d = "challengeProposal";
    private static final String e = "challengeVarUpdated";
    private static final String f = "challengeVarUpdateNegate";
    private static final String g = "challengeWin";
    private static final String h = "challengeFailed";
    private static final int i = 600;
    private static final blo_1 j = new blo_1();

    public void a(int n) {
        this.a = n;
    }

    public void a(bls_2 bls_22) {
        this.b = bls_22;
        this.g();
    }

    public void a(eod_0 eod_02) {
        this.c = eod_02;
    }

    public void a(eod_0 eod_02, int n) {
        this.c = eod_02;
        blq_2.a.a(n, false);
    }

    public eod_0 a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public bls_2 c() {
        return this.b;
    }

    public Optional<bls_2> d() {
        return Optional.ofNullable(this.b);
    }

    public static blo_1 e() {
        return j;
    }

    public void f() {
        if (this.b != null) {
            blc_2.a().f(this.b.c());
            this.b = null;
            bhw_2.a.a(-1);
        }
        this.l();
        fis_1.a().a("waitingForInputChallenge", (Object)null);
    }

    private void a(String string) {
        this.a(ayu_2.a().b((aui_2)auj_1.a.a(), (long)auc_1.d(string), string, false));
    }

    private void a(ays_2 ays_22) {
        biI biI2 = azu_0.j().k().bv();
        zp_0 zp_02 = new zp_0();
        zo_0 zo_02 = new zo_0(ays_22, 32, 32, (zt_0)zp_02, 2000);
        zo_02.a(biI2);
        HashSet<za_0> hashSet = zd_0.a().a(biI2);
        zo_02.g(Math.max(1, hashSet != null ? hashSet.size() * 600 : 0));
        zd_0.a().a(zo_02);
    }

    public void a(int n, long l, wu_0 wu_02, TIntArrayList tIntArrayList, int n2) {
        if (n == -1) {
            this.a(l);
        } else {
            this.b(n, l, wu_02, tIntArrayList, n2);
        }
    }

    private void b(int n, long l, wu_0 wu_02, TIntArrayList tIntArrayList, int n2) {
        bld_2.a.a();
        blq_2.a.a(l, false);
        this.b = blc_2.a().a(n, wu_02);
        this.b.a(tIntArrayList);
        this.b.a(false);
        this.b.d(true);
        this.b.b(true);
        cdw_0.n().c(600127L);
        this.b.b(n2);
        this.b.b(wu_02);
        bld_2.a.b();
        blo_1.o();
        this.g();
        this.h();
    }

    private void a(long l) {
        blq_2.a.a(l, this.b == null);
        blq_2.a.c();
        bld_2.a.a();
        this.g();
        this.h();
    }

    public void g() {
        int n = this.n() ? (this.b != null ? this.b.c() : -1) : -1;
        bhw_2.a.a(n);
    }

    private static void o() {
        String string;
        String string2 = fpm_0.b().q("verticalFollowedAchievementsDialog") ? "verticalFollowedAchievementsDialog" : (string = fpm_0.b().q("followedAchievementsDialog") ? "followedAchievementsDialog" : null);
        if (string == null) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        fvE fvE2 = (fvE)fyy_02.a("environmentRenderable.environmentQuestContainer");
        fbx_1 fbx_12 = new fbx_1();
        fbx_12.onCheckOut();
        fbx_12.setFile("6001051.xps");
        fbx_12.setAlignment(frs_0.e);
        fvE2.getAppearance().add(fbx_12);
    }

    public void h() {
        switch (this.c) {
            case a: 
            case b: {
                bll_2 bll_22 = this.b != null ? blj_2.a.a(this.b.c()) : null;
                fis_1.a().a("displayedAchievement", bll_22);
                break;
            }
            case d: 
            case c: {
                fis_1.a().a("displayedAchievement", (Object)null);
            }
        }
    }

    public void i() {
        switch (this.c) {
            case a: {
                break;
            }
            case b: {
                if (this.b == null) break;
                this.b.a(false);
                this.b.d(true);
                break;
            }
            case d: 
            case c: {
                if (this.b != null && !this.b.q() && this.b.h()) {
                    this.b(this.b.c());
                }
                this.f();
                blq_2.a.a();
            }
        }
    }

    public void b(int n) {
        if (this.b != null && this.b.c() == n) {
            boolean bl;
            fis_1.a().a("challengeDetailsVisible", false);
            this.b.f(true);
            this.b.b(false);
            this.b.d(false);
            this.b.a((aff_1)null);
            boolean bl2 = bl = !this.b.p();
            if (bl && this.n()) {
                aUh.b("chat.challenge.failed", this.b.m());
                this.a(azs_0.a().a("challengeFlyingImagePath", "defaultIconPath", h));
            }
            this.j();
        }
        this.l();
    }

    public void j() {
        if (this.b != null) {
            blc_2.a().f(this.b.c());
            this.b = null;
            this.h();
            bhw_2.a.a(-1);
        }
    }

    public short k() {
        if (this.b != null) {
            return this.b.o();
        }
        return -1;
    }

    public void l() {
    }

    public void m() {
        if (this.n()) {
            this.a(azs_0.a().a("challengeFlyingImagePath", "defaultIconPath", g));
            biI biI2 = azu_0.j().k().bv();
            biI2.a(aej_2.d);
            biI2.e("AnimEmote-Victoire");
        }
    }

    public void a(boolean bl) {
        if (this.n()) {
            String string = bl ? e : f;
            this.a(azs_0.a().a("challengeFlyingImagePath", "defaultIconPath", string));
        }
    }

    public boolean n() {
        bmr_1 bmr_12 = azu_0.j().k();
        apc_2 apc_22 = this.b != null ? this.b.b().t() : null;
        boolean bl = apc_22 == null || apc_22.b(bmr_12, bmr_12, null, null);
        return bl && !bmr_12.fE().s();
    }
}

