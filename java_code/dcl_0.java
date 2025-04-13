/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from dcL
 */
public class dcl_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(dcl_0.class);
    private static final dcl_0 b = new dcl_0();
    private static final int c = 20000;
    private dcR d;
    fvE e;
    private Runnable f;
    private fzi g;
    private ans_1 h;

    public static dcl_0 a() {
        return b;
    }

    public void a(dcR dcR2) {
        this.d = dcR2;
        if (!azu_0.j().c(this)) {
            azu_0.j().a(this);
        } else {
            fis_1.a().a("shukruteReward", (Object)this.d, "shukruteRewardDialog");
        }
    }

    public void a(dcs_0 dcs_02) {
        this.d.a(dcs_02);
    }

    public void c() {
        if (this.f != null) {
            ado_1.a().b(this.f);
            this.f = null;
        }
        this.e.removeTweensOfType(fjq_2.class);
        this.e.addTween(new fjq_2(this.e.getX(), this.e.getY(), this.e.getX(), fta_0.getInstance().getHeight(), this.e, 0, 1000, fjw_2.b));
        ado_1.a().a(new dcM(this), 1000L, 1);
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
            this.h = new dcN(this);
            fpm_0.b().a(this.h);
            this.g = new dco_0(this);
            cff_0.b().a(this.g);
            this.e = (fvE)fpm_0.b().a("shukruteRewardDialog", cfi_0.a("shukruteRewardDialog"), 1L, (short)10000);
            this.e.setVisible(false);
            this.e.setY(fta_0.getInstance().getHeight());
            fis_1.a().a("shukruteReward", (Object)this.d, "shukruteRewardDialog");
            ado_1.a().a(new dcP(this), 1000L, 1);
            this.f = new dcQ(this);
            ado_1.a().a(this.f, 20000L, 1);
            fpm_0.b().a("wakfu.shukrute", cJB.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.h);
            cff_0.b().b(this.g);
            fpm_0.b().o("shukruteRewardDialog");
            fpm_0.b().e("wakfu.shukrute");
            if (this.f != null) {
                ado_1.a().b(this.f);
                this.f = null;
            }
        }
    }
}

