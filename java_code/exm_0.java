/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from exM
 */
public final class exm_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private String b;

    public exm_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        this.b = "target";
        if (by == 1) {
            this.b = ((apd_2)arrayList.get(0)).b();
        }
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.a(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        return eqq_12.a(eqr_1.b) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.ex;
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.j);
    }
}

