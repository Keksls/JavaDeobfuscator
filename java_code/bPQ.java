/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bPQ
implements ahr_1 {
    public static final bPQ a = new bPQ();
    private static final Logger b = Logger.getLogger(bPQ.class);

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 13996: {
                cyf_1 cyf_12 = (cyf_1)adt_12;
                Ae ae = cyf_12.b();
                bmr_1 bmr_12 = azu_0.j().k();
                if (bmr_12.hB() == 34) {
                    this.b(ae);
                } else {
                    this.a(ae);
                }
                return false;
            }
        }
        return true;
    }

    private void a(Ae ae) {
        int n = ae.c();
        evv_1 evv_12 = (evv_1)evl_1.a.a(evg_1.D, n);
        if (evv_12 == null) {
            b.error((Object)String.format("[STELE] Received unknown stele identifier to display preview : %s", n));
            return;
        }
        ddh_0.a().a(evv_12, ae);
        if (!azu_0.j().c(ddh_0.a())) {
            azu_0.j().a(ddh_0.a());
        }
    }

    private void b(Ae ae) {
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 == null || bpc_22.ac_() != 34) {
            b.warn((Object)"Received stele content while having another occupation. Something is not adding up");
            return;
        }
        bpi_2 bpi_22 = (bpi_2)bpc_22;
        ddh_0.a().a(bpi_22.h(), ae);
        if (!azu_0.j().c(ddh_0.a())) {
            azu_0.j().a(ddh_0.a());
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
    }
}

