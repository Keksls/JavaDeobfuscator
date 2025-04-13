/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from eyY
 */
public final class eyy_2 {
    public static final eyy_2 a = new eyy_2();
    private static final int b = 2041;
    private final TIntObjectHashMap<efh_0> c = new TIntObjectHashMap();
    private boolean d;

    private eyy_2() {
    }

    void a() {
        if (this.d) {
            return;
        }
        fie_0 fie_02 = fih_0.a().a(2041);
        for (efh_0 efh_02 : fie_02) {
            this.c.put(efh_02.i(), (Object)efh_02);
        }
        this.d = true;
    }

    public efh_0 a(int n) {
        if (!this.d) {
            this.a();
        }
        return (efh_0)this.c.get(n);
    }
}

