/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from Pc
 */
public class pc_0 {
    private static final pc_0 a = new pc_0();
    private final TIntObjectHashMap<pb_0> b = new TIntObjectHashMap();

    private pc_0() {
    }

    public static pc_0 a() {
        return a;
    }

    public void a(int n, pb_0 pb_02) {
        this.b.put(n, (Object)pb_02);
    }

    public pb_0 a(int n) {
        return (pb_0)this.b.get(n);
    }
}

