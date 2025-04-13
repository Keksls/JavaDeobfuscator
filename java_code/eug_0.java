/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from euG
 */
public final class eug_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    public eug_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
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
        if (object2 == null || !(object2 instanceof aff_1)) {
            return 0L;
        }
        ekk_0 ekk_02 = this.c(object, object2, object3, object4);
        if (ekk_02 == null) {
            return 0L;
        }
        aff_1 aff_12 = (aff_1)object2;
        abc_2 abc_22 = ekk_02.B();
        Iterator iterator = abc_22.iterator();
        elm_0 elm_02 = erQ.b(object4);
        eKw eKw2 = new eKw();
        HashSet<Su> hashSet = new HashSet<Su>();
        while (iterator.hasNext()) {
            efh_0 efh_02 = (efh_0)iterator.next();
            List<List<Su>> list = eKw2.a(efh_02, ekk_02, elm_02.h(), aff_12.d(), aff_12.e(), aff_12.f());
            if (list.isEmpty()) continue;
            int n = list.size();
            for (int k = 0; k < n; ++k) {
                List<Su> list2 = list.get(k);
                if (list2.isEmpty()) continue;
                int n2 = list2.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    Su su = list2.get(i2);
                    hashSet.add(su);
                }
            }
        }
        return hashSet.size();
    }

    private ekk_0 c(Object object, Object object2, Object object3, Object object4) {
        long l = this.b.a(object, object2, object3, object4);
        return elg_0.a().i(l);
    }

    @Override
    public Enum c() {
        return eyO.dz;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

