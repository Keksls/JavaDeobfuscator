/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from exP
 */
public final class exp_0
extends esf {
    private static final List<aov_1[]> a = new ArrayList<aov_1[]>();

    public exp_0(ArrayList<aot_2> arrayList) {
    }

    @Override
    protected List<aov_1[]> i() {
        return Collections.unmodifiableList(a);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        els_0 els_02 = erQ.a(object, object4);
        if (els_02 == null && object3 != null && object3 instanceof eyc_0) {
            els_02 = ((eyc_0)object3).b().ck();
        }
        if (els_02 == null) {
            return -1;
        }
        if (els_02.af_().x().a()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.fN;
    }

    static {
        a.add(aov_1.j);
    }
}

