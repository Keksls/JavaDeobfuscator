/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from euF
 */
public final class euf_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public euf_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
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
        if (object2 == null) {
            return 0L;
        }
        ekk_0 ekk_02 = this.a(object2, object4);
        if (ekk_02 == null) {
            return 0L;
        }
        abc_2 abc_22 = ekk_02.B();
        Iterator iterator = abc_22.iterator();
        elm_0 elm_02 = erQ.b(object4);
        eKw eKw2 = new eKw();
        HashSet<Su> hashSet = new HashSet<Su>();
        while (iterator.hasNext()) {
            efh_0 efh_02 = (efh_0)iterator.next();
            List<List<Su>> list = eKw2.a(efh_02, ekk_02, elm_02.h(), ekk_02.G(), ekk_02.H(), ekk_02.I());
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

    private ekk_0 a(Object object, Object object2) {
        Object object3 = object;
        if (object instanceof sz_0) {
            object3 = ((sz_0)object).am();
        }
        ekf_0 ekf_02 = null;
        if (object3 instanceof ekf_0) {
            ekf_02 = (ekf_0)object;
        } else if (object instanceof aff_1) {
            elm_0 elm_02 = erQ.b(object2);
            aff_1 aff_12 = (aff_1)object;
            ti_0 ti_02 = elm_02.g().g(aff_12.d(), aff_12.e());
            if (ti_02 instanceof ekf_0) {
                ekf_02 = (ekf_0)ti_02;
            }
        }
        return ekf_02;
    }

    @Override
    public Enum c() {
        return eyO.du;
    }

    static {
        a.add(esa_0.i);
    }
}

