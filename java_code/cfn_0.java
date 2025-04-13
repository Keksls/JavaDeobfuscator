/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cFn
 */
public class cfn_0 {
    private static final Logger k = Logger.getLogger(cfn_0.class);
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;

    private cfn_0() {
    }

    public static String a(int n) {
        try {
            return String.format(azs_0.a().a("messageBoxIconsPath"), n);
        }
        catch (gm_0 gm_02) {
            k.warn((Object)gm_02.getMessage(), (Throwable)gm_02);
            return null;
        }
    }
}

