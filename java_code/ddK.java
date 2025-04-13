/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ddK
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(ddK.class);
    private static final ddK b = new ddK();
    private ans_1 c;

    public static ddK a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        adt_12.a();
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
            if (!fis_1.a().c("isInExterior") || bwy_2.h().c()) {
                return;
            }
            this.c = new ddl_0(this);
            brh_0.a().f();
            azu_0.j().K().c(new cme());
            fpm_0.b().a(this.c);
            fis_1.a().a("weather.manager", brh_0.a());
            fpm_0.b().a("weatherInfoDialog", cfi_0.a("weatherInfoDialog"), 32769L, (short)10000);
            fpm_0.b().a("wakfu.weatherInformation", cKe.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fpm_0.b().o("weatherInfoDialog");
            fpm_0.b().e("wakfu.weatherInformation");
        }
    }
}

