/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ewP
 */
public final class ewp_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private String b;

    public ewp_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b();
    }

    protected ArrayList<aov_1[]> b() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.a(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        return eqq_12.a(eqr_1.d) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.fG;
    }

    protected /* synthetic */ List i() {
        return this.b();
    }

    static {
        a.add(esa_0.j);
    }
}

