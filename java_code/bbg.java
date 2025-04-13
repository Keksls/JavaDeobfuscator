/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.util.Iterator;
import java.util.List;

public class bbg
extends bak_0 {
    private final boolean e;
    private boolean f;
    private boolean g;
    private List<Long> h;
    private List<Long> i;
    private List<Long> j;

    public bbg(int n, int n2, int n3, int n4, boolean bl) {
        super(n, n2, n3, n4);
        this.e = bl;
    }

    @Override
    protected void r() {
        Iterator<pj_0> iterator;
        bbg.t();
        bwh_0 bwh_02 = this.b();
        if (bwh_02 instanceof bvw_2) {
            baz_0 baz_02 = new baz_0(0, 0, 0, bwh_02.c());
            baz_02.a(this.h);
            baz_02.b(this.i);
            baz_02.c(this.j);
            baz_02.r();
            return;
        }
        if (!(bwh_02 instanceof bvx_2)) {
            return;
        }
        bvx_2 bvx_22 = (bvx_2)bwh_02;
        a.info((Object)("[FIGHT] End fight with id " + bvx_22.c()));
        bmr_1 bmr_12 = bzf_1.a();
        boolean bl = bvx_22.b(bmr_12.a_());
        if (!this.e) {
            this.f = !bl;
        } else {
            this.f = false;
            bvx_22.m(bmr_12.a_());
            bvx_22.d(bmr_12);
        }
        aPc.a(bvx_22);
        if (this.e && bvx_22.l()) {
            return;
        }
        fis_1.a().a("fight");
        fis_1.a().a("isInFightCreationOrPlacement", false);
        bbg.v();
        fis_1.a().a("fight.timeline", (Object)null);
        bbg.u();
        bbg.a(bvx_22);
        apv_0.a().b();
        apw_0.a().c();
        cYH.d();
        if (!this.e) {
            blx_1 blx_12;
            iterator = bvx_22.ax();
            Iterator object = iterator.iterator();
            while (object.hasNext()) {
                blx_12 = (blx_1)object.next();
                blx_12.ap();
            }
            Iterator iterator2 = iterator.iterator();
            while (iterator2.hasNext()) {
                blx_12 = (blx_1)iterator2.next();
                blx_12.br();
            }
            bvx_22.o();
        } else {
            bmr_12.br();
            iterator = new bwn_1(bvx_22).a();
            aPc.f().b(bmr_12, ((bvw_2)((Object)iterator)).c());
        }
        if (this.g) {
            new bxj_2().a();
        }
        if (bl) {
            bua_0.a.a(new buo_1());
        }
        for (pj_0 pj_02 : ccm_1.g().i()) {
            pj_02.aI_();
        }
        baa_0.a().c(bvx_22.c());
        if (bmr_12.cH() != null) {
            bOQ.a().e();
        }
        aPc.f().i();
        bxr_2.a.b();
        aed.a.d();
        afz_0.d().a();
        bNT.f().a();
        abe_0.d().a();
        ahs.d().a();
        this.a(bmr_12);
        bmr_12.a(eps_0.c, eps_0.b, eps_0.d, eps_0.e);
        dcj_0.a().a(bmr_12.cg());
        bmr_12.cg().b(fid.a);
        azu_0.j().a((blx_1)bmr_12);
        this.s();
        if (cZI.A()) {
            cZI.a().e();
        }
    }

    private void a(bmr_1 bmr_12) {
        euw_2.a.b(bmr_12.U_(), epq_22 -> {
            bmr_1 bmr_12 = (bmr_1)epq_22;
            bPJ.a(bmr_12.dz(), bmr_12.aZ(), bmr_12.cg());
            return true;
        });
    }

    private static void t() {
        TIntObjectIterator<bwh_0> tIntObjectIterator = bwj_1.a().b();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bwh_0 bwh_02 = (bwh_0)tIntObjectIterator.value();
            if (!(bwh_02 instanceof bvw_2)) continue;
            for (blx_1 blx_12 : bwh_02.j()) {
                blx_12.C(true);
                biI biI2 = blx_12.bv();
                if (bwh_02.e() != elp_0.b || !(blx_12 instanceof bnh_1)) continue;
                biI2.e((byte)0);
            }
        }
    }

    private static void a(bvx_2 bvx_22) {
        aed.a.b(bvx_22.p());
    }

    private static void u() {
        azu_0.j().a(dei.a());
        azu_0.j().a(cfu_1.a());
    }

    private static void v() {
        try {
            cZa.a().g();
            azu_0.j().b(ddy_0.a());
            azu_0.j().b(ddv_0.a());
            azu_0.j().b(cYW.a());
            azu_0.j().b(cZa.a());
            azu_0.j().b(cyo_0.a());
            azu_0.j().b(cYT.a());
            azu_0.j().b(cyv_0.a());
            azu_0.j().b(cyp_0.g());
            azu_0.j().b(cgz_1.a());
            cgz_1.a().a((bvx_2)null);
            azu_0.j().b(cYH.a());
        }
        catch (Exception exception) {
            a.error((Object)"Raised exception when remove frames", (Throwable)exception);
        }
    }

    @Override
    protected void l() {
        bwh_0 bwh_02 = this.b();
        if (bwh_02 == null) {
            return;
        }
        emr_2 emr_22 = bwh_02.af_();
        if (emr_22.p()) {
            cdw_0.n().h(this.f);
        }
        if (this.g) {
            return;
        }
        cms_0 cms_02 = new cms_0(bwh_02.c(), this.f);
        azu_0.j().K().c(cms_02);
    }

    public void b(boolean bl) {
        this.g = bl;
    }

    public void a(List<Long> list, List<Long> list2, List<Long> list3) {
        this.j = list;
        this.i = list2;
        this.h = list3;
    }

    public void s() {
        bWe bWe2 = bWe.A;
        boolean bl = ((bvx_0)ans_0.D().h()).a(bWe2);
        acb_0 acb_02 = ajI.e().d();
        acb_02.b().c(bl);
    }
}

