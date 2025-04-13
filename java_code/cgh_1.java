/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cgH
 */
public class cgh_1
implements adx_1<cvz_1> {
    private static final Logger a = Logger.getLogger(cgh_1.class);

    @Override
    public boolean a(cvz_1 cvz_12) {
        cVg.b.a(false);
        if (cvz_12.b() != eAW.a) {
            a.error((Object)("[Account chest] Error when stacking items to account chest= " + cvz_12.b()));
            return false;
        }
        String string = cvz_12.d();
        cVg.b.a(string, cvz_12.e());
        if (cvz_12.f()) {
            return false;
        }
        bqD bqD2 = cVg.b.e();
        if (bqD2 == null || !Objects.equals(bqD2.c(), string)) {
            return false;
        }
        HashMap<le_0, Short> hashMap = cvz_12.c();
        for (Map.Entry entry : hashMap.entrySet()) {
            short s2;
            Optional<exk_2> optional;
            le_0 le_02 = (le_0)entry.getKey();
            Short s3 = (Short)entry.getValue();
            exk_2 exk_22 = eyl_1.a(le_02);
            if (exk_22 == null || (optional = cVg.b.e().a(s3.shortValue())).isPresent() && (s2 = optional.get().e()) > exk_22.e() || (s2 = (short)(cVg.b.e().a(exk_22, (int)s3.shortValue()) ? 1 : 0)) != 0) continue;
            a.warn((Object)"[Account chest] Error when applying modification to account chest");
        }
        return false;
    }

    @Override
    public int a() {
        return 12914;
    }
}

