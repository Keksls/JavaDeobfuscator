/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cjt
 */
final class cjt_2
implements adx_1<cul_2> {
    private static final Logger a = Logger.getLogger(cjt_2.class);

    cjt_2() {
    }

    @Override
    public boolean a(cul_2 cul_22) {
        long l = cul_22.b();
        long l2 = cul_22.c();
        blx_1 blx_12 = bmf_2.a().c(l);
        blx_1 blx_13 = bmf_2.a().c(l2);
        if (blx_12 != null) {
            blx_12.q(true);
            blx_12.b(false);
        }
        if (blx_13 != null) {
            blx_13.q(false);
            blx_13.b(true);
        }
        return false;
    }

    @Override
    public int a() {
        return 13200;
    }
}

