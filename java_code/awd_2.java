/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.DataInput;
import org.apache.log4j.Logger;

/*
 * Renamed from awD
 */
public abstract class awd_2<T extends avh_1>
extends awf_2<T> {
    private static final Logger a = Logger.getLogger(awd_2.class);
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    public static final byte f = 5;
    public static final byte g = 6;
    public static final byte h = 7;
    public static final byte i = 8;
    public static final byte j = 9;
    public static final byte k = 10;
    public static final byte l = 11;
    public static final byte m = 12;
    public static final byte n = 13;
    public static final byte o = 14;

    public static avh_1 c(DataInput dataInput, float f2) {
        byte by = dataInput.readByte();
        switch (by) {
            case 1: {
                return awp_1.a.a(dataInput, f2);
            }
            case 2: {
                return awq_1.a.a(dataInput, f2);
            }
            case 3: {
                return awr_1.a.a(dataInput, f2);
            }
            case 4: {
                return aws_1.a.a(dataInput, f2);
            }
            case 5: {
                return awu_1.a.a(dataInput, f2);
            }
            case 6: {
                return awv_1.a.a(dataInput, f2);
            }
            case 7: {
                return aww_2.a.a(dataInput, f2);
            }
            case 8: {
                return awy_2.a.a(dataInput, f2);
            }
            case 9: {
                return awz_2.a.a(dataInput, f2);
            }
            case 10: {
                return awc_2.a.a(dataInput, f2);
            }
            case 11: {
                return awx_2.a.a(dataInput, f2);
            }
            case 12: {
                return awt_1.a.a(dataInput, f2);
            }
            case 13: {
                return awa_2.a.a(dataInput, f2);
            }
            case 14: {
                return awb_2.a.a(dataInput, f2);
            }
        }
        a.error((Object)("type d'affecteur inconnu " + by));
        return null;
    }
}

