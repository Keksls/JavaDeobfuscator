/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from bzg
 */
public class bzg_1 {
    private final TLongObjectHashMap<bmk_1> b = new TLongObjectHashMap();
    public static final bzg_1 a = new bzg_1();

    public bmk_1 a(brm brm2) {
        if (brm2 == null) {
            return null;
        }
        long l = brm2.a();
        bmk_1 bmk_12 = (bmk_1)this.b.get(l);
        if (bmk_12 == null) {
            bmk_12 = new bmk_1((blx_1)euw_2.a.d(l), brm2);
        }
        return bmk_12;
    }

    public bmk_1 a(bnh_1 bnh_12) {
        if (bnh_12 == null) {
            return null;
        }
        long l = bnh_12.a_();
        bmk_1 bmk_12 = (bmk_1)this.b.get(l);
        if (bmk_12 == null) {
            bmk_12 = new bmk_1((blx_1)euw_2.a.d(l), new brm(bnh_12));
        }
        return bmk_12;
    }

    public TLongObjectHashMap<bmk_1> a() {
        return this.b;
    }
}

