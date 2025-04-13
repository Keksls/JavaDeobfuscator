/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class evC
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b = false;

    public evC(ArrayList<aot_2> arrayList) {
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02 == null) {
            return -1;
        }
        Collection collection = elm_02.i(eqq_12.Y());
        aff_1 aff_12 = erQ.d(true, object, object2, object4, object3);
        if (aff_12 == null) {
            return -1;
        }
        for (Object f2 : collection) {
            epq_2 epq_22 = (epq_2)f2;
            if (!emj_2.a(epq_22, elm_02.g(), aff_12.d(), aff_12.e(), aff_12.f(), eqq_12)) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.dG;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a};
        a.add(aov_1Array);
    }
}

