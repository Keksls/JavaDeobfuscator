/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

/*
 * Renamed from ert
 */
public final class ert_2 {
    private final TByteObjectHashMap<flk_0> a = new TByteObjectHashMap();

    public void a(byte by, long l, short s2) {
        this.a.put(by, (Object)new flk_0(l, s2));
    }

    public void a(byte by, long l) {
        this.a.put(by, (Object)new flk_0(l, 0));
    }

    public boolean a() {
        return this.a.isEmpty();
    }

    public TByteObjectHashMap<flk_0> b() {
        return this.a;
    }
}

