/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

/*
 * Renamed from bkz
 */
public class bkz_2 {
    public static final bkz_2 a = new bkz_2();
    private final TIntObjectHashMap<bky_2> b = new TIntObjectHashMap();

    public void a(bky_2 bky_22) {
        this.b.put(bky_22.b(), (Object)bky_22);
    }

    public bky_2 a(int n) {
        return (bky_2)this.b.get(n);
    }

    public ArrayList<bky_2> a(bka_2 bka_22) {
        ArrayList<bky_2> arrayList = new ArrayList<bky_2>();
        TIntObjectIterator tIntObjectIterator = this.b.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bky_2 bky_22 = (bky_2)tIntObjectIterator.value();
            if (bky_22.a() != bka_22) continue;
            arrayList.add(bky_22);
        }
        return arrayList;
    }
}

