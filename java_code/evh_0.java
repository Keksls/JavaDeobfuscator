/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.google.common.base.Function;
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from evH
 */
class evh_0
implements Function<TIntObjectHashMap<aeo_2>, Boolean> {
    private final long a;

    evh_0(long l) {
        this.a = l;
    }

    public Boolean a(TIntObjectHashMap<aeo_2> tIntObjectHashMap) {
        return tIntObjectHashMap.containsKey(Hw.e(this.a));
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((TIntObjectHashMap<aeo_2>)((TIntObjectHashMap)object));
    }
}

