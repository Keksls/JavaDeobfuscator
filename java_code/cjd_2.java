/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cjd
 */
public final class cjd_2 {
    private static final Logger a = Logger.getLogger(cjd_2.class);

    public static <M extends adt_1, Fi extends bwh_0> void a(int n, cgy_1<Fi> cgy_12) {
        chc_1<cuk_2, bvx_2> chc_12;
        switch (n) {
            case 13930: {
                chc_12 = new cje_2();
                break;
            }
            case 12029: {
                chc_12 = new cja_2();
                break;
            }
            case 12399: {
                chc_12 = new cjb_2();
                break;
            }
            case 13946: {
                chc_12 = new cil_2();
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
            case 13573: {
                chc_12 = new chp_1();
                break;
            }
            case 13735: {
                chc_12 = new cjc_2();
                break;
            }
            case 12522: {
                chc_12 = new cit_2();
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

