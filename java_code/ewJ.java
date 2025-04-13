/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class ewJ
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public ewJ(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(true, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        aff_1 aff_12 = new aff_1(eqq_12.P_());
        aej_2 aej_22 = eqq_12.F();
        aff_12.c(aej_22.m, aej_22.n, 0);
        exZ exZ2 = new exZ();
        return ((apc_2)exZ2).a(object, aff_12, object3, object4);
    }

    @Override
    public Enum c() {
        return eyO.eW;
    }

    static {
        a.add(esa_0.i);
    }
}

