/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from dde
 */
public class dde_0
implements ahr_1 {
    private static final Logger a = Logger.getLogger(dde_0.class);
    private static final dde_0 b = new dde_0();
    private ans_1 c;
    private ees_0 d;
    private btj e;
    private pj_0 f;
    private evt_1 g;

    public static dde_0 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16855: {
                if (azu_0.j().n().f()) {
                    cbx_2.a();
                    return false;
                }
                evt_1 evt_12 = new evt_1(this.g);
                bmr_1 bmr_12 = azu_0.j().k();
                byn_1 byn_12 = bmr_12.dE();
                if (!byn_12.d() || byn_12.c()) {
                    evt_12.a(this.e.b());
                    evt_12.b(this.e.a());
                }
                ((bfc_0)this.f).a((TF)bzf_1.a(), evt_12);
                bti.a.a(this.e.e().a(), this.e.b(), this.e.a());
                fpm_0.b().o("stasisDungeonDialog");
                return false;
            }
            case 17912: {
                bmr_1 bmr_13 = bzf_1.a();
                if (bmr_13 == null) {
                    a.info((Object)"Can't change dungeon difficulty, player null");
                    return false;
                }
                byn_1 byn_13 = bmr_13.dE();
                if (byn_13.d() && !byn_13.c()) {
                    return false;
                }
                int n = this.e.e().a();
                if (this.d.a(bmr_13.a_(), (long)this.g.n(), n, this.e.b())) {
                    cmy cmy2 = new cmy();
                    cmy2.a(bmr_13.a_());
                    cmy2.b(this.e.b());
                    cmy2.b(bmr_13.dP().get().a());
                    azu_0.j().K().c(cmy2);
                    fpm_0.b().o("stasisDungeonDialog");
                }
                return false;
            }
            case 16917: {
                dfc dfc2 = (dfc)adt_12;
                int n = dfc2.c();
                bmr_1 bmr_14 = azu_0.j().k();
                if (bmr_14 == null) {
                    a.info((Object)"Can't change dungeon difficulty, player null");
                    return false;
                }
                byn_1 byn_14 = bmr_14.dE();
                if (byn_14.d() && !byn_14.c()) {
                    fis_1.a().a((ajf_1)this.e, btj.u);
                    return false;
                }
                int n2 = this.e.e().a();
                Optional<fkU> optional = bmr_14.dP();
                boolean bl = optional.isPresent() && optional.get().a() == (long)this.g.n() ? this.d.a(bmr_14.a_(), (long)this.g.n(), n2, n) : this.d.a(bmr_14.a_(), n, n2, this.e.a());
                if (bl) {
                    this.e.c(n);
                    fis_1.a().a("stasisDungeonJauge", n);
                }
                fis_1.a().a((ajf_1)this.e, btj.u);
                bti.a.a(this.e.e().a(), this.e.b(), this.e.a());
                return false;
            }
            case 16804: {
                dfc dfc3 = (dfc)adt_12;
                boolean bl = dfc3.i();
                bmr_1 bmr_15 = bzf_1.a();
                if (bmr_15 == null) {
                    return false;
                }
                byn_1 byn_15 = bmr_15.dE();
                if (byn_15.d() && !byn_15.c()) {
                    fis_1.a().a((ajf_1)this.e, btj.u);
                    return false;
                }
                this.e.a(bl);
                if (!bl && this.e.b() > 10) {
                    this.e.c(10);
                }
                fis_1.a().a((ajf_1)this.e, btj.u);
                return false;
            }
            case 17261: {
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new ddf_0(this);
            this.d = new ees_0();
            cYb.a().b(this.d());
            fis_1.a().a("stasisDungeonView", this.e);
            fis_1.a().a("stasisDungeonSlider", this.e.b());
            fis_1.a().a("stasisDungeonJauge", this.e.b());
            fpm_0.b().a(this.c);
            fpm_0.b().a("stasisDungeonDialog", cfi_0.a("stasisDungeonDialog"), 256L, (short)10000);
            fpm_0.b().a("wakfu.stasisDungeon", cjl_0.class);
        }
    }

    public void a(pj_0 pj_02, evt_1 evt_12) {
        boolean bl;
        boolean bl2;
        int n;
        Optional<Object> optional;
        boolean bl3;
        if (pj_02 == null || evt_12 == null) {
            a.info((Object)"Can't open dungeon UI, invalid parameters");
            return;
        }
        this.f = pj_02;
        this.g = evt_12;
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        short s2 = evt_12.n();
        Optional<ezb_2> optional2 = ezd_2.a.a((long)s2);
        if (optional2.isEmpty()) {
            a.error((Object)("[DUNGEON] No dungeon information found for id " + s2));
            return;
        }
        ezb_2 ezb_22 = optional2.get();
        boolean bl4 = bl3 = !bmr_12.dE().d() || bmr_12.dE().c();
        if (bl3) {
            optional = bti.a.a(ezb_22.a());
            n = optional.isPresent() ? ((bth)optional.get()).a() : 2;
            bl2 = optional.isPresent() && ((bth)optional.get()).b() || eEF.b(ezb_22.a());
            bl = true;
        } else {
            optional = byu_1.a.a(s2);
            bl2 = optional.isPresent() && ((eet_0)optional.get()).a() > 0 || eEF.b(ezb_22.a());
            bl = !optional.isPresent() || ((eet_0)optional.get()).g();
            int n2 = n = optional.isPresent() ? ((eet_0)optional.get()).e() : 2;
        }
        if (!ezb_22.g() || eEF.b(ezb_22.a())) {
            n = 2;
        }
        int n3 = bmr_12.fk().a(ezb_22.a());
        this.e = new btj(ezb_22, n, bl2, bl, n3);
        this.e.b(!bl3);
        azu_0.j().a(this);
    }

    public void c() {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        Optional<fkU> optional = bmr_12.dP();
        if (optional.isEmpty()) {
            return;
        }
        fkU fkU2 = optional.get();
        fjv_0 fjv_02 = ((fjw_0)fjw_0.e()).c(fkU2.a());
        if (!fjv_02.c()) {
            return;
        }
        Optional<ezb_2> optional2 = ezd_2.a.a(fkU2.a());
        if (optional2.isEmpty()) {
            a.error((Object)("[DUNGEON] No dungeon information found for id " + fkU2.a()));
            return;
        }
        ezb_2 ezb_22 = optional2.get();
        byn_1 byn_12 = bmr_12.dE();
        boolean bl = fkU2.c() > 0 || eEF.b(ezb_22.a());
        int n = bmr_12.fk().a(ezb_22.a());
        this.e = new btj(ezb_22, fkU2.d(), bl, fkU2.f(), n);
        this.e.b(byn_12.d() && !byn_12.c());
        if (!fkU2.f()) {
            this.e.b(fkU2.d());
        }
        azu_0.j().a(this);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fpm_0.b().o("stasisDungeonDialog");
            fpm_0.b().e("wakfu.stasisDungeon");
            fis_1.a().a("stasisDungeonView");
            cYb.a().b(-1);
            this.d = null;
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public int d() {
        return this.e.e().a();
    }
}

