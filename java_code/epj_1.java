/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntShortHashMap
 *  gnu.trove.map.hash.TShortShortHashMap
 */
import gnu.trove.map.hash.TIntShortHashMap;
import gnu.trove.map.hash.TShortShortHashMap;
import java.util.HashMap;

/*
 * Renamed from ePJ
 */
public class epj_1 {
    private final int a;
    private final TIntShortHashMap b = new TIntShortHashMap();
    private final TShortShortHashMap c = new TShortShortHashMap();

    public epj_1(int n) {
        this.a = n;
    }

    public int a() {
        return this.a;
    }

    public void a(HashMap<Integer, Short> hashMap) {
        this.b.clear();
        this.b.putAll(hashMap);
    }

    public void b(HashMap<Short, Short> hashMap) {
        this.c.clear();
        this.c.putAll(hashMap);
    }

    public short a(int n, short s2) {
        short s3 = this.b.get(n);
        if (s3 != 0 || this.b.contains(n)) {
            return s3;
        }
        short s4 = this.c.get(s2);
        if (s4 != 0 || this.c.contains(s2)) {
            return s4;
        }
        return 0;
    }

    public int[] b() {
        return this.b.keys();
    }

    public short[] c() {
        return this.c.keys();
    }
}

