/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from evu
 */
public final class evu_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    @Deprecated
    public evu_0() {
    }

    public evu_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public Enum c() {
        return eyO.cH;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(object, object2, object3, object4);
        if (epq_22 == null || epq_22.a(eqr_1.d)) {
            return -1;
        }
        int n = (int)this.b.a(object, object2, object3, object4);
        return eLi.a(epq_22.R(), n) ? 0 : -1;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

