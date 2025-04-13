/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from aHs
 */
public abstract class ahs_1
implements ahr_1 {
    private final TIntObjectHashMap<adx_1> a;

    protected ahs_1(adx_1 ... adx_1Array) {
        int n = adx_1Array.length;
        this.a = new TIntObjectHashMap(n);
        for (int k = 0; k < n; ++k) {
            adx_1 adx_12 = adx_1Array[k];
            if (this.a.put(adx_12.a(), (Object)adx_12) == null) continue;
            throw new IllegalArgumentException("Il existe d\u00e9j\u00e0 un traitement de message pour le message " + adx_12.a());
        }
    }

    @Override
    public final boolean a(adt_1 adt_12) {
        adx_1 adx_12 = (adx_1)this.a.get(adt_12.a());
        return adx_12 == null || adx_12.a(adt_12);
    }

    protected final <T extends adx_1> void a(TObjectProcedure<T> tObjectProcedure) {
        this.a.forEachValue(tObjectProcedure);
    }
}

