/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongLongHashMap
 */
import gnu.trove.map.hash.TLongLongHashMap;

/*
 * Renamed from eUv
 */
public class euv_2 {
    public static final euv_2 a = new euv_2();
    private final TLongLongHashMap b = new TLongLongHashMap();

    public void a(long l, long l2) {
        this.b.put(l, l2);
    }

    public boolean a(long l) {
        return this.b.containsKey(l);
    }

    public long b(long l) {
        return this.b.get(l);
    }

    public boolean a(epq_2 epq_22) {
        return !this.b(epq_22);
    }

    private boolean b(epq_2 epq_22) {
        return this.b(epq_22.U_(), epq_22.a_());
    }

    public boolean b(long l, long l2) {
        if (!euu_2.a()) {
            return false;
        }
        return this.b.containsKey(l) && this.b(l) != l2;
    }

    public boolean a(long l, epq_2 epq_22) {
        if (!euu_2.a()) {
            return false;
        }
        return this.b.containsKey(l) && this.b(l) != epq_22.a_() && epq_22.U_() == l;
    }

    public void c(long l) {
        this.b.remove(l);
    }

    public void c(long l, long l2) {
        if (this.b.containsKey(l) && this.b.get(l) == l2) {
            this.b.remove(l);
        }
    }

    public void a() {
        this.b.clear();
    }
}

