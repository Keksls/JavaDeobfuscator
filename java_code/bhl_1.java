/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from bhL
 */
public class bhl_1 {
    public static final bhl_1 a = new bhl_1();
    private final TLongObjectHashMap<bhr_1> b = new TLongObjectHashMap();

    private bhl_1() {
    }

    public void a(long l, bhr_1 bhr_12) {
        this.b.put(l, (Object)bhr_12);
    }

    public void a(long l) {
        this.b.remove(l);
    }

    public bhr_1 b(long l) {
        return (bhr_1)this.b.get(l);
    }
}

