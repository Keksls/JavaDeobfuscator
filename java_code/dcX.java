/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Objects;
import org.apache.log4j.Logger;

public class dcX
extends cxo_0
implements bOy {
    public static final dcX a = new dcX();
    protected static final Logger i = Logger.getLogger(dcX.class);
    private bpk_0 j;
    private fso k;
    private fid l;
    private boolean m;
    private fbx_1 n;
    private ans_1 o;

    private dcX() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (azu_0.j().c(cZI.a())) {
            return true;
        }
        switch (adt_12.a()) {
            case 18030: {
                return false;
            }
            case 17284: {
                this.r();
                return false;
            }
            case 16922: {
                return false;
            }
            case 18011: {
                dha_0 dha_02 = (dha_0)adt_12;
                bpr_0 bpr_02 = dha_02.o();
                bpl_0 bpl_02 = bpr_02.b();
                if (bpl_02 == null) {
                    return false;
                }
                int n = ((bph_0)bpl_02.r()).i();
                long l = this.j().l().a_();
                return false;
            }
            case 17304: {
                return false;
            }
            case 19621: {
                dha_0 dha_03 = (dha_0)adt_12;
                bpl_0 bpl_03 = dha_03.k();
                if (bpl_03 == null) {
                    this.a(false);
                    return false;
                }
                blx_1 blx_12 = this.j().l();
                bpl_0 bpl_04 = bpl_03.l();
                bpl_04.c(bpl_03.a(blx_12.dz()));
                this.a(true);
                fis_1.a().a("describedSpell", (Object)bpl_04, "spellDeckDialog");
                fis_1.a().a("describedSpellRealLevel", (Object)bpl_04.c(), "spellDeckDialog");
                fis_1.a().a("editableDescribedSpell", (Object)bpl_04, "spellDeckDialog");
                return false;
            }
            case 16823: {
                dfc dfc2 = (dfc)adt_12;
                long l = dfc2.d();
                bmr_1 bmr_12 = (bmr_1)euw_2.a.d(l);
                if (bmr_12 == null) {
                    return false;
                }
                this.a(bmr_12);
                fis_1.a().a((ajf_1)this.j, "passiveSpellsList", "naturalState");
                return false;
            }
            case 19138: {
                dfc dfc3 = (dfc)adt_12;
                String string = dfc3.h();
                this.i();
                return false;
            }
            case 19372: {
                dfc dfc4 = (dfc)adt_12;
                blb_0 blb_02 = (blb_0)dfc4.j();
                this.i();
                return false;
            }
            case 17681: {
                bmr_1 bmr_13 = (bmr_1)this.j().l();
                ezm_1 ezm_12 = bmr_13.dx();
                int n = ezm_12.e();
                if (!fis_1.a().c("hideDownscaling")) {
                    String string = ezm_12.d().b();
                    fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("sheet.add.build.confirmation", string), cfn_0.a(0), 25L, 102, 1);
                    fzm_02.a(new dcy_0(this, bmr_13, n));
                } else {
                    this.a(bmr_13, n);
                }
                return false;
            }
            case 19279: {
                return false;
            }
            case 17756: {
                blx_1 blx_13 = this.j().l();
                if (blx_13 == null) {
                    return false;
                }
                long l = blx_13.a_();
                cqE cqE2 = new cqE(l);
                azu_0.j().K().c(cqE2);
                return false;
            }
            case 19533: {
                dfc dfc5 = (dfc)adt_12;
                bPK bPK2 = (bPK)dfc5.j();
                int n = bPK2.g();
                this.d(n);
                return false;
            }
            case 16237: {
                this.u();
                this.w();
                return false;
            }
            case 16760: {
                return false;
            }
            case 18208: {
                this.u();
                this.w();
                return false;
            }
        }
        return true;
    }

    public void d(int n) {
        fis_1.a().a((ajf_1)this.j, bpk_0.h);
    }

    private void r() {
        this.a(false);
    }

    void a() {
        this.a(false);
    }

    void a(bmr_1 bmr_12, int n) {
    }

    private void a(blx_1 blx_12, short s2, fiL fiL2, long l, int n, String string) {
        boolean bl = this.a(blx_12, n, s2);
        if (bl) {
            this.a(s2, fiL2, l, n, "spellDeck.upperLevelValidationQuestion", string);
        } else {
            this.a(s2, fiL2, l, n);
        }
    }

    private boolean a(blx_1 blx_12, int n, int n2) {
        ezm_1 ezm_12 = blx_12.dx();
        for (ezj_1 ezj_12 : ezm_12.a().values()) {
            if (ezj_12.e() != n || ezj_12.c() >= n2 || ezj_12.c() == -1) continue;
            return true;
        }
        return false;
    }

    private void a(short s2, fiL fiL2, long l, int n, String string) {
        this.a(s2, fiL2, l, n, "spellDeck.lowerLevelValidationQuestion", string);
    }

    private void a(short s2, fiL fiL2, long l, int n, String string, String string2) {
        String string3 = bae.h().a(string, string2);
        fzm_0 fzm_02 = fpm_0.b().a(string3, cfn_0.a(0), 2073L, 102, 1);
        fzm_02.a(new dcz_0(this, s2, fiL2, l, n));
    }

    void s() {
    }

    void a(short s2, fiL fiL2, long l, int n) {
        if (fiL2.a(l, n, (int)s2)) {
            cqI cqI2 = new cqI(l, n, s2);
            azu_0.j().K().c(cqI2);
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            super.a(aav_22, false);
            this.o = new dda(this);
            this.m = false;
            this.t();
            bmr_1 bmr_12 = this.h != null ? this.h : azu_0.j().k();
            this.a(bmr_12);
            cdw_0.n().c(600114L);
            btn_0.a().a(btr_0.g, "spellDeckDialog");
            bOw bOw2 = bmr_12.cg();
            this.l = bOw2.b();
            bOw2.a(fid.b, true);
            bOw2.a(this);
            fpm_0.b().a(this.o);
            fpm_0.b().a("wakfu.spellDeck", cjd_0.class);
            fyy_0 fyy_02 = fpm_0.b().h().d("spellDeckDialog");
            this.k = (fso)fyy_02.a("spellDescription");
            fis_1.a().a((ajf_1)this.j, bpk_0.h);
            this.u();
            this.w();
            if (this.g >= 0) {
                this.d(this.g);
                this.a();
            }
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            super.b(aav_22, false);
            this.m = false;
            this.w();
            this.e();
            cdw_0.n().c(600013L);
            fpm_0.b().b(this.o);
            fpm_0.b().o("spellDeckDialog");
            bmr_1 bmr_12 = azu_0.j().k();
            bOw bOw2 = bmr_12.cg();
            if (bmr_12.bz() == null) {
                bOw2.a(this.l, true);
            }
            bOw2.b(this);
        }
    }

    @Override
    public void a(fid fid2) {
        this.l = fid2;
    }

    private void t() {
        fyy_0 fyy_02 = fpm_0.b().h().d("worldAndFightBarDialog");
        if (fyy_02 == null) {
            return;
        }
        fvE fvE2 = (fvE)fyy_02.a("spellButton");
        if (fvE2 == null) {
            return;
        }
        fvE2.getAppearance().removeTweensOfType(fjp_2.class);
    }

    void c() {
    }

    public void a(bmr_1 bmr_12) {
    }

    private void a(boolean bl) {
        if (this.k == null) {
            return;
        }
        this.m = bl;
        this.k.setUsePositionTween(true);
        this.k.setX(bl ? 694 : 376);
        this.u();
    }

    private void u() {
        fyy_0 fyy_02 = fpm_0.b().h().d("spellDeckDialog");
        fso fso2 = (fso)fyy_02.a("containerBottom");
        fqm_0 fqm_02 = (fqm_0)fyy_02.a("margin");
    }

    @Override
    public String f() {
        return "spellDeckDialog";
    }

    public void d() {
        azu_0 azu_02 = azu_0.j();
        if (!azu_02.c(this)) {
            azu_02.a(this);
        }
    }

    public void c(bmr_1 bmr_12) {
    }

    public void e() {
    }

    public void g() {
        bpl_0 bpl_02 = (bpl_0)fis_1.a().d("describedSpell", "spellDeckDialog");
        bpl_0 bpl_03 = (bpl_0)fis_1.a().d("editableDescribedSpell", "spellDeckDialog");
        fis_1.a().a((ajf_1)bpl_02, bpl_0.ah);
        fis_1.a().a((ajf_1)bpl_03, bpl_0.ah);
    }

    public void h() {
        HashMap<Long, bpl_0> hashMap = this.j.i().g();
        hashMap.values().stream().filter(Objects::nonNull).forEach(bpl_02 -> fis_1.a().a((ajf_1)bpl_02, "isInCurrentDeck"));
    }

    public void i() {
    }

    private void v() {
        if (this.n != null) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("spellDeckDialog");
        fru_0 fru_02 = (fru_0)fyy_02.a("validateButton");
        this.n = new fbx_1();
        this.n.onCheckOut();
        this.n.setFile("6001078.xps");
        this.n.setAlignment(frs_0.e);
        fru_02.getAppearance().add(this.n);
    }

    private void w() {
        if (this.n != null) {
            fyy_0 fyy_02 = fpm_0.b().h().d("spellDeckDialog");
            fru_0 fru_02 = (fru_0)fyy_02.a("validateButton");
            if (fru_02 != null) {
                fru_02.getAppearance().c(this.n);
            }
            this.n = null;
        }
    }
}

