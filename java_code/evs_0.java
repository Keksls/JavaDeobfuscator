/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from evs
 */
public final class evs_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b = false;
    private aoq_1 f;

    public evs_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        this.f = (aoq_1)arrayList.get(1);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        int n = (int)this.f.a(object, object2, object3, object4);
        return epq_22 != null && epq_22.r(n) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.dK;
    }

    static {
        a.add(new aov_1[]{aov_1.a, aov_1.b});
    }
}

