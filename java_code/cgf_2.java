/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgF
 */
public final class cgf_2
implements adx_1<cvx_1> {
    private static final Logger a = Logger.getLogger(cgf_2.class);

    @Override
    public boolean a(cvx_1 cvx_12) {
        cVg.b.a(false);
        if (cvx_12.b() != eAW.a) {
            a.error((Object)("[Account chest] Error when removing item from account chest=" + cvx_12.b()));
            cVg.a(cvx_12.b());
            return false;
        }
        cVg.b.a(cvx_12.c(), cvx_12.e());
        if (cvx_12.d() == null) {
            return false;
        }
        bqD bqD2 = cVg.b.e();
        if (bqD2 == null) {
            return false;
        }
        if (!bqD2.a(cvx_12.d().c())) {
            return false;
        }
        boolean bl = cVg.b.e().a(cvx_12.d().c(), (short)cvx_12.d().g());
        if (!bl) {
            a.warn((Object)"[Account chest] Error when applying modification to account chest");
        }
        return false;
    }

    @Override
    public int a() {
        return 13288;
    }
}

