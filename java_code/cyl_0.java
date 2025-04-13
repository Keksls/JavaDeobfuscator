/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cYl
 */
public class cyl_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cyl_0.class);
    public static final int b = 260;
    public static final int c = 45;
    private static final cyl_0 d = new cyl_0();
    private ans_1 e;

    public static cyl_0 a() {
        return d;
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
            if (!(bwa_2.X.b() != -1 || bwy_2.h().j() != null && fis_1.a().c("wakfuEcosystemEnabled"))) {
                return;
            }
            this.e = new cym_0(this);
            fpm_0.b().a(this.e);
            fis_1.a().a("wakfuMonsterZoneManager", bRC.c());
            fis_1.a().a("wakfuResourceZoneManager", bRD.c());
            fis_1.a().a("wakfuGlobalZoneManager", bRA.e());
            fis_1.a().a("wakfuEcosystemGaugeSize", new fjf_2(260, 30));
            fpm_0.b().a("ecosystemEquilibriumDialog", cfi_0.a("ecosystemEquilibriumDialog"), 32769L, (short)10000);
            cdw_0.n().c(600141L);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.e);
            fis_1.a().a("wakfuMonsterZoneManager");
            fis_1.a().a("wakfuResourceZoneManager");
            fpm_0.b().o("ecosystemEquilibriumDialog");
            cdw_0.n().A();
        }
    }
}

