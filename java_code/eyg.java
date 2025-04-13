/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eyg
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public eyg(ArrayList<aot_2> arrayList) {
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
        return ejh_02.bk() == 7 ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.fL;
    }

    protected /* synthetic */ List i() {
        return this.b();
    }

    static {
        a.add(esa_0.i);
    }
}

