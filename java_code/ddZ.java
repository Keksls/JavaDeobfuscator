/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class ddZ
extends cur_0
implements esr_1 {
    private static final boolean b = false;
    static final Logger c = Logger.getLogger(ddZ.class);
    private static final ddZ d = new ddZ();
    cks_2 e;
    private bto_2 f;
    private final fkc_0 g = new fkc_0(new cdk_1());
    private int h;
    private csi_1 i;
    private ans_1 j;
    private long k;

    public static ddZ d() {
        return d;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18623: {
                dgy_0 dgy_02 = (dgy_0)adt_12;
                bue_2 bue_22 = dgy_02.k();
                switch (bue_22.g()) {
                    case a: {
                        this.e.setTool(new cLb((etn_2)bue_22.i()));
                        break;
                    }
                    case b: {
                        this.e.setTool(new cKZ((etk_2)bue_22.i()));
                    }
                }
                fis_1.a().a("havenWorldSelectedCatalogEntry", bue_22);
                this.l();
                return false;
            }
            case 18913: {
                dgc_0 dgc_02 = (dgc_0)adt_12;
                btd_2 btd_22 = dgc_02.k();
                cLm cLm2 = btd_22.c();
                if (cLm2 == null) {
                    return false;
                }
                ArrayList<fkN> arrayList = this.a(cLm2);
                if (!arrayList.isEmpty()) {
                    this.a(arrayList, cLm2);
                    return false;
                }
                cLm2.a(this.e);
                this.f.b(btd_22);
                this.f();
                bue_2 bue_23 = btd_22.b();
                fis_1.a().a((ajf_1)bue_23, bue_23.d());
                fis_1.a().a("havenWorldSelectedCatalogEntry", (Object)null);
                if (this.f.a() == 0) {
                    fis_1.a().a("havenWorldCatalogQuotationMode", false);
                }
                return false;
            }
            case 16051: {
                dfc dfc2 = (dfc)adt_12;
                this.f.a(dfc2.b());
                this.e.setCurrentLayer(this.f.c());
                fis_1.a().a("havenWorldCatalogQuotationMode", false);
                this.l();
                return false;
            }
            case 19778: {
                String string = bae.h().a("question.havenWorldModificationConfirm", new Object[0]);
                fzn_0 fzn_02 = new fzn_0(102, 0, string, null, cfn_0.a(8), 24L);
                fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
                fzm_02.a(new dea_0(this));
                this.l();
                return false;
            }
            case 18597: {
                dgb_0 dgb_02 = (dgb_0)adt_12;
                this.a(dgb_02);
                return false;
            }
            case 18468: {
                return false;
            }
            case 17781: {
                return false;
            }
            case 18228: {
                dga_0 dga_02 = (dga_0)adt_12;
                cLm cLm3 = dga_02.k();
                cLm3.e(this.e);
                this.b(dga_02.o(), cLm3);
                return false;
            }
        }
        return true;
    }

    private ArrayList<fkN> a(cLm cLm2) {
        Object t = cLm2.e();
        if (t instanceof fkv_0) {
            fkI fkI2 = new fkI(this.e.getWorkingHavenWorld());
            fkv_0 fkv_02 = (fkv_0)t;
            fkI2.a(fkv_02.e(), fkv_02.g());
            return fkI2.a();
        }
        if (cLm2 instanceof cLj) {
            fkf_0 fkf_02 = new fkf_0(this.e.getWorkingHavenWorld(), cck_2.a);
            cLj cLj2 = (cLj)cLm2;
            fkw fkw2 = (fkw)cLj2.e();
            fkf_02.a(cLj2.b(), fkw2.e(), fkw2.g());
            return fkf_02.a();
        }
        if (t instanceof fkr_0) {
            return this.a((fkt_0)t, cLm2.a().a());
        }
        throw new UnsupportedOperationException("modification non prise en compte " + t);
    }

    void n() {
        bmr_1 bmr_12 = azu_0.j().k();
        cnc_0 cnc_02 = new cnc_0(bmr_12.a_());
        for (btd_2 btd_22 : this.f.b()) {
            esl_2 esl_22 = this.a(btd_22);
            if (esl_22 == null) continue;
            cnc_02.a(esl_22);
        }
        azu_0.j().K().c(cnc_02);
        this.h = this.f.a();
        fis_1.a().a("havenWorldCatalogQuotationMode", false);
        this.f.j();
    }

    private esl_2 a(btd_2 btd_22) {
        esl_2 esl_22 = null;
        cLm cLm2 = btd_22.c();
        afe_1 afe_12 = cLm2.f();
        bue_2 bue_22 = btd_22.b();
        switch (bue_22.g()) {
            case e: {
                esl_22 = new etd_1(fkh_0.e(afe_12.a()), fkh_0.f(afe_12.b()));
                break;
            }
            case b: {
                switch (cLm2.a()) {
                    case a: {
                        int n = ((buc_2)bue_22).h();
                        esl_22 = new esg_2((short)n, (short)afe_12.a(), (short)afe_12.b());
                        this.f.f();
                        break;
                    }
                    case b: {
                        esl_22 = new esh_2(cLm2.e().d());
                        this.f.f();
                        break;
                    }
                    case c: {
                        esl_22 = new esk_2(cLm2.e().d(), (short)afe_12.a(), (short)afe_12.b());
                    }
                }
                break;
            }
            case a: {
                cLj cLj2 = (cLj)cLm2;
                short s2 = (short)fkk_0.b(afe_12.a());
                short s3 = (short)fkk_0.c(afe_12.b());
                short s4 = ((etn_2)bue_22.i()).b();
                short s5 = cLj2.b();
                esl_22 = new ete_1(s2, s3, s4, s5);
                break;
            }
        }
        return esl_22;
    }

    public void e() {
        fyt_0.a().c();
        fzd_0.a().d();
    }

    private void a(ArrayList<fkN> arrayList, cLm cLm2) {
        ani_2 ani_22 = new ani_2();
        String string = btz_2.a(cLm2.e());
        if (cLm2.a() == cLn.a || cLm2.a() == cLn.b) {
            ani_22.a((CharSequence)bae.h().a("havenWorldBoardConflictOnRevertMessage", string)).m();
            this.a(arrayList, ani_22);
        } else {
            ani_22.a((CharSequence)bae.h().a("havenWorldBoardConflictMessage", string)).m();
        }
        fis_1.a().a("havenWorldConflictList", (Object)ani_22.r());
    }

    private void b(ArrayList<fkN> arrayList, cLm cLm2) {
        ani_2 ani_22 = new ani_2();
        String string = btz_2.a(cLm2.e());
        ani_22.a((CharSequence)bae.h().a("havenWorldBoardConflictMessage", string)).m();
        this.a(arrayList, ani_22);
        fis_1.a().a("havenWorldConflictList", (Object)ani_22.r());
    }

    private void a(ArrayList<fkN> arrayList, ani_2 ani_22) {
        for (int k = 0; k < arrayList.size(); ++k) {
            fkN fkN2 = arrayList.get(k);
            c.error((Object)fkN2);
            ddZ.a(ani_22, fkN2);
            this.e.e(fkN2.c());
            if (fkN2 instanceof fkS || fkN2 instanceof fkM) continue;
            c.error((Object)("Erreur non g\u00e9r\u00e9e = " + fkN2.toString()));
        }
    }

    private static void a(ani_2 ani_22, fkN fkN2) {
        afe_1 afe_12 = fkN2.d();
        String string = btz_2.a(fkN2.c());
        ani_22.m().i();
        ani_22.c(afe_12.a() + ";" + afe_12.b());
        ani_22.a().g().a((CharSequence)string).h().b();
        ani_22.a((CharSequence)" ").a((CharSequence)bae.h().a(fkN2.a().name(), new Object[0]));
        ani_22.j();
    }

    private void a(ani_2 ani_22, long l, bue_2 bue_22) {
        ani_22.a().g();
        ani_22.c(String.valueOf(l));
        ani_22.a((CharSequence)bue_22.c());
        ani_22.h().b();
    }

    private void a(dgb_0 dgb_02) {
        cLm cLm2 = dgb_02.k();
        switch (cLm2.a()) {
            case a: {
                etl_2 etl_22 = cLm2.g();
                if (etl_22 instanceof etk_2) {
                    this.c(cLm2);
                    break;
                }
                if (etl_22 instanceof etn_2) {
                    this.a(cLm2, (etn_2)etl_22);
                    break;
                }
                this.b(cLm2);
                break;
            }
            case b: {
                fzm_0 fzm_02 = cfl_0.createDeleteMessageBox();
                fzm_02.a(new deb_0(this, cLm2));
                break;
            }
            case c: {
                String string = bae.h().a("question.havenWorldMoveBuilding", new Object[0]);
                fzn_0 fzn_02 = new fzn_0(102, 0, string, null, cfn_0.a(8), 24L);
                fzm_0 fzm_03 = fpm_0.b().a(fzn_02);
                fzm_03.a(new dec(this, cLm2));
                break;
            }
            case d: {
                btd_2 btd_22 = this.f.a(cLm2);
                if (btd_22 == null) {
                    c.warn((Object)"\u00c9l\u00e9m\u00e9nt n'appartenant pas au devis, todo design");
                    return;
                }
                fis_1.a().a("havenWorldCatalogQuotationMode", true);
                fis_1.a().a("havenWorldSelectedCatalogEntry", btd_22);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void b(cLm cLm2) {
        if (!this.g.b(this.a.h())) {
            cLm2.a(this.e);
            this.g();
        } else {
            cdw_0.n().c(600182L);
            this.d(cLm2);
        }
    }

    private void a(cLm cLm2, etn_2 etn_22) {
        if (!this.g.b(etn_22.a())) {
            cLm2.a(this.e);
            this.g();
            return;
        }
        int n = bte_2.a.b(etn_22.j());
        if (n != -1) {
            cdw_0.n().c((long)n);
        }
        this.d(cLm2);
    }

    private void c(cLm cLm2) {
        fkr_0 fkr_02 = (fkr_0)cLm2.e();
        etw_2 etw_22 = fkr_02.e().g();
        if (etw_22 == null) {
            cLm2.a(this.e);
            return;
        }
        fkz fkz2 = new fkz(this.g);
        fkz2.a(fkr_02.e());
        if (fkz2.b(fkO.d)) {
            this.h();
        }
        if (fkz2.b(fkO.b)) {
            this.g();
        }
        if (fkz2.b(fkO.f)) {
            c.error((Object)"Manque des batiement ");
        }
        if (fkz2.b(fkO.g)) {
            this.p();
        }
        if (fkz2.b()) {
            cLm2.a(this.e);
            return;
        }
        int n = bte_2.a.a(fkr_02.c().i());
        if (n != -1) {
            cdw_0.n().c((long)n);
        }
        this.d(cLm2);
    }

    private void d(cLm cLm2) {
        bue_2 bue_22 = bua_2.a.a(cLm2.g());
        btd_2 btd_22 = btd_2.a(bue_22);
        btd_22.a(cLm2);
        this.b(btd_22);
        fis_1.a().a((ajf_1)bue_22, bue_22.d());
    }

    private ArrayList<fkN> a(fkt_0 fkt_02, cLn cLn2) {
        fkc_0 fkc_02 = new fkc_0(this.g);
        this.a(fkc_02, fkt_02, cLn2);
        fkJ fkJ2 = new fkJ(fkc_02);
        fkJ2.e();
        return fkJ2.a();
    }

    private boolean e(cLm cLm2) {
        ArrayList<fkN> arrayList = this.a((fkt_0)cLm2.e(), cLm2.a());
        if (arrayList.isEmpty()) {
            return true;
        }
        add_2.b().a(new dga_0(cLm2, arrayList));
        return false;
    }

    private void b(btd_2 btd_22) {
        if (!this.f.a(btd_22)) {
            cKl.cancelAction();
            btd_22.c().a(this.e);
            String string = bae.h().a("havenWorldErrorTooMuchActions", new Object[0]);
            fpm_0.b().a(string, cfn_0.a(1), 3L, 102, 1);
        }
        this.f();
        if (!this.f.a(btd_22.b())) {
            cKl.cancelAction();
            this.e.setSelectTool();
        }
    }

    public void f() {
        this.g.a(this.k, this.a);
        for (btd_2 btd_22 : this.f.b()) {
            cLm cLm2 = btd_22.c();
            this.a(this.g, (fkt_0)cLm2.e(), cLm2.a());
        }
        this.f.a(this.g);
        this.f.f();
    }

    private void a(fkc_0 fkc_02, fkt_0 fkt_02, cLn cLn2) {
        Object t = fkt_02.f();
        if (t instanceof etk_2) {
            fkr_0 fkr_02 = (fkr_0)fkt_02;
            if (cLn2 == cLn.a) {
                fkc_02.a(fkr_02.e());
            }
            if (cLn2 == cLn.b) {
                fkc_02.b(fkr_02.e());
            }
            return;
        }
        if (t instanceof etm_2) {
            etm_2 etm_22 = (etm_2)t;
            fkc_02.a(etm_22);
            return;
        }
        if (t instanceof etn_2) {
            etn_2 etn_22 = (etn_2)t;
            fkc_02.a(etn_22);
            return;
        }
    }

    public btd_2 a(fkr_0 fkr_02) {
        return this.f.a(fkr_02.d(), fks_0.b);
    }

    public ese_1 b(long l) {
        return this.a.a(l);
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
            if (this.a == null) {
                return;
            }
            this.j = new ded(this);
            fpm_0.b().a(this.j);
            this.i = cco_1.a;
            fpm_0.b().a("wakfu.worldEditor", cKl.class);
            fyb_0 fyb_02 = fpm_0.b().a("worldEditorDialog", cfi_0.a("worldEditorDialog"), 256L, (short)10005);
            this.o();
            this.e = (cks_2)fyb_02.getElementMap().a("worldEditor");
            this.e.a(cci_2.a.e(), this.i);
            this.e.setTool(new cLd());
            def def2 = new def();
            this.a.a(def2);
            afe_1 afe_12 = def2.a();
            if (afe_12 != null) {
                this.e.a(afe_12.a(), afe_12.b());
            }
            azu_0.j().k().bv().a(this);
            fis_1.a().a("havenWorldConflictList", (Object)null);
            fis_1.a().a("havenWorldCatalogPlacingMode", false);
            cdw_0.n().c(600012L);
            cdw_0.n().b(0.2f, 1000);
            cdw_0.n().a(0.2f, 1000);
        }
        super.a(aav_22, bl);
    }

    @Override
    public ese_1 c() {
        Object object = fis_1.a().e("selectedBuilding");
        if (object == null) {
            return null;
        }
        long l = ((btv_2)object).g();
        return this.a.a(l);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            cKl.stopScroll(null);
            this.e();
            this.a = null;
            fpm_0.b().b(this.j);
            cuo_0.e().b();
            this.i = null;
            this.h = 0;
            if (this.f != null) {
                this.f.i();
            }
            this.f = null;
            fis_1.a().a("havenWorldCatalog");
            fis_1.a().a("havenWorldConflictList");
            if (this.e != null) {
                this.e.getHavenWorldImages().c();
            }
            fpm_0.b().o("worldEditorDialog");
            fpm_0.b().e("wakfu.worldEditor");
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12 != null) {
                bmr_12.dN();
                bmr_12.bv().b(this);
            }
            cdw_0.n().c(600013L);
            cdw_0.n().b(1.0f, 1000);
            cdw_0.n().a(1.0f, 1000);
        }
        this.e = null;
        super.b(aav_22, bl);
    }

    private void o() {
        this.f = new bto_2(this.g);
        this.f();
        fis_1.a().a("havenWorldCatalog", this.f);
        fis_1.a().a("havenWorldCatalogQuotationMode", false);
        fis_1.a().a("havenWorldSelectedCatalogEntry", (Object)null);
    }

    private void p() {
        fyy_0 fyy_02 = fpm_0.b().h().d("worldEditorDialog");
        fvE fvE2 = (fvE)fyy_02.a("resourceCostContainer");
        this.a(fvE2);
    }

    public void g() {
        fyy_0 fyy_02 = fpm_0.b().h().d("worldEditorDialog");
        fvE fvE2 = (fvE)fyy_02.a("moneyCostContainer");
        this.a(fvE2);
    }

    public void h() {
        fyy_0 fyy_02 = fpm_0.b().h().d("worldEditorDialog");
        fvE fvE2 = (fvE)fyy_02.a("sidoaCostContainer");
        this.a(fvE2);
    }

    private void a(fvE fvE2) {
        azj_2 azj_22 = fvE2.getAppearance().getModulationColor() == null ? azf_2.e : fvE2.getAppearance().getModulationColor();
        azf_2 azf_22 = azf_2.b;
        fjp_2 fjp_22 = new fjp_2(azj_22, azf_22, fvE2.getAppearance(), 0, 250, 4, true, fjw_2.b);
        fvE2.getAppearance().addTween(fjp_22);
    }

    public void i() {
        if (this.h <= 0) {
            return;
        }
        anv_1 anv_12 = cuo_0.e().a();
        anv_12.a(1);
        --this.h;
        if (this.h <= 0) {
            fis_1.a().a((ajf_1)this.f, bto_2.k);
            cuo_0.e().b();
        }
    }

    public fkc_0 j() {
        return this.g;
    }

    public bto_2 k() {
        return this.f;
    }

    private void a(short s2, int n, short s3, short s4, long l, long l2) {
        new deg_0(this.a).a(s2, n, s3, s4, l, l2);
        ese_1 ese_12 = this.a.a(l);
        fkr_0 fkr_02 = new fkr_0(new cdj_1(ese_12));
        cLh cLh2 = new cLh(fkr_02);
        cLh2.b(this.e);
        this.a.c().a(this.a.c().e() - ese_12.a().g());
        this.a(this.a);
        this.f();
    }

    private void a(long l, short s2, short s3) {
        ese_1 ese_12 = this.a.a(l);
        this.d(l);
        this.a(ese_12.a().a(), ese_12.g(), s2, s3, l, ese_12.c());
    }

    private void a(long l, long l2) {
        ese_1 ese_12 = this.a.a(l);
        etg_2 etg_22 = eti_2.a.b(ese_12.a().a());
        short s2 = etg_22.c();
        this.d(l);
        this.a(s2, ese_12.g(), ese_12.d(), ese_12.e(), l, l2);
        this.a.c().a(this.a.c().e() - ese_12.a().g());
        this.a(this.a);
        this.f();
    }

    private void d(long l) {
        ese_1 ese_12 = this.a.a(l);
        fkr_0 fkr_02 = new fkr_0(new cdj_1(ese_12));
        cLk cLk2 = new cLk(fkr_02);
        new deg_0(this.a).a(l);
        cLk2.b(this.e);
        this.f();
    }

    public void a(esl_2 esl_22) {
        cLm cLm2 = this.b(esl_22);
        if (cLm2 != null) {
            cLm2.b(this.e);
        }
        if (esl_22.a() == esn_2.c) {
            esg_2 esg_22 = (esg_2)esl_22;
            this.a(esg_22.d(), 0, esg_22.e(), esg_22.f(), esg_22.b(), esg_22.c());
            return;
        }
        if (esl_22.a() == esn_2.j) {
            esk_2 esk_22 = (esk_2)esl_22;
            this.a(esk_22.b(), esk_22.c(), esk_22.d());
            return;
        }
        if (esl_22.a() == esn_2.d) {
            esh_2 esh_22 = (esh_2)esl_22;
            this.d(esh_22.b());
            return;
        }
        if (esl_22.a() == esn_2.e) {
            esj_2 esj_22 = (esj_2)esl_22;
            this.a(esj_22.b(), esj_22.d());
            return;
        }
    }

    public void a(esl_2 esl_22, esz_1 esz_12) {
        cLm cLm2 = this.b(esl_22);
        if (cLm2 != null) {
            cLm2.d(this.e);
        }
    }

    @Nullable
    private cLm b(esl_2 esl_22) {
        if (esl_22.a() == esn_2.c) {
            esg_2 esg_22 = (esg_2)esl_22;
            return new cLh(new fkr_0(new cdj_1(esg_22.b(), esg_22.d(), 0, esg_22.e(), esg_22.f())));
        }
        if (esl_22.a() == esn_2.d) {
            esh_2 esh_22 = (esh_2)esl_22;
            ese_1 ese_12 = this.a.a(esh_22.b());
            return new cLk(new fkr_0(new cdj_1(ese_12)));
        }
        if (esl_22.a() == esn_2.b) {
            ete_1 ete_12 = (ete_1)esl_22;
            etn_2 etn_22 = eti_2.a.d(ete_12.d());
            return new cLj(new fkw(etn_22, ete_12.b(), ete_12.c()), ete_12.e());
        }
        if (esl_22.a() == esn_2.j) {
            esk_2 esk_22 = (esk_2)esl_22;
            ese_1 ese_13 = this.a.a(esk_22.b());
            return new cLo(new fkr_0(new cdj_1(ese_13)), ese_13.d(), ese_13.e());
        }
        return null;
    }

    @Override
    public void a(esl_1 esl_12) {
        super.a(esl_12);
        this.g.a(esl_12);
        esl_12.a(this);
    }

    @Override
    public void pathStarted(afe_0 afe_02, apl_1 apl_12) {
        azu_0.j().b(this);
    }

    public void l() {
        fis_1.a().a("havenWorldConflictList", (Object)null);
        this.e.e();
        this.e.b();
    }

    public long m() {
        return this.k;
    }

    public void c(long l) {
        this.k = l;
        String string = bae.h().a(l);
        fis_1.a().a("guildMoney", (Object)string);
    }

    @Override
    public void a(int n) {
        this.f();
        if (this.f != null) {
            this.f.a(n);
        }
    }

    public int a(short s2) {
        etr_1 etr_12 = new etr_1(s2);
        this.g.a(etr_12);
        return etr_12.a();
    }
}

