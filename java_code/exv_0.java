/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from exV
 */
public final class exv_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final boolean b;
    private final aoq_1 f;
    private final aoq_1 g;
    private final aov_2 h;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public exv_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        this.f = (aoq_1)arrayList.get(1);
        this.h = (aov_2)arrayList.get(2);
        this.g = (aoq_1)arrayList.get(3);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Su su = erQ.c(object);
        Su su2 = erQ.c(object2);
        if (object == null) {
            return -1;
        }
        Object object5 = this.b ? object2 : object;
        boolean bl = this.h.b(object, object2, object3, object4);
        long l = this.f.a(object, object2, object3, object4);
        long l2 = this.g.a(object, object2, object3, object4);
        if (object5 instanceof sz_0) {
            sr_0 sr_02 = ((sz_0)object5).am();
            if (sr_02 == null) {
                return -1;
            }
            if (sr_02.A() != l) {
                return -1;
            }
            if (bl && su2 != su) {
                return -1;
            }
            if (!(sr_02 instanceof eqq_1)) {
                return -1;
            }
            if (!((eqq_1)((Object)sr_02)).d_(l2)) {
                return -1;
            }
            return 0;
        }
        if (object5 == null) {
            for (sr_0 sr_03 : ((elm_0)object4).i().f()) {
                if (sr_03.A() != l || bl && erQ.c(sr_03) != su || !(sr_03 instanceof eqq_1) || !((eqq_1)((Object)sr_03)).d_(l2)) continue;
                return 0;
            }
            return -1;
        }
        elm_0 elm_02 = erQ.b(object4);
        if (object2 instanceof aff_1 && elm_02 != null) {
            for (sr_0 sr_04 : elm_02.i().f()) {
                aff_1 aff_12 = (aff_1)object2;
                if (sr_04.A() != l || bl && erQ.c(sr_04) != su || !sr_04.c(aff_12) || !(sr_04 instanceof eqq_1) || !((eqq_1)((Object)sr_04)).d_(l2)) continue;
                return 0;
            }
            return -1;
        }
        return -2;
    }

    @Override
    public Enum c() {
        return eyO.Y;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a, aov_1.b, aov_1.c, aov_1.b};
        a.add(aov_1Array);
    }
}

