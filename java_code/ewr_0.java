/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ewr
 */
public final class ewr_0
extends esf {
    private static final int a = -1;
    private static final List<aov_1[]> b = new ArrayList<aov_1[]>();
    private int f;

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    @Deprecated
    public ewr_0() {
    }

    public ewr_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.f = arrayList.size() < 1 ? -1 : (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02 == null) {
            return -1;
        }
        if (elm_02.T() == null) {
            return -1;
        }
        Sy sy = elm_02.T();
        if (this.f == -1) {
            return sy.e() != null ? 0 : -1;
        }
        return sy.c() == this.f ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.di;
    }

    static {
        b.add(esa_0.i);
        b.add(esa_0.l);
    }
}

