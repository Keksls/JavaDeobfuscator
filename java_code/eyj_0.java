/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eyj
 */
public class eyj_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public eyj_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null || object2 == null || !(object instanceof epq_2) || !(object2 instanceof Su)) {
            throw new aob_1("On cherche les summons d'un user null");
        }
        if (((epq_2)object).d(((Su)object2).a_()) != null) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.aG;
    }

    static {
        a.add(aov_1.j);
    }
}

