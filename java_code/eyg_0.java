/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from eyG
 */
public final class eyg_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public eyg_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    protected ArrayList<aov_1[]> b() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.a("caster", object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        aff_1 aff_12 = erQ.d(true, object, object2, object4, object3);
        if (aff_12 == null) {
            return -1;
        }
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            return -1;
        }
        if (!eyg_0.b(eqq_12, aff_12, elm_02)) {
            return -1;
        }
        if (!eyg_0.a(eqq_12, aff_12, elm_02)) {
            return -1;
        }
        return 0;
    }

    private static boolean a(eqq_1 eqq_12, aff_1 aff_12, elm_0<?> elm_02) {
        aej_2[] aej_2Array = aej_2.d();
        for (int k = 0; k < aej_2Array.length; ++k) {
            aej_2 aej_22 = aej_2Array[k];
            if (eyf_0.a(aff_12, eqq_12, elm_02, aej_22) < 1) continue;
            return true;
        }
        return false;
    }

    private static boolean b(eqq_1 eqq_12, aff_1 aff_12, elm_0<?> elm_02) {
        Collection collection = elm_02.i(eqq_12.Y());
        for (epq_2 epq_22 : collection) {
            aff_1 aff_13 = epq_22.P_();
            if (!aff_12.e(aff_13.d(), aff_13.e())) continue;
            return true;
        }
        return false;
    }

    @Override
    public Enum c() {
        return eyO.fT;
    }

    protected /* synthetic */ List i() {
        return this.b();
    }

    static {
        a.add(esa_0.i);
    }
}

