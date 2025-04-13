/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class erN
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public erN(ArrayList<aot_2> arrayList) {
        if (this.a(arrayList) == 0) {
            apd_2 apd_22 = (apd_2)arrayList.get(0);
            this.b = apd_22.b().trim().equalsIgnoreCase("target");
        } else {
            this.b = false;
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1;
        }
        if (!(epq_22 instanceof erk_2)) {
            return -1;
        }
        erp_2 erp_22 = epq_22.dQ();
        if (erp_22 == null) {
            return -1;
        }
        for (int n = 0; n < 10; n = (int)((byte)(n + 1))) {
            if (erp_22.a(n) == null) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.a;
    }

    static {
        a.add(new aov_1[]{aov_1.a});
        a.add(aov_1.j);
    }
}

