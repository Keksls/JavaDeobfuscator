/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eyf
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public eyf(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    protected ArrayList<aov_1[]> b() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ejh_0 ejh_02 = erQ.d(object3);
        if (ejh_02 == null) {
            return -1;
        }
        efh_0 efh_02 = (efh_0)ejh_02.f();
        if (efh_02 == null) {
            return -1;
        }
        if (efh_02.a(eff_0.d)) {
            return 0;
        }
        if (efh_02.u().d() == aqe_1.a) {
            return -1;
        }
        return 0;
    }

    @Override
    public Enum c() {
        return eyO.fl;
    }

    protected /* synthetic */ List i() {
        return this.b();
    }

    static {
        a.add(esa_0.i);
    }
}

