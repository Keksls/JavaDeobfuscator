/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from etZ
 */
public class etz_0
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

    public etz_0(ArrayList<aot_2> arrayList) {
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(object, object2, object4, object3);
        if (epq_22 == null) {
            throw new aob_1("on cherche le rang gouvernemental d'un user null");
        }
        if (!(object instanceof faU)) {
            throw new aob_1("on cherche le gouvernemental d'un user qui n'est pas citoyen");
        }
        fcu_0 fcu_02 = epq_22.fE().w();
        if (fcu_02 == null) {
            return -1L;
        }
        return super.e() * (long)fcu_02.g();
    }

    @Override
    public Enum c() {
        return eyO.cO;
    }

    static {
        a.add(aov_1.j);
    }
}

