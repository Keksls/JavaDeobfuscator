/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Objects;
import org.apache.log4j.Logger;

/*
 * Renamed from cgD
 */
public final class cgd_1
implements adx_1<cvv_2> {
    private static final Logger a = Logger.getLogger(cgd_1.class);

    @Override
    public boolean a(cvv_2 cvv_22) {
        cVg.b.a(false);
        if (cvv_22.b() != eAW.a) {
            a.error((Object)("[Account chest] Error when adding item to account chest=" + cvv_22.b()));
            cVg.a(cvv_22.b());
            return false;
        }
        cVg.b.a(cvv_22.c(), cvv_22.f());
        if (cvv_22.d() == null) {
            return false;
        }
        bqD bqD2 = cVg.b.e();
        if (bqD2 == null || !Objects.equals(bqD2.c(), cvv_22.c())) {
            return false;
        }
        exk_2 exk_22 = eyl_1.a(cvv_22.d());
        if (exk_22 == null) {
            return false;
        }
        boolean bl = cVg.b.e().a(exk_22, (int)cvv_22.e());
        if (!bl) {
            a.warn((Object)"[Account chest] Error when applying modification to account chest");
        }
        return false;
    }

    @Override
    public int a() {
        return 13257;
    }
}

