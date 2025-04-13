/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class cYL
implements ahr_1 {
    private static final cYL a = new cYL();
    private static final int b = 33;
    private jk_0 c;
    private bxh_1 d;
    private fhq e;
    private js f;
    private final Map<Long, cYN> g = new HashMap<Long, cYN>();
    private List<Long> h = new LinkedList<Long>();
    private boolean i = false;
    private boolean j = false;
    private ans_1 k;

    public static cYL a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16776: {
                azu_0.j().b(this);
                return false;
            }
            case 17807: {
                if (this.d == null) {
                    return false;
                }
                this.d.a();
                return false;
            }
            case 17214: {
                if (this.d == null) {
                    return false;
                }
                this.d.b();
                return false;
            }
            case 19388: {
                dfc dfc2 = (dfc)adt_12;
                this.i = dfc2.i();
                this.a((bxg_1)null);
                return false;
            }
            case 19680: {
                dfc dfc3 = (dfc)adt_12;
                this.j = dfc3.i();
                this.a(this.j ? (bxg_1)dfc3.j() : null);
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public long c() {
        return this.c == null ? -1L : this.c.c();
    }

    public void d() {
        if (this.c != null) {
            return;
        }
        ArrayList<iy_0> arrayList = new ArrayList<iy_0>();
        ja ja2 = iy_0.k();
        ja2.a(27851);
        ja2.b(1);
        arrayList.add(ja2.l());
        ja ja3 = iy_0.k();
        ja3.a(27040);
        ja3.b(10);
        arrayList.add(ja3.l());
        ja ja4 = iy_0.k();
        ja4.a(27041);
        ja4.b(100);
        arrayList.add(ja4.l());
        ja ja5 = iy_0.k();
        ja5.a(23597);
        ja5.b(1000);
        arrayList.add(ja5.l());
        jm_0 jm_02 = jk_0.G();
        jm_02.a(1234L);
        jm_02.b(1000L);
        jm_02.a(1000);
        jm_02.b(1);
        jm_02.c(4321L);
        bxs_2.a.a();
        bxs_2.a.a(11);
        bxs_2.a.a(33);
        bxs_2.a.a(36);
        bxs_2.a.a(11, eos_1.c);
        bxs_2.a.a(36, eos_1.b);
        jm_02.c(emr_2.b.a());
        jm_02.d(12);
        jq jq2 = jo.k();
        jq2.e(1);
        jC jC2 = ja_0.q();
        jC2.b(215);
        jC2.c(200);
        jC jC3 = ja_0.q();
        jC3.b(123);
        ji_0 ji_02 = jg_0.z();
        ji_02.a(9L);
        ji_02.b(3001946L);
        ji_02.a("Trente Et Un Sadida");
        ji_02.c(10);
        ji_02.a(false);
        ji_02.b(false);
        ji_02.a(arrayList);
        ji_02.g(123);
        ji_02.a(jC2);
        jq2.a(ji_02);
        ji_0 ji_03 = jg_0.z();
        ji_03.a(14L);
        ji_03.b(3001946L);
        ji_03.a("AER-H\u00e9ro Avec un Superlon Nom");
        ji_03.c(4);
        ji_03.a(false);
        ji_03.b(true);
        ji_03.c(true);
        ji_03.g(0);
        ji_03.a(jC3);
        jq2.a(ji_03);
        ja ja6 = iy_0.k();
        ja6.a(17784);
        ja6.b(123);
        arrayList.add(ja6.l());
        ja ja7 = iy_0.k();
        ja7.a(23619);
        ja7.b(123);
        arrayList.add(ja7.l());
        ja ja8 = iy_0.k();
        ja8.a(23597);
        ja8.b(123);
        arrayList.add(ja8.l());
        ja ja9 = iy_0.k();
        ja9.a(17784);
        ja9.b(123);
        arrayList.add(ja9.l());
        ja ja10 = iy_0.k();
        ja10.a(12324);
        ja10.b(123);
        arrayList.add(ja10.l());
        ja ja11 = iy_0.k();
        ja11.a(17784);
        ja11.b(123);
        arrayList.add(ja11.l());
        ja ja12 = iy_0.k();
        ja12.a(23626);
        ja12.b(123);
        arrayList.add(ja12.l());
        ji_0 ji_04 = jg_0.z();
        ji_04.a(36L);
        ji_04.b(3001946L);
        ji_04.a("Trente Et Un Pandawa");
        ji_04.c(4);
        ji_04.a(true);
        ji_04.b(true);
        ji_04.a(arrayList);
        ji_04.g(5432);
        ji_04.a(jC2);
        jq2.a(ji_04);
        ji_0 ji_05 = jg_0.z();
        ji_05.a(2L);
        ji_05.b(3001945L);
        ji_05.a("Trente Iop");
        ji_05.c(2);
        ji_05.a(true);
        ji_05.b(false);
        ji_05.c(true);
        ji_05.g(9999);
        ji_05.a(jC2);
        jq2.a(ji_05);
        je_0 je_02 = jc_0.q();
        je_02.a(-1234L);
        je_02.b(3001945L);
        je_02.c(2832);
        je_02.a(jC2);
        je_02.a(arrayList);
        jq2.a(je_02);
        ji_0 ji_06 = jg_0.z();
        ji_06.a(102L);
        ji_06.b(3001945L);
        ji_06.a("Trente Truc");
        ji_06.c(2);
        ji_06.a(false);
        ji_06.b(true);
        ji_06.g(9999);
        ji_06.a(jC3);
        jq2.a(ji_06);
        jm_02.a(jq2);
        jq jq3 = jo.k();
        jq3.e(12);
        je_0 je_03 = jc_0.q();
        je_03.a(-4321L);
        je_03.c(1);
        jq3.a(je_03);
        je_0 je_04 = jc_0.q();
        je_04.a(-4321L);
        je_04.c(2);
        je_04.g(50);
        jq3.a(je_04);
        je_0 je_05 = jc_0.q();
        je_05.a(-4321L);
        je_05.c(2);
        je_05.g(999);
        jq3.a(je_05);
        je_0 je_06 = jc_0.q();
        je_06.a(-4321L);
        je_06.c(3);
        je_06.g(1);
        jq3.a(je_06);
        je_0 je_07 = jc_0.q();
        je_07.a(-4321L);
        je_07.c(5058);
        je_07.g(1);
        jq3.a(je_07);
        je_0 je_08 = jc_0.q();
        je_08.a(-4321L);
        je_08.c(4341);
        je_08.g(1);
        jq3.a(je_08);
        je_0 je_09 = jc_0.q();
        je_09.a(-4321L);
        je_09.c(2192);
        je_09.g(1);
        jq3.a(je_09);
        je_0 je_010 = jc_0.q();
        je_010.a(-4321L);
        je_010.c(5258);
        je_010.g(1);
        jq3.a(je_010);
        je_0 je_011 = jc_0.q();
        je_011.a(-4321L);
        je_011.c(2695);
        je_011.g(1);
        jq3.a(je_011);
        jq3.a(ji_04);
        jm_02.b(jq3);
        this.c = jm_02.H();
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.k = string -> {
            if (!string.equals(cYL.e())) {
                return;
            }
            azu_0.j().b(cYL.a());
        };
        fpm_0.b().a(this.k);
        if (this.e != null) {
            this.a(this.e);
        }
        if (this.f != null) {
            this.a(this.f);
        }
        fis_1.a().a("fightReport", this.d);
        fpm_0.b().a(cYL.e(), cfi_0.a(cYL.e()), 1L, (short)10000);
        fpm_0.b().a("wakfu.fightResult", cGX.class);
        cdw_0.n().c(600068L);
    }

    public void a(jk_0 jk_02) {
        if (this.h.size() > 33) {
            this.g.remove(this.h.remove(0));
        }
        this.h.add(jk_02.c());
        this.g.put(jk_02.c(), new cYN(jk_02.c(), jk_02, this.e, this.f));
    }

    public Optional<cYN> b(long l) {
        return Optional.ofNullable(this.g.get(l));
    }

    private static String e() {
        return "fightResultDialog";
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fpm_0.b().o("fightResultSpellsDetailsDialog");
        fpm_0.b().o(cYL.e());
        fpm_0.b().o("fightResultPlusLootDialog");
        fpm_0.b().b(this.k);
        fis_1.a().a("fight.resultDescription");
        fis_1.a().a("osamodasSymbiotCreatureCapturedState");
        fis_1.a().a("pvpInventoryPlusLootView");
        fpm_0.b().e("wakfu.fightResult");
        cdw_0.n().G();
        this.e = null;
        this.f = null;
        this.i = false;
        this.j = false;
        this.c = null;
        this.d = null;
    }

    public void b(jk_0 jk_02) {
        this.c = jk_02;
        this.d = new bxh_1(jk_02);
        fis_1.a().a("fightReport", this.d);
    }

    public void a(cYN cYN2) {
        this.b(cYN2.b());
        if (cYN2.c() != null) {
            this.a(cYN2.c());
        }
        if (cYN2.d() != null) {
            this.a(cYN2.d());
        }
    }

    public void a(fhq fhq2) {
        if (this.d == null || this.d.c() != fhq2.a()) {
            this.e = fhq2;
            return;
        }
        fhq2.b().forEachEntry((l, fhp2) -> {
            this.d.a(l, (fhp)fhp2);
            return true;
        });
    }

    public void a(js js2) {
        if (this.d == null) {
            this.f = js2;
            return;
        }
        js2.b().forEach(this.d::a);
    }

    private void a(@Nullable bxg_1 bxg_12) {
        if (!this.j && !this.i) {
            ado_1.a().a(() -> {
                if (this.i || this.j) {
                    return;
                }
                fpm_0.b().o("fightResultPlusLootDialog");
                fis_1.a().a("pvpInventoryPlusLootView");
            }, 100L, 1);
            return;
        }
        if (bxg_12 != null) {
            fis_1.a().a("pvpInventoryPlusLootView", bxg_12);
        }
        if (fpm_0.b().q("fightResultPlusLootDialog")) {
            return;
        }
        int n = fyf_0.a().c();
        int n2 = fyf_0.a().d();
        fvk_0 fvk_02 = (fvk_0)fpm_0.b().a("fightResultPlusLootDialog", cfi_0.a("fightResultPlusLootDialog"), 1L, (short)10000);
        fvk_02.a(new cYM(this, fvk_02, n, n2));
    }
}

