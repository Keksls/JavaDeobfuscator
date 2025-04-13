/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cXX
implements ahr_1 {
    private static final Logger a = Logger.getLogger(cXX.class);
    private static final cXX b = new cXX();
    private ans_1 c;
    private long d;
    private Runnable e;
    private fil_1 f;
    private final fjx_1 g = new fjx_1();
    private bFN h;

    public static cXX a() {
        return b;
    }

    public void a(bFN bFN2) {
        this.h = bFN2;
        bLt.a.a(bFN2.a_());
        azu_0.j().a(this);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17212: {
                dfc dfc2 = (dfc)adt_12;
                ble_1.E().z().a(dfc2.b(), dfc2.i());
                return false;
            }
            case 18892: {
                float f2 = ble_1.E().g();
                float f3 = f2 + 0.1f;
                f2 = 1.0f < f3 ? 1.0f : f3;
                ble_1.E().a(f2);
                return false;
            }
            case 17135: {
                float f4 = ble_1.E().g();
                float f5 = f4 - 0.1f;
                f4 = 0.0f > f5 ? 0.0f : f5;
                ble_1.E().a(f4);
                return false;
            }
            case 19325: {
                dfc dfc3 = (dfc)adt_12;
                ble_1.E().a((float)dfc3.f());
                return false;
            }
            case 17770: {
                dfc dfc4 = (dfc)adt_12;
                long l = dfc4.d();
                fjA fjA2 = fjs.a.b(l);
                if (fjA2 == null) {
                    a.warn((Object)"On essaye de se t\u00e9l\u00e9porter sur une drago d'id inconnue ?");
                    return false;
                }
                long l2 = azu_0.j().n().u();
                if (!fjq_0.a(l2, ay_0.b, (int)l)) {
                    return false;
                }
                bmr_1 bmr_12 = azu_0.j().k();
                bqy_1 bqy_12 = (bqy_1)fjq_0.a(fjv.b);
                bqy_12.c(bmr_12, this.h, l);
                azu_0.j().b(this);
                return false;
            }
        }
        return true;
    }

    public final void a(fci_2 fci_22) {
        fis_1.a().a("mapPopupDescription", (Object)fci_22.o().e());
        fsS fsS2 = (fsS)fci_22.e();
        this.g.a(fci_22.k() + fsS2.getScreenX() - fci_22.m() / 2);
        this.g.b(fci_22.l() + fsS2.getScreenY() - fci_22.n() / 2);
        this.g.c(fci_22.m());
        this.g.d(fci_22.n());
        this.f.b(this.g);
    }

    public final void c() {
        fta_0.getInstance().getPopupContainer().b();
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    void d() {
        long l = System.currentTimeMillis();
        if (l - this.d > 30000L) {
            this.d = l;
            cql_0 cql_02 = new cql_0();
            azu_0.j().K().c(cql_02);
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            if (azu_0.j().c(das_0.a())) {
                azu_0.j().b(das_0.a());
            }
            this.c = new cXY(this);
            fpm_0.b().a(this.c);
            fis_1.a().a("landMarkGfxs", azu_0.j().k().dM().a());
            ble_1.E().z().a(bLt.a);
            ble_1.E().z().a(new bul_0());
            ble_1.E().b();
            ble_1.E().a(((bvx_0)ans_0.D().h()).a(bWe.T));
            ble_1.E().K();
            blf_1.a(false);
            fpm_0.b().a("dragoMapPopup", cfi_0.a("dragoMapPopup"), 8200L, (short)10000);
            fyy_0 fyy_02 = fpm_0.b().h().d("dragoMapPopup");
            if (fyy_02 != null) {
                this.f = (fil_1)fyy_02.a("popup");
            }
            fvE fvE2 = (fvE)fpm_0.b().a("dragoMapDialog", cfi_0.a("dragoMapDialog"), 1L, (short)10000);
            fyy_02 = fpm_0.b().h().d("dragoMapDialog");
            if (fyy_02 != null) {
                fru_0 fru_02 = (fru_0)fyy_02.a("closeMapButton");
                fsY fsY2 = (fsY)fyy_02.a("map");
                fsY2.a(new cxz_0(this, fvE2, fsY2, fru_02));
                ble_1.E().a(fsY2);
            }
            this.g.a(fyy_02);
            cge_0.reset();
            fpm_0.b().a("wakfu.dragoMap", cge_0.class);
            cdw_0.n().c(600021L);
            this.d();
            this.e = new cya_0(this);
            ado_1.a().a(this.e, 30000L, -1);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fpm_0.b().o("dragoMapDialog");
            fpm_0.b().o("dragoMapPopup");
            this.f = null;
            this.g.a(null);
            fis_1.a().a("landMarkGfxs");
            ble_1.E().a((fsY)null);
            bup_0.a().c();
            cge_0.setCurrentWorldPositionMarker(null);
            cge_0.setCurrentNote(null);
            fpm_0.b().e("wakfu.dragoMap");
            cdw_0.n().c(600022L);
            fyt_0.a().c();
            ado_1.a().b(this.e);
            this.e = null;
            cge_0.reset();
            ble_1.E().K();
            this.h = null;
        }
    }
}

