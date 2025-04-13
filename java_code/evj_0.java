/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from evj
 */
public class evj_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public evj_0(ArrayList<aot_2> arrayList) {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof emh_0)) {
            return -1;
        }
        boolean bl = ((emh_0)object).N_().a(emq_0.bm);
        return bl ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.gc;
    }

    static {
        a.add(esa_0.i);
    }
}

