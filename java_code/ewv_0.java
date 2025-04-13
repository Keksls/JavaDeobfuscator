/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from ewV
 */
public class ewv_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ewv_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object2 == null) {
            return 0;
        }
        if (object == null || !(object instanceof eqq_1)) {
            return -1;
        }
        eqq_1 eqq_12 = (eqq_1)object;
        if (object2 instanceof eqq_1) {
            if (eqq_12.Y() == ((eqq_1)object2).Y()) {
                return -1;
            }
            return 0;
        }
        if (object2 instanceof aff_1 && object4 instanceof elm_0) {
            elm_0 elm_02 = (elm_0)object4;
            aff_1 aff_12 = (aff_1)object2;
            Collection collection = elm_02.k(eqq_12.Y());
            for (epq_2 epq_22 : collection) {
                if (!this.a(aff_12, epq_22)) continue;
                return 0;
            }
            ti_0 ti_02 = elm_02.g().g(aff_12.d(), aff_12.e());
            if (ti_02 instanceof eqq_1 && eqq_12.Y() != ((eqq_1)((Object)ti_02)).Y()) {
                return 0;
            }
            return -1;
        }
        return -2;
    }

    private boolean a(aff_1 aff_12, epq_2 epq_22) {
        if (epq_22.X() <= 0) {
            return aff_12.equals(epq_22.P_());
        }
        return aob_2.a(epq_22, aff_12.d(), aff_12.e()) == 0;
    }

    @Override
    public Enum c() {
        return eyO.b;
    }

    static {
        a.add(aov_1.j);
    }
}

