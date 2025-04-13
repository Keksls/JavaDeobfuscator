/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ews
 */
public class ews_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ews_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        if (!(eqq_12 instanceof epq_2)) {
            return -1;
        }
        epq_2 epq_22 = (epq_2)eqq_12;
        if (!emw_0.a.c(epq_22.U_())) {
            return -1;
        }
        emg_0 emg_02 = emw_0.a.d(epq_22.U_());
        int[] nArray = emg_02.a();
        return emp_0.a(nArray, emp_0.b) ? -1 : 0;
    }

    @Override
    public Enum c() {
        return eyO.gh;
    }

    static {
        a.add(esa_0.i);
    }
}

