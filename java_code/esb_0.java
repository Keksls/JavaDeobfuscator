/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from esb
 */
public final class esb_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public esb_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        throw new UnsupportedOperationException("DEPRECATED CRITERIA");
    }

    @Override
    public Enum c() {
        return eyO.dO;
    }

    static {
        a.add(aov_1.j);
    }
}

