/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ddM
 */
public class ddm_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(ddm_0.class);
    private static final ddm_0 b = new ddm_0();
    private ans_1 c;

    public static ddm_0 a() {
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
            if (!fis_1.a().c("isInExterior")) {
                return;
            }
            this.c = new ddn_0(this);
            fpm_0.b().a(this.c);
            fis_1.a().a("weather.manager", brh_0.a());
            fpm_0.b().a("weatherInfoSmallDialog", cfi_0.a("weatherInfoSmallDialog"), 32769L, (short)10000);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fis_1.a().a("weather.manager");
            fpm_0.b().o("weatherInfoSmallDialog");
        }
    }
}

