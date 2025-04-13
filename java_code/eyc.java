/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eyc
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    public eyc(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        if (arrayList.size() == 1) {
            this.b = (aoq_1)arrayList.get(0);
        }
    }

    protected ArrayList<aov_1[]> b() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ejh_0 ejh_02 = erQ.d(object3);
        if (ejh_02 == null) {
            return -1;
        }
        eff_0 eff_02 = eff_0.a((int)this.b.a(object, object2, object3, object4));
        return ejh_02.a(eff_02) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.fL;
    }

    protected /* synthetic */ List i() {
        return this.b();
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

