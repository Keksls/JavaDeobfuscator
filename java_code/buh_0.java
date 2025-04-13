/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

/*
 * Renamed from bUh
 */
public class buh_0 {
    public static final buh_0 a = new buh_0();
    private final TIntObjectHashMap<fah_0> b = new TIntObjectHashMap();
    private final TIntObjectHashMap<ArrayList<fah_0>> c = new TIntObjectHashMap();

    private buh_0() {
    }

    public void a(int n, int n2, int n3, int n4) {
        ArrayList<fah_0> arrayList = (ArrayList<fah_0>)this.c.get(n4);
        if (arrayList == null) {
            arrayList = new ArrayList<fah_0>();
            this.c.put(n4, arrayList);
        }
        int n5 = arrayList.size();
        fah_0 fah_02 = new fah_0(n, n2, n3, n4, n5);
        this.b.put(n, (Object)fah_02);
        arrayList.add(fah_02);
    }
}

