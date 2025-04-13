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
 * Renamed from euq
 */
class euq_0
implements Function<TIntObjectHashMap<aeo_2>, aeo_2> {
    private final long a;

    euq_0(long l) {
        this.a = l;
    }

    public aeo_2 a(TIntObjectHashMap<aeo_2> tIntObjectHashMap) {
        return (aeo_2)tIntObjectHashMap.get((int)this.a);
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((TIntObjectHashMap<aeo_2>)((TIntObjectHashMap)object));
    }
}

