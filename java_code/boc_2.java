/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from boc
 */
public class boc_2 {
    public static final boc_2 a = new boc_2();
    private final TLongObjectHashMap<bob_2> b = new TLongObjectHashMap();

    private boc_2() {
    }

    public bob_2 a(bnh_1 bnh_12) {
        if (this.b.contains(bnh_12.a_())) {
            return (bob_2)this.b.get(bnh_12.a_());
        }
        bob_2 bob_22 = new bob_2(bnh_12);
        this.b.put(bnh_12.a_(), (Object)bob_22);
        bnh_12.a(bob_22);
        return bob_22;
    }

    public void a(abu_1 abu_12) {
        this.b.remove(abu_12.a_());
    }

    public void a() {
        this.b.clear();
    }

    public String toString() {
        return "PandawaFightListenerManager{}";
    }
}

