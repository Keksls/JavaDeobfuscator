/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class esx
extends etx_0 {
    private static final ArrayList<aov_1[]> g = new ArrayList();
    private boolean h = true;

    public esx(ArrayList<aot_2> arrayList) {
        super(arrayList);
        if (arrayList.size() == 6) {
            this.b = (aoq_1)arrayList.get(0);
            this.a = (aoq_1)arrayList.get(1);
            this.c = ((apd_2)arrayList.get(2)).b();
            this.e = (aov_2)arrayList.get(3);
            this.f = (aov_2)arrayList.get(4);
            this.h = ((aov_2)arrayList.get(5)).b(null, null, null, null);
        }
    }

    @Override
    protected List<aov_1[]> i() {
        return g;
    }

    @Override
    public Enum c() {
        return eyO.aP;
    }

    protected Collection<? extends epq_2> a(elm_0<?> elm_02, eqq_1 eqq_12) {
        if (elm_02 == null || eqq_12 == null) {
            return Collections.emptyList();
        }
        if (this.h) {
            return elm_02.a(enw_2.c(), enw_2.b(eqq_12.Y()), enw_2.a(enw_2.a(eoz_1.bh)), enw_2.a(enw_2.h()));
        }
        return elm_02.a(enw_2.b(eqq_12.Y()), enw_2.a(enw_2.a(eoz_1.bh)), enw_2.a(enw_2.h()));
    }

    static {
        g.add(aov_1.j);
        g.add(new aov_1[]{aov_1.b});
        g.add(new aov_1[]{aov_1.b, aov_1.a});
        g.add(new aov_1[]{aov_1.b, aov_1.b, aov_1.a});
        g.add(new aov_1[]{aov_1.b, aov_1.b, aov_1.a, aov_1.c});
        g.add(new aov_1[]{aov_1.b, aov_1.b, aov_1.a, aov_1.c, aov_1.c});
        g.add(new aov_1[]{aov_1.b, aov_1.b, aov_1.a, aov_1.c, aov_1.c, aov_1.c});
    }
}

