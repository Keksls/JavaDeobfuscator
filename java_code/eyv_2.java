/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TShortIntHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TShortIntHashMap;
import java.util.Date;

/*
 * Renamed from eyV
 */
public class eyv_2 {
    public static final eyv_2 a = new eyv_2();
    private final TIntObjectHashMap<eyu_2> b = new TIntObjectHashMap();
    private final TShortIntHashMap c = new TShortIntHashMap();

    private eyv_2() {
    }

    public void a(eyu_2 eyu_22) {
        this.b.put(eyu_22.c(), (Object)eyu_22);
    }

    public void a(Date date, int n) {
        this.c.put(eyw_2.a(date), n);
    }

    public eyu_2 a(wu_0 wu_02) {
        int n = this.c.get(eyw_2.a(wu_02));
        eyu_2 eyu_22 = (eyu_2)this.b.get(n);
        return eyu_22 != null ? eyu_22 : eyu_2.a;
    }

    public eyu_2 a(int n) {
        eyu_2 eyu_22 = (eyu_2)this.b.get(n);
        if (eyu_22 != null) {
            return eyu_22;
        }
        return eyu_2.a;
    }
}

