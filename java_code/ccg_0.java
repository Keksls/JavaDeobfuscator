/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cCG
 */
public final class ccg_0
implements adx_1<crW> {
    private static final Logger a = Logger.getLogger(ccg_0.class);

    @Override
    public boolean a(crW crW2) {
        long l = crW2.b();
        blx_1 blx_12 = bzf_1.a(l);
        if (blx_12 == null || !blx_12.bo()) {
            a.error((Object)"Build sheet notification message received for an unknown or not owned character");
            return false;
        }
        byte[] byArray = crW2.c();
        ezj_1 ezj_12 = ezl_1.b(byArray);
        ezj_1 ezj_13 = blx_12.dx().a(ezj_12.e());
        if (ezj_13 == null) {
            a.error((Object)"Build sheet notification message received for an unknown sheet");
            return false;
        }
        ezj_13.a(ezj_12);
        if (ezj_13.e() == blx_12.dx().e()) {
            blx_12.c(blx_12.cK());
        }
        return false;
    }

    @Override
    public int a() {
        return 12519;
    }
}

