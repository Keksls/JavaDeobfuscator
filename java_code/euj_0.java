/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from euJ
 */
public final class euj_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;

    public euj_0(ArrayList<aot_2> arrayList) {
        this.b = this.a(arrayList) == 0 && ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1L;
        }
        return super.e() * (long)epq_22.bO();
    }

    @Override
    public Enum c() {
        return eyO.bG;
    }

    static {
        a.add(new aov_1[]{aov_1.a});
        a.add(aov_1.j);
    }
}

