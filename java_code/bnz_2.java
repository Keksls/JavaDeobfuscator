/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from bnZ
 */
public class bnz_2 {
    public static final bnz_2 a = new bnz_2();
    private final TLongObjectHashMap<bny_2> b = new TLongObjectHashMap();

    private bnz_2() {
    }

    public bny_2 a(long l) {
        return (bny_2)this.b.get(l);
    }

    public void a(bnh_1 bnh_12) {
        if (this.b.contains(bnh_12.a_())) {
            return;
        }
        bny_2 bny_22 = new bny_2(bnh_12);
        this.b.put(bnh_12.a_(), (Object)bny_22);
        bnh_12.a(bny_22);
    }

    public void a(abu_1 abu_12) {
        this.b.remove(abu_12.a_());
    }

    public void a() {
        this.b.clear();
    }

    public String toString() {
        return "EcaflipFightListenerManager{}";
    }
}

