/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class exu
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public exu(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        if (by == 1) {
            this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        return eqq_12 != null && eqq_12.p() ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.de;
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.j);
    }
}

