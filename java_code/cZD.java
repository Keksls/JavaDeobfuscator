/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cZD
extends cVb {
    protected static final Logger b = Logger.getLogger(cZD.class);
    private static final cZD c = new cZD();
    btw_2 d;
    bdh_0 e;
    private int f;
    private fzi g;
    private ans_1 h;

    public static cZD d() {
        return c;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18960: {
                String string = bae.h().a("question.havenWorldResourcesCollectorConfirm", this.d.b());
                fzn_0 fzn_02 = new fzn_0(102, 0, string, null, cfn_0.a(8), 24L);
                fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
                fzm_02.a(new cze_0(this));
                return false;
            }
            case 18128: {
                this.d.a(((dgH)adt_12).k());
                return false;
            }
            case 17594: {
                if (this.d.e() >= this.f) {
                    aUh.a("maxItemsCountReached", new Object[0]);
                    return false;
                }
                dgL dgL2 = (dgL)adt_12;
                long l = dgL2.d();
                short s2 = dgL2.u();
                bmr_1 bmr_12 = azu_0.j().k();
                bHi bHi2 = bmr_12.da();
                exk_2 exk_22 = dgL2.o() == null ? bHi2.i(l) : dgL2.o();
                ezr_0<?> ezr_02 = exk_22.T();
                if (ezr_02.a(exz_1.d) != null && !ezr_02.a(exz_1.d).b(bmr_12, -1, ezr_02, bmr_12.ge())) {
                    b.warn((Object)"Impossible d'ajouter l'item");
                    aUh.a("storageBox.addItem.unauthorized", new Object[0]);
                    return false;
                }
                this.d.a(exk_22, s2);
                return false;
            }
        }
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
        super.a(aav_22, bl);
        if (!bl) {
            if (this.e == null || this.d == null) {
                return;
            }
            fis_1.a().a("havenWorldResourcesCollector", this.d);
            this.g = new cZF(this);
            cff_0.b().a(this.g);
            this.h = new cZH(this);
            fpm_0.b().a(this.h);
            fpm_0.b().a("havenWorldResourcesCollectorDialog", cfi_0.a("havenWorldResourcesCollectorDialog"), 1L, (short)10000);
            fyy_0 fyy_02 = fpm_0.b().h().d("havenWorldResourcesCollectorDialog");
            fsQ fsQ2 = (fsQ)fyy_02.a("itemList");
            this.f = fsQ2.getIdealSizeMaxColumns() * fsQ2.getIdealSizeMaxRows();
            fpm_0.b().a("wakfu.havenWorldResourcesCollector", chq_0.class);
            if (!this.a) {
                azu_0.j().k().da().c();
            }
            azu_0.j().b(dei.a());
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        super.b(aav_22, bl);
        if (!bl) {
            azu_0.j().a(dei.a());
            azu_0.j().b(this.e.Z());
            fis_1.a().a("havenWorldResourcesCollector");
            fpm_0.b().b(this.h);
            cff_0.b().b(this.g);
            fpm_0.b().o("havenWorldResourcesCollectorDialog");
            fpm_0.b().e("wakfu.havenWorldResourcesCollector");
        }
    }

    public void a(bdh_0 bdh_02) {
        this.e = bdh_02;
    }

    public btw_2 e() {
        return this.d;
    }

    public void a(btw_2 btw_22) {
        this.d = btw_22;
    }

    public boolean b(long l) {
        return this.d.a(l);
    }

    public void f() {
        fis_1.a().a("havenWorldResourcesCollector", this.d);
    }
}

