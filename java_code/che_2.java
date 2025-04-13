/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from che
 */
public final class che_2 {
    private static final Logger a = Logger.getLogger(che_2.class);
    private static final chc_1 b = new cha_1();

    public static <M extends adt_1, Fi extends bwh_0> chc_1<M, Fi> a() {
        return b;
    }

    public static <M extends adt_1, Fi extends bwh_0> void a(int n, cgy_1<Fi> cgy_12) {
        chc_1<ctl_1, bvx_2> chc_12;
        switch (n) {
            case 13066: {
                chc_12 = new chf_1();
                break;
            }
            case 13323: {
                chc_12 = new chg_1();
                break;
            }
            case 12015: {
                chc_12 = new chi_2();
                break;
            }
            case 12837: {
                chc_12 = new chn_2();
                break;
            }
            case 12910: {
                chc_12 = new cho_2();
                break;
            }
            case 12482: {
                chc_12 = new chp_2();
                break;
            }
            case 13163: {
                chc_12 = new chq_2();
                break;
            }
            case 13211: {
                chc_12 = new chr_2();
                break;
            }
            case 13407: {
                chc_12 = new chu_2();
                break;
            }
            case 12738: {
                chc_12 = new chv_2();
                break;
            }
            case 12787: {
                chc_12 = new chw_2();
                break;
            }
            case 13079: {
                chc_12 = new chx_2();
                break;
            }
            case 12696: {
                chc_12 = new chj_2();
                break;
            }
            case 13979: {
                chc_12 = new chk_2();
                break;
            }
            case 13225: {
                chc_12 = new chm_2();
                break;
            }
            case 13680: {
                chc_12 = new chl_2();
                break;
            }
            case 13607: {
                chc_12 = new chy_2();
                break;
            }
            case 12274: {
                chc_12 = new chz_2();
                break;
            }
            case 13274: {
                chc_12 = new chb_1();
                break;
            }
            case 13337: {
                chc_12 = new chc_2();
                break;
            }
            case 12965: {
                chc_12 = new chd_2();
                break;
            }
            case 13966: {
                chc_12 = new che_1();
                break;
            }
            case 13453: {
                chc_12 = new chf_2();
                break;
            }
            case 13248: {
                chc_12 = new chg_2();
                break;
            }
            case 12230: {
                chc_12 = new chh_2();
                break;
            }
            case 13941: {
                chc_12 = new cif_2();
                break;
            }
            case 12356: {
                chc_12 = new chu_1();
                break;
            }
            default: {
                a.warn((Object)("ATTENTION : l'id de message pass\u00e9 en parametre n'est pas g\u00e9r\u00e9 par la factory : " + n));
                chc_12 = b;
            }
        }
        chc_12.a(n);
        cgy_12.a((Fi)chc_12);
    }
}

