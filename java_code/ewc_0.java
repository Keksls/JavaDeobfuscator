/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ewC
 */
public class ewc_0
extends esf {
    private final TIntArrayList a = new TIntArrayList();
    private eyJ b = eyJ.b;
    private static final ArrayList<aov_1[]> f = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return f;
    }

    public TIntArrayList b() {
        return this.a;
    }

    public boolean d() {
        return this.b == eyJ.c;
    }

    public ewc_0(ArrayList<aot_2> arrayList) {
        int n;
        String string;
        eyJ eyJ2;
        byte by = this.a(arrayList);
        if (by == 0 && (eyJ2 = eyJ.a(string = ((apd_2)arrayList.get(0)).b())) != eyJ.a) {
            this.b = eyJ2;
        }
        int n2 = n = by == 0 ? 1 : 0;
        while (n < arrayList.size()) {
            int n3 = (int)((aoq_1)arrayList.get(n)).a(null, null, null, null);
            this.a.add(n3);
            ++n;
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1;
        }
        epq_1 epq_12 = epq_22.Z_();
        if (epq_12 instanceof epj_2 && this.a.contains(epq_12.t())) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.ar;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a, aov_1.d};
        f.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.d};
        f.add(aov_1Array);
    }
}

