/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cie
 */
public final class cie_2 {
    private static final Logger a = Logger.getLogger(cie_2.class);

    public static <M extends adt_1, Fi extends bwh_0> void a(int n, cgy_1<Fi> cgy_12) {
        chc_1<cqv_0, bvx_2> chc_12;
        switch (n) {
            case 13972: {
                chc_12 = new chh_1();
                break;
            }
            case 12564: {
                chc_12 = new chi_1();
                break;
            }
            case 12222: {
                chc_12 = new chk_1();
                break;
            }
            case 13190: {
                chc_12 = new chy_1();
                break;
            }
            case 12922: {
                chc_12 = new chx_1();
                break;
            }
            case 13573: {
                chc_12 = new chp_1();
                break;
            }
            case 13222: {
                chc_12 = new chr_1();
                break;
            }
            case 12029: {
                chc_12 = new cht_1();
                break;
            }
            case 12356: {
                chc_12 = new chu_1();
                break;
            }
            case 12843: {
                chc_12 = new chw_1();
                break;
            }
            case 12003: {
                chc_12 = new cia_2();
                break;
            }
            case 13759: {
                chc_12 = new cib_2();
                break;
            }
            case 13413: {
                chc_12 = new cic_2();
                break;
            }
            case 13735: {
                chc_12 = new chz_1();
                break;
            }
            case 12554: {
                chc_12 = new cig_2();
                break;
            }
            case 12553: {
                chc_12 = new cii_2();
                break;
            }
            case 12708: {
                chc_12 = new cij_2();
                break;
            }
            case 12939: {
                chc_12 = new cik_2();
                break;
            }
            case 13116: {
                chc_12 = new cip_2();
                break;
            }
            case 13609: {
                chc_12 = new cir_2();
                break;
            }
            case 12798: {
                chc_12 = new ciu_2();
                break;
            }
            case 13930: {
                chc_12 = new cis_2();
                break;
            }
            case 12399: {
                chc_12 = new cid_2();
                break;
            }
            case 13946: {
                chc_12 = new cil_2();
                break;
            }
            case 13269: {
                chc_12 = new chs_1();
                break;
            }
            case 12573: {
                chc_12 = new chj_1();
                break;
            }
            case 12170: {
                chc_12 = new cim_2();
                break;
            }
            case 12739: {
                chc_12 = new chn_1();
                break;
            }
            case 12710: {
                chc_12 = new chl_1();
                break;
            }
            case 13405: {
                chc_12 = new chq_1();
                break;
            }
            case 12643: {
                chc_12 = new ciq_2();
                break;
            }
            case 13538: {
                chc_12 = new cih_2();
                break;
            }
            default: {
                a.warn((Object)("ATTENTION : l'id de message pass\u00e9 en parametre n'est pas g\u00e9r\u00e9 par la factory : " + n));
                chc_12 = che_2.a();
            }
        }
        chc_12.a(n);
        cgy_12.a((Fi)chc_12);
    }
}

