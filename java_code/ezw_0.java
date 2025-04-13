/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.TestOnly
 */
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.TestOnly;

/*
 * Renamed from eZW
 */
public class ezw_0 {
    private static final int[] c = new int[]{12097, 12191, 12184, 12185, 12186, 12187, 12188, 12189, 12190, 12192, 12193, 12194, 12195, 12196, 12197, 12178, 12183, 15107, 15108, 15109, 15110};
    @TestOnly
    public static final int a = c[0];
    public static final short b = 100;

    private ezw_0() {
    }

    public static boolean a(int n) {
        return ArrayUtils.contains((int[])c, (int)n);
    }
}

