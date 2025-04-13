/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from GS
 */
public abstract class gs_2 {
    protected static final Logger a = Logger.getLogger(gs_2.class);

    public static int a(byte[] byArray) {
        return (byArray[0] & 0xFF) << 24 | (byArray[1] & 0xFF) << 16 | (byArray[2] & 0xFF) << 8 | byArray[3] & 0xFF;
    }

    public static byte[] a(int n) {
        byte[] byArray = new byte[]{(byte)(n >> 24 & 0xFF), (byte)(n >> 16 & 0xFF), (byte)(n >> 8 & 0xFF), (byte)(n & 0xFF)};
        return byArray;
    }

    public static long b(byte[] byArray) {
        return (long)gs_2.a(byArray) & 0xFFFFFFFFL;
    }

    public static byte[] a(long l) {
        return gs_2.a((int)l);
    }

    public static String c(byte[] byArray) {
        return (byArray[0] & 0xFF) + "." + (byArray[1] & 0xFF) + "." + (byArray[2] & 0xFF) + "." + (byArray[3] & 0xFF);
    }
}

