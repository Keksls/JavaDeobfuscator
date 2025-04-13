/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class exL
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public exL(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null || !(object instanceof epq_2)) {
            throw new aob_1("On essaie d'avoir une info sur une cible invalide " + object);
        }
        epq_2 epq_22 = erQ.a(object, object2, object4, object3);
        epq_2 epq_23 = null;
        if (object2 instanceof epq_2) {
            epq_23 = epq_22;
        }
        if (epq_23 == null) {
            return -1;
        }
        if (epq_23.fE().u()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.cJ;
    }

    static {
        a.add(aov_1.j);
    }
}

