/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from cWU
 */
public class cwu_0
extends cxo_0
implements ena_1,
fjd_2 {
    private static final Logger a = Logger.getLogger(cwu_0.class);
    private static final cwu_0 i = new cwu_0();
    private static final int j = 400;
    private ans_1 k;

    public static cwu_0 h() {
        return i;
    }

    @Override
    public void a(String string) {
        if (string != null && !string.equals("characterSheetDialog")) {
            azu_0.j().b(this);
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18905: {
                dfc dfc2 = (dfc)adt_12;
                long l = dfc2.d();
                blx_1 blx_12 = bzf_1.a(l);
                if (blx_12 == null || !blx_12.bo()) {
                    a.error((Object)("Trying to display a bad character's stats : " + l));
                    return false;
                }
                bmr_1 bmr_12 = (bmr_1)blx_12;
                bkr_2.v.a(bmr_12);
                return false;
            }
            case 17219: {
                ezn_1 ezn_12;
                dfc dfc3 = (dfc)adt_12;
                blf_0 blf_02 = (blf_0)dfc3.j();
                blx_1 blx_13 = this.j().l();
                if (blf_02.c() && (ezn_12 = new ezn_1()).a(blx_13.a_(), 0)) {
                    clo_1 clo_12 = new clo_1();
                    clo_12.a(blx_13.a_());
                    clo_12.a((byte)0);
                    azu_0.j().K().c(clo_12);
                    bld_0 bld_02 = cwa_0.a.e();
                    if (bld_02 != null) {
                        bld_02.a(0);
                        bld_02.a();
                        fis_1.a().a((ajf_1)bld_02, bld_02.d());
                        if (fpm_0.b().q("buildSheetSetIconsDialog")) {
                            fpm_0.b().o("buildSheetSetIconsDialog");
                        }
                    }
                    this.j().b();
                }
                return false;
            }
        }
        return super.a(adt_12);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public String f() {
        return "characterSheetDialog";
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        super.a(aav_22, bl);
        if (!bl) {
            cwu_0.r();
            this.s();
            boolean bl2 = azr_0.a().i((byte)3, "displayAllCharacteristics") ? azr_0.a().b((byte)3, "displayAllCharacteristics") : true;
            cwu_0.a(bl2);
            fis_1.a().a("aptitudeBonus", bkr_2.v);
            bmr_1 bmr_12 = this.h != null ? this.h : azu_0.j().k();
            bkr_2.v.a(bmr_12);
            fis_1.a().a("characterSheetSecondMode", ((bvx_0)ans_0.D().h()).a(bWe.N));
            fpm_0.b().a("wakfu.characterSheet", cFQ.class);
            cdw_0.n().c(600054L);
        }
    }

    private static void r() {
        fvk_0 fvk_02 = (fvk_0)fpm_0.b().k("characterSheetDialog");
        fvk_02.setEnableResizeEvents(true);
        fvk_02.addEventListener(frd_0.P, new cWV(fvk_02), true);
    }

    private void s() {
        fyy_0 fyy_02 = fpm_0.b().h().d("worldAndFightBarDialog");
        if (fyy_02 == null) {
            return;
        }
        fvE fvE2 = (fvE)fyy_02.a("fightInfoBtn");
        if (fvE2 == null) {
            return;
        }
        fvE2.getAppearance().removeTweensOfType(fjp_2.class);
    }

    public static void a(boolean bl) {
        fis_1.a().a("displayAllCharacteristics", bl);
        azr_0.a().a((byte)3, "displayAllCharacteristics", bl);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bmk_1 bmk_12;
            bvx_2 bvx_22 = azu_0.j().k().bz();
            TIntObjectIterator tIntObjectIterator = b.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                bmk_12 = (bmk_1)tIntObjectIterator.value();
                bmk_12.l().cd().b();
                if (bvx_22 == null || !(bmk_12 instanceof bqU)) continue;
                ((bqU)bmk_12).A();
            }
            tIntObjectIterator = c.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                bmk_12 = (bmk_1)tIntObjectIterator.value();
                bmk_12.l().cd().b();
                if (bvx_22 == null || !(bmk_12 instanceof bqU)) continue;
                ((bqU)bmk_12).A();
            }
            if (bvx_22 != null) {
                bvx_22.b(this);
            }
            fis_1.a().a("characterSheetSecondMode");
            fpm_0.b().b(this.k);
            fpm_0.b().o("aptitudeBonusDialog");
            fpm_0.b().e("wakfu.characterSheet");
            cdw_0.n().c(600013L);
            chr_0.a.c();
        }
        super.b(aav_22, bl);
    }

    public void i() {
        bmk_1 bmk_12;
        TIntObjectIterator tIntObjectIterator = b.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bmk_12 = (bmk_1)tIntObjectIterator.value();
            if (!(bmk_12 instanceof bqU)) continue;
            fis_1.a().a((ajf_1)bmk_12, blx_1.W);
        }
        tIntObjectIterator = c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bmk_12 = (bmk_1)tIntObjectIterator.value();
            if (!(bmk_12 instanceof bqU)) continue;
            fis_1.a().a((ajf_1)bmk_12, blx_1.W);
        }
    }

    public void a(bvx_2 bvx_22) {
        if (bvx_22 == null) {
            return;
        }
        bvx_22.a(this);
    }

    @Override
    public void b() {
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
        if (!(epq_22 instanceof bmv_1)) {
            return;
        }
        bmv_1 bmv_12 = (bmv_1)epq_22;
        if (!bmv_12.bp()) {
            return;
        }
        if (bmv_12.gY() != 5) {
            return;
        }
        bmk_1 bmk_12 = cwu_0.c(bmv_12.gO());
        if (bmk_12 == null) {
            return;
        }
        ((bqU)bmk_12).B();
    }

    public void d(epq_2 epq_22) {
        if (!(epq_22 instanceof bmv_1)) {
            return;
        }
        bmv_1 bmv_12 = (bmv_1)epq_22;
        if (!bmv_12.bp()) {
            return;
        }
        if (bmv_12.gY() != 5) {
            return;
        }
        bmk_1 bmk_12 = cwu_0.c(bmv_12.gO());
        if (bmk_12 == null) {
            return;
        }
        ((bqU)bmk_12).A();
    }

    public void e(epq_2 epq_22) {
    }

    public void f(epq_2 epq_22) {
    }

    @Override
    public void a(ekk_0 ekk_02) {
    }

    public void g(epq_2 epq_22) {
    }

    @Override
    public void g() {
    }
}

