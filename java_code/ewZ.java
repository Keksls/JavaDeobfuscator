/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class ewZ
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b = false;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ewZ(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        if (by == 1) {
            this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        return epq_22 != null && epq_22.hm() ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.dg;
    }

    static {
        a.add(aov_1.j);
        a.add(new aov_1[]{aov_1.a});
    }
}

