/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cCE
implements adx_1<crU> {
    private static final Logger a = Logger.getLogger(cCE.class);

    @Override
    public boolean a(crU crU2) {
        long l = crU2.b();
        blx_1 blx_12 = bzf_1.a(l);
        if (blx_12 == null || !blx_12.bo()) {
            a.error((Object)"Build sheet notification message received for an unknown or not owned character");
            return false;
        }
        byte[] byArray = crU2.c();
        ezm_1 ezm_12 = ezl_1.a(byArray);
        blx_12.a(ezm_12);
        if (blx_12 instanceof eeg_0 && azu_0.j().k() != null) {
            ((eeg_0)((Object)blx_12)).cC().a(blx_12.dx());
        }
        blx_12.c(blx_12.cK());
        return false;
    }

    @Override
    public int a() {
        return 12601;
    }
}

