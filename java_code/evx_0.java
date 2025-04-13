/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from evX
 */
public final class evx_0
extends esf {
    private static final List<aov_1[]> a = new ArrayList<aov_1[]>();
    private final boolean b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public evx_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(false, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1;
        }
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02 == null) {
            return -1;
        }
        aff_1 aff_12 = null;
        if (this.b) {
            if (object2 instanceof epq_2) {
                aff_12 = ((epq_2)object2).gg();
            } else if (object2 instanceof aff_1) {
                aff_12 = (aff_1)object2;
            }
            if (aff_12 == null) {
                return 0;
            }
        } else {
            aff_12 = epq_22.P_();
        }
        Collection<sr_0> collection = elm_02.i().f();
        for (sr_0 sr_02 : collection) {
            if (evx_0.a(epq_22, sr_02) || !evx_0.a(aff_12, sr_02)) continue;
            return 0;
        }
        return -1;
    }

    private static boolean a(epq_2 epq_22, sr_0 sr_02) {
        return sr_02.w() != ele_0.o.a() || sr_02.v() != epq_22;
    }

    private static boolean a(aff_1 aff_12, sr_0 sr_02) {
        if (sr_02.G() == aff_12.d() + 1 && sr_02.H() == aff_12.e()) {
            return true;
        }
        if (sr_02.G() == aff_12.d() - 1 && sr_02.H() == aff_12.e()) {
            return true;
        }
        if (sr_02.G() == aff_12.d() && sr_02.H() == aff_12.e() + 1) {
            return true;
        }
        if (sr_02.G() == aff_12.d() && sr_02.H() == aff_12.e() - 1) {
            return true;
        }
        if (sr_02.G() == aff_12.d() + 1 && sr_02.H() == aff_12.e() + 1) {
            return true;
        }
        if (sr_02.G() == aff_12.d() + 1 && sr_02.H() == aff_12.e() - 1) {
            return true;
        }
        if (sr_02.G() == aff_12.d() - 1 && sr_02.H() == aff_12.e() + 1) {
            return true;
        }
        return sr_02.G() == aff_12.d() - 1 && sr_02.H() == aff_12.e() - 1;
    }

    @Override
    public Enum c() {
        return eyO.ct;
    }

    static {
        a.add(esa_0.j);
    }
}

