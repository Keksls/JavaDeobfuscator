/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bLG
 */
public class blg_1 {
    private static final blg_1 a = new blg_1();
    private final TByteObjectHashMap<TLongObjectHashMap<bLP>> b = new TByteObjectHashMap();
    private blh_1 c = blh_1.a;

    private blg_1() {
    }

    public static blg_1 a() {
        return a;
    }

    public void a(blh_1 blh_12, long l, bLP bLP2) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.b.get(blh_12.g);
        if (tLongObjectHashMap == null) {
            tLongObjectHashMap = new TLongObjectHashMap();
            this.b.put(blh_12.g, (Object)tLongObjectHashMap);
        }
        tLongObjectHashMap.put(l, (Object)bLP2);
    }

    public void a(blh_1 blh_12, long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.b.get(blh_12.g);
        if (tLongObjectHashMap == null) {
            return;
        }
        tLongObjectHashMap.remove(l);
    }

    public void a(blh_1 blh_12) {
        this.b.remove(blh_12.g);
    }

    public TLongObjectIterator<bLP> b() {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.b.get(this.c.g);
        if (tLongObjectHashMap == null) {
            return null;
        }
        return tLongObjectHashMap.iterator();
    }

    @Nullable
    public bLP b(blh_1 blh_12, long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.b.get(blh_12.a());
        if (tLongObjectHashMap == null) {
            return null;
        }
        return (bLP)tLongObjectHashMap.get(l);
    }

    @Nullable
    public TLongObjectHashMap<bLP> b(blh_1 blh_12) {
        return (TLongObjectHashMap)this.b.get(blh_12.a());
    }

    public void c(blh_1 blh_12) {
        this.c = blh_12;
    }

    public blh_1 c() {
        return this.c;
    }

    public void d() {
        this.b.clear();
    }
}

