/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ciW
 */
public final class ciw_1 {
    private static final Logger a = Logger.getLogger(ciw_1.class);

    public static <M extends adt_1, Fi extends bwh_0> void a(int n, cgy_1<Fi> cgy_12) {
        chc_1<cwo_2, bvw_2> chc_12;
        switch (n) {
            case 13116: {
                chc_12 = new cix_1();
                break;
            }
            case 13506: {
                chc_12 = new cix_2();
                break;
            }
            case 12564: {
                chc_12 = new ciy_2();
                break;
            }
            case 13987: {
                chc_12 = new ciz_1();
                break;
            }
            case 12554: {
                chc_12 = new civ_1();
                break;
            }
            case 13269: {
                chc_12 = new cia_1();
                break;
            }
            case 12029: {
                chc_12 = new cib_1();
                break;
            }
            case 12126: {
                chc_12 = new cid_1();
                break;
            }
            case 12843: {
                chc_12 = new cig_1();
                break;
            }
            case 13406: {
                chc_12 = new cif_1();
                break;
            }
            case 12482: {
                chc_12 = new cip_1();
                break;
            }
            case 13163: {
                chc_12 = new ciq_1();
                break;
            }
            case 13413: {
                chc_12 = new cir_1();
                break;
            }
            case 13307: {
                chc_12 = new cis_1();
                break;
            }
            case 13869: {
                chc_12 = new cih_1();
                break;
            }
            case 12295: {
                chc_12 = new cii_1();
                break;
            }
            case 13606: {
                chc_12 = new cik_1();
                break;
            }
            case 12696: {
                chc_12 = new cil_1();
                break;
            }
            case 13979: {
                chc_12 = new cim_1();
                break;
            }
            case 13735: {
                chc_12 = new cio_1();
                break;
            }
            case 13607: {
                chc_12 = new ciu_1();
                break;
            }
            case 13966: {
                chc_12 = new ciy_1();
                break;
            }
            case 12687: {
                chc_12 = new cie_1();
                break;
            }
            case 13262: {
                chc_12 = new cit_1();
                break;
            }
            case 13930: {
                chc_12 = new ciz_2();
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

