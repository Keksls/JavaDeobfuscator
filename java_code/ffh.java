/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

public class ffh {
    public static final int a = 3700;
    public static final int b = 408;
    public static final int c = 467;
    private static final int[] d = new int[]{480, 479, 478, 467};
    private static final int[] e = new int[]{510, 509, 508, 507};
    private static final int[] f = new int[]{840, 839, 838, 837};
    private static final int[] g = new int[]{836, 835, 834, 833};
    private static final TIntHashSet h = new TIntHashSet();
    private static int i = Integer.MAX_VALUE;

    public static boolean a(int n, int n2) {
        if (i != n) {
            i = n;
            h.clear();
            ffh.a();
        }
        return !h.contains(n2);
    }

    private static void a() {
        if (i != 30) {
            h.addAll(d);
        }
        if (i != 31) {
            h.addAll(e);
        }
        if (i != 32) {
            h.addAll(f);
        }
        if (i != 33) {
            h.addAll(g);
        }
    }
}

