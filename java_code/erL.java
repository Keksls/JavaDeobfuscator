/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class erL
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final aoq_1 b;
    private final aov_2 f;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public erL(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
        this.f = arrayList.size() >= 2 ? (aov_2)arrayList.get(1) : null;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Su su;
        Object object5;
        boolean bl;
        aff_1 aff_12 = erQ.d(true, object, object2, object4, object3);
        if (aff_12 == null) {
            return -1;
        }
        long l = this.b.a(object, object2, object3, object4);
        elm_0 elm_02 = null;
        if (object4 instanceof elm_0) {
            elm_02 = (elm_0)object4;
        } else if (object4 instanceof efq_0) {
            elm_02 = ((efq_0)object4).l();
        }
        if (elm_02 == null) {
            return -1;
        }
        boolean bl2 = bl = this.f != null && this.f.b(object, object3, object3, object4) && this.f.a(object, object3, object3, object4) == 0;
        if (bl) {
            object5 = erQ.b(false, object, object2, object4, object3);
            if (object5 == null) {
                return -1;
            }
            su = erQ.c(object5);
        } else {
            su = null;
        }
        object5 = elm_02.i().f();
        Iterator iterator = object5.iterator();
        while (iterator.hasNext()) {
            sr_0 sr_02 = (sr_0)iterator.next();
            if ((long)sr_02.w() != l || su != null && erQ.c(sr_02) != su || !sr_02.c(aff_12)) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.gI;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.b, aov_1.c};
        a.add(aov_1Array);
    }
}

