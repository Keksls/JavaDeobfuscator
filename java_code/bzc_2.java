/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from bzc
 */
public class bzc_2 {
    private final TIntObjectHashMap<etg_1> b = new TIntObjectHashMap();
    public static final bzc_2 a = new bzc_2();

    public etg_1 a(int n) {
        etg_1 etg_12 = (etg_1)this.b.get(n);
        if (etg_12 == null && (etg_12 = this.b(n)) != null) {
            this.b.put(n, (Object)etg_12);
        }
        return etg_12;
    }

    private etg_1 b(int n) {
        etj_1 etj_12 = (etj_1)eti_1.a.b(n);
        if (etj_12 instanceof etm_1) {
            return new etn_1((etm_1)etj_12);
        }
        if (etj_12 instanceof etu_2) {
            return new ett_2((etu_2)etj_12);
        }
        if (etj_12 instanceof etr_2) {
            return new etq_2((etr_2)etj_12);
        }
        if (etj_12 instanceof etp_1) {
            return new eto_1((etp_1)etj_12);
        }
        return null;
    }
}

