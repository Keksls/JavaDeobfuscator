/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from chL
 */
public final class chl_1
extends chd_1<ctc_2, bvx_2> {
    private static final Logger b = Logger.getLogger(chl_1.class);

    @Override
    public boolean a(ctc_2 ctc_22) {
        chm_1 chm_12 = new chm_1(this, alc_1.q(), emd_1.ar.a(), 0, ctc_22);
        baa_0.a().a((bvx_2)this.a, (aku_1)chm_12);
        baa_0.a().a(this.a);
        return false;
    }

    public void b(ctc_2 ctc_22) {
        blx_1 blx_12;
        long l = ctc_22.b();
        byte[] byArray = ctc_22.c();
        blx_1 blx_13 = (blx_1)((bvx_2)this.a).n(l);
        if (blx_13 == null) {
            b.error((Object)("Trying to recover character " + l + " but he's not in the fight"));
            return;
        }
        biI biI2 = blx_13.bv();
        agi agi2 = biI2.aZ();
        biI2.a(agk.a());
        blx_13.a(byArray, false);
        biI2.a(agi2);
        this.b();
        if (blx_13.a(eoz_1.f)) {
            blx_13.a((rx_0)eoz_1.f, rz_0.a);
        }
        if (blx_13.C_() && (blx_12 = bmf_2.a().d(blx_13.U_())) instanceof bnh_1) {
            ((bnh_1)blx_12).a(blx_13, true);
        }
    }

    private void b() {
        Collection collection = ((bvx_2)this.a).j();
        for (blx_1 blx_12 : collection) {
            epq_1 epq_12 = blx_12.Z_();
            if (epq_12 != epn_2.m) continue;
            ((bnh_1)blx_12).et();
        }
    }
}

