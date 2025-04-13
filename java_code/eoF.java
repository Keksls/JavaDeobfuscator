/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.map.hash.TIntIntHashMap;

public class eoF {
    private static final TIntIntHashMap a = new TIntIntHashMap();

    public static int a(int n, int n2) {
        int n3 = a.get(n);
        return n3 == 0 ? n2 : n3;
    }

    static {
        a.put(-11, 67);
    }
}

