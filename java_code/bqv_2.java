/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from bqv
 */
public final class bqv_2
implements ahr_1 {
    public static final bqv_2 a = new bqv_2();
    private static final Logger b = LoggerFactory.getLogger(bqv_2.class);
    private boolean c;
    private ans_1 d;
    private final bqu_2 e = new bqu_2();

    private bqv_2() {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fis_1.a().a("deathView", this.e);
        this.d = string -> {
            if (!string.equals("deathDialog")) {
                return;
            }
            bpc_2 bpc_22 = azu_0.j().k().eE();
            if (bpc_22 != null && bpc_22.ac_() == 4) {
                return;
            }
            if (azu_0.j().c(a)) {
                azu_0.j().b(a);
            }
        };
        fpm_0.b().a(this.d);
        fpm_0.b().a("wakfu.death", cgw_0.class);
        if (!fpm_0.b().q("deathDialog")) {
            fpm_0.b().a("deathDialog", cfi_0.a("deathDialog"), 257L, (short)10000);
        }
        this.c = false;
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fpm_0.b().e("wakfu.death");
        fpm_0.b().b(this.d);
        if (fpm_0.b().q("deathDialog")) {
            fpm_0.b().o("deathDialog");
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16567: {
                bmr_1 bmr_12 = azu_0.j().k();
                cUt cUt2 = new cUt();
                cUt2.a(bmr_12);
                cUt2.o();
                return false;
            }
            case 16415: {
                azu_0.j().K().c(new cly_0());
                this.c = true;
                return false;
            }
            case 16603: {
                if (fpm_0.b().q("deathDialog")) {
                    fpm_0.b().o("deathDialog");
                }
                return false;
            }
            case 17801: {
                boolean bl;
                bmr_1 bmr_13 = azu_0.j().k();
                int[] nArray = azu_0.j().n().v();
                boolean bl2 = bl = !emp_0.a(nArray, emp_0.b);
                if (!bl) {
                    b.error("[DEATH] A non admin player tried to send an admin revival request. Character id {}, account id : {}", (Object)bmr_13.a_(), (Object)bmr_13.R());
                    return false;
                }
                new aXT(bmr_13.dp()).b();
                this.c = false;
                return false;
            }
            case 16119: {
                bmr_1 bmr_14 = azu_0.j().k();
                bpc_2 bpc_22 = bmr_14.eE();
                if (bpc_22 != null && bpc_22.ac_() == 4 && !fpm_0.b().q("deathDialog")) {
                    fpm_0.b().a("deathDialog", cfi_0.a("deathDialog"), 257L, (short)10000);
                }
                return false;
            }
        }
        return true;
    }

    public boolean a() {
        return this.c;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

