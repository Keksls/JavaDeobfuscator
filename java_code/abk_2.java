/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Renamed from aBK
 */
class abk_2
extends LinkedHashMap<K, V> {
    final /* synthetic */ abj_2 a;

    abk_2(abj_2 abj_22, int n, float f2, boolean bl) {
        this.a = abj_22;
        super(n, f2, bl);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return this.size() > this.a.b;
    }
}

