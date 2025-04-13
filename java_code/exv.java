/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class exv
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b = false;

    public exv(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        aff_1 aff_12 = null;
        if (eqq_12 != null) {
            aff_12 = eqq_12.P_();
        } else if (this.b && object2 instanceof aff_1) {
            aff_12 = (aff_1)object2;
        }
        if (aff_12 == null) {
            return -1;
        }
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02.g().a(aff_12.d(), aff_12.e())) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.dQ;
    }

    static {
        a.add(new aov_1[]{aov_1.a});
    }
}

