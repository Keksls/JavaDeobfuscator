/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdx
 */
public class bdx_2 {
    public static String a(aqd_1 aqd_12) {
        switch (aqd_12.d()) {
            case a: {
                return null;
            }
            case m: {
                return bae.h().a("all", new Object[0]);
            }
            case d: 
            case i: {
                aqf_1 aqf_12 = (aqf_1)aqd_12;
                if (aqf_12.k() == 0) {
                    return "" + aqf_12.j();
                }
                if (aqf_12.j() == 0) {
                    return "" + aqf_12.k();
                }
                return aqf_12.k() + "x" + aqf_12.j();
            }
            case b: {
                aqt_1 aqt_12 = (aqt_1)aqd_12;
                return "" + aqt_12.j();
            }
            case e: {
                aqe_2 aqe_22 = (aqe_2)aqd_12;
                return "" + aqe_22.j();
            }
            case f: {
                aqd_2 aqd_22 = (aqd_2)aqd_12;
                return aqd_22.k() + "x" + aqd_22.j();
            }
        }
        return null;
    }
}

