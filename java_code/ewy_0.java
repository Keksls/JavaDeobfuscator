/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ewy
 */
public class ewy_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final wt_0 b = new wt_0(0, 0, 0, 0, 0, 0);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ewy_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        int n = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
        int n2 = (int)((aoq_1)arrayList.get(1)).a(null, null, null, null);
        int n3 = (int)((aoq_1)arrayList.get(2)).a(null, null, null, null);
        int n4 = (int)((aoq_1)arrayList.get(3)).a(null, null, null, null);
        int n5 = (int)((aoq_1)arrayList.get(4)).a(null, null, null, null);
        int n6 = (int)((aoq_1)arrayList.get(5)).a(null, null, null, null);
        this.b.a(n6, n5, n4, n, n2, n3);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (wc_0.p().l() && wc_0.p().a().f(this.b) <= 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.gu;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b, aov_1.b, aov_1.b, aov_1.b, aov_1.b, aov_1.b};
        a.add(aov_1Array);
    }
}

