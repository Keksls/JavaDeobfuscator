/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Renamed from cZA
 */
public class cza_0
implements ahr_1 {
    private static final cza_0 a = new cza_0();
    private ans_1 b;
    private bdz_0 c;
    private bze_2 d;
    private long e;
    private static final int f = 3000;
    private final Runnable g = () -> {
        if (this.d == null) {
            azu_0.j().K().c(new czo_2());
        } else {
            String string = this.d.h();
            int n = this.d.g();
            boolean bl = this.d.j();
            boolean bl2 = this.d.l();
            azu_0.j().K().c(new czo_2(string, n, bl, bl2));
        }
    };

    private cza_0() {
    }

    public static cza_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17380: {
                dgd_0 dgd_02 = (dgd_0)adt_12;
                bzd_2 bzd_22 = dgd_02.k();
                this.e = bzd_22.b();
                fis_1.a().a("basicHavenWorld", new btg_2(bzd_22.a(), bzd_22.b(), bzd_22.e(), bzd_22.f(), bzd_22.g()));
                fis_1.a().a("selectedHavenWorld", (Object)bzd_22, "havenWorldEntranceDialog");
                return false;
            }
            case 18691: {
                bzd_2 bzd_23 = (bzd_2)fis_1.a().d("selectedHavenWorld", "havenWorldEntranceDialog");
                if (bzd_23 == null) {
                    return false;
                }
                if (this.c == null) {
                    return false;
                }
                if (!bzd_23.f()) {
                    return false;
                }
                bmr_1 bmr_12 = azu_0.j().k();
                boolean bl = emp_0.b(bmr_12.N_().a(), emq_0.bt);
                if (bzd_23.g() && bzd_23.b() != bmr_12.fc() && !bl) {
                    return false;
                }
                cna_0 cna_02 = new cna_0(bzd_23.b(), this.c.a_());
                azu_0.j().K().c(cna_02);
                azu_0.j().b(this);
                return false;
            }
            case 18853: {
                bzd_2 bzd_24 = (bzd_2)fis_1.a().d("selectedHavenWorld", "havenWorldEntranceDialog");
                if (bzd_24 == null) {
                    return false;
                }
                if (this.c == null) {
                    return false;
                }
                cnf_0 cnf_02 = new cnf_0(bzd_24.b());
                azu_0.j().K().c(cnf_02);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12.dO().g()) {
                azu_0.j().b(this);
                return;
            }
            this.b = string -> {
                if (string.equals("havenWorldEntranceDialog")) {
                    azu_0.j().b(a);
                }
            };
            fpm_0.b().a(this.b);
            fpm_0.b().a("havenWorldEntranceDialog", cfi_0.a("havenWorldEntranceDialog"), 32769L, (short)10000);
            fpm_0.b().a("wakfu.havenWorldEntrance", cho_0.class);
            fpm_0.b().a("wakfu.havenWorldPanel", cHp.class);
            cdw_0.n().c(600012L);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.b);
            fpm_0.b().o("havenWorldEntranceDialog");
            fpm_0.b().e("wakfu.havenWorldEntrance");
            fpm_0.b().e("wakfu.havenWorldPanel");
            fis_1.a().a("basicHavenWorld");
            fis_1.a().a("havenWorldViewList");
            fis_1.a().a("selectedHavenWorld");
            this.c = null;
            this.d = null;
            cdw_0.n().c(600013L);
            ado_1.a().b(this.g);
        }
    }

    public void a(bdz_0 bdz_02) {
        this.c = bdz_02;
        this.d = new bze_2();
        azu_0.j().a(this);
        azu_0.j().K().c(new czo_2());
        ado_1.a().a(this.g, 3000L, -1);
    }

    public void a(List<esm_2> list) {
        if (this.d == null) {
            return;
        }
        List<bzd_2> list2 = list.stream().map(bzd_2::new).collect(Collectors.toList());
        this.d.a(list2);
        fis_1.a().a("havenWorldViewList", this.d);
        Optional<bzd_2> optional = list2.stream().filter(bzd_22 -> bzd_22.b() == this.e).findFirst();
        if (optional.isPresent()) {
            bzd_2 bzd_23 = optional.get();
            fis_1.a().a("selectedHavenWorld", (Object)bzd_23, "havenWorldEntranceDialog");
            fis_1.a().a("basicHavenWorld", new btg_2(bzd_23.a(), bzd_23.b(), bzd_23.e(), bzd_23.f(), bzd_23.g()));
            return;
        }
        bzd_2 bzd_24 = this.d.a();
        if (bzd_24 != null) {
            fis_1.a().a("selectedHavenWorld", (Object)bzd_24, "havenWorldEntranceDialog");
            fis_1.a().a("basicHavenWorld", new btg_2(bzd_24.a(), bzd_24.b(), bzd_24.e(), bzd_24.f(), bzd_24.g()));
        } else {
            fis_1.a().a("selectedHavenWorld", (Object)null, "havenWorldEntranceDialog");
            fis_1.a().a("basicHavenWorld", (Object)null);
        }
    }

    public void a(int n) {
        if (this.d == null) {
            return;
        }
        this.d.a(n);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

