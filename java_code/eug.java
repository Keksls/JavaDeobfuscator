/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eug
extends esi_0 {
    private final String a;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    @Override
    public boolean a() {
        return true;
    }

    public eug(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.a = ((apd_2)arrayList.get(0)).b();
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.a(this.a, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1L;
        }
        return eqq_12.X();
    }

    @Override
    public Enum c() {
        return eyO.gq;
    }

    static {
        b.add(esa_0.j);
    }
}

