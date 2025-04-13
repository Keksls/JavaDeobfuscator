/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from Yw
 */
public class yw_0 {
    private static final Logger k = Logger.getLogger(yw_0.class);
    public static final byte a = -16;
    public static final byte b = 15;
    public static final int c = 4;
    public static final int d = 0;
    public static final byte e = 0;
    public static final byte f = 1;
    public static final byte g = 2;
    public static final byte h = 3;
    public static final byte i = 4;
    public static final byte j = 5;

    public static yv_0 a(byte by) {
        byte by2 = (byte)((by & 0xF) >> 0);
        switch (by2) {
            case 0: {
                return new yd_0();
            }
            case 1: {
                return new ye_0();
            }
            case 2: {
                return new yf_0();
            }
            case 3: {
                return new yh_0();
            }
            case 4: {
                return new yi_0();
            }
            case 5: {
                return new yj_0();
            }
        }
        k.error((Object)("Type de map inconnu " + by2));
        return null;
    }
}

