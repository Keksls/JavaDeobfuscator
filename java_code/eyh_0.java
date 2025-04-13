/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eyh
 */
public final class eyh_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public eyh_0(ArrayList<aot_2> arrayList) {
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
        return efh_02.a(1L) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.fK;
    }

    protected /* synthetic */ List i() {
        return this.b();
    }

    static {
        a.add(esa_0.i);
    }
}

