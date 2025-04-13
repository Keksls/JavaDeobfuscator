/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Objects;
import org.apache.log4j.Logger;

/*
 * Renamed from cgJ
 */
public final class cgj_1
implements adx_1<cvb_1> {
    private static final Logger a = Logger.getLogger(cgj_1.class);

    @Override
    public boolean a(cvb_1 cvb_12) {
        cVg.b.a(false);
        if (cvb_12.b() != eAW.a) {
            a.error((Object)("[Account chest] Error when swapping items in account chest=" + cvb_12.b()));
            cVg.a(cvb_12.b());
            return false;
        }
        bqD bqD2 = cVg.b.e();
        if (bqD2 == null || !Objects.equals(bqD2.c(), cvb_12.c())) {
            return false;
        }
        boolean bl = bqD2.a(cvb_12.d(), cvb_12.e());
        if (!bl) {
            a.warn((Object)"[Account chest] Error when applying modification to account chest");
        }
        return false;
    }

    @Override
    public int a() {
        return 12980;
    }
}

