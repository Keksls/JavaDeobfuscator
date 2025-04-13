/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bmN
 */
public final class bmn_1
implements bho_1 {
    private static final Logger a = Logger.getLogger(bmn_1.class);
    private final long b;
    private final bhr_1 c;
    amj_1 d;
    bms_1 e = bms_1.a;
    final ArrayList<Runnable> f = new ArrayList();
    private final Runnable g = new bmr_2(this);

    public bmn_1(long l, bhr_1 bhr_12) {
        this.b = l;
        this.c = bhr_12;
    }

    @Override
    public void a(bhx_2 bhx_22) {
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(this.b);
        if (!bhx_22.d().a(bmr_12)) {
            return;
        }
        if (biz_2.a.a(bhx_22.c())) {
            ble_1.E().G();
        }
        bip_2 bip_22 = biz_2.a.a(this.b, bhx_22.c());
        bip_22.k();
        biw_2 biw_22 = biz_2.a.b(this.b, bhx_22.d().a());
        biw_22.x();
        biw_22.q();
        this.a(bhx_22.d(), bmr_12);
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        if (bvx_02.a(bWe.ah) || bvx_02.a(bWe.u)) {
            bvx_02.a((agp_0)bWe.ah, true);
            dem.a();
            cVh.a(bhx_22.d().a());
        }
        if (this.c(bhx_22) && bms_1.b.a(this.e)) {
            this.e = bms_1.b;
            if (this.d != null) {
                this.d.u();
            }
            this.d = cdw_0.n().a(600074L, 0.4f, 100, 1500, 2200);
            this.b(2200);
        }
    }

    private boolean c(bhx_2 bhx_22) {
        return bhk_1.a(bhx_22, (bnh_1)euw_2.a.d(this.b));
    }

    @Override
    public void a(bhj_1 bhj_12) {
        Object object;
        ArrayList<bib_2> arrayList;
        ani_2 ani_22;
        blr_1 blr_12;
        String string;
        bvx_0 bvx_02;
        if (!bhj_12.a((rp_0)euw_2.a.d(this.b))) {
            return;
        }
        wu_0 wu_02 = wc_0.p().a();
        for (long l : euw_2.a.e(azu_0.j().k().R())) {
            bhr_1 bhr_12 = bhl_1.a.b(l);
            bhr_12.w(bhj_12.a());
        }
        if (bms_1.c.a(this.e)) {
            this.e = bms_1.c;
            if (this.d != null) {
                this.d.u();
            }
            this.d = cdw_0.n().a(600075L, 0.4f, 100, 1500, 3300);
            this.b(3300);
        }
        if ((bvx_02 = (bvx_0)ans_0.D().h()).a(bWe.ah) || bvx_02.a(bWe.u)) {
            bvx_02.a((agp_0)bWe.ah, true);
            dem.a();
        }
        bhw_2.a.c(bhj_12.a());
        biw_2 biw_22 = biz_2.a.b(this.b, bhj_12.a());
        biw_22.y();
        bhw_2.a.c();
        bhy_2.a.b(bhj_12.a());
        if (!bhj_12.t()) {
            return;
        }
        boolean bl = biz_2.a.e(this.b, bhj_12.a());
        biw_2 biw_23 = null;
        String string2 = null;
        if (bhj_12.o().a(83)) {
            string = bae.h().a("notification.questExploration", new Object[0]);
            blr_12 = blr_1.k;
        } else if (bl) {
            ani_22 = new ani_2();
            ani_22.a((CharSequence)bae.h().a(62, (long)bhj_12.a(), new Object[0]));
            ani_22.a((CharSequence)" ");
            ani_22.i().a(azf_2.j.w());
            ani_22.a((CharSequence)bae.h().a("quest.result.success", new Object[0]));
            ani_22.j();
            string = ani_22.r();
            blr_12 = blr_1.l;
            biw_23 = biz_2.a.b(this.b, bhj_12.a());
            arrayList = new ani_2();
            ((ani_2)((Object)arrayList)).a().a(azf_2.h.w()).a((CharSequence)bae.h().a(62, (long)bhj_12.a(), new Object[0])).b();
            String string3 = ((ani_2)((Object)arrayList)).r();
            string2 = bae.h().a("quest.completedChatMessage", string3);
        } else {
            string = bae.h().a("notification.achievementReward", new Object[0]);
            blr_12 = blr_1.k;
            cVh.e().a(bhj_12);
        }
        if (bmn_1.a(this.c, bhj_12)) {
            this.f(bhj_12);
        }
        ani_22 = new ani_2();
        arrayList = bhj_12.s();
        if (arrayList.isEmpty()) {
            return;
        }
        boolean bl2 = true;
        for (bib_2 object22 : arrayList) {
            long l;
            Object n;
            object = object22.d();
            if (bl2) {
                bl2 = false;
            } else {
                ani_22.a((CharSequence)", ");
            }
            if (object == bhn_1.a || object == bhn_1.e) {
                n = eyo_1.g().d(object22.c()[0]);
                if (n == null) continue;
                exk_2 l3 = eyo_1.g().g(((ezr_0)n).n());
                ani_22.a((CharSequence)aUi.a(l3));
                continue;
            }
            if (object == bhn_1.b) {
                int n2 = object22.c()[0];
                ani_22.a((CharSequence)bae.h().a(34, (long)n2, new Object[0]));
                continue;
            }
            if (object == bhn_1.c) {
                int n3 = object22.c()[0];
                ani_22.a((CharSequence)bae.h().a(80, (long)n3, new Object[0]));
                continue;
            }
            if (object == bhn_1.d) {
                int l2 = object22.c()[0];
                ani_22.a((CharSequence)bae.h().a("landmark.gfx", new Object[0]));
                continue;
            }
            if (object == bhn_1.f) {
                long l5 = fla_0.a(object22.c()[0], azu_0.j().k());
                ani_22.a((CharSequence)bae.h().a("xpGain", l5));
                continue;
            }
            if (object == bhn_1.m) {
                n = azu_0.j().k();
                long l4 = ((bmr_1)n).du().b(((bmr_1)n).dt());
                l = l4 * (long)object22.c()[0] / 100L;
                ani_22.a((CharSequence)bae.h().a("xpPercentGain", fla_0.b(l)));
                continue;
            }
            if (object == bhn_1.q) {
                n = azu_0.j().k();
                long l2 = Math.round((double)(object22.c()[0] / 100) * (double)oe_0.a(((bmr_1)n).dt()));
                l = fla_0.a(l2, (epq_2)n);
                ani_22.a((CharSequence)bae.h().a("xpGain", l));
                continue;
            }
            if (object == bhn_1.k) {
                long n4 = object22.c()[0];
                ani_22.a((CharSequence)bae.h().a("kama.shortGain", n4));
                continue;
            }
            if (object == bhn_1.l) {
                int n5 = object22.c()[0];
                ani_22.a((CharSequence)bae.h().a("guild.pointsGain", n5));
                continue;
            }
            if (object != bhn_1.p) continue;
            int n6 = object22.c()[0];
            ani_22.a((CharSequence)bae.h().a(3, (long)n6, new Object[0]));
        }
        String string4 = bae.h().a("achievement.unlockedChatMessage", ani_22.r());
        ani_2 ani_23 = new ani_2();
        if (bl) {
            ani_23.a().a((CharSequence)bae.h().a(62, (long)bhj_12.a(), new Object[0])).b().m();
        }
        ani_23.a((CharSequence)string4);
        object = new dhc(string, ani_23.r(), blr_12, -1, biw_23);
        add_2.b().a((adt_1)object);
        if (string2 != null) {
            aul_0.a().c(string2);
        }
    }

    @Override
    public void b(bhj_1 bhj_12) {
        Object object;
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(this.b);
        if (!bhj_12.a(bmr_12)) {
            return;
        }
        bin_2 bin_22 = biz_2.a.c(this.b, bhj_12.o().a());
        bin_22.j();
        if (bmn_1.a(this.c, bhj_12)) {
            this.f(bhj_12);
        }
        if (biz_2.a.e(this.b, bhj_12.a())) {
            if (bhj_12.B() != -1) {
                this.e(bhj_12);
            }
            bhw_2.a.b(bhj_12.a());
            object = new ani_2();
            ((ani_2)object).a().a(azf_2.h.w()).a((CharSequence)bae.h().a(62, (long)bhj_12.a(), new Object[0])).b();
            String string = ((ani_2)object).r();
            aUh.b("quest.activatedChatMessage", string);
            fis_1.a().a("followedQuestsDisplay", true);
            ado_1.a().a(new bmo_2(this), 5000L, 1);
            bhw_2.a.c();
            this.a(bhj_12, bmr_12);
        }
        object = biz_2.a.b(this.b, bhj_12.a());
        ((biw_2)object).y();
    }

    private void a(bhj_1 bhj_12, bmr_1 bmr_12) {
        if (bmr_12.f(erl_2.ac) || bhj_12.D()) {
            long l = bmr_12.T_();
            ArrayList<bhx_2> arrayList = bhj_12.r();
            int n = arrayList.size();
            for (int k = 0; k < n; ++k) {
                bhx_2 bhx_22 = arrayList.get(k);
                if (bhx_22.b() || !bhx_22.j() || !bhk_1.a(bhx_22, bmr_12) || bhx_22.a(l)) continue;
                biz_2.a.a(this.b, bhx_22.c(), l);
                break;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void e(bhj_1 bhj_12) {
        int n = bhj_12.B() * 1000;
        if (n < 0) {
            return;
        }
        String string = "questActivatedDialog" + bhj_12.a();
        bmp_2 bmp_22 = new bmp_2(this, string, bhj_12);
        ArrayList<Runnable> arrayList = this.f;
        synchronized (arrayList) {
            this.f.add(bmp_22);
            ado_1.a().a(bmp_22, n, 1);
        }
    }

    boolean b() {
        return dbp.a().d() || !dbp.a().a(blr_1.l) && !dbp.a().a(blr_1.m);
    }

    void a(String string, bhj_1 bhj_12) {
        fpm_0.b().a(string, cfi_0.a("questActivatedDialog"), (short)10000);
        fis_1.a().a("displayedAchievement", (Object)biz_2.a.b(this.b, bhj_12.a()), string);
    }

    @Override
    public void d(bhj_1 bhj_12) {
        Object object;
        Object object2;
        if (!bhj_12.a((rp_0)euw_2.a.d(this.b))) {
            return;
        }
        bhr_1 bhr_12 = azu_0.j().k().eK();
        boolean bl = bhr_12.a(bhj_12.a(), false);
        if (bl && !bhr_12.p(bhj_12.a())) {
            bhw_2.a.c();
            object2 = new cle_1(bhj_12.a(), false);
            azu_0.j().K().c(object2);
        }
        object2 = biz_2.a.c(this.b, bhj_12.o().a());
        ((bin_2)object2).j();
        if (bhj_12.x()) {
            object = new clf_0(bhj_12.a());
            azu_0.j().K().c(object);
        }
        object = bhj_12.r();
        int n = ((ArrayList)object).size();
        for (int k = 0; k < n; ++k) {
            bip_2 bip_22 = biz_2.a.a(this.b, ((bhx_2)((ArrayList)object).get(k)).c());
            bip_22.l();
        }
    }

    @Override
    public void a(bic_1 bic_12, long l) {
        int n;
        bPL bPL2;
        if (bic_12.d() && (bPL2 = bPL.a).e()) {
            n = bPL2.g().getIntStat(bic_12.b());
            bPL2.a(bic_12.b(), (int)((long)n + l));
        }
        if ((bPL2 = this.c.q(bic_12.a())) == null) {
            return;
        }
        int n2 = bPL2.size();
        for (n = 0; n < n2; ++n) {
            bvx_0 bvx_02;
            bip_2 bip_22 = biz_2.a.a(this.b, bPL2.get(n));
            rr_0 rr_02 = this.c.j(bip_22.j());
            bip_22.l();
            TIntArrayList tIntArrayList = this.c.a();
            int n3 = rr_02.a().a();
            if (!tIntArrayList.contains(n3) || !(bvx_02 = (bvx_0)ans_0.D().h()).a(bWe.ah) && !bvx_02.a(bWe.u)) continue;
            bvx_02.a((agp_0)bWe.ah, true);
            dem.a();
            cVh.a(n3);
        }
    }

    @Override
    public void a(int n, boolean bl) {
        if (bl) {
            cVh.a(n);
        }
        bhw_2.a.a(n, bl);
    }

    @Override
    public void a(bhr_1 bhr_12) {
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(this.b);
        if (bmr_12 != null && euv_2.a.b(bmr_12.U_(), this.b)) {
            biz_2.a.a(this.b, bhr_12);
            return;
        }
        bnl_2.a.c();
        biz_2.a.a(this.b, bhr_12);
        bia_2.a.a();
        bhw_2.a.a();
        TIntObjectIterator<bhj_1> tIntObjectIterator = bhr_12.d();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bhj_1 bhj_12 = (bhj_1)tIntObjectIterator.value();
            if (bmn_1.a(this.c, bhj_12)) {
                this.f(bhj_12);
            }
            if (!biz_2.a.e(this.b, bhj_12.a()) || !bhj_12.m() || bhj_12.l()) continue;
            bhw_2.a.b(bhj_12.a());
        }
        bhw_2.a.c();
    }

    private void f(bhj_1 bhj_12) {
        biw_2 biw_22 = biz_2.a.b(this.b, bhj_12.a());
        bia_2.a.a(biw_22);
    }

    private static boolean a(ro_0 ro_02, rm_0 rm_02) {
        boolean bl;
        boolean bl2 = bl = !ro_02.d(rm_02.a());
        if (bl) {
            return false;
        }
        boolean bl3 = rm_02.e() != null;
        boolean bl4 = !rm_02.l() && rm_02.k() != 0L;
        boolean bl5 = rm_02.c() != 0L && rm_02.j() != 0L;
        return bl3 || bl4 || bl5;
    }

    @Override
    public void c(bhj_1 bhj_12) {
        if (!bhj_12.a((rp_0)euw_2.a.d(this.b))) {
            return;
        }
        biw_2 biw_22 = biz_2.a.b(this.b, bhj_12.a());
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)bae.h().a(62, (long)bhj_12.a(), new Object[0]));
        ani_22.a((CharSequence)" ");
        ani_22.i().a(azf_2.h.w());
        ani_22.a((CharSequence)bae.h().a("quest.result.fail", new Object[0]));
        ani_22.j();
        String string = ani_22.r();
        dhc dhc2 = new dhc(string, "", blr_1.m, -1, biw_22);
        add_2.b().a(dhc2);
        ani_2 ani_23 = new ani_2();
        ani_23.a().a(azf_2.h.w()).a((CharSequence)bae.h().a(62, (long)bhj_12.a(), new Object[0])).b();
        String string2 = ani_23.r();
        aUh.b("quest.failedChatMessage", string2);
        bhw_2.a.c();
        bhy_2.a.b(bhj_12.a());
    }

    @Override
    public void a(bhj_1 bhj_12, long l) {
        bnl_2.a.a(bhj_12.a(), l);
    }

    @Override
    public void a(int n) {
        azu_0.j().K().c(new clg_0(n));
    }

    @Override
    public void b(bhx_2 bhx_22) {
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(this.b);
        if (!bhx_22.d().a(bmr_12)) {
            return;
        }
        if (biz_2.a.a(bhx_22.c())) {
            ble_1.E().G();
        }
        bip_2 bip_22 = biz_2.a.a(this.b, bhx_22.c());
        bip_22.k();
        biw_2 biw_22 = biz_2.a.b(this.b, bhx_22.d().a());
        biw_22.x();
        biw_22.q();
    }

    private void b(int n) {
        ado_1.a().b(this.g);
        ado_1.a().a(this.g, n, 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        ArrayList<Runnable> arrayList = this.f;
        synchronized (arrayList) {
            for (int k = this.f.size() - 1; k >= 0; --k) {
                ado_1.a().b(this.f.get(k));
            }
        }
    }
}

