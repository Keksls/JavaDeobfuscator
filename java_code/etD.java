/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class etD
extends etx_0 {
    private static final ArrayList<aov_1[]> g = new ArrayList();
    private aoq_1 h;
    private long i;

    @Override
    protected List<aov_1[]> i() {
        return g;
    }

    public etD(ArrayList<aot_2> arrayList) {
        this.a = (aoq_1)arrayList.get(0);
        this.c = ((apd_2)arrayList.get(1)).b();
        this.h = (aoq_1)arrayList.get(2);
    }

    protected Collection<? extends epq_2> a(elm_0<?> elm_02, eqq_1 eqq_12) {
        if (elm_02 == null) {
            return Collections.emptyList();
        }
        Collection collection = elm_02.am();
        ArrayList<epq_2> arrayList = new ArrayList<epq_2>();
        for (epq_2 epq_22 : collection) {
            if ((long)epq_22.gO() != this.i) continue;
            arrayList.add(epq_22);
        }
        return arrayList;
    }

    @Override
    protected void c(Object object, Object object2, Object object3, Object object4) {
        this.i = this.h.a(object, object2, object4, object3);
    }

    @Override
    public Enum c() {
        return eyO.dv;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b, aov_1.a, aov_1.b};
        g.add(aov_1Array);
    }
}

