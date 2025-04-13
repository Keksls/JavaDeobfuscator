/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgK
 */
public final class cgk_2
implements adx_1<cvc_1> {
    private static final Logger a = Logger.getLogger(cgk_2.class);

    @Override
    public boolean a(cvc_1 cvc_12) {
        if (cvc_12.c() != eAW.a) {
            a.error((Object)("[Account chest] Error when receiving account chest compartment list=" + cvc_12.c()));
            cVg.a(cvc_12.c());
            return false;
        }
        cVg.b.a(cvc_12.b());
        cVg.b(cvc_12.b());
        return false;
    }

    @Override
    public int a() {
        return 12365;
    }
}

