/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from exa
 */
public final class exa_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;
    private int f;
    private int g;

    public exa_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        this.f = (int)((aoq_1)arrayList.get(1)).a(null, null, null, null);
        this.g = (int)((aoq_1)arrayList.get(2)).a(null, null, null, null);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        aff_1 aff_12 = erQ.d(this.b, object, object2, object4, object3);
        if (aff_12 == null) {
            return -1;
        }
        aff_1 aff_13 = erQ.d(!this.b, object, object2, object4, object3);
        if (aff_13 == null) {
            return -1;
        }
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02 == null) {
            return -1;
        }
        aej_2 aej_22 = aff_12.c(aff_13);
        if (aej_22 == null) {
            return -1;
        }
        int n = aej_22.m * this.f - aej_22.n * this.g;
        int n2 = aej_22.n * this.f + aej_22.m * this.g;
        aff_1 aff_14 = new aff_1(aff_12);
        aff_14.a(n, n2);
        if (!elm_02.g().c(aff_14.d(), aff_14.e())) {
            return -1;
        }
        Collection<sr_0> collection = elm_02.i().f();
        for (sr_0 sr_02 : collection) {
            if (!sr_02.P_().a((Object)aff_14) || !sr_02.ab()) continue;
            return -1;
        }
        ti_0 ti_02 = elm_02.g().g(aff_14.d(), aff_14.e());
        if (ti_02 != null) {
            return -1;
        }
        return 0;
    }

    @Override
    public Enum c() {
        return eyO.eE;
    }

    static {
        a.add(new aov_1[]{aov_1.a, aov_1.b, aov_1.b});
    }
}

