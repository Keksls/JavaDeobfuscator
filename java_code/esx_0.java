/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from esX
 */
public class esx_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private wt_0 b;

    public esx_0(ArrayList<aot_2> arrayList) {
        this.b = new wt_0((int)((aoq_1)arrayList.get(5)).a(null, null, null, null), (int)((aoq_1)arrayList.get(4)).a(null, null, null, null), (int)((aoq_1)arrayList.get(3)).a(null, null, null, null), (int)((aoq_1)arrayList.get(0)).a(null, null, null, null), (int)((aoq_1)arrayList.get(1)).a(null, null, null, null), (int)((aoq_1)arrayList.get(2)).a(null, null, null, null));
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (this.b == null) {
            throw new IllegalStateException("No valid date defined on the criterion GetDayIntervalSince");
        }
        wu_0 wu_02 = wc_0.p().a();
        ww_0 ww_02 = this.b.g(wu_02);
        return ww_02.d();
    }

    @Override
    public Enum c() {
        return eyO.aZ;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b, aov_1.b, aov_1.b, aov_1.b, aov_1.b, aov_1.b};
        a.add(aov_1Array);
    }
}

