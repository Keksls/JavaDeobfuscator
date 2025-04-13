/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from bRh
 */
public class brh_2 {
    public static final brh_2 a = new brh_2();
    private final TIntObjectHashMap<bri_2> b = new TIntObjectHashMap();

    private brh_2() {
    }

    public void a(int n, int[] nArray) {
        this.b.put(n, (Object)new bri_2(n, nArray));
    }

    public boolean a(TIntObjectProcedure<bri_2> tIntObjectProcedure) {
        return this.b.forEachEntry(tIntObjectProcedure);
    }
}

