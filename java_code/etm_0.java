/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from etM
 */
public class etm_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public etm_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(object, object2, object4, object3);
        if (epq_22 != null) {
            return epq_22.T_();
        }
        if (object instanceof fhi_0) {
            return ((fhi_0)object).T_();
        }
        if (object4 instanceof Vt) {
            return ((Vt)object4).a();
        }
        if (object instanceof fgy_0) {
            return ((fgy_0)object).I();
        }
        throw new aob_1("Impossible d'evaluer le critere GetInstanceId sur user=" + object);
    }

    @Override
    public Enum c() {
        return eyO.P;
    }

    static {
        a.add(aov_1.j);
    }
}

