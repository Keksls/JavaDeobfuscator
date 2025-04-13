/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eyb
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public boolean b() {
        return true;
    }

    public eyb(ArrayList<aot_2> arrayList) {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(true, object, object2, object4, object3);
        epq_2 epq_23 = erQ.a(false, object, object2, object4, object3);
        if (epq_23 == null || epq_22 == null) {
            return -1;
        }
        if (epq_23.Y() == epq_22.Y()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.dI;
    }

    static {
        a.add(aov_1.j);
    }
}

