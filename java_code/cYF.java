/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cYF
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cYF.class);
    private static final cYF b = new cYF();
    private ans_1 c;
    private fyy_0 d;
    private bvo_1 e;
    private bcv_1 f;
    private final Ty g = tG -> {
        if (this.f == null) {
            return;
        }
        if (tG.a_() != this.f.a_()) {
            return;
        }
        if (tG.N()) {
            return;
        }
        azu_0.j().b(this);
    };
    private boolean h;
    private bmr_1 i;

    public static cYF a() {
        return b;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new cyg_0(this);
            fpm_0.b().a(this.c);
            this.d = fpm_0.b().a("exchangeMachineDialog", cfi_0.a("exchangeMachineDialog"), 1L, (short)10000).getElementMap();
            this.i = azu_0.j().k();
            cdw_0.n().c(600012L);
            if (!fpm_0.b().d("wakfu.exchangeMachine")) {
                fpm_0.b().a("wakfu.exchangeMachine", cGU.class);
            }
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = null;
            this.e.e();
            this.e = null;
            if (this.f != null) {
                this.f.b(this.g);
            }
            this.f = null;
            this.a((bmr_1)null);
            fpm_0.b().b(this.c);
            fpm_0.b().o("exchangeMachineDialog");
            fis_1.a().a("exchangeMachine");
            fis_1.a().a("selectedExchange");
            cdw_0.n().c(600013L);
            if (!(azu_0.j().c(dct.a()) || azu_0.j().c(cxq_0.a) || fpm_0.b().q("ladderRewardsDialog"))) {
                fpm_0.b().e("wakfu.exchangeMachine");
            }
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16119: {
                return !this.h;
            }
            case 18696: {
                cYF.a((dgj_0)adt_12, this.e.f(), this.e.g(), this.i);
                return false;
            }
            case 16539: {
                dfc dfc2 = (dfc)adt_12;
                bmr_1 bmr_12 = (bmr_1)dfc2.j();
                if (bmr_12 == this.i) {
                    return false;
                }
                this.e.e();
                this.a(bmr_12);
                this.e.a(this.i);
                return false;
            }
        }
        return true;
    }

    public static void a(@NotNull dgj_0 dgj_02, long l, int n, @NotNull bmr_1 bmr_12) {
        short s2 = dgj_02.o();
        if (s2 < 1) {
            return;
        }
        eve_1 eve_12 = dgj_02.k().h();
        int n2 = eve_12.g();
        if (!cYF.a(eve_12, s2, bmr_12)) {
            aUh.a("inventory.error.lackItem", new Object[0]);
            return;
        }
        cml_0 cml_02 = new cml_0(l, n2, n, s2, bmr_12.a_());
        azu_0.j().K().c(cml_02);
    }

    private static boolean a(@Nullable eve_1 eve_12, short s2, @NotNull bmr_1 bmr_12) {
        boolean bl;
        if (eve_12 == null) {
            return true;
        }
        apc_2 apc_22 = eve_12.f();
        if (apc_22 != null && !apc_22.b(bmr_12, cYF.a(), eve_12, bmr_12.Q_())) {
            return false;
        }
        boolean bl2 = bl = !eve_12.a((n, s3) -> {
            if (bmr_12.da().h(n) >= s3 * s2) {
                return true;
            }
            ewx_2 ewx_22 = (ewx_2)bmr_12.a(ewl_1.a);
            ewz_2 ewz_22 = ewx_22.a(n);
            return ewz_22 != null && ewz_22.b() >= s3 * s2;
        });
        if (bl) {
            return false;
        }
        if (bmr_12.dK().a() < (long)eve_12.b() * (long)s2) {
            return false;
        }
        return bmr_12.fE().z() >= (long)eve_12.c() * (long)s2;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(bcv_1 bcv_12) {
        if (this.f != null) {
            this.f.b(this.g);
        }
        this.f = bcv_12;
        this.f.a(this.g);
        this.a(bcv_12.a_(), bcv_12.al_(), bcv_12.Z(), bcv_12.ao(), true, true);
    }

    private void a(long l, String string, String string2, evd_1 evd_12, boolean bl, boolean bl2) {
        this.a(azu_0.j().k());
        this.e = new bvo_1(l, string, string2, bl, evd_12);
        this.e.a(this.i);
        this.h = bl2;
        fis_1.a().a("exchangeMachine", this.e);
        azu_0.j().a(this);
    }

    private void a(brw_0 brw_02) {
        fus_0 fus_02 = (fus_0)this.d.a("recipeList");
        ftj_0 ftj_02 = fus_02.getRenderables().get(fus_02.getItemIndex(brw_02));
        fsQ fsQ2 = (fsQ)ftj_02.getInnerElementMap().a("ingredientList");
        for (Object object : fsQ2.getItems()) {
            brk_1 brk_12 = (brk_1)object;
            if (brk_12.e()) continue;
            fsk_0 fsk_02 = (fsk_0)fsQ2.getRenderableByOffset(fsQ2.getItemIndex(brk_12)).getInnerElementMap().a("icon");
            azf_2 azf_22 = new azf_2(1.0f, 0.5f, 0.5f, 1.0f);
            azj_2 azj_22 = fsk_02.getModulationColor();
            fjp_2 fjp_22 = new fjp_2(azf_22, azj_22, fsk_02, 0, 250, 3, fjw_2.b);
            fsk_02.addTween(fjp_22);
        }
    }

    public void a(bgq_1 bgq_12) {
        if (bgq_12.a_() == this.e.f()) {
            azu_0.j().b(this);
        }
    }

    public void a(afe_0 afe_02, apl_1 apl_12) {
        azu_0.j().b(cXC.a());
    }

    public void a(bmr_1 bmr_12) {
        this.i = bmr_12;
    }

    public bmr_1 c() {
        return this.i;
    }
}

