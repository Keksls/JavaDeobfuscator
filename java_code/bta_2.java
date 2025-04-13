/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from bTA
 */
public class bta_2 {
    public static final bta_2 a = new bta_2();
    private final TIntObjectHashMap<btz_1> b = new TIntObjectHashMap();

    private bta_2() {
    }

    public void a(btz_1 btz_12) {
        this.b.put(btz_12.b(), (Object)btz_12);
    }

    public btz_1 a(int n) {
        return (btz_1)this.b.get(n);
    }
}

