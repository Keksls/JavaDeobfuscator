/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class ewQ
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b = false;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ewQ(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        return epq_22 != null && epq_22.gk() ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.dA;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a};
        a.add(aov_1Array);
    }
}

