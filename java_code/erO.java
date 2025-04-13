/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

abstract class erO
extends esf {
    protected static final ArrayList<aov_1[]> a = new ArrayList();
    protected boolean b = false;

    erO() {
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1;
        }
        Object object5 = this.b ? object : object2;
        if (object5 != null && object5 instanceof Su) {
            un_0 un_02;
            Su su = (Su)object5;
            if (epq_22.k() != null && this.a(un_02 = epq_22.k().a(su.G(), su.H(), su.I()))) {
                return 0;
            }
        }
        return -1;
    }

    protected abstract boolean a(un_0 var1);

    static {
        a.add(aov_1.j);
        a.add(new aov_1[]{aov_1.a});
    }
}

