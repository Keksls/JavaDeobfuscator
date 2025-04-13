/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cCs
implements adx_1<cwi_2> {
    private static final Logger a = Logger.getLogger(cCs.class);

    @Override
    public boolean a(cwi_2 cwi_22) {
        long l = cwi_22.c();
        long l2 = cwi_22.d();
        boz_2 boz_22 = bpa_2.a().a(cwi_22.b());
        if (boz_22 != null) {
            bmv_1 bmv_12 = (bmv_1)bmf_2.a().c(l);
            blx_1 blx_12 = bmf_2.a().c(l2);
            bbu bbu2 = blx_12 != null ? new bbu(alc_1.q(), 0, 0, boz_22.b(), bmv_12, blx_12) : new bbu(alc_1.q(), 0, 0, boz_22.b(), bmv_12, l2);
            if (bmv_12 != null) {
                if (bmv_12.cM() != null) {
                    bmv_12.cM().u();
                }
                bmv_12.a(bbu2);
                biI biI2 = bmv_12.bv();
                if (biI2.bb() != null && boz_22.c()) {
                    biI2.b(new cCt(this, bbu2));
                } else {
                    bbt.a.a(bbu2);
                    bbt.a.a();
                }
            }
        } else {
            a.error((Object)("R\u00e9ception d'un MonsterBehaviour inconnu id=" + cwi_22.b()));
        }
        return false;
    }

    @Override
    public int a() {
        return 12799;
    }
}

