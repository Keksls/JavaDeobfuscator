/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Longs
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import com.google.common.primitives.Longs;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Comparator;

/*
 * Renamed from eJO
 */
class ejo_0
implements Comparator<Long> {
    private final TLongObjectHashMap<sd_0> a;

    ejo_0(TLongObjectHashMap<sd_0> tLongObjectHashMap) {
        this.a = tLongObjectHashMap;
    }

    public int a(Long l, Long l2) {
        int n;
        sd_0 sd_02;
        int n2;
        sd_0 sd_03 = (sd_0)this.a.get(l.longValue());
        int n3 = sd_03 == null ? Integer.MIN_VALUE : sd_03.N();
        int n4 = -Longs.compare((long)n3, (long)(n2 = (sd_02 = (sd_0)this.a.get(l2.longValue())) == null ? Integer.MIN_VALUE : sd_02.N()));
        if (n4 != 0) {
            return n4;
        }
        int n5 = sd_03 == null ? 0 : sd_03.o();
        n4 = Longs.compare((long)n5, (long)(n = sd_02 == null ? 0 : sd_02.o()));
        if (n4 != 0) {
            return n4;
        }
        return Longs.compare((long)l, (long)l2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Long)object, (Long)object2);
    }
}

