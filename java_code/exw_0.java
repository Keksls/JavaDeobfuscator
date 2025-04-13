/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from exw
 */
public class exw_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final boolean b;
    private final aoq_1 f;
    private final aov_2 g;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public exw_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        this.f = (aoq_1)arrayList.get(1);
        this.g = arrayList.size() >= 3 ? (aov_2)arrayList.get(2) : null;
    }

    public exw_0(String string, int n, boolean bl) {
        this.b = string.equalsIgnoreCase("target");
        this.f = new aox_1(n);
        this.g = new aov_2(bl);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1;
        }
        int n = (int)this.f.a(object, object2, object3, object4);
        ele_0 ele_02 = ele_0.a(n);
        if (ele_02 == null) {
            e.error((Object)("Error while checking IsOnEffectAreaType : area type " + n + " doesn't exist"));
            return -1;
        }
        elm_0 elm_02 = null;
        if (object4 instanceof elm_0) {
            elm_02 = (elm_0)object4;
        } else if (object4 instanceof efq_0) {
            elm_02 = ((efq_0)object4).l();
        }
        if (elm_02 == null) {
            return -1;
        }
        boolean bl = this.g != null && this.g.b(object, object3, object3, object4);
        Su su = bl ? erQ.c(epq_22) : null;
        Collection<sr_0> collection = elm_02.i().f();
        for (sr_0 sr_02 : collection) {
            if (sr_02.w() != n || su != null && erQ.c(sr_02) != su || !sr_02.c(epq_22.P_())) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.dj;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a, aov_1.b};
        a.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.a, aov_1.b, aov_1.c};
        a.add(aov_1Array);
    }
}

