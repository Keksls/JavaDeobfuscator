/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.commons.lang3.ArrayUtils
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;
import org.apache.commons.lang3.ArrayUtils;

public class eoD {
    public static final int a = -4;
    public static final int b = -10;
    public static final int c = 8;
    public static final int d = 11;
    public static final aff_1 e = new aff_1(93, -41, 8);
    public static final short f = 527;
    public static final byte g = 3;
    public static final int h = 56401;
    public static final aff_1 i = new aff_1(0, -52, 0);
    public static final short j = 159;
    public static final aff_1 k = new aff_1(-1, -52, 0);
    public static final int l = 19119;
    public static final short m = 161;
    public static final int[] n = new int[]{0, -33, 0};
    public static final int[] o = new int[]{0, -50, 0};
    public static final int p = 16530;
    public static final aff_1 q = new aff_1(0, -32, 0);
    public static final short[] r = new short[]{100, 118, 226, 757, 758, 761};
    public static final int s = 50000000;
    private static final int F = 12;
    private static final int G = 13;
    private static final int H = 14;
    private static final int I = 15;
    public static final int t = 20;
    public static final TIntHashSet u = new TIntHashSet(new int[]{11, 21, 14, 28});
    private static final TIntObjectHashMap<int[]> J = new TIntObjectHashMap();
    public static final short v = 9;
    public static final int w = 62601;
    public static final int x = -8799;
    public static final long y = 375L;
    public static final int z = Integer.MAX_VALUE;
    public static final int A = -1;
    public static final byte B = 0;
    public static final byte C = 1;
    public static final byte D = 2;
    public static final byte E = 3;
    private static final int K = 7;
    private static final int L = 18;

    public static boolean a(int n) {
        return n == 311;
    }

    public static boolean a(short s2) {
        return s2 == 7 || s2 == 23 || s2 == 22 || s2 == 20;
    }

    public static boolean a(int n, int n2) {
        int[] nArray = (int[])J.get(n);
        return ArrayUtils.contains((int[])nArray, (int)n2);
    }

    public static byte a(etk_2 etk_22) {
        if (etk_22.b()) {
            return 2;
        }
        if (etk_22.j() == 7) {
            return 0;
        }
        if (etk_22.j() == 18) {
            return 3;
        }
        return 1;
    }

    static {
        J.put(12, (Object)new int[]{12});
        J.put(13, (Object)new int[]{12, 13});
        J.put(14, (Object)new int[]{12, 13, 14});
        J.put(15, (Object)new int[]{12, 13, 14, 15});
    }
}

