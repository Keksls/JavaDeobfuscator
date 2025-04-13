/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Insets;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cWa
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cWa.class);
    private static final cWa b = new cWa();
    private bkb_2 c;
    private boolean d;
    private ans_1 e;

    public static cWa a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17396: {
                this.c.a();
                this.a(true);
                return false;
            }
            case 17809: {
                this.c.b();
                this.a(true);
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
        if (!bl) {
            if (this.c == null) {
                a.error((Object)"Impossible de charger l'affichage, il manque les donn\u00e9es !");
                return;
            }
            this.e = new cwb_0(this);
            fpm_0.b().a(this.e);
            fis_1.a().a("backgroundDisplay", this.c);
            fpm_0.b().a("backgroundDisplayDialog", cfi_0.a("backgroundDisplayDialog"), 256L, (short)30000);
            fyy_0 fyy_02 = fpm_0.b().h().d("backgroundDisplayDialog");
            bka_2 bka_22 = this.c.c();
            fqm_0 fqm_02 = (fqm_0)fyy_02.a("margin1");
            this.a(fqm_02, bka_22.c(), bka_22.g());
            fqm_0 fqm_03 = (fqm_0)fyy_02.a("margin2");
            this.a(fqm_03, bka_22.g(), bka_22.c());
            this.a(false);
            fpm_0.b().a("wakfu.background", cFD.class);
            cdw_0.n().c((long)bka_22.h());
        }
    }

    private void a(fqm_0 fqm_02, int n, int n2) {
        if (fqm_02 != null && this.c != null) {
            Insets insets = new Insets(50, n, 50, n2);
            fso fso2 = fqm_02.getParentOfType(fso.class);
            fso2.getAppearance().setMargin(insets);
            fso2.getContainer().getLayoutManager().a(fso2);
        }
    }

    private void a(boolean bl) {
        int n;
        fyy_0 fyy_02 = fpm_0.b().h().d("backgroundDisplayDialog");
        ArrayList<fqt> arrayList = new ArrayList<fqt>();
        fvE fvE2 = null;
        if (!bl) {
            fvE2 = (fvE)fyy_02.a("background");
            if (fvE2 != null) {
                arrayList.add(fvE2.getAppearance());
            }
            if ((fvE2 = (fvE)fyy_02.a("closeButton")) != null) {
                arrayList.add(fvE2.getAppearance());
            }
            if ((fvE2 = (fvE)fyy_02.a("previousButton")) != null) {
                arrayList.add(fvE2.getAppearance());
            }
            if ((fvE2 = (fvE)fyy_02.a("nextButton")) != null) {
                arrayList.add(fvE2.getAppearance());
            }
        }
        for (n = 1; n <= 10; ++n) {
            fvE2 = (fvE)fyy_02.a("text" + n);
            if (fvE2 == null) continue;
            arrayList.add(fvE2.getAppearance());
        }
        for (n = 1; n <= 6; ++n) {
            fvE2 = (fvE)fyy_02.a("image" + n);
            if (fvE2 == null) continue;
            arrayList.add(fvE2.getAppearance());
        }
        if (fvE2 != null) {
            azf_2 azf_22 = new azf_2(azf_2.b.i());
            azf_2 azf_23 = new azf_2(azf_2.e.i());
            fvE2.addTween(new fjo_2(azf_22, azf_23, arrayList, 0, 500, 1, fjw_2.b));
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            int n = this.c != null ? this.c.c().i() : 600149;
            this.c = null;
            fpm_0.b().b(this.e);
            fis_1.a().a("backgroundDisplay");
            fpm_0.b().o("backgroundDisplayDialog");
            fpm_0.b().e("wakfu.background");
            cdw_0.n().c((long)n);
        }
    }

    public void a(int n) {
        this.a(n, true);
    }

    public void a(int n, boolean bl) {
        this.d = bl;
        bky_2 bky_22 = bkz_2.a.a(n);
        if (bky_22 == null) {
            return;
        }
        bkd_2[] bkd_2Array = bky_22.c();
        bke_2[] bke_2Array = new bke_2[bkd_2Array.length];
        for (bkd_2 bkd_22 : bkd_2Array) {
            bke_2Array[bkd_22.b()] = new bke_2(bkd_22.a(), bkd_22.b(), bkd_22.d(), bkd_22.c());
        }
        this.c = new bkb_2(bky_22.a(), bke_2Array);
    }
}

