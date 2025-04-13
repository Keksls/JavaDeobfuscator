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
 * Renamed from bpt
 */
public class bpt_1 {
    private static final Logger a = Logger.getLogger(bpt_1.class);

    @Nullable
    public static bpp_1 a(int n, byte by, apc_2 apc_22, boolean bl, fii fii2, int n2, long l, boolean bl2, boolean bl3) {
        eao_0 eao_02 = eao_0.a(by);
        if (eao_02 == null) {
            a.error((Object)("Impossible de trouver l'action de monstre " + by));
            return null;
        }
        switch (eao_02) {
            case a: {
                return new bps_1(n, by, apc_22, bl, fii2, n2, l, bl2, bl3, eao_02.b());
            }
            case b: {
                return new bpw_1(n, by, apc_22, bl, fii2, n2, l, bl2, bl3, eao_02.b());
            }
            case c: {
                return new bpq_1(n, by, apc_22, bl, fii2, n2, l, bl2, bl3, eao_02.b());
            }
            case d: {
                return new bpr_1(n, by, apc_22, bl, fii2, n2, l, bl2, bl3, eao_02.b());
            }
            case e: {
                return new bpv_1(n, by, apc_22, bl, fii2, n2, l, bl2, bl3, eao_02.b());
            }
        }
        return null;
    }
}

