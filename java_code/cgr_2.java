/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgr
 */
public class cgr_2
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cgr_2.class);
    public static final cgr_2 b = new cgr_2();

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 22671: {
                cbk_0 cbk_02 = (cbk_0)adt_12;
                enp_2.a.a(cbk_02.b());
                String string = String.valueOf(enp_2.a.c(ens_2.ay));
                cbf_2.a(string);
                boolean bl = enp_2.a.d(ens_2.m);
                fis_1.a().a("isShopAvailable", bl);
                fis_1.a().a("systemConfiguration", new bdi_2());
                int[] nArray = azu_0.j().n().v();
                boolean bl2 = !emp_0.a(nArray, emp_0.b);
                boolean bl3 = enp_2.a.d(ens_2.C) && !bl2;
                fis_1.a().a("noExpoRestrictions", !bl3);
                return false;
            }
            case 22666: {
                cbl_0 cbl_02 = (cbl_0)adt_12;
                String string = cbl_02.b();
                String string2 = cbl_02.c();
                ens_2 ens_22 = ens_2.a(string);
                if (ens_22 == null) {
                    a.error((Object)("Unknown property " + string + " received with value " + string2));
                    return false;
                }
                enp_2.a.a(ens_22, string2);
                if (ens_22 == ens_2.m) {
                    boolean bl = enp_2.a.d(ens_2.m);
                    fis_1.a().a("isShopAvailable", bl);
                }
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
}

