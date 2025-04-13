/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from bhF
 */
public class bhf_1 {
    private static final bhf_1 a = new bhf_1();
    private final TLongObjectHashMap<bhe_1> b = new TLongObjectHashMap();

    public static bhf_1 a() {
        return a;
    }

    private bhf_1() {
    }

    public void a(long l, bhe_1 bhe_12) {
        this.b.put(l, (Object)bhe_12);
    }

    public bhe_1 a(long l) {
        return (bhe_1)this.b.get(l);
    }

    public void b(long l) {
        this.b.remove(l);
    }

    public void b() {
        this.b.clear();
    }
}

