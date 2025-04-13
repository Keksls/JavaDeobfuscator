/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cZN
 */
public class czn_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(czn_0.class);
    private static final czn_0 b = new czn_0();
    private static final int c = 20000;
    private cZT d;
    fvE e;
    private Runnable f;
    private fzi g;
    private ans_1 h;

    public static czn_0 a() {
        return b;
    }

    public void a(cZT cZT2) {
        this.d = cZT2;
        if (!azu_0.j().c(this)) {
            azu_0.j().a(this);
        } else {
            fis_1.a().a("infoView", (Object)this.d, "infoDialog");
        }
    }

    public void c() {
        if (this.f != null) {
            ado_1.a().b(this.f);
            this.f = null;
        }
        this.e.removeTweensOfType(fjq_2.class);
        this.e.addTween(new fjq_2(this.e.getX(), this.e.getY(), this.e.getX(), fta_0.getInstance().getHeight(), this.e, 0, 1000, fjw_2.b));
        ado_1.a().a(new czo_0(this), 1000L, 1);
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

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.h = new cZP(this);
            fpm_0.b().a(this.h);
            this.g = new cZQ(this);
            cff_0.b().a(this.g);
            this.e = (fvE)fpm_0.b().a("infoDialog", cfi_0.a("infoDialog"), 1L, (short)10000);
            this.e.setVisible(false);
            this.e.setY(fta_0.getInstance().getHeight());
            fis_1.a().a("infoView", (Object)this.d, "infoDialog");
            ado_1.a().a(new cZR(this), 1000L, 1);
            this.f = new cZS(this);
            ado_1.a().a(this.f, 20000L, 1);
            fpm_0.b().a("wakfu.info", chu_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.h);
            cff_0.b().b(this.g);
            fpm_0.b().o("infoDialog");
            fpm_0.b().e("wakfu.info");
            if (this.f != null) {
                ado_1.a().b(this.f);
                this.f = null;
            }
        }
    }
}

