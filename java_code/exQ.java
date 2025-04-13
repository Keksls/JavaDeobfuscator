/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class exQ
extends esf {
    private final wy_0 a;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    public exQ(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        String string = ((apd_2)arrayList.get(0)).b();
        this.a = wy_0.valueOf(string);
    }

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (wc_0.p().l() && wc_0.p().k() == this.a) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.t;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a};
        b.add(aov_1Array);
    }
}

