/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from euI
 */
public class eui_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private String b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public eui_0(ArrayList<aot_2> arrayList) {
        if (this.a(arrayList) == 1) {
            this.b = ((apd_2)arrayList.get(0)).b();
        }
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.a(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1L;
        }
        return this.e() * (long)eqq_12.Y();
    }

    @Override
    public Enum c() {
        return eyO.j;
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.j);
    }
}

