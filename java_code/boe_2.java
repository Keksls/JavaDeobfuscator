/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from boe
 */
public class boe_2 {
    public static final boe_2 a = new boe_2();
    private final TLongObjectHashMap<bod_2> b = new TLongObjectHashMap();

    private boe_2() {
    }

    public bod_2 a(long l) {
        return (bod_2)this.b.get(l);
    }

    public void a(bnh_1 bnh_12) {
        if (this.b.contains(bnh_12.a_())) {
            return;
        }
        bod_2 bod_22 = new bod_2(bnh_12);
        this.b.put(bnh_12.a_(), (Object)bod_22);
        bnh_12.a(bod_22);
    }

    public void a(abu_1 abu_12) {
        this.b.remove(abu_12.a_());
    }

    public void a() {
        this.b.clear();
    }

    public String toString() {
        return "XelorFightListenerManager{m_listeners=" + this.b + "}";
    }
}

