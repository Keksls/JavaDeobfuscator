/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ddv
 */
public class ddv_0
implements ahr_1 {
    private static final Logger a = Logger.getLogger(ddv_0.class);
    private static final ddv_0 b = new ddv_0();
    private long c;
    private blx_1 d;
    private Runnable e;
    private fvE f;
    private boolean g;
    private ftv h;
    private aeg_1 i;
    private static final String j = "endPlacementAndTurn";
    private amj_1 k;

    public static ddv_0 a() {
        return b;
    }

    private void b(int n, boolean bl) {
        if (this.g) {
            return;
        }
        this.g = true;
        if (this.f == null) {
            return;
        }
        int n2 = 0;
        if (!bl && n != -1) {
            Object object;
            String string = "list#" + n + ".image";
            fsk_0 fsk_02 = (fsk_0)this.f.getElementMap().a(string);
            if (fsk_02 != null) {
                object = fsk_02.getAppearance();
                ((fyb_0)object).addTween(new fjp_2(azf_2.e, azf_2.b, (fqt)object, 0, 250, 8, true, fjw_2.b));
            }
            n2 = 1300;
            object = new fjq_2(this.f.getX(), this.f.getY(), fta_0.getInstance().getWidth(), this.f.getY(), this.f, n2, 175, fjw_2.b);
            ((fjg_2)object).a((fjg_2 fjg_22, fju_2 fju_22) -> {
                switch (fju_22) {
                    case a: {
                        ado_1.a().a(() -> azu_0.j().b(this));
                    }
                }
            });
            this.f.addTween((fjg_2)object);
        } else {
            azu_0.j().b(this);
        }
    }

    void d() {
        try {
            if (this.k != null) {
                this.k.f(true);
                this.k.a(0.0f, 500.0f);
                this.k = null;
            }
            if (azu_0.j().c(this)) {
                azu_0.j().b(this);
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private void a(efh_0 efh_02, boolean bl) {
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 == null) {
            return;
        }
        if (efh_02 == null) {
            this.b(-1, bl);
        } else {
            this.a(efh_02);
            this.a(efh_02.i(), bl);
        }
    }

    private void e() {
        this.b(-1, true);
        cnl_0 cnl_02 = new cnl_0();
        cnl_02.a(this.d.a_());
        azu_0.j().K().c(cnl_02);
    }

    public void a(int n, boolean bl) {
        if (this.d == null) {
            return;
        }
        bvx_2 bvx_22 = this.d.bz();
        if (bvx_22 == null) {
            return;
        }
        if (n != -1) {
            int n2;
            efh_0 efh_02 = bvx_22.A().a().c(n);
            bxn_2[] bxn_2Array = (bxn_2[])fis_1.a().e("fight.timePointAvailableBonuses");
            for (n2 = 0; n2 < bxn_2Array.length && bxn_2Array[n2].a().i() != efh_02.i(); ++n2) {
            }
            this.b(n2, bl);
        } else {
            this.b(-1, bl);
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19577: {
                if (!this.d.bp()) {
                    return false;
                }
                dgp_0 dgp_02 = (dgp_0)adt_12;
                bwm_2 bwm_22 = this.d.ao();
                bwm_22.a(dgp_02.k());
                this.a(dgp_02.k().a(), true);
                cdw_0.n().c(600124L);
                return false;
            }
            case 16830: {
                this.e();
                return false;
            }
        }
        return true;
    }

    public blx_1 c() {
        return this.d;
    }

    public void a(blx_1 blx_12) {
        this.d = blx_12;
        bxn_2[] bxn_2Array = this.d.bz().A().y(this.d.a_());
        fis_1.a().a("fight.timePointAvailableBonuses", bxn_2Array);
        fis_1.a().a("fight.timePointSelectionChooser", blx_12);
        fis_1.a().a("fight.timePointSelectionChooser.isHero", blx_12.cX());
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    private void a(efh_0 efh_02) {
        cnk_0 cnk_02 = new cnk_0();
        cnk_02.a(this.d.a_());
        cnk_02.b(efh_02.i());
        azu_0.j().K().c(cnk_02);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fis_1.a().a("fight.timePointBonusRemainingTime", Float.valueOf(1.0f));
            fis_1.a().a("fight.timePointBonusFighterId", this.d.aq().a_());
            this.e = new ddx_0(this);
            this.g = false;
            long l = 8208L;
            if (this.d.bp() || this.d.gY() == 5) {
                l |= 0x100L;
            }
            this.f = (fvE)fpm_0.b().a("timePointBonusSelectionDialog", cfi_0.a("timePointBonusSelectionDialog"), l, (short)10000);
            this.f.setX(fta_0.getInstance().getWidth());
            this.h = (ftv)this.f.getElementMap().a("progressBar");
            this.h.setInitialValue(1.0f);
            fpm_0.b().a("wakfu.timePointSelection", cJT.class);
            ado_1.a().a(() -> {
                if (this.f == null) {
                    return;
                }
                if (this.f.getSize() == null) {
                    return;
                }
                this.f.setPosition(fta_0.getInstance().getWidth(), frs_0.f.b(this.f.getHeight(), fta_0.getInstance().getHeight()));
                this.f.addTween(new fjq_2(this.f.getX(), this.f.getY(), frs_0.e.a(this.f.getWidth(), fta_0.getInstance().getWidth()), this.f.getY(), this.f, 0, 150, fjw_2.b));
            }, 200L, 1);
            if (this.d.bp()) {
                cdw_0.n().c(600123L);
                this.k = cdw_0.n().a(600126L, true);
            }
            if (this.c <= 0L) {
                this.c = 30000L;
            }
            this.h.setTweenDuration(this.c);
            this.h.setValue(0.0f);
            fil_1.a();
            ado_1.a().a(this.e, this.c, 1);
            Runnable runnable = () -> {
                if (this.d == azu_0.j().k()) {
                    cJT.skipEffectChoice();
                }
            };
            this.i = new aeg_1();
            this.i.a(402, aZG.e().a(j).b(), runnable);
            ans_0.D().e().a(this.i, true);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.f = null;
            fpm_0.b().o("timePointBonusSelectionDialog");
            fpm_0.b().e("wakfu.timePointSelection");
            ado_1.a().b(this.e);
            fis_1.a().a("fight.timePointBonusFighterId", (Object)null);
            if (this.k != null) {
                this.k.a(0.0f, 500.0f);
                this.k.f(true);
                this.k = null;
            }
            this.h = null;
            this.d = null;
            this.c = 0L;
            ans_0.D().e().a(this.i);
        }
    }

    public void b(long l) {
        this.c = l;
    }
}

