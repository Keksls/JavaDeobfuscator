/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWg
 */
public class cwg_0
implements ahr_1 {
    private static final cwg_0 a = new cwg_0();
    private ans_1 b;

    public static cwg_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19591: {
                anw_1 anw_12 = (anw_1)adt_12;
                bkn_2 bkn_22 = (bkn_2)anw_12.j();
                bkf_2 bkf_22 = (bkf_2)fis_1.a().e("battlegroundListView");
                if (bkf_22.g() != null && bkf_22.g().f().a() == bkn_22.f().a()) {
                    bkf_22.a((bkn_2)null);
                } else {
                    bkf_22.a(bkn_22);
                }
                return false;
            }
            case 19452: {
                bkf_2 bkf_23 = (bkf_2)fis_1.a().e("battlegroundListView");
                int n = bkf_23.h() - 1;
                if (n < 1) {
                    return false;
                }
                bkf_23.a(n);
                return false;
            }
            case 19103: {
                bkf_2 bkf_24 = (bkf_2)fis_1.a().e("battlegroundListView");
                int n = bkf_24.h() + 1;
                if (n > bkf_24.i()) {
                    return false;
                }
                bkf_24.a(n);
                return false;
            }
            case 16883: {
                anw_1 anw_13 = (anw_1)adt_12;
                bkh_2 bkh_22 = (bkh_2)anw_13.j();
                bkf_2 bkf_25 = (bkf_2)fis_1.a().e("battlegroundListView");
                bkf_25.a(bkh_22);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.b = new cwh_0(this);
            bkf_2 bkf_22 = new bkf_2();
            bkf_22.f();
            azu_0.j().K().c(new cAg());
            fis_1.a().a("battlegroundListView", bkf_22);
            fpm_0.b().a(this.b);
            fpm_0.b().a("battlegroundListDialog", cfi_0.a("battlegroundListDialog"), 32768L, (short)10000);
            fpm_0.b().a("wakfu.battlegroundList", cfg_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.b);
            fpm_0.b().o("battlegroundListDialog");
            fpm_0.b().e("wakfu.battlegroundList");
            fis_1.a().a("battlegroundListView");
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

