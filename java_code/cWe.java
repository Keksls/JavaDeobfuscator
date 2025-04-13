/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class cWe
implements ahr_1 {
    private static final cWe a = new cWe();
    private bae_1 b;
    private fhe_0 c;
    private ans_1 d;

    public static cWe a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18595: {
                if (azu_0.j().n().f()) {
                    cbx_2.a();
                    return false;
                }
                this.b.a(Tv.a, azu_0.j().k());
                fpm_0.b().o("battlegroundEnterDialog");
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = new cwf_0(this);
            bkn_2 bkn_22 = new bkn_2(this.c);
            fis_1.a().a("battlegroundView", bkn_22);
            fpm_0.b().a(this.d);
            fpm_0.b().a("battlegroundEnterDialog", cfi_0.a("battlegroundEnterDialog"), 256L, (short)10000);
            fpm_0.b().a("wakfu.battlegroundEnter", cFF.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.d);
            fpm_0.b().o("battlegroundEnterDialog");
            fpm_0.b().e("wakfu.battlegroundEnter");
        }
    }

    public void a(bae_1 bae_12) {
        if (bae_12 == null) {
            return;
        }
        Optional<fhe_0> optional = cxj_2.a.c();
        if (optional.isEmpty()) {
            return;
        }
        this.c = optional.get();
        this.b = bae_12;
        azu_0.j().a(this);
    }

    public void c() {
        bkn_2 bkn_22 = (bkn_2)fis_1.a().e("battlegroundView");
        if (bkn_22 != null) {
            bkn_22.k();
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

