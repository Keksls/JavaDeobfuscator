/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cZI
extends cxo_0
implements Uo,
bOy,
bnp_1,
exa_1 {
    private static final Logger m = Logger.getLogger(cZI.class);
    private static final String n = "buildNameTE";
    private static final cZI o = new cZI();
    public static final String a = "heroBuildWindow";
    public static final String i = "sheetsTabContainer";
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    private static final Map<Integer, String> p = Map.of(0, "equipments", 1, "spells", 2, "aptitudes");
    private final fzi q = string -> {
        if ("heroBuildDialog".equals(string)) {
            this.a(() -> azu_0.j().b(this));
            return fzh.d;
        }
        return fzh.a;
    };
    private final ans_1 r = string -> {
        if ("heroBuildDialog".equals(string)) {
            azu_0.j().b(this);
        }
    };
    private bzo_1 s;
    private int t;
    private eyt_0 u;
    private int v;
    private final bzx_1 w = new bzx_1();
    private bzj_2 x;
    private bzk_2 y;
    private int z = 0;
    private boolean A = false;
    private boolean B = true;

    public static cZI a() {
        return o;
    }

    private cZI() {
    }

    @Override
    public String f() {
        return "heroBuildDialog";
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18991: {
                this.a(() -> azu_0.j().b(this));
                return false;
            }
            case 18077: {
                this.w.h();
                return false;
            }
            case 16336: {
                long l = ((dfc)adt_12).d();
                if (l == this.s.e()) {
                    return false;
                }
                this.a(() -> this.i(l), () -> fis_1.a().a("characterSheet", c.get(this.s.e()), this.f()));
                return false;
            }
            case 19108: {
                int n2 = ((dfc)adt_12).c();
                if ((long)n2 == this.s.e()) {
                    return false;
                }
                this.a(() -> this.h(n2));
                return false;
            }
            case 18529: {
                if (!this.s.a()) {
                    return false;
                }
                ble_0 ble_02 = (ble_0)((dfc)adt_12).j();
                if (ble_02.c() == this.Q()) {
                    return false;
                }
                if (this.y != null && this.y.b()) {
                    this.B = false;
                }
                this.a(ble_02.c(), false);
                return false;
            }
            case 19700: {
                if (!this.s.a()) {
                    return false;
                }
                ble_0 ble_03 = (ble_0)((dfc)adt_12).j();
                if (ble_03 == null) {
                    ble_03 = this.w.c();
                }
                if (ble_03 == null) {
                    return false;
                }
                if (this.w.e()) {
                    return false;
                }
                this.b(this.s.e(), ble_03.c());
                return false;
            }
            case 17431: {
                if (!this.s.a()) {
                    return false;
                }
                dfk dfk2 = (dfk)adt_12;
                if (this.w.e()) {
                    return false;
                }
                this.a(dfk2);
                return false;
            }
            case 17577: {
                if (!this.s.a()) {
                    return false;
                }
                if (this.w.e()) {
                    return false;
                }
                if (!this.y.a()) {
                    this.s();
                    return false;
                }
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("sheet.remove.confirmation", new Object[0]), cfn_0.a(0), 24L, 102, 1);
                fzm_02.a((int n, String string) -> {
                    if (n == 8) {
                        this.s();
                    }
                });
                return false;
            }
            case 16923: {
                int n3 = ((dfc)adt_12).c();
                if (n3 != this.z) {
                    bua_0.a.a(new bvd_1("heroBuildDialog-" + p.get(n3)));
                }
                this.z = n3;
                return false;
            }
            case 17329: {
                if (this.w.e()) {
                    return false;
                }
                if (!fzw_0.a.d("heroBuildLock")) {
                    return false;
                }
                if (this.y != null) {
                    Optional<Integer> optional = this.y.e();
                    this.y.c();
                    this.M();
                    optional.ifPresent(det::b);
                }
                return false;
            }
            case 18219: {
                if (!this.s.a()) {
                    return false;
                }
                String string2 = ((dfc)adt_12).h();
                this.w.i().a(string2);
                return false;
            }
            case 16651: {
                boolean bl = ((dfc)adt_12).i();
                this.w.i().b(bl);
                return false;
            }
            case 17269: {
                if (!this.s.a()) {
                    return false;
                }
                @NotNull bzn_2 bzn_22 = (bzn_2)((Object)((dfc)adt_12).j());
                this.w.i().a(bzn_22);
                return false;
            }
            case 18956: {
                if (!this.s.a()) {
                    return false;
                }
                ble_0 ble_04 = (ble_0)((dfc)adt_12).j();
                this.w.i().a(ble_04);
                return false;
            }
            case 17007: {
                if (!this.s.a()) {
                    return false;
                }
                ble_0 ble_05 = (ble_0)((dfc)adt_12).j();
                this.w.i().b(ble_05);
                return false;
            }
            case 18875: {
                if (!this.s.a()) {
                    return false;
                }
                dfm dfm2 = (dfm)adt_12;
                this.w.i().a(dfm2.k(), dfm2.o());
                return false;
            }
            case 16954: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.y.f()) {
                    return false;
                }
                this.a(false);
                return false;
            }
            case 19616: {
                if (this.w.e()) {
                    return false;
                }
                this.T();
                return false;
            }
            case 18649: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                this.a(() -> cZI.a(new bzz_2(this.s.c())));
                return false;
            }
            case 17975: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                cZI.a(new bza_2(this.s.c(), this.w.c()));
                return false;
            }
            case 16378: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                dfk dfk3 = (dfk)adt_12;
                this.a(dfk3.k(), dfk3.o(), dfk3.p());
                return false;
            }
            case 17445: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                cZI.a(new bzb_1(this.s.c(), this.w.c()));
                return false;
            }
            case 18631: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.y.b()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                if (this.y.h()) {
                    return false;
                }
                dfk dfk4 = (dfk)adt_12;
                this.b(dfk4);
                return false;
            }
            case 17416: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                if (fpm_0.b().q("heroBuildCopyBuildDialog")) {
                    fpm_0.b().o("heroBuildCopyBuildDialog");
                    fis_1.a().a("heroBuildCopyBuildView", (Object)null);
                    this.x = null;
                } else {
                    boolean bl = ((dfc)adt_12).i();
                    this.x = new bzj_2(this.w.i(), bl);
                    fis_1.a().a("heroBuildCopyBuildView", this.x);
                    this.x.a();
                }
                return false;
            }
            case 19967: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                dfl dfl2 = (dfl)adt_12;
                this.x.b(dfl2.k());
                this.x.c(dfl2.o());
                this.x.d(dfl2.p());
                return false;
            }
            case 18428: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                String string3 = ((dfc)adt_12).h();
                this.x.a(string3);
                return false;
            }
            case 19204: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                dfc dfc2 = (dfc)adt_12;
                boolean bl = dfc2.i();
                if (bl) {
                    this.x.a(this.w.c().b().c());
                } else {
                    this.x.a((Integer)null);
                }
                return false;
            }
            case 17457: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                dfc dfc3 = (dfc)adt_12;
                this.x.a(dfc3.i());
                return false;
            }
            case 17555: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                ble_0 ble_06 = (ble_0)((dfc)adt_12).j();
                this.x.a(ble_06);
                return false;
            }
            case 19711: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                if (this.x == null || !this.x.b()) {
                    return false;
                }
                if (this.y != null && this.y.b()) {
                    return false;
                }
                ble_0 ble_07 = this.x.f();
                ble_0 ble_08 = this.w.c();
                if (this.x.c() == bzl_2.a) {
                    this.a(ble_07, ble_08, this.x.g(), this.x.e());
                } else {
                    this.a(ble_08, ble_07, this.x.g(), this.x.e());
                }
                return false;
            }
            case 19757: {
                dfc dfc4 = (dfc)adt_12;
                this.w.j().a((bja_1)dfc4.j());
                return false;
            }
            case 16937: {
                bzc_1 bzc_12 = (bzc_1)((dfc)adt_12).j();
                this.w.j().a(bzc_12);
                return false;
            }
            case 16850: {
                boolean bl = ((dfc)adt_12).i();
                this.b(bl);
                return false;
            }
            case 16997: {
                bLl bLl2 = (bLl)((dfc)adt_12).j();
                Optional<bzg_2> optional = this.w.j().a(bzd_1.c);
                Set set = optional.map(bzg_22 -> new HashSet<exw_1>(bzg_22.d())).orElse(new HashSet());
                if (bLl2.e()) {
                    set.add(bLl2.c());
                } else {
                    set.remove(bLl2.c());
                }
                this.w.j().a(new bzg_2(set));
                return false;
            }
            case 19975: {
                bzh_2 bzh_22 = (bzh_2)((Object)((dfc)adt_12).j());
                this.w.j().a(bzh_22);
                return false;
            }
            case 18789: {
                dfc dfc5 = (dfc)adt_12;
                this.w.j().a(dfc5.i());
                return false;
            }
            case 17643: {
                dfc dfc6 = (dfc)adt_12;
                this.w.j().b(dfc6.i());
                return false;
            }
            case 16715: {
                dfc dfc7 = (dfc)adt_12;
                bzr_2 bzr_22 = (bzr_2)dfc7.j();
                bzr_22.ak_();
                return false;
            }
            case 19312: {
                if (this.w.e()) {
                    return false;
                }
                dfj dfj2 = (dfj)adt_12;
                exk_2 exk_22 = dfj2.k();
                exh_2 exh_22 = dfj2.o();
                this.a(exk_22, exh_22);
                return false;
            }
            case 19941: {
                if (this.w.e()) {
                    return false;
                }
                bja_1 bja_12 = (bja_1)((anw_1)adt_12).j();
                if (bja_12 == null || bja_12.h() == null) {
                    return false;
                }
                this.a(bja_12);
                return false;
            }
            case 19795: {
                Object object;
                exh_2 exh_23;
                if (this.w.e()) {
                    return false;
                }
                if (this.y.b()) {
                    return false;
                }
                exk_2 exk_23 = (exk_2)((dfc)adt_12).j();
                if (this.s.b() && (exh_23 = exh_2.a((byte)((TL)(object = this.s.d().h())).f(exk_23.a()))) != null) {
                    this.a(exh_23);
                    return false;
                }
                object = (bmr_1)euu_2.e(this.s.f(), exk_23.a());
                if (object == null) {
                    return false;
                }
                azu_0.j().K().c(new clY(((epq_2)object).a_(), exk_23.a()));
                return false;
            }
            case 18127: {
                if (ezp_1.a(azu_0.j().k())) {
                    return false;
                }
                exk_2 exk_24 = (exk_2)((dfc)adt_12).j();
                bmr_1 bmr_12 = (bmr_1)euu_2.c(this.s.f(), exk_24.a());
                Optional<exg_2> optional = bmr_12.da().m(exk_24.a());
                if (optional.isEmpty()) {
                    return false;
                }
                long l = optional.get().f();
                short s2 = optional.get().l();
                long l2 = l;
                if (s2 < 0) {
                    Optional<Cm<exg_2, Short>> optional2 = bmr_12.da().f(exk_24);
                    if (optional2.isEmpty()) {
                        aUh.a("build.split.item.error", new Object[0]);
                        return false;
                    }
                    s2 = optional2.get().b();
                    l2 = optional2.get().a().f();
                }
                bmr_12.a(exk_24, (short)1, s2, l, l2);
                this.u();
                return false;
            }
            case 16922: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                dhz dhz2 = (dhz)adt_12;
                this.a(dhz2.k(), dhz2.o());
                return false;
            }
            case 18011: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                bpr_0 bpr_02 = (bpr_0)((dfc)adt_12).j();
                this.a(bpr_02);
                return false;
            }
            case 17304: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                String string4 = ((dfc)adt_12).h();
                fiO fiO2 = fiM.a(string4);
                if (fiO2 == null) {
                    aUh.a("build.error.spell.invalid.code", new Object[0]);
                    return false;
                }
                this.a(fiO2);
                return false;
            }
            case 18365: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                dfi_0 dfi_02 = (dfi_0)adt_12;
                this.a(dfi_02.k(), dfi_02.q());
                return false;
            }
            case 16001: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                String string5 = ((dfc)adt_12).h();
                ezx_2 ezx_22 = bkp_2.a(string5);
                this.a(ezx_22);
                return false;
            }
            case 18473: {
                if (this.w.e()) {
                    return false;
                }
                if (!this.s.a()) {
                    return false;
                }
                this.a(new ezu_1());
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        cff_0.b().a(this.q);
        fpm_0.b().a(this.r);
        fpm_0.b().a("wakfu.heroBuild", chs_0.class);
        fpm_0.b().a("wakfu.spellDeck", cjd_0.class);
        ans_0.D().e().a(bzu_2.a, true);
        fzw_0.a.b("heroBuildLock");
        this.A = false;
        this.B = true;
        bmr_1 bmr_12 = azu_0.j().k();
        this.a(bmr_12);
        this.N();
        super.a(aav_22, false);
        this.w.a();
        this.a(new bzk_2(this.s, this.w.c(), false));
        fis_1.a().a("heroBuildView", this.w);
        this.w.j().a((bja_1)null);
        this.v = bmr_12.dx().e();
        int n = ((bvx_0)ans_0.D().h()).d(bWe.aX);
        if (n != 0) {
            this.b(n == 1);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        super.b(aav_22, false);
        this.r();
        this.K();
        this.O();
        this.P();
        this.s = null;
        this.u = null;
        this.a((bzk_2)null);
    }

    private void K() {
        cff_0.b().b(this.q);
        fpm_0.b().b(this.r);
        fpm_0.b().o("heroBuildDialog");
        fpm_0.b().o("createBuildDialog");
        fpm_0.b().o("heroBuildCopyBuildDialog");
        fpm_0.b().e("wakfu.heroBuild");
        ans_0.D().e().a(bzu_2.a);
        fzw_0.a.c("heroBuildLock");
    }

    private void i(long l) {
        this.a((bmr_1)euw_2.a.d(l));
        this.a((bzk_2)null);
        this.a(this.s.c().dx().e(), true);
    }

    public void a(@NotNull bmr_1 bmr_12) {
        this.L();
        this.s = bzo_1.a(bmr_12);
        this.w.a(this.s);
        this.w.j().a(cZI.o().valueCollection());
        this.t = bmr_12.fP();
        bmr_12.eu().a(this);
        fis_1.a().a("characterSheet", c.get(this.s.e()), this.f());
        this.u = bjd_1.a.a(this.s.e());
        bjd_1.a.b(this.s.e(), bjj_1.a(this.u));
    }

    private void h(int n) {
        if (!fzw_0.a.d("heroBuildLock")) {
            return;
        }
        eBt eBt2 = eBo.a.a(bhh_1.b(), n);
        if (eBt2 == null) {
            return;
        }
        this.c(eBt2);
    }

    private void c(eBt eBt2) {
        this.L();
        this.s = bzo_1.a(eBt2);
        this.w.a(this.s);
        this.w.j().a(cZI.o().valueCollection());
        this.a(new bzk_2(this.s, this.w.c(), false));
        if (this.z == 2) {
            det.b(0);
        }
    }

    private void L() {
        if (this.u != null && this.s != null && this.u.c() == this.s.e()) {
            bjd_1.a.b(this.s.e(), this.u);
            this.u = null;
        }
        if (this.s != null && this.s.a()) {
            this.s.c().eu().b(this);
        }
    }

    private void a(bzk_2 bzk_22) {
        this.y = bzk_22;
        this.M();
    }

    private void M() {
        fis_1.a().a((ajf_1)this.w, "hasUnsavedChanges", "isCurrentBuildNew");
        fis_1.a().a((ajf_1)this.w.c(), "hasInvalidSheet");
        this.w.j().g();
        this.w.k().g();
        this.w.l().g();
    }

    public void c() {
        if (this.y != null && this.y.b()) {
            String string2 = bae.h().a("build.unsaved.changes.fight.start", new Object[0]);
            int n2 = 32;
            int n3 = 64;
            fzn_0 fzn_02 = new fzn_0(102, 0, string2, null, cfn_0.a(7), 96L, List.of(bae.h().a("save", new Object[0]), bae.h().a("build.continue.modifications", new Object[0])), 0);
            fzn_02.a(32, 64);
            fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
            fzm_02.a((int n, String string) -> {
                if (n == 32 && this.y.f()) {
                    this.a(false);
                }
            });
        }
    }

    public void d() {
        this.r();
        fis_1.a().a((ajf_1)this.w, "canEditBuild", "cantEditMessage");
    }

    public void e() {
        fis_1.a().a((ajf_1)this.w, "canEditBuild", "cantEditMessage");
        this.a(new bzk_2(this.s, this.w.c(), false));
        if (this.s.a()) {
            bjd_1.a.b(this.s.e(), bjj_1.a(this.u));
        }
    }

    public void g() {
        if (!this.t()) {
            this.a(this.Q(), false);
        }
    }

    public void h() {
        fis_1.a().a((ajf_1)this.w, "canEditBuild", "cantEditMessage");
    }

    public void i() {
        fis_1.a().a((ajf_1)this.w, "canEditBuild", "cantEditMessage");
        if (this.y == null && !this.s.i()) {
            this.a(new bzk_2(this.s, this.w.c(), false));
        }
    }

    private void N() {
        euw_2.a.g(this.s.f()).forEach(this::a);
    }

    public void a(epq_2 epq_22) {
        epq_22.dS().a(this);
        for (exg_2 exg_22 : epq_22.dS().j()) {
            exg_22.b(this);
        }
    }

    private void O() {
        euw_2.a.g(this.s.f()).forEach(this::b);
    }

    public void b(epq_2 epq_22) {
        epq_22.dS().b(this);
        for (exg_2 exg_22 : epq_22.dS().j()) {
            exg_22.a(this);
        }
    }

    @Override
    public void a(long l, int n) {
        if (this.s != null && this.s.e() == l) {
            this.t += n;
        }
    }

    private void P() {
        euw_2.a.g(this.s.f()).forEach(epq_22 -> ((bnh_1)epq_22).eu().b(this));
    }

    public void c(long l) {
        if (!cZI.A()) {
            return;
        }
        this.u();
        if (this.s.a() && this.s.e() == l || this.s.b() && this.s.e() == -l) {
            this.U();
            this.i(azu_0.j().k().a_());
        }
    }

    public void a(List<eBt> list) {
        if (!this.s.b()) {
            return;
        }
        for (eBt eBt2 : list) {
            if (eBt2.b() != this.s.e()) continue;
            this.c(eBt2);
            return;
        }
    }

    private int Q() {
        return this.w.b();
    }

    public static String d(int n) {
        String string = n < 0 ? bae.h().a("aptitude.real.level", new Object[0]) : bae.h().a("levelShort.custom", n);
        return bae.h().a("build.default.name", string);
    }

    public void b(long l, int n) {
        if (!cZI.A()) {
            new ezn_1().a(l, n);
            cZI.b(l, (byte)n);
            return;
        }
        if (this.y != null && this.y.b()) {
            if (this.y.f()) {
                this.A = true;
                this.a(false);
            }
            return;
        }
        this.a(n, true);
    }

    private void a(int n, boolean bl) {
        if (!fzw_0.a.d("heroBuildLock")) {
            return;
        }
        this.a(() -> {
            ezn_1 ezn_12 = new ezn_1();
            if (ezn_12.c(this.s.e(), n) && !ezn_12.b(this.s.e(), n)) {
                this.w.b(n);
                this.a((bzk_2)null);
                return;
            }
            if (!ezn_12.a(this.s.e(), n)) {
                fis_1.a().a((ajf_1)this.w.i(), "currentBuildSheet");
                return;
            }
            if (bl) {
                this.v = n;
            }
            this.w.a(n);
            this.a(new bzk_2(this.s, this.w.c(), false));
            if (bl) {
                cZI.b(this.s.e(), (byte)n);
            }
            this.V();
            this.S();
            this.s.c().o(this.t);
            if (bl) {
                this.t = this.s.c().fP();
            }
        }, () -> {
            this.B = true;
            fis_1.a().a((ajf_1)this.w.i(), "currentBuildSheet");
        });
    }

    private void R() {
        this.a(() -> {
            ezn_1 ezn_12 = new ezn_1();
            ezn_12.a(this.s.e(), this.v);
            cZI.b(this.s.e(), (byte)this.v);
            this.S();
            this.s.c().o(this.t);
        });
    }

    private void S() {
        this.s.c().ht();
        try {
            this.s.c().b(this.s.c().cK());
            ezj_1 ezj_12 = this.s.c().dx().d();
            this.s.c().cC().c(ezj_12);
            this.s.c().cC().d(ezj_12);
            this.s.c().cC().e(ezj_12);
        }
        finally {
            this.s.c().hu();
        }
    }

    private static void b(long l, byte by) {
        clo_1 clo_12 = new clo_1();
        clo_12.a(l);
        clo_12.a(by);
        azu_0.j().K().c(clo_12);
    }

    public void a(Runnable runnable) {
        this.a(runnable, () -> {});
    }

    public void a(Runnable runnable, Runnable runnable2) {
        if (!cZI.A() || this.y == null || !this.y.b()) {
            runnable.run();
            return;
        }
        String string2 = bae.h().a("build.unsaved.changes", new Object[0]);
        int n2 = 32;
        int n3 = 64;
        fzn_0 fzn_02 = new fzn_0(102, 0, string2, null, cfn_0.a(0), 100L, List.of(bae.h().a("save", new Object[0]), bae.h().a("build.discard", new Object[0])), 0);
        fzn_02.a(32, 64, 4);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a((int n, String string) -> {
            if (n == 32) {
                boolean bl;
                boolean bl2 = bl = !this.w.e();
                if (bl && this.y.f()) {
                    this.a(false);
                    runnable.run();
                } else {
                    if (ezp_1.a(this.s.f())) {
                        aUh.a("build.error.save." + ezg_1.f.a(), new Object[0]);
                    }
                    runnable2.run();
                }
            } else if (n == 64) {
                this.y.a(true);
                runnable.run();
            } else if (n == 4) {
                runnable2.run();
            }
        });
    }

    private void a(dfk dfk2) {
        int n = new ezn_1().a(this.s.e(), dfk2.k(), dfk2.o(), dfk2.p(), false);
        if (n == -1) {
            return;
        }
        this.a(n, false);
        this.a(new bzk_2(this.s, this.w.c(), true));
    }

    public void a(@NotNull String string, short s2, int n) {
        boolean bl = this.y.a(string, s2, n);
        if (!bl) {
            aUh.a("build.error.edit.invalid.level", new Object[0]);
            return;
        }
        this.M();
        this.V();
        this.w.g();
        this.w.a(false);
        this.w.l().c();
        fis_1.a().a((ajf_1)this.w.i(), "currentBuildSheet");
        fis_1.a().a((ajf_1)this.w.i().i(), ble_0.n);
    }

    private void b(dfk dfk2) {
        int n = new ezn_1().a(this.s.e(), dfk2.k(), dfk2.o(), dfk2.p(), false);
        if (n == -1) {
            return;
        }
        int n2 = this.w.b();
        ezj_1 ezj_12 = this.s.c().dx().a(n);
        eyz_0 eyz_02 = this.s.c().d(n2);
        eyz_0 eyz_03 = this.s.c().d(n);
        fiO fiO2 = this.s.c().dw().b(n2);
        fiO fiO3 = this.s.c().dw().b(n);
        Object t = this.s.c().dA().a(n2);
        Object t2 = this.s.c().dA().a(n);
        if (ezj_12 == null || eyz_02 == null || eyz_03 == null || fiO2 == null || fiO3 == null || t == null || t2 == null) {
            m.error((Object)String.format("[Builds] Error while saving build as, some sheets are null, this should not happen: %s, %s, %s, %s, %s, %s", eyz_02, eyz_03, fiO2, fiO3, t, t2));
            this.i(n);
            return;
        }
        eyz_03.a(eyz_02);
        fiO3.a(fiO2);
        ((ezx_2)t2).d((ezx_2)t);
        bzk_2 bzk_22 = new bzk_2(this.s, ezj_12, true);
        bzk_22.a(this.y);
        this.y.a(false);
        this.a(n, false);
        this.a(bzk_22);
        this.a(true);
    }

    private void a(boolean bl) {
        if (this.t() && fzw_0.a.d("heroBuildLock")) {
            fzw_0.a.a("heroBuildLock", false);
            try {
                azu_0.j().K().c(this.y.b(bl));
            }
            catch (Exception exception) {
                fzw_0.a.a("heroBuildLock", true);
                m.error((Object)"[Builds] An unexpected error happened while send save build message", (Throwable)exception);
            }
        }
    }

    public void r() {
        if (this.s.i()) {
            return;
        }
        if (this.y != null && this.y.b()) {
            this.y.a(false);
        }
        this.a((bzk_2)null);
        if (this.s.a()) {
            if (this.v != this.s.c().dx().e()) {
                this.R();
            }
            if (this.u != null && this.s != null) {
                bjd_1.a.b(this.s.e(), this.u);
            }
        }
    }

    private void T() {
        if (!this.t()) {
            return;
        }
        String string2 = bae.h().a("build.discard.confirmation", new Object[0]);
        fzn_0 fzn_02 = new fzn_0(102, 0, string2, null, cfn_0.a(0), 24L, null, 0);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a((int n, String string) -> {
            if (n == 8) {
                this.U();
            }
        });
    }

    private void U() {
        this.y.a(true);
        this.M();
    }

    public void s() {
        int n = this.Q();
        if (this.y.h()) {
            this.i(n);
        } else {
            if (!this.g(n)) {
                aUh.a("build.error.delete.build.ui", new Object[0]);
                return;
            }
            if (!fzw_0.a.d("heroBuildLock")) {
                return;
            }
            fzw_0.a.a("heroBuildLock", false);
            clW clW2 = new clW(this.s.e(), (byte)n);
            azu_0.j().K().c(clW2);
        }
    }

    private void i(int n) {
        this.a((bzk_2)null);
        new ezn_1().d(this.s.e(), n);
        this.a(n == this.v ? 0 : this.v, false);
    }

    public void a(long l2, byte by) {
        Object t = euw_2.a.d(l2);
        ArrayList<Long> arrayList = new ArrayList<Long>(t != null ? ((epq_2)t).d(by).a().values() : List.of());
        new ezn_1().d(l2, by);
        if (cZI.A()) {
            if (t != null) {
                eyt_0 eyt_02 = ((epq_2)t).dC();
                arrayList.forEach(l -> eyt_02.b((Long)l).ifPresent(exk_2::P));
            }
            if (this.s.e() == l2 && this.w.c().c() == by) {
                this.a((bzk_2)null);
                this.a(by == this.v ? 0 : this.v, true);
            }
        }
    }

    public void a(long l, int n, @NotNull ezj_1 ezj_12, @NotNull eyz_0 eyz_02, @NotNull fiO fiO2, @NotNull ezx_2 ezx_22) {
        bnh_1 bnh_12 = (bnh_1)euw_2.a.d(l);
        if (bnh_12 == null) {
            return;
        }
        bnh_12.dx().a(n, ezj_12);
        bnh_12.dB().a(n, eyz_02);
        bnh_12.dw().a(n, fiO2);
        bnh_12.dA().a(n, ezx_22);
        bnh_12.cg().a(fie.f, n, ezj_12.d());
        Object object = fis_1.a().d("itemDetail", "heroBuildDialog");
        if (object instanceof exk_2 && eyz_02.b(((exk_2)object).a())) {
            ((exk_2)object).P();
        }
        if (cZI.A() && this.s != null && this.s.e() == bnh_12.a_()) {
            if (this.B) {
                this.a((bzk_2)null);
                this.a(n, this.A);
                this.A = false;
            }
            this.w.j().a(cZI.o().valueCollection());
        }
        this.B = true;
    }

    public void d(long l) {
        if (!cZI.A()) {
            return;
        }
        if (this.s != null && this.s.b() && this.s.e() == l) {
            this.a((bzk_2)null);
            eBt eBt2 = eBo.a.c(l);
            if (eBt2 != null) {
                this.c(eBt2);
            } else {
                this.i(azu_0.j().k().a_());
            }
        }
    }

    public boolean t() {
        return this.y != null && this.y.b();
    }

    public boolean e(int n) {
        return this.y != null && this.y.a(n);
    }

    public boolean f(int n) {
        return this.y == null || this.y.b(n);
    }

    private void a(ble_0 ble_02, ble_0 ble_03, bzm_2 bzm_22, boolean bl) {
        bzk_2 bzk_22;
        this.y = bzk_22 = new bzk_2(this.s, ble_03, false);
        eyz_0 eyz_02 = this.s.c().d(ble_02.c());
        if (bzm_22.a() && eyz_02 != null) {
            if (bl) {
                eyz_02 = cZI.a(eyz_02, this.s.c().dC(), ble_03.b().a(this.s.c()));
            }
            bzk_22.a(eyz_02);
        }
        fiO fiO2 = this.s.c().dw().b(ble_02.c());
        if (bzm_22.b() && fiO2 != null) {
            fiO2 = cZI.a(fiO2, ble_03.b().a(this.s.c()), bl);
            bzk_22.a(fiO2);
        }
        Object object = this.s.c().dA().a(ble_02.c());
        if (bzm_22.c() && object != null) {
            if (bl) {
                object = cZI.a(object, ble_03.b().a(this.s.c()));
            }
            bzk_22.a((ezx_2)object);
        }
        this.y = null;
        this.a(ble_03.c(), false);
        this.a(bzk_22);
        fpm_0.b().o("heroBuildCopyBuildDialog");
    }

    public void e(long l) {
        if (this.s.e() != l) {
            return;
        }
        this.w.i().a();
        fis_1.a().a((ajf_1)this.w.i(), bld_0.k);
    }

    private void V() {
        Object object;
        Optional optional = this.w.j().a(bzd_1.b);
        if (optional.isPresent() && !((bze_1)(object = this.c(((bze_1)optional.get()).g()))).equals(optional.get())) {
            this.w.j().a((bzc_1)object);
        }
        if ((object = fis_1.a().d("editableDescribedSpell", "heroBuildDialog")) instanceof bpl_0) {
            ((bpl_0)object).c(this.s.h());
        }
        fis_1.a().a("describedSpellRealLevel", (Object)this.s.h(), "heroBuildDialog");
    }

    public void a(exk_2 exk_22, @Nullable exh_2 exh_22) {
        if (exk_22.aa() && !exk_22.ab() && !exk_22.n().a().c()) {
            String string2 = bae.h().a("item.bound.onEquipQuestion", new Object[0]);
            fzn_0 fzn_02 = new fzn_0(102, 0, string2, null, cfn_0.a(8), 24L);
            fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
            fzm_02.a((int n, String string) -> {
                if (n == 8) {
                    this.b(exk_22, exh_22);
                }
            });
        } else {
            this.b(exk_22, exh_22);
        }
    }

    private void b(exk_2 exk_22, @Nullable exh_2 exh_22) {
        Set<exh_2> set;
        exh_2 exh_23;
        if (this.s.a()) {
            bji_1 bji_12 = (bji_1)this.X();
            exh_23 = exh_22 == null ? eyf_1.a(bji_12.e(), exk_22) : exh_22;
            set = eyf_1.e(this.s.c(), bji_12.e(), exk_22, exh_23);
        } else {
            exh_23 = exh_22 == null ? eyf_1.a(this.s.d().h(), exk_22) : exh_22;
            set = eyf_1.a(this.s.d().h(), exk_22, exh_23);
        }
        this.a(exk_22, exh_23, set, this.w.j().f());
    }

    private void a(@NotNull exk_2 exk_22, @NotNull exh_2 exh_22, Set<exh_2> set, bjc_1 bjc_12) {
        if (!fzw_0.a.d("heroBuildLock")) {
            return;
        }
        Optional<exh_2> optional = this.y.a(exk_22, exh_22);
        if (optional.isEmpty()) {
            return;
        }
        bja_1 bja_12 = bjc_12.a(optional.get());
        cZI.a(bjc_12, set);
        cZI.a(bjc_12, exk_22);
        bja_12.a(exk_22);
        this.w.j().c();
        this.M();
        fis_1.a().a((ajf_1)bja_12, bja_1.g);
        fis_1.a().a((ajf_1)this.w, "equipments");
        fis_1.a().a((ajf_1)this.j(), "actorEquipment");
        fis_1.a().a((ajf_1)this.w.j(), "actorDescriptorLibrary", "actorAnimationName");
    }

    public void a(@NotNull exh_2 exh_22) {
        bjc_1 bjc_12 = this.w.j().f();
        this.a(bjc_12.a(exh_22));
    }

    private void a(@NotNull bja_1 bja_12) {
        if (!fzw_0.a.d("heroBuildLock")) {
            return;
        }
        Optional<exh_2> optional = this.y.a(bja_12.a());
        if (optional.isEmpty()) {
            return;
        }
        this.b(bja_12);
    }

    public void b(@NotNull exh_2 exh_22) {
        this.b(this.X().a(exh_22));
    }

    private void b(@Nullable bja_1 bja_12) {
        if (bja_12 == null) {
            return;
        }
        bjc_1 bjc_12 = this.X();
        if (bja_12.h().T().B() && bja_12.a() == exh_2.q) {
            bja_1 bja_13 = bjc_12.a(exh_2.p);
            bja_13.a(null);
            fis_1.a().a((ajf_1)bja_13, "item", "containerStyle");
        } else {
            cZI.a(bjc_12, List.of(bja_12.h().U().j()));
        }
        bja_12.a(null);
        this.w.j().c();
        this.M();
        fis_1.a().a((ajf_1)bja_12, bja_1.g);
        fis_1.a().a((ajf_1)this.w, "equipments");
        fis_1.a().a((ajf_1)this.w.j(), "actorDescriptorLibrary", "actorAnimationName");
    }

    private static void a(bjc_1 bjc_12, Collection<exh_2> collection) {
        for (exh_2 exh_22 : collection) {
            bja_1 bja_12 = bjc_12.a(exh_22);
            bja_12.a(null);
            fis_1.a().a((ajf_1)bja_12, bja_1.g);
        }
    }

    private static void a(bjc_1 bjc_12, exk_2 exk_22) {
        exk_2 exk_23 = exk_22.b(exk_22.a());
        exk_22.b(exk_23);
        for (exh_2 exh_22 : exk_22.U().j()) {
            bja_1 bja_12 = bjc_12.a(exh_22);
            bja_12.a(exk_23);
            fis_1.a().a((ajf_1)bja_12, bja_1.g);
        }
    }

    public void a(exk_2 exk_22) {
        if (this.X().a(exk_22.a())) {
            cZI.a(this.X(), exk_22);
        }
    }

    public void f(long l) {
        if (cZI.A() && this.s != null && this.s.e() == l && this.u != null) {
            this.u.b(this.s.c().dC());
        }
    }

    public void a(long l, long l2) {
        if (cZI.A() && this.s != null && this.s.e() == l && this.u != null) {
            this.u.a((Long)l2);
        }
    }

    private static eyz_0 a(@NotNull eyz_0 eyz_02, @NotNull eyt_0 eyt_02, int n) {
        eyz_0 eyz_03 = eyz_02.b();
        eyz_03.a().values().removeIf(l -> {
            Optional<exk_2> optional = eyt_02.b((Long)l);
            return optional.isEmpty() || optional.get().c() > n;
        });
        return eyz_03;
    }

    public void g(long l) {
        if (this.s.e() != l) {
            return;
        }
        this.a(new bzk_2(this.s, this.w.c(), false));
        this.w.i().a();
        this.w.f();
    }

    private void b(boolean bl) {
        bze_1 bze_12 = this.c(bl);
        this.w.j().a(bze_12);
    }

    public void u() {
        this.w.j().a(cZI.o().valueCollection());
    }

    public void b(@NotNull exk_2 exk_22) {
        if (this.y.g().contains(exk_22.a())) {
            this.y.a(exk_22);
            this.M();
        }
    }

    @Override
    public void a(exg_2 exg_22) {
        exg_22.b(this);
        this.u();
    }

    @Override
    public void b(exg_2 exg_22) {
        exg_22.a(this);
        this.u();
    }

    @Override
    public void a(Uk uk) {
        ts_0 ts_02;
        boolean bl = true;
        if (uk instanceof um_0 && (ts_02 = ((um_0)uk).c()) instanceof exk_2 && !((exk_2)ts_02).T().U()) {
            bl = false;
        }
        if (bl) {
            this.u();
        }
    }

    @NotNull
    private bze_1 c(boolean bl) {
        int n;
        short s2;
        if (this.s.a()) {
            ble_0 ble_02 = this.w.i().i();
            int n2 = ble_02.b().a(this.s.c());
            Cm<Short, Short> cm = ezi_1.c((short)n2);
            s2 = bl ? cm.a() : (short)0;
            n = Math.min(this.s.c().dt(), cm.b().shortValue());
        } else {
            int n3 = eBx.b(this.s.d());
            Cm<Short, Short> cm = ezi_1.c((short)n3);
            s2 = bl ? cm.a() : (short)0;
            n = n3;
        }
        return new bze_1(s2, n, bl);
    }

    public void c(exk_2 exk_22) {
        this.w.j().a(exk_22);
    }

    public void v() {
        this.w.j().e();
    }

    @Nullable
    public exk_2 h(long l) {
        return this.y.a(l);
    }

    public void a(@NotNull bpl_0 bpl_02, @Nullable bpr_0 bpr_02) {
        if (!fzw_0.a.d("heroBuildLock")) {
            return;
        }
        bpr_0 bpr_03 = bpr_02;
        if (bpr_03 == null) {
            bpr_03 = this.Y().a(bpl_02);
        }
        if (bpr_03 == null || bpr_03.b(bpl_02)) {
            return;
        }
        if (bpr_03.e() != ((bph_0)bpl_02.r()).w()) {
            return;
        }
        boolean bl = this.y.a(bpl_02, bpr_03);
        if (!bl) {
            return;
        }
        bpr_03.a(bpl_02);
        this.M();
        fis_1.a().a((ajf_1)bpr_03, bpr_0.f);
        this.w.a(false);
    }

    public void a(@NotNull bpr_0 bpr_02) {
        if (!fzw_0.a.d("heroBuildLock")) {
            return;
        }
        boolean bl = this.y.a(bpr_02);
        if (!bl) {
            return;
        }
        bpr_02.a(null);
        this.M();
        fis_1.a().a((ajf_1)bpr_02, bpr_0.f);
        this.w.a(false);
    }

    public void w() {
        Object object;
        Cm<Integer, Integer> cm2;
        bPK bPK2 = this.w.i().l();
        List<Cm<Integer, Integer>> list = ezp_1.b(this.s.c(), bPK2.f());
        for (Cm<Integer, Integer> cm2 : list) {
            object = bPK2.a(cm2.b().byteValue());
            if (((bpr_0)object).b().w() != ((Integer)cm2.a()).intValue()) continue;
            this.a((bpr_0)object);
        }
        List<Cm<Integer, Integer>> list2 = ezp_1.c(this.s.c(), bPK2.f());
        cm2 = list2.iterator();
        while (cm2.hasNext()) {
            object = (Cm)cm2.next();
            bpr_0 bpr_02 = bPK2.b(((Integer)((Cm)object).b()).byteValue());
            if (bpr_02.b().w() != ((Integer)((Cm)object).a()).intValue()) continue;
            this.a(bpr_02);
        }
    }

    public void a(@NotNull fiO fiO2) {
        if (!fzw_0.a.d("heroBuildLock")) {
            return;
        }
        fiL fiL2 = new fiL();
        boolean bl = ezp_1.a((epq_2)this.s.c(), fiO2).isEmpty();
        fiO fiO3 = bl ? fiO2 : fiL2.b(this.s.e(), fiO2);
        if (fiO3 == null) {
            return;
        }
        boolean bl2 = this.y.a(fiO3);
        if (!bl2) {
            return;
        }
        if (!bl) {
            aUh.a("error.spellDeck.clean", new Object[0]);
        }
        this.M();
        this.w.a(false);
    }

    public void x() {
        this.s.c().aZ().g().forEach((l, bpl_02) -> {
            if (bpl_02 != null) {
                fis_1.a().a((ajf_1)bpl_02, "isInCurrentDeck", "unlockLevel", "isUnlockedSpell");
            }
        });
    }

    public void y() {
        this.Y().c();
        this.w.a(false);
    }

    private static fiO a(@NotNull fiO fiO2, int n, boolean bl) {
        Object object;
        fiO fiO3 = fiO2.a();
        ArrayList<Integer> arrayList = fiO3.d();
        for (int k = 0; k < arrayList.size(); ++k) {
            Integer n2 = arrayList.get(k);
            if (n2 == 0 || (object = fip_0.d().b(n2)) != null && fiK.a[k] <= n && (!bl || ((fin_0)object).m() <= n)) continue;
            fiO3.a(0, k);
        }
        ArrayList<Integer> arrayList2 = fiO3.f();
        for (int k = 0; k < arrayList2.size(); ++k) {
            Object Spell;
            object = arrayList2.get(k);
            if ((Integer)object == 0 || (Spell = fip_0.d().b((Integer)object)) != null && fiK.a[k] <= n && (!bl || ((fin_0)Spell).m() <= n)) continue;
            fiO3.b(0, k);
        }
        return fiO3;
    }

    private bkq_2 W() {
        return this.w.i().m();
    }

    public void a(@NotNull bkx_2 bkx_22, int n) {
        if (!fzw_0.a.d("heroBuildLock")) {
            return;
        }
        int n2 = n > 0 ? Math.min(n, bkx_22.a(this.s.c().dt())) : Math.max(n, -bkx_22.b());
        this.y.a(bkx_22, n2);
        bkx_22.e().e();
        this.w.l().e();
        this.M();
        this.s.c().b(this.s.c().cK(), true);
    }

    public void a(@NotNull ezx_2 ezx_22) {
        if (!fzw_0.a.d("heroBuildLock")) {
            return;
        }
        this.y.a(ezx_22);
        this.z();
        this.M();
        this.s.c().b(this.s.c().cK(), true);
    }

    public void z() {
        this.w.l().c();
        this.w.l().e();
    }

    private static ezx_2 a(@NotNull ezx_2 ezx_22, int n2) {
        ezx_2 ezx_23 = ezx_22.f();
        ezj_2 ezj_22 = ezi_2.a.b((short)n2);
        block0: for (int n3 : ezi_2.a.a()) {
            int n4 = ezx_23.b(n3) - ezj_22.a(n3);
            if (n4 <= 0) continue;
            List list = ezi_2.a.d(n3).stream().sorted(Comparator.comparingInt(n -> {
                Object t = ezh_2.a.a((int)n);
                return t == null || ((ezv_2)t).d() <= 0 ? 0 : 1;
            })).collect(Collectors.toList());
            for (Integer n5 : list) {
                short s2 = ezx_23.a(n5);
                if (s2 > 0) {
                    int n6 = Math.max(0, s2 - n4);
                    ezx_23.a(n5, (short)n6);
                    n4 -= s2 - n6;
                }
                if (n4 > 0) continue;
                continue block0;
            }
        }
        return ezx_23;
    }

    @Contract(pure=true)
    public static boolean A() {
        return azu_0.j().c(o);
    }

    private bjc_1 X() {
        return this.w.j().f();
    }

    private bPK Y() {
        return this.w.i().l();
    }

    public Optional<bpr_0> a(bpl_0 bpl_02) {
        if (bpl_02 == null) {
            return Optional.empty();
        }
        return this.Y().b(bpl_02.w());
    }

    public boolean B() {
        return this.y != null && this.y.h();
    }

    public boolean C() {
        return this.w.e();
    }

    @Nullable
    public static bmr_1 D() {
        if (cZI.o.s == null) {
            return null;
        }
        return cZI.o.s.c();
    }

    @Nullable
    public static eBt E() {
        if (cZI.o.s == null) {
            return null;
        }
        return cZI.o.s.d();
    }

    @Nullable
    public static bmv_1 F() {
        if (cZI.o.s == null) {
            return null;
        }
        if (!cZI.o.s.b()) {
            return null;
        }
        return (bmv_1)cZI.o.s.j();
    }

    public static short G() {
        if (cZI.o.s == null) {
            return 0;
        }
        return cZI.o.s.h();
    }

    public static short H() {
        if (cZI.o.s == null) {
            return azu_0.j().k().dt();
        }
        if (cZI.o.s.b()) {
            return o.I().d().d();
        }
        return cZI.o.s.c().dt();
    }

    public boolean g(int n) {
        if (!this.s.a()) {
            return false;
        }
        return !ezp_1.a(this.s.c()) && ezn_1.a(this.s.c(), n);
    }

    private static void a(bzy_2 bzy_22) {
        if (fpm_0.b().q("createBuildDialog")) {
            fpm_0.b().o("createBuildDialog");
            fis_1.a().a("heroBuildBuildCreationView", (Object)null);
        } else {
            fis_1.a().a("heroBuildBuildCreationView", bzy_22);
            fvk_0 fvk_02 = (fvk_0)fpm_0.b().a("createBuildDialog", cfi_0.a("createBuildDialog"), 33153L, (short)10000);
            fyb_0 fyb_02 = fvk_02.getElementMap().a(n);
            if (fyb_02 instanceof fuh_0) {
                ((fuh_0)fyb_02).setFocused(true);
            }
        }
    }

    @Override
    public void a(fid fid2) {
    }

    @Override
    protected boolean q() {
        return false;
    }

    public bzo_1 I() {
        return this.s;
    }

    public int J() {
        return this.v;
    }
}

