/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from dcd
 */
public class dcd_0
implements ahr_1 {
    private static final dcd_0 a = new dcd_0();
    private static final Logger b = Logger.getLogger(dcd_0.class);

    public static dcd_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17494: {
                if (bwa_2.X.b() != -1) {
                    b.info((Object)"On a push\u00e9 un protecteur statique, on ne l'enl\u00e8ve pas \u00e0 l'entr\u00e9e du territoire (retir\u00e9 manuelllement)");
                    return false;
                }
                this.c();
                return false;
            }
        }
        return true;
    }

    public void c() {
        bwy_2.h().a((bMn)null);
        bwa_2.X.a(-1);
    }

    @Override
    public long a_() {
        return 3L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            brh_0 brh_02 = brh_0.a();
            bwy_2 bwy_22 = bwa_2.X.b() == -1 ? bwy_2.h() : bwa_2.X;
            fis_1.a().a("weather.manager", brh_02);
            fis_1.a().a("protector", bwy_22);
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fis_1.a().a("protector");
            cgu_2.a().b(this);
        }
    }

    public void d() {
        if (azu_0.j().c(ddK.a())) {
            azu_0.j().b(ddK.a());
        }
        if (azu_0.j().c(cyl_0.a())) {
            azu_0.j().b(cyl_0.a());
        }
        fis_1.a().a("challengeDetailsVisible", false);
    }
}

