/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class cVg
extends cVb {
    private static final Logger c = Logger.getLogger(cVg.class);
    public static final cVg b = new cVg();
    private static final azf_2 d = new azf_2(216, 216, 216, 255);
    private static final azf_2 e = new azf_2(170, 170, 170, 255);
    private ans_1 f;
    private bqC g;
    private bqD h;
    private boolean i;

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17315: {
                dfc dfc2 = (dfc)adt_12;
                String string = dfc2.h();
                if (Cz.f(string)) {
                    return false;
                }
                Optional<bqE> optional = this.g.a(string);
                if (optional.isEmpty()) {
                    return false;
                }
                if (optional.get().e()) {
                    return false;
                }
                this.g.e(string);
                this.a(new cog_0(string));
                return false;
            }
            case 17982: {
                dfd_0 dfd_02 = (dfd_0)adt_12;
                if (!eAV.a(dfd_02.o())) {
                    return false;
                }
                if (!eAV.b(dfd_02.p())) {
                    return false;
                }
                Optional<bqE> optional = this.g.a(dfd_02.k());
                if (optional.isEmpty()) {
                    return false;
                }
                bqE bqE2 = optional.get();
                azj_2 azj_22 = cVg.a(dfd_02.p(), bqE2.f());
                bqE2.a(azj_22);
                String string = cVg.a(dfd_02.o(), bqE2.f(), bqE2.c());
                bqE2.a(string);
                fis_1.a().a((ajf_1)bqE2, "color", "name", "textColor");
                if (Objects.equals(dfd_02.k(), this.h.c())) {
                    this.h.a(string);
                    this.h.a(azj_22);
                    fis_1.a().a((ajf_1)this.h, "color", "title");
                }
                azu_0.j().K().c(new cok_0(dfd_02.k(), string, dfd_02.p()));
                return false;
            }
            case 16615: {
                if (this.i) {
                    return false;
                }
                dfc dfc3 = (dfc)adt_12;
                bqE bqE3 = (bqE)dfc3.j();
                Optional<bqE> optional = this.g.a(bqE3);
                if (optional.isEmpty()) {
                    return false;
                }
                bqE bqE4 = optional.get();
                if (bqE4.f()) {
                    return false;
                }
                bqE3.b(false);
                fis_1.a().a((ajf_1)bqE3, "hovered");
                this.a(new coi_0(bqE4.j(), bqE3.j()));
                return false;
            }
            case 18827: {
                if (this.i) {
                    return false;
                }
                dfc dfc4 = (dfc)adt_12;
                bqE bqE5 = (bqE)dfc4.j();
                Optional<bqE> optional = this.g.b(bqE5);
                if (optional.isEmpty()) {
                    return false;
                }
                bqE bqE6 = optional.get();
                if (bqE6.f()) {
                    return false;
                }
                bqE5.b(false);
                fis_1.a().a((ajf_1)bqE5, "hovered");
                this.a(new coi_0(bqE5.j(), bqE6.j()));
                return false;
            }
            case 17093: {
                if (this.i) {
                    return false;
                }
                dgL dgL2 = (dgL)adt_12;
                String string = dgL2.h();
                if (string == null || string.isEmpty()) {
                    return false;
                }
                exk_2 exk_22 = dgL2.o();
                if (exk_22 == null) {
                    return false;
                }
                Optional<bqE> optional = this.g.a(string);
                if (optional.isEmpty()) {
                    return false;
                }
                bqE bqE7 = optional.get();
                if (bqE7.f()) {
                    return false;
                }
                if (!Objects.equals(this.h.c(), string) && bqE7.i()) {
                    return false;
                }
                bmr_1 bmr_12 = cyt_0.s();
                ezr_0<?> ezr_02 = exk_22.T();
                if (ezr_02.a(exz_1.d) != null && !ezr_02.a(exz_1.d).b(bmr_12, -1, ezr_02, bmr_12.Q_())) {
                    return false;
                }
                if (ezr_02.a(exz_1.e) != null && !ezr_02.a(exz_1.e).b(bmr_12, -1, ezr_02, bmr_12.Q_())) {
                    return false;
                }
                if (exk_22.n() != null && exk_22.n().a().g()) {
                    return false;
                }
                int n = dgL2.r();
                if (n < -1 || n >= bqE7.g()) {
                    return false;
                }
                short s2 = dgL2.u();
                if (Objects.equals(this.h.c(), string)) {
                    Optional<exk_2> optional2;
                    if (n == -1 && (optional2 = this.h.a(exk_22)).isPresent()) {
                        exk_2 exk_23 = optional2.get();
                        n = this.h.c(exk_23.a());
                        s2 = Hw.c((long)Math.min(s2, exk_23.aR_() - exk_23.e()));
                    }
                    if (n == -1 && !this.h.g()) {
                        return false;
                    }
                    if (n >= 0 && (optional2 = this.h.a(n)).isPresent() && (!exk_22.a(optional2.get()) || optional2.get().D() <= 0)) {
                        return false;
                    }
                }
                if (s2 < 1) {
                    return false;
                }
                this.a(new cod_0(string, n, exk_22.a(), s2));
                return false;
            }
            case 16926: {
                if (this.i) {
                    return false;
                }
                dfc dfc5 = (dgP)adt_12;
                Object object = ((dgP)dfc5).k();
                if (((exk_2[])object).length == 0) {
                    return false;
                }
                String string = ((dgP)dfc5).o();
                if (Cz.f(string)) {
                    return false;
                }
                Optional<bqE> optional3 = this.g.a(string);
                if (optional3.isEmpty()) {
                    return false;
                }
                bqE bqE8 = optional3.get();
                if (bqE8.f()) {
                    return false;
                }
                if (!Objects.equals(this.h.c(), string)) {
                    return false;
                }
                HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
                int n = this.h.h();
                coh_0 coh_02 = new coh_0();
                coh_02.a(string);
                for (Object object2 : object) {
                    boolean bl;
                    if (!((exk_2)object2).U().m() || ((exk_2)object2).y() || !(bl = this.h.b((exk_2)object2))) continue;
                    long l = ((exk_2)object2).a();
                    short s3 = ((exk_2)object2).e();
                    int n2 = -1;
                    Integer[] integerArray = this.h.c((exk_2)object2);
                    if (integerArray.length > 0) {
                        boolean bl2 = false;
                        Integer[] integerArray2 = integerArray;
                        int n3 = integerArray2.length;
                        for (int k = 0; k < n3; ++k) {
                            boolean bl3;
                            int n4;
                            int n5 = integerArray2[k];
                            if (hashMap.containsKey(n5)) {
                                n4 = (Integer)hashMap.get(n5);
                            } else {
                                exk_2 exk_24 = this.h.a(n5).get();
                                n4 = exk_24.aR_() - exk_24.e();
                                hashMap.put(n5, n4);
                            }
                            boolean bl4 = bl3 = s3 <= Hw.c((long)n4);
                            if (!bl3) {
                                if (n4 == 0) continue;
                                coh_02.a(l, (short)n5, (short)n4);
                                hashMap.replace(n5, 0);
                                continue;
                            }
                            hashMap.replace(n5, n4 - s3);
                            coh_02.a(l, (short)n5, s3);
                            bl2 = true;
                            break;
                        }
                        if (bl2) continue;
                    }
                    if (n == 0) continue;
                    coh_02.a(l, (short)-1, s3);
                    --n;
                }
                this.a(coh_02);
            }
            case 17543: {
                Optional<exk_2> optional;
                if (this.i) {
                    return false;
                }
                dfc dfc5 = (dgL)adt_12;
                Object object = ((dgL)dfc5).o();
                if (object == null) {
                    return false;
                }
                String string = dfc5.h();
                if (string == null || string.isEmpty()) {
                    return false;
                }
                Optional<bqE> optional3 = this.g.a(string);
                if (optional3.isEmpty()) {
                    return false;
                }
                bqE bqE8 = optional3.get();
                if (bqE8.f()) {
                    return false;
                }
                if (!Objects.equals(this.h.c(), string) && bqE8.i()) {
                    return false;
                }
                short s4 = ((dgL)dfc5).r();
                if (s4 < -1 || s4 >= bqE8.g()) {
                    return false;
                }
                if (Objects.equals(this.h.c(), string) && s4 == -1) {
                    return false;
                }
                if (s4 >= 0 && (optional = this.h.a(s4)).isPresent()) {
                    this.a(new coj_0(this.h.c(), ((exk_2)object).a(), optional.get().a()));
                    return false;
                }
                this.a(new coe_0(this.h.c(), ((exk_2)object).a(), string, Integer.valueOf(s4)));
                return false;
            }
            case 16358: {
                if (this.i) {
                    return false;
                }
                dgL dgL3 = (dgL)adt_12;
                bmk_1 bmk_12 = dgL3.y();
                if (bmk_12 == null) {
                    return false;
                }
                this.a(new cof_0(this.h.c(), bmk_12.f(), dgL3.o().aT_(), dgL3.o().a(), dgL3.t(), Integer.valueOf(dgL3.r()), dgL3.u()));
                return false;
            }
            case 17048: {
                dfc dfc6 = (dfc)adt_12;
                if (dfc6.h() == null) {
                    return false;
                }
                this.g.c(dfc6.h());
                this.g.c();
                return false;
            }
            case 16356: {
                dfc dfc7 = (dfc)adt_12;
                if (dfc7.h() == null) {
                    return false;
                }
                cVg.g();
                this.h.e(dfc7.h());
                this.h.f();
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        super.a(aav_22, bl);
        if (!bl) {
            this.f = string -> {
                if (string.equals("accountChestDialog")) {
                    azu_0.j().b(b);
                }
            };
            fpm_0.b().a(this.f);
            azu_0.j().b(dei.a());
            this.h = new bqD();
            fis_1.a().a("accountChestContentView", this.h);
            fis_1.a().a("accountChestCompartmentModification", false);
            this.i = true;
            fvk_0 fvk_02 = (fvk_0)fpm_0.b().a("accountChestDialog", cfi_0.a("accountChestDialog"), 32769L, (short)10000);
            this.a(fvk_02);
            fpm_0.b().a("wakfu.accountChest", cfo_0.class);
            cdw_0.n().c(600012L);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        super.b(aav_22, bl);
        if (!bl) {
            fpm_0.b().b(this.f);
            fpm_0.b().o("accountChestDialog");
            this.h = null;
            fis_1.a().a("accountChestContentView");
            this.g = null;
            fis_1.a().a("accountChestCompartments");
            fis_1.a().a("accountChestCompartmentModification", false);
            fis_1.a().a("compartmentColorPreview");
            fpm_0.b().e("wakfu.accountChest");
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12 != null && bmr_12.eE() != null) {
                bmr_12.a(false, true);
            }
            azu_0.j().a(dei.a());
            cdw_0.n().c(600013L);
            cVg.g();
            this.i = false;
        }
    }

    private void a(Pw pw) {
        azu_0.j().K().c(pw);
        this.i = true;
    }

    private static void g() {
        if (exk_2.S().b() != null) {
            exk_2.S().b().b();
        }
    }

    public void a(mc_0 mc_02) {
        if (mc_02 == null || mc_02.d() == 0) {
            c.error((Object)("[Account Chest] No compartment retrieved for account " + azu_0.j().n().u()));
            return;
        }
        List<bqE> list = mc_02.b().stream().map(cVg::b).collect(Collectors.toList());
        list.add(new bqf_0());
        list.sort((bqE2, bqE3) -> {
            if (bqE2.k() && bqE3.k()) {
                return Integer.compare(bqE2.c(), bqE3.c());
            }
            if (bqE2.k()) {
                return 1;
            }
            if (bqE3.k()) {
                return -1;
            }
            if (bqE2.f() && bqE3.f()) {
                return Integer.compare(bqE2.c(), bqE3.c());
            }
            if (bqE2.f()) {
                return 1;
            }
            if (bqE3.f()) {
                return -1;
            }
            return Integer.compare(bqE2.c(), bqE3.c());
        });
        boolean bl = emp_0.b(azu_0.j().n().v(), emq_0.m);
        this.g = new bqC(list, bl);
        fis_1.a().a("accountChestCompartments", this.g);
        bqE bqE4 = list.get(0);
        bqE4.a(true);
        azu_0.j().K().c(new cog_0(bqE4.j()));
    }

    public static void b(mc_0 mc_02) {
        if (mc_02 == null || mc_02.d() == 0) {
            return;
        }
        mc_02.b().stream().filter(mg_02 -> !mg_02.t()).filter(mg_02 -> Cz.f(mg_02.h())).forEach(mg_02 -> azu_0.j().K().c(new cok_0(mg_02.c(), cVg.d(mg_02), mg_02.k())));
    }

    private static bqE b(mg_0 mg_02) {
        bqE bqE2 = new bqE(mg_02.c(), cVg.d(mg_02), cVg.c(mg_02), (short)mg_02.n(), mg_02.t());
        bqE2.a(mg_02.r());
        bqE2.b(mg_02.r() - mg_02.p());
        return bqE2;
    }

    public void a(@NotNull mg_0 mg_02) {
        eAU eAU2 = eAU.a(mg_02.v(), mg_02.r());
        this.h.a(eAU2);
        this.h.c(mg_02.c());
        this.h.a(cVg.c(mg_02));
        this.h.a(cVg.d(mg_02));
        this.h.a(mg_02.t());
        cVg.g();
        this.h.f();
        fis_1.a().a((ajf_1)this.h, bqD.g);
    }

    public void a(String string, int n) {
        bqE bqE2;
        this.g.a(string, n);
        Optional<bqE> optional = this.g.a(string);
        if (optional.isEmpty()) {
            return;
        }
        bqE bqE3 = optional.get();
        if (!bqE3.f() || bqE3.h() != 0) {
            return;
        }
        Optional<bqE> optional2 = this.g.a(bqE3);
        if (optional2.isPresent()) {
            bqE2 = optional2.get();
        } else {
            Optional<bqE> optional3 = this.g.b(bqE3);
            if (optional3.isEmpty()) {
                return;
            }
            bqE2 = optional3.get();
        }
        aUh.b("account.chest.compartment.removed", bqE3.a());
        this.g.c(bqE3);
        this.g.e(bqE2.j());
        this.a(new cog_0(bqE2.j()));
    }

    private static azj_2 c(mg_0 mg_02) {
        return cVg.a(mg_02.k(), mg_02.t());
    }

    private static azj_2 a(String string, boolean bl) {
        if (!Cz.f(string)) {
            try {
                return azf_2.a(string);
            }
            catch (RuntimeException runtimeException) {
                c.error((Object)("Error when creating color from hexa " + string), (Throwable)runtimeException);
            }
        }
        return bl ? e : d;
    }

    private static String d(mg_0 mg_02) {
        return cVg.a(mg_02.h(), mg_02.t(), mg_02.n());
    }

    private static String a(String string, boolean bl, int n) {
        if (Cz.f(string)) {
            return bae.h().a(bl ? "account.chest.compartment.readonly.name" : "account.chest.compartment.default.name", n + 1);
        }
        return string;
    }

    public bqC d() {
        return this.g;
    }

    public bqD e() {
        return this.h;
    }

    public boolean f() {
        return this.i;
    }

    public void a(boolean bl) {
        this.i = bl;
    }

    public static void a(eAW eAW2) {
        String string;
        if (eAW2 == eAW.b) {
            string = "account.storage.result.error";
        } else if (eAW2 == eAW.c) {
            string = "account.storage.result.maintenance";
        } else if (eAW2 == eAW.d) {
            string = "account.chest.action.result.temporary.inventory";
        } else {
            return;
        }
        fpm_0.b().a(bae.h().a(string, new Object[0]), cfn_0.a(1), 3L, 102, 1);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

