/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from eQE
 */
public final class eqe_0 {
    public static final eqe_0 a = new eqe_0();
    private static final int b = 1903;
    private final TIntObjectHashMap<efh_0> c = new TIntObjectHashMap();
    private boolean d;

    private eqe_0() {
    }

    void a() {
        if (this.d) {
            return;
        }
        fie_0 fie_02 = fih_0.a().a(1903);
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

