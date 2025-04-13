/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Objects;
import org.apache.log4j.Logger;

/*
 * Renamed from cgE
 */
public final class cge_2
implements adx_1<cvw_1> {
    private static final Logger a = Logger.getLogger(cge_2.class);

    @Override
    public boolean a(cvw_1 cvw_12) {
        cVg.b.a(false);
        if (cvw_12.b() != eAW.a) {
            a.error((Object)("[Account chest] Error when moving item in the account chest=" + cvw_12.b()));
            cVg.a(cvw_12.b());
            return false;
        }
        cVg.b.a(cvw_12.d(), cvw_12.h());
        if (cvw_12.e() == null) {
            return false;
        }
        bqD bqD2 = cVg.b.e();
        if (bqD2 == null) {
            return false;
        }
        if (Objects.equals(bqD2.c(), cvw_12.c()) && !Objects.equals(cvw_12.d(), cvw_12.c())) {
            cVg.b.a(cvw_12.c(), cvw_12.g());
            if (!bqD2.a(cvw_12.e().c())) {
                return false;
            }
            boolean bl = cVg.b.e().b(cvw_12.e().c());
            if (!bl) {
                a.warn((Object)"[Account chest] Error when applying modification to account chest");
            }
            return false;
        }
        exk_2 exk_22 = eyl_1.a(cvw_12.e());
        if (exk_22 == null) {
            return false;
        }
        boolean bl = cVg.b.e().b(exk_22, cvw_12.f());
        if (!bl) {
            a.warn((Object)"[Account chest] Error when applying modification to account chest");
        }
        return false;
    }

    @Override
    public int a() {
        return 12110;
    }
}

