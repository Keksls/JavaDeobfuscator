/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cCx
implements adx_1<cwn_1> {
    private static final Logger a = Logger.getLogger(cCx.class);

    @Override
    public boolean a(cwn_1 cwn_12) {
        boolean bl;
        bmv_1 bmv_12 = (bmv_1)bmf_2.a().c(cwn_12.b());
        if (bmv_12 == null) {
            a.error((Object)"Tentative de modification des \u00e9tats d'un NPC qui n'existe pas");
            return false;
        }
        byte by = cwn_12.c();
        boolean bl2 = bl = by < 0;
        if (bl) {
            by = (byte)Math.abs(by);
        }
        erl_2 erl_22 = erl_2.a(by);
        if (bl) {
            bpo_1.a().b(bmv_12, erl_22);
        } else {
            if (erl_22 == erl_2.o && !bmv_12.ab_() && !bmv_12.ak()) {
                bmv_12.cH();
            }
            bpo_1.a().a(bmv_12, erl_22);
        }
        return false;
    }

    @Override
    public int a() {
        return 13226;
    }
}

