/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from evD
 */
public final class evd_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;

    public evd_0(ArrayList<aot_2> arrayList) {
        if (arrayList.size() >= 1) {
            this.b = ((aov_2)arrayList.get(0)).b(null, null, null, null);
        }
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(false, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02 == null) {
            return -1;
        }
        aff_1 aff_12 = erQ.d(true, object, object2, object4, object3);
        aff_1 aff_13 = erQ.d(false, object, object2, object4, object3);
        if (aff_12 == null || aff_13 == null) {
            return -1;
        }
        aej_2 aej_22 = aff_13.c(aff_12);
        Collection collection = elm_02.i(eqq_12.Y());
        for (Object f2 : collection) {
            aff_1[] aff_1Array;
            epq_2 epq_22 = (epq_2)f2;
            for (aff_1 aff_14 : aff_1Array = erQ.a(epq_22)) {
                if (this.b && aej_22 != null && !aej_22.equals((Object)aff_13.c(aff_14)) || !emj_2.a(eqq_12, elm_02.g(), aff_14.d(), aff_14.e(), aff_14.f(), epq_22)) continue;
                return 0;
            }
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.ew;
    }

    static {
        a.add(aov_1.j);
        a.add(new aov_1[]{aov_1.c});
    }
}

