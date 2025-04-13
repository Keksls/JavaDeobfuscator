/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;

public class fjJ {
    static final ahh_2 c = new ahh_2();

    public float a(TIntObjectHashMap<aeo_2> tIntObjectHashMap, TIntIntHashMap tIntIntHashMap) {
        if (tIntObjectHashMap == null) {
            return 0.0f;
        }
        c.b();
        if (!tIntObjectHashMap.isEmpty()) {
            tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new fjK(this, tIntIntHashMap));
        }
        return (float)c.c() / (float)tIntObjectHashMap.size();
    }
}

