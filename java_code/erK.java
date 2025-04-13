/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class erK
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public erK(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null || !(object instanceof eqq_1)) {
            throw new aob_1("on essaie de savoir si la cible est une invoc d'un user invalide " + object);
        }
        List<eqq_1> list = erQ.c(true, object, object2, object4, object3);
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            eqq_1 eqq_12 = list.get(k);
            if (eqq_12 == null || eqq_12.B_() != ((eqq_1)object).B_()) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.ec;
    }

    static {
        a.add(aov_1.j);
    }
}

