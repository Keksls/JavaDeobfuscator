/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from ccV
 */
public class ccv_1 {
    public static final ccv_1 a = new ccv_1();
    public static final int b = 0x7FFFFFFE;
    private static final ArrayList<ccx_2> c = new ArrayList();
    private static final TIntObjectHashMap<agt> d = new TIntObjectHashMap();

    private static byte a(int n) {
        int n2 = XZ.a(n);
        int n3 = n - n2 * 18;
        return (byte)n3;
    }

    private static byte b(int n) {
        int n2 = XZ.b(n);
        int n3 = n - n2 * 18;
        return (byte)n3;
    }

    public void a() {
        d.forEachValue((TObjectProcedure)new ccw_2(this));
    }

    public void a(aet_0 aet_02) {
        afs[] afsArray = aet_02.f();
        ArrayList<afs> arrayList = new ArrayList<afs>();
        if (afsArray != null) {
            arrayList.addAll(Arrays.asList(afsArray));
        }
        int n = c.size();
        for (int k = 0; k < n; ++k) {
            ccx_2 ccx_22 = c.get(k);
            if (!aet_02.a(ccx_22.a, ccx_22.b)) continue;
            afs afs2 = new afs(ccv_1.a(ccx_22.a), ccv_1.b(ccx_22.b), 0, ccx_22.c);
            arrayList.add(afs2);
        }
        aet_02.a(arrayList.toArray(new afs[arrayList.size()]));
    }

    static {
        d.put(0x7FFFFFFE, (Object)new agt(0x7FFFFFFE, 70500023L, 0.05f, true, true, 10, 25, 1.0f, 0, 0));
        c.add(new ccx_2(0x7FFFFFFE, 0, -48));
    }
}

