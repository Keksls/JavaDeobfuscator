/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ddE
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(ddE.class);
    private static final ddE b = new ddE();
    private String c;
    private boolean d;
    acb_0 e;
    final Runnable f = new ddF(this);
    private ans_1 g;

    public static ddE a() {
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

    public void a(String string) {
        this.c = string;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            if (this.c == null) {
                a.error((Object)"Impossible de charger la frame de lecture video sans d\u00e9finir la video \u00e0 jouer");
                return;
            }
            this.g = string -> {
                if (string.equals("videoLoadingDialog")) {
                    azu_0.j().b(ddE.a());
                }
            };
            fpm_0.b().a(this.g);
            azu_2 azu_22 = ans_0.D().e();
            ace_0 ace_02 = ans_0.D().c();
            azu_22.a(ace_02);
            cdw_0.n().b(false);
            if (!this.c()) {
                azu_0.j().b(ddE.a());
            }
            fpm_0.b().a("wakfu.videoLoading", cjy_0.class);
            fis_1.a().a("isNewWorldReady", false);
            ado_1.a().a(this.f, 500L);
        }
    }

    public void a(acb_0 acb_02) {
        this.e = acb_02;
    }

    private boolean c() {
        try {
            fyb_0 fyb_02 = fpm_0.b().a("videoLoadingDialog", cfi_0.a("videoLoadingDialog"), 8448L, (short)19500);
            fvp fvp2 = (fvp)fyb_02.getElementMap().a("video");
            fvp2.setDebugMode(this.d);
            fvp2.setVideoPath(this.c);
            fvp2.a();
            fvp2.setPaused(false);
            fvp2.a(new ddG(this));
            return true;
        }
        catch (Exception exception) {
            a.error((Object)("Erreur durant la tentative de lecture de la video " + this.c), (Throwable)exception);
            fpm_0.b().o("videoLoadingDialog");
            return false;
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            azu_2 azu_22 = ans_0.D().e();
            ace_0 ace_02 = ans_0.D().c();
            azu_22.a(ace_02, false);
            cdw_0.n().b(true);
            this.c = null;
            fpm_0.b().b(this.g);
            fpm_0.b().o("videoLoadingDialog");
            this.e = null;
            fis_1.a().a("isNewWorldReady");
            fpm_0.b().e("wakfu.videoLoading");
        }
    }
}

