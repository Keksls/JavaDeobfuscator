/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cZd
 */
public class czd_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(czd_0.class);
    private static final czd_0 b = new czd_0();
    private int c;
    private ans_1 d;

    public static czd_0 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        adt_12.a();
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(int n) {
        if (this.c == n) {
            return;
        }
        this.c = n;
        this.c();
    }

    private void c() {
        fyy_0 fyy_02 = fpm_0.b().h().d("frescoDialog");
        if (fyy_02 == null) {
            a.warn((Object)"Impossible de trouver l'elementMap");
            return;
        }
        fte_0 fte_02 = (fte_0)fyy_02.a("multipleImage");
        try {
            fte_02.setParticlePath(azs_0.a().a(800248));
            String string = String.format(azs_0.a().a("frescoPath"), this.c);
            fte_02.setImagePath(string);
        }
        catch (gm_0 gm_02) {
            a.warn((Object)"Probl\u00e8me de Property", (Throwable)gm_02);
        }
    }

    private void a(int n, int n2, int n3) {
        fyy_0 fyy_02 = fpm_0.b().h().d("frescoDialog");
        ArrayList<fqt> arrayList = new ArrayList<fqt>();
        fvE fvE2 = (fvE)fyy_02.a("closeButton");
        if (fvE2 != null) {
            arrayList.add(fvE2.getAppearance());
        }
        if ((fvE2 = (fvE)fyy_02.a("multipleImage")) != null) {
            arrayList.add(fvE2.getAppearance());
        }
        if ((fvE2 = (fvE)fyy_02.a("leftArrowContainer")) != null) {
            arrayList.add(fvE2.getAppearance());
        }
        if ((fvE2 = (fvE)fyy_02.a("rightArrowContainer")) != null) {
            arrayList.add(fvE2.getAppearance());
        }
        if ((fvE2 = (fvE)fyy_02.a("mainWindow")) != null) {
            arrayList.add(fvE2.getAppearance());
        }
        if (fvE2 != null) {
            azf_2 azf_22 = new azf_2(n);
            azf_2 azf_23 = new azf_2(n2);
            fvE2.addTween(new fjo_2(azf_22, azf_23, arrayList, 0, n3, 1, fjw_2.b));
        }
    }

    private void d() {
        this.a(azf_2.b.i(), azf_2.e.i(), 1000);
        cdw_0.n().b(0.2f, 1000);
        cdw_0.n().a(0.4f, 1000);
    }

    private void e() {
        this.a(azf_2.e.i(), azf_2.b.i(), 250);
        cdw_0.n().b(1.0f, 300);
        cdw_0.n().a(1.0f, 300);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = new cZe(this);
            fpm_0.b().a(this.d);
            fyb_0 fyb_02 = fpm_0.b().a("frescoDialog", cfi_0.a("frescoDialog"), 257L, (short)10000);
            fyy_0 fyy_02 = fyb_02.getElementMap();
            fte_0 fte_02 = (fte_0)fyy_02.a("multipleImage");
            fvE fvE2 = (fvE)fyy_02.a("leftArrowContainer");
            fvE fvE3 = (fvE)fyy_02.a("rightArrowContainer");
            fte_02.setImageListener(new czf_0(this, fvE2, fvE3));
            fvE2.setVisible(false);
            this.c();
            this.d();
            fpm_0.b().a("wakfu.fresco", chc_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.d);
            this.e();
            fpm_0.b().e("wakfu.fresco");
            ado_1.a().a(new czg_0(this), 250L, 1);
        }
    }
}

