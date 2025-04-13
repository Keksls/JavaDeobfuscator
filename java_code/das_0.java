/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from das
 */
public class das_0
implements ahr_1 {
    private static final Logger a = Logger.getLogger(das_0.class);
    private static final das_0 b = new das_0();
    private ans_1 c;
    private long d;
    private Runnable e;
    private fil_1 f;
    private fil_1 g;
    private fil_1 h;
    private final fjx_1 i = new fjx_1();
    private fww j;

    public static das_0 a() {
        return b;
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
                float f2 = ble_1.E().g() + 0.1f;
                ble_1.E().a(Math.max(f2, 1.0f));
                return false;
            }
            case 17135: {
                float f3 = ble_1.E().g() - 0.1f;
                ble_1.E().a(Math.min(0.0f, f3));
                return false;
            }
            case 19325: {
                dfc dfc3 = (dfc)adt_12;
                ble_1.E().a((float)dfc3.f());
                return false;
            }
        }
        return true;
    }

    public final void a(fcg_2 fcg_22) {
        fsY fsY2 = (fsY)fcg_22.e();
        fww fww2 = fsY2.getSelectedMapZone();
        if (this.j == fww2) {
            return;
        }
        this.j = fww2;
        ble_1.E().H();
        if (this.j == null) {
            fta_0.getInstance().getPopupContainer().b();
            return;
        }
        fws fws2 = (fws)fww2.w();
        if (!fws2.e()) {
            return;
        }
        String string = fws2.bc_();
        if (string == null || string.isEmpty()) {
            return;
        }
        fis_1.a().a("mapPopupDescription", (Object)string);
        try {
            fis_1.a().a("currentMapScrollDecoratorPath", (Object)String.format(azs_0.a().a("mapScrollDecoratorPath"), fws2.b()));
        }
        catch (gm_0 gm_02) {
            a.warn((Object)gm_02.getMessage());
        }
        int n = fww2.q();
        int n2 = fww2.s();
        int n3 = fww2.r();
        int n4 = fww2.t();
        int n5 = (int)((float)n / 86.0f - (float)n2 / 43.0f);
        int n6 = (int)(-((float)n / 86.0f + (float)n2 / 43.0f));
        int n7 = (int)((float)n3 / 86.0f - (float)n4 / 43.0f);
        int n8 = (int)(-((float)n3 / 86.0f + (float)n4 / 43.0f));
        afe_1 afe_12 = fsY2.isoToScreen(n5, n6, true);
        afe_1 afe_13 = fsY2.isoToScreen(n7, n8, true);
        int n9 = afe_13.a() - afe_12.a();
        int n10 = afe_13.b() - afe_12.b();
        this.i.a(afe_12.a() + fsY2.getScreenX() + fsY2.getAppearance().getContentWidth() / 2 - n9 / 2);
        this.i.b(afe_12.b() + fsY2.getScreenY());
        this.i.c(n9);
        this.i.d(n10);
        this.h.b(this.i);
    }

    public final void a(fci_2 fci_22) {
        String string = fci_22.o().e();
        if (!fci_22.o().n() && (string == null || string.isEmpty())) {
            return;
        }
        fis_1.a().a("mapPopupDescription", (Object)string);
        fsS fsS2 = (fsS)fci_22.e();
        this.i.a(fci_22.k() + fsS2.getScreenX() - fci_22.m() / 2);
        this.i.b(fci_22.l() + fsS2.getScreenY() - fci_22.n() / 2);
        this.i.c(fci_22.m());
        this.i.d(fci_22.n());
        if (this.i.getDisplayX() < fta_0.getInstance().getWidth() / 2) {
            this.f.b(this.i);
        } else {
            this.g.b(this.i);
        }
    }

    public final boolean c() {
        return fis_1.a().c("mapPopupIsEditing");
    }

    public final void a(boolean bl) {
        fyy_0 fyy_02;
        fis_1.a().a("mapPopupIsEditing", bl);
        if (bl && (fyy_02 = fta_0.getInstance().getPopupContainer().getElementMap()) != null) {
            fug_0 fug_02 = (fug_0)fyy_02.a("textEditor");
        }
    }

    public final void d() {
        fta_0.getInstance().getPopupContainer().b();
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    void e() {
        long l = System.currentTimeMillis();
        if (l - this.d > 30000L) {
            this.d = l;
            cql_0 cql_02 = new cql_0();
            azu_0.j().K().c(cql_02);
        }
    }

    public static void a(fru_0 fru_02, float f2) {
        fjf_2 fjf_22 = fru_02.getPrefSize();
        if (fjf_22 == null) {
            return;
        }
        fru_02.setSize((int)((float)fjf_22.width * f2), (int)((float)fjf_22.height * f2));
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new dat(this);
            fpm_0.b().a(this.c);
            fis_1.a().a("landMarkGfxs", azu_0.j().k().dM().a());
            fis_1.a().a("compassGfx", azu_0.j().k().dM().b());
            blc_1 blc_12 = ble_1.E().z();
            blc_12.a(new bum_0());
            blc_12.a(bLt.b);
            blc_12.i();
            ble_1.E().b();
            ble_1.E().a(((bvx_0)ans_0.D().h()).a(bWe.T));
            this.f = this.a("mapEditablePopup");
            this.g = this.a("mapEditablePopup2");
            this.h = this.a("completeMapPopup");
            fvE fvE2 = (fvE)fpm_0.b().a("mapDialog", cfi_0.a("mapDialog"), 1L, (short)10000);
            if (fvE2 == null) {
                return;
            }
            fvE2.setVisible(false);
            fyy_0 fyy_02 = fpm_0.b().h().d("mapDialog");
            if (fyy_02 != null) {
                fsY fsY2 = (fsY)fyy_02.a("map");
                fsY2.a(new dau_0(this, fvE2));
                ble_1.E().a(fsY2);
            }
            this.i.a(fyy_02);
            cha_0.reset();
            fpm_0.b().a("wakfu.map", cha_0.class);
            cdw_0.n().c(600021L);
            this.e();
            this.a(false);
            this.e = new dav_0(this);
            ado_1.a().a(this.e, 30000L, -1);
            cdw_0.n().a(0.1f, 1000);
            cdw_0.n().b(0.1f, 1000);
        }
    }

    private fil_1 a(String string) {
        fpm_0.b().a(string, cfi_0.a(string), 8200L, (short)10000);
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 != null) {
            return (fil_1)fyy_02.a("popup");
        }
        return null;
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fpm_0.b().o("mapDialog");
            fpm_0.b().o("mapEditablePopup");
            fpm_0.b().o("mapEditablePopup2");
            fpm_0.b().o("completeMapPopup");
            this.f = null;
            this.g = null;
            this.h = null;
            this.i.a(null);
            fis_1.a().a("landMarkGfxs");
            ble_1.E().a((fsY)null);
            bup_0.a().c();
            cha_0.setCurrentWorldPositionMarker(null);
            cha_0.setCurrentNote(null);
            fpm_0.b().e("wakfu.map");
            cdw_0.n().c(600022L);
            fyt_0.a().c();
            ado_1.a().b(this.e);
            this.e = null;
            cha_0.reset();
            cdw_0.n().a(1.0f, 1000);
            cdw_0.n().b(1.0f, 1000);
        }
    }
}

