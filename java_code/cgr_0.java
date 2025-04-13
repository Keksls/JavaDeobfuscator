/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cGr
 */
@fpw_0
public class cgr_0 {
    public static final String PACKAGE = "wakfu.controlCenterFight";
    private static final Logger a = Logger.getLogger(cgr_0.class);

    public static void openCloseStateBar(fzs fzs2) {
        cgq_0.openCloseStateBar(fzs2);
    }

    public static void dropCommand(fzs fzs2, String string) {
        cgq_0.dropCommand(fzs2, string);
    }

    public static void fightSetDirection(bvx_2 bvx_22, aej_2 aej_22) {
        short s2;
        switch (aej_22) {
            case h: {
                s2 = 16836;
                break;
            }
            case f: {
                s2 = 18819;
                break;
            }
            case d: {
                s2 = 19380;
                break;
            }
            case b: {
                s2 = 19266;
                break;
            }
            default: {
                return;
            }
        }
        cgr_0.a(bvx_22, s2);
    }

    private static void a(bvx_2 bvx_22, short s2) {
        blx_1 blx_12;
        if (!(fis_1.a().c("isInFightPlacement") || (blx_12 = bvx_22.A().H()).bp() && !blx_12.M())) {
            return;
        }
        dfc.d(s2);
    }

    private static void a(short s2, short s3) {
        bvx_2 bvx_22 = azu_0.j().k().bz();
        if (bvx_22 != null) {
            cgr_0.a(bvx_22, s3);
        } else {
            dfc.d(s2);
        }
    }

    public static void setSouthEastDirection(fzs fzs2) {
        cgr_0.a((short)16377, (short)19266);
    }

    public static void setSouthWestDirection(fzs fzs2) {
        cgr_0.a((short)19296, (short)19380);
    }

    public static void setNorthWestDirection(fzs fzs2) {
        cgr_0.a((short)17515, (short)18819);
    }

    public static void setNorthEastDirection(fzs fzs2) {
        cgr_0.a((short)19011, (short)16836);
    }
}

