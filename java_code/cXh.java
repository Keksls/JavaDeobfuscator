/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cXh
implements ahr_1 {
    private static final Logger b = Logger.getLogger(cXh.class);
    public static final cXh a = new cXh();
    private fvp c;
    private String d;
    private float e = 1.0f;
    private boolean f;
    private cXj g;
    private boolean h = false;

    private cXh() {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (this.h) {
            return;
        }
        this.h = true;
        cXh.a();
        this.e();
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!this.h) {
            return;
        }
        this.h = false;
        cXh.g();
        this.f();
    }

    private void e() {
        this.g = new cXj();
        fis_1.a().a("video", this.g);
        fyb_0 fyb_02 = fpm_0.b().a("videoCinematicDialog", cfi_0.a("videoCinematicDialog"), 8448L, (short)19500);
        this.c = (fvp)fyb_02.getElementMap().a("video");
        if (this.c == null) {
            b.error((Object)"On n'a pas trouv\u00e9 le video widget dans la dialog");
        } else {
            this.c.a(this.g.a());
        }
        fpm_0.b().a("wakfu.videoCinematic", cjx_0.class);
    }

    private void f() {
        fpm_0.b().o("videoCinematicDialog");
        fpm_0.b().e("wakfu.videoCinematic");
        this.c = null;
    }

    private static void g() {
        azu_2 azu_22 = ans_0.D().e();
        ace_0 ace_02 = ans_0.D().c();
        azu_22.a(ace_02, false);
        cdw_0.n().c(1.0f, 500);
        cdw_0.n().b(1.0f, 500);
        cdw_0.n().a(1.0f, 500);
    }

    protected static void a() {
        azu_2 azu_22 = ans_0.D().e();
        ace_0 ace_02 = ans_0.D().c();
        azu_22.a(ace_02);
        cdw_0.n().c(0.0f, 500);
        cdw_0.n().b(0.0f, 500);
        cdw_0.n().a(0.0f, 500);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16892: {
                this.d();
                return false;
            }
            case 16042: {
                dfc dfc2 = (dfc)adt_12;
                this.a((Runnable)dfc2.j());
                return false;
            }
            case 12093: 
            case 12727: {
                return true;
            }
        }
        return false;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(String string) {
        this.d = string;
    }

    public void a(float f2) {
        this.e = f2;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public void c() {
        if (this.c != null) {
            this.c.c();
        }
    }

    public void d() {
        if (!this.h) {
            b.error((Object)"On veut jouer la video mais la frame n'est pas encore push\u00e9");
        }
        if (this.c == null) {
            return;
        }
        if (this.c instanceof fvv_0) {
            ((fvv_0)this.c).setEndedVideoRunnable(() -> cuo_0.e().b());
        }
        this.c.setVideoPath(this.d);
        this.c.setDebugMode(this.f);
        this.c.setKeepRatio(true);
        this.c.setVolume(this.e);
        this.c.a(new caz_2());
        this.c.a(new cbe_2(this.c));
        this.c.a();
        this.c.setPaused(false);
    }

    public void a(Runnable runnable) {
        if (this.c != null && this.c.isPlaying()) {
            this.c.a(new cXi(runnable));
        } else {
            runnable.run();
            azu_0.j().b(this);
        }
    }
}

