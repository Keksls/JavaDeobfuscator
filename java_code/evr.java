/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class evr
extends esf {
    private static final List<aov_1[]> a = new ArrayList<aov_1[]>();
    private final aoq_1 b;

    public evr(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public Enum c() {
        return eyO.cE;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        int n;
        ece_0 ece_02 = erQ.d(object, object2, object3, object4);
        return ece_02.e(n = (int)this.b.a(object, object2, object3, object4)) ? 0 : -1;
    }

    public int b() {
        return this.b.a() ? (int)this.b.a(null, null, null, null) : -1;
    }

    public String toString() {
        return "HasCraft{m_craftId=" + this.b + "}";
    }

    static {
        a.add(esa_0.l);
    }
}

