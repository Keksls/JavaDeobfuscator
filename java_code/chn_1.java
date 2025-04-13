/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from chN
 */
public final class chn_1
extends chd_1<ctd_2, bvx_2> {
    private static final Logger b = Logger.getLogger(chn_1.class);

    @Override
    public boolean a(ctd_2 ctd_22) {
        if (cZI.A()) {
            cZI.a().d();
        }
        cho_1 cho_12 = new cho_1(this, alc_1.q(), emd_1.aq.a(), 0, ctd_22);
        baa_0.a().a((bvx_2)this.a, (aku_1)cho_12);
        baa_0.a().a(this.a);
        return false;
    }

    boolean b(ctd_2 ctd_22) {
        long l = ctd_22.b();
        byte[] byArray = ctd_22.c();
        blx_1 blx_12 = (blx_1)((bvx_2)this.a).n(l);
        if (blx_12 == null) {
            b.error((Object)("Trying to synchronize a fighter from current fight but the fighter can't be found " + l));
            return false;
        }
        chn_1.a(blx_12);
        try {
            b.info((Object)("Unserializing effects for fighter " + l + ", byte size : " + byArray.length));
            blx_12.c(byArray);
            List<sd_0> list = blx_12.dR().b(efc_0.ed.a());
            list.addAll(blx_12.dR().b(efc_0.ee.a()));
            list.addAll(blx_12.dR().b(efc_0.ef.a()));
            list.addAll(blx_12.dR().b(efc_0.ej.a()));
            list.addAll(blx_12.dR().b(efc_0.ek.a()));
            list.addAll(blx_12.dR().b(efc_0.cf.a()));
            list.addAll(blx_12.dR().b(efc_0.ch.a()));
            for (sd_0 sd_02 : list) {
                if (!((ejh_0)sd_02).bg()) continue;
                sd_02.h(null);
                sd_02.a(null, false);
            }
        }
        catch (Exception exception) {
            b.error((Object)"Exception levee", (Throwable)exception);
        }
        chn_1.b(blx_12);
        blx_12.eS();
        return false;
    }

    private static void a(blx_1 blx_12) {
        if (!(blx_12 instanceof bnh_1)) {
            return;
        }
        bnq_2 bnq_22 = ((bnh_1)blx_12).ez();
        bnq_22.b();
    }

    private static void b(blx_1 blx_12) {
        if (!(blx_12 instanceof bnh_1)) {
            return;
        }
        bnq_2 bnq_22 = ((bnh_1)blx_12).ez();
        bnq_22.c();
    }
}

