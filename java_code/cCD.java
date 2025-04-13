/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cCD
implements adx_1<crr_0> {
    private static final Logger a = Logger.getLogger(cCD.class);

    @Override
    public boolean a(crr_0 crr_02) {
        long l = crr_02.b();
        blx_1 blx_12 = bzf_1.a(l);
        if (blx_12 == null || !blx_12.bo()) {
            a.error((Object)"Aptitude sheet notification message received for an unknown or not owned character");
            return false;
        }
        byte[] byArray = crr_02.c();
        ezy_2 ezy_22 = ezl_2.b(byArray);
        blx_12.a(ezy_22);
        blx_12.c(blx_12.cK());
        bkr_2.v.a();
        return false;
    }

    @Override
    public int a() {
        return 12053;
    }
}

