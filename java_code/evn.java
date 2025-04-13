/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class evn
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;

    public evn(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        if (eqq_12 instanceof epq_2) {
            return ((epq_2)eqq_12).ho() ? 0 : -1;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.eF;
    }

    static {
        a.add(esa_0.j);
    }
}

