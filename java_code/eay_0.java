/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from eAY
 */
public final class eay_0 {
    public static final eay_0 a = new eay_0();
    private static final Logger b = Logger.getLogger(eay_0.class);
    private final TIntObjectHashMap<Yc> c = new TIntObjectHashMap();
    private final TIntObjectHashMap<eax_0> d = new TIntObjectHashMap();

    private eay_0() {
    }

    public void a(int n, float f2, float f3, apc_2 apc_22, int n2, short s2) {
        Yc yc = new Yc(n, f2, f3, apc_22, n2, s2);
        this.c.put(n, (Object)yc);
    }

    public Yc a(int n) {
        return (Yc)this.c.get(n);
    }

    public void a(int n, int[] nArray) {
        ArrayList<Yc> arrayList = new ArrayList<Yc>();
        int n2 = nArray.length;
        for (int k = 0; k < n2; ++k) {
            Yc yc = (Yc)this.c.get(nArray[k]);
            if (yc != null) {
                arrayList.add(yc);
                continue;
            }
            b.error((Object)("Impossible de trouver le bonus correspondant, ID=" + nArray[k]));
        }
        eax_0 eax_02 = new eax_0(n, arrayList.toArray(new Yc[arrayList.size()]));
        this.d.put(n, (Object)eax_02);
    }

    public eax_0 b(int n) {
        return (eax_0)this.d.get(n);
    }
}

