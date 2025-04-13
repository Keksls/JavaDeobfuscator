/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bIE
 */
public class bie_1 {
    private static final Logger a = Logger.getLogger(bie_1.class);

    public static big_1 a(int n, eyx_1 eyx_12) {
        if (eyx_12 == null) {
            a.error((Object)"Impossible de cr\u00e9er une action d'item \u00e0 partir d'une constante 'null'", (Throwable)new IllegalArgumentException());
            return null;
        }
        switch (eyx_12) {
            case a: {
                return new bjc_2(n);
            }
            case b: {
                return new bis_0(n);
            }
            case c: {
                return new bix_1(n);
            }
            case d: {
                return new bje_2(n);
            }
            case e: {
                return new bjh_2(n);
            }
            case f: {
                return new bim_0(n);
            }
            case g: {
                return new bjk_2(n);
            }
            case h: {
                return new bjm_1(n);
            }
            case i: {
                return new bim_1(n);
            }
            case j: {
                return new bin_0(n);
            }
            case k: {
                return new bjq_2(n);
            }
            case R: {
                return new bjr_2(n);
            }
            case l: {
                return new bin_1(n);
            }
            case m: {
                return new biv_1(n);
            }
            case n: {
                return new biq_1(n);
            }
            case o: {
                return new bij_0(n);
            }
            case p: {
                return new biy_0(n);
            }
            case q: {
                return new bij_1(n);
            }
            case r: {
                return new bjp_2(n);
            }
            case s: {
                return new bIB(n);
            }
            case t: {
                return new biz_1(n);
            }
            case u: {
                return new bjf_2(n);
            }
            case v: {
                return new bIA(n);
            }
            case L: {
                return new bil_0(n);
            }
            case w: {
                return new bjl_2(n);
            }
            case x: {
                return new bik_0(n);
            }
            case y: {
                return new bja_2(n);
            }
            case z: {
                return new biz_0(n);
            }
            case A: {
                return new bir_0(n);
            }
            case B: {
                return new bih_1(n);
            }
            case C: {
                return new biu_1(n);
            }
            case E: {
                return new bis_1(n);
            }
            case D: {
                return new bit_1(n);
            }
            case F: {
                return new bic_0(n);
            }
            case G: {
                return new bip_1(n);
            }
            case H: {
                return new bio_1(n);
            }
            case I: {
                return new biw_1(n);
            }
            case J: {
                return new bik_1(n);
            }
            case K: {
                return new bju_2(n);
            }
            case M: {
                return new bjt_2(n);
            }
            case N: {
                return new bio_0(n);
            }
            case O: {
                return new biw_0(n);
            }
            case P: {
                return new bjn_1(n);
            }
            case Q: {
                return new bih_0(n);
            }
        }
        return null;
    }
}

