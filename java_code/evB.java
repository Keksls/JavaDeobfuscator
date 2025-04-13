/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class evB
extends esf {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public evB(ArrayList<aot_2> arrayList) {
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
        eqq_1 eqq_13 = erQ.b(true, object, object2, object4, object3);
        aff_1[] aff_1Array = erQ.a(object2);
        if (aff_1Array == null) {
            return -1;
        }
        for (aff_1 aff_12 : aff_1Array) {
            if (!(eqq_13 != null ? emj_2.a(eqq_12, elm_02.g(), aff_12.d(), aff_12.e(), aff_12.f(), eqq_13) : emj_2.a(eqq_12, elm_02, aff_12.d(), aff_12.e(), aff_12.f()))) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.dr;
    }
}

