/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from eyA
 */
public final class eya_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public eya_0(ArrayList<aot_2> arrayList) {
        this.b = this.a(arrayList) == 0 && ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1;
        }
        els_0 els_02 = epq_22.ck();
        if (els_02 == null) {
            return -1;
        }
        Collection collection = els_02.f(epq_22.Y());
        for (epq_2 epq_23 : collection) {
            if (!epq_23.fE().s()) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.dc;
    }

    static {
        a.add(new aov_1[]{aov_1.a});
        a.add(aov_1.j);
    }
}

