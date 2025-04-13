/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bwY
 */
public class bwy_1 {
    public bww_1 a(bwh_0 bwh_02, byte by) {
        bmr_1 bmr_12 = azu_0.j().k();
        emr_2 emr_22 = bwh_02.af_();
        switch (emr_22) {
            case a: 
            case v: 
            case m: 
            case k: 
            case l: {
                return new bxb_2(bwh_02, bmr_12, by);
            }
            case i: 
            case n: {
                return new bwv_1(bwh_02, bmr_12, by);
            }
            case c: 
            case b: 
            case d: 
            case h: 
            case f: 
            case g: 
            case j: 
            case u: 
            case x: {
                return new bxa_2(bwh_02, bmr_12, by);
            }
        }
        throw new IllegalArgumentException(String.format("fightModel %s non g\u00e9r\u00e9.", new Object[]{emr_22}));
    }
}

