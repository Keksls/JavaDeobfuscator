/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGk
 */
public class bgk_1 {
    private static final Logger a = Logger.getLogger(bgk_1.class);

    @Nullable
    public static bgi_2 a(int n, evd_2 evd_22) {
        if (evd_22 == null) {
            a.error((Object)"Impossible de cr\u00e9er une action de generic \u00e0 partir d'une constante 'null'", (Throwable)new IllegalArgumentException());
            return null;
        }
        switch (evd_22) {
            case a: {
                return new bgr_0(n);
            }
            case b: {
                return new bgj_1(n);
            }
            case c: {
                return new bgv_0(n);
            }
            case k: 
            case d: {
                return new bgn_0(n);
            }
            case e: {
                return new bgo_0(n);
            }
            case f: {
                return new bgu_0(n);
            }
            case g: {
                return new bgm_0(n);
            }
            case h: {
                return new bgt_0(n);
            }
            case i: {
                return new bgp_0(n);
            }
            case j: {
                return new bgq_0(n);
            }
            case l: {
                return new bgs_0(n);
            }
        }
        return null;
    }

    public static bgi_2 a(euo_1 euo_12) {
        bgi_2 bgi_22 = bgk_1.a(euo_12.a(), euo_12.f());
        if (bgi_22 != null) {
            bgi_22.a(euo_12);
        }
        return bgi_22;
    }
}

