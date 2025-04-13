/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class ewI
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public ewI(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    protected ArrayList<aov_1[]> b() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(false, object, object2, object4, object3);
        aej_2 aej_22 = eqq_12.F();
        aff_1 aff_12 = new aff_1(eqq_12.P_());
        aff_12.a(aej_22);
        eqq_1 eqq_13 = erQ.a("target", null, (Object)aff_12, object4, object3);
        return eqq_13 instanceof epq_2 ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.fx;
    }

    protected /* synthetic */ List i() {
        return this.b();
    }

    static {
        a.add(esa_0.i);
    }
}

