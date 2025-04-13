/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class exc
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public exc(ArrayList<aot_2> arrayList) {
    }

    @Override
    public Enum c() {
        return eyO.fZ;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(object, object2, object3, object4);
        return euv_2.a.b(epq_22.U_()) == epq_22.a_() ? -1 : 0;
    }

    static {
        a.add(esa_0.i);
    }
}

