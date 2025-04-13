/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class exn
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;

    public exn(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        if (arrayList.size() >= 1) {
            this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        }
    }

    protected ArrayList<aov_1[]> b() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        return eqq_12 != null && eqq_12.o() ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.fv;
    }

    protected /* synthetic */ List i() {
        return this.b();
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.j);
    }
}

