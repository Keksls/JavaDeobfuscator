/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class cUJ {
    private static final int a = 303;

    private cUJ() {
    }

    public static void a() {
        cUK.a.a(frb_0.A, frb_0.B, cUM2 -> {
            cSS cSS2 = null;
            for (cSS cSS3 : cUM2.aI()) {
                bpp_1 bpp_12;
                if (cSS3 instanceof ctg_0) {
                    cSS3.a(cUM2);
                    if (!cSS3.d() || !cSS3.c()) continue;
                    return Optional.of(cSS3);
                }
                if (cSS2 != null || !cSS3.getClass().isAssignableFrom(cUa.class) || !((bpp_12 = ((cUa)cSS3).a()) instanceof bps_1) || bpp_12.a().a() != 303) continue;
                cSS3.a(cUM2);
                if (!cSS3.d() || !cSS3.c()) continue;
                cSS2 = cSS3;
            }
            return Optional.ofNullable(cSS2);
        });
    }
}

