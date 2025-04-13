/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TIntShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TIntShortHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from eXD
 */
public class exd_1 {
    private static final Logger b = Logger.getLogger(exd_1.class);
    public static final exd_1 a = new exd_1();
    private final TIntObjectHashMap<int[]> c = new TIntObjectHashMap();
    private final TIntShortHashMap d = new TIntShortHashMap();

    private exd_1() {
    }

    public void a(int n, int[] nArray, short s2) {
        int[] nArray2 = nArray == null || nArray.length == 0 ? null : nArray;
        this.c.put(n, (Object)nArray2);
        this.d.put(n, s2);
    }

    public int[] a(int n) {
        return (int[])this.c.get(n);
    }

    public boolean b(int n) {
        return this.a(n) != null;
    }

    public short c(int n) {
        return this.d.get(n);
    }
}

