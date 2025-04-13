/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cXT
implements ahr_1 {
    private static final Logger a = Logger.getLogger(cXT.class);
    private static final cXT b = new cXT();
    private bsw_2 c;
    private ans_1 d;

    public static cXT a() {
        return b;
    }

    public void a(bsw_2 bsw_22) {
        this.c = bsw_22;
        fis_1.a().a("saleHistory", bsw_22);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17331: {
                this.c.b();
                return false;
            }
            case 16189: {
                this.c.a();
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

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = new cXU(this);
            fpm_0.b().a(this.d);
            fpm_0.b().a("dimensionalBagFleaHistoryDialog", cfi_0.a("dimensionalBagFleaHistoryDialog"), 32769L, (short)10000);
            fpm_0.b().a("wakfu.dimensionalBagFleaHistory", cGB.class);
            fis_1.a().a("saleHistory", this.c);
            cdw_0.n().z();
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().o("dimensionalBagFleaHistoryDialog");
            fpm_0.b().b(this.d);
            fpm_0.b().e("wakfu.dimensionalBagFleaHistory");
            fis_1.a().a("saleHistory");
            cdw_0.n().A();
        }
    }
}

