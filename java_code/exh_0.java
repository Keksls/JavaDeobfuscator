/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from exh
 */
public class exh_0
extends esf {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public exh_0(ArrayList<aot_2> arrayList) {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02 == null) {
            return -1;
        }
        aff_1 aff_12 = erQ.d(false, object, object2, object4, object3);
        if (aff_12 == null) {
            return -1;
        }
        aff_1 aff_13 = erQ.d(true, object, object2, object4, object3);
        if (aff_13 == null) {
            return -1;
        }
        if ((int)Math.pow(aff_13.d() - aff_12.d(), 2.0) == (int)Math.pow(aff_13.e() - aff_12.e(), 2.0)) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.eB;
    }
}

