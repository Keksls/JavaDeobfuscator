/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * Renamed from OL
 */
class ol_0
extends on_0 {
    private final SortedMap<Integer, Long> f;

    ol_0(Map<Integer, Long> map) {
        this.f = new TreeMap<Integer, Long>(map);
    }

    @Override
    int a() {
        if (this.b != null) {
            return this.b;
        }
        int n = this.f.isEmpty() ? 0 : this.f.lastKey() - this.f.firstKey();
        return this.c() + n;
    }

    @Override
    long[] b() {
        long[] lArray = new long[this.a() - this.c() + 1];
        for (int k = 0; k < lArray.length - 1; ++k) {
            SortedMap<Integer, Long> sortedMap = this.f.headMap(this.c() + k + 1);
            long l = sortedMap.isEmpty() ? 0L : (Long)this.f.get(sortedMap.lastKey());
            lArray[k + 1] = lArray[k] + l;
        }
        return lArray;
    }
}

