/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class exk
extends esf {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public exk(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(object, object2, object3, object4);
        if (!(epq_22 instanceof erp_1)) {
            return -1;
        }
        erp_1 erp_12 = (erp_1)((Object)epq_22);
        return erp_12.fm().d() == 0L ? -1 : 0;
    }

    @Override
    public Enum c() {
        return eyO.fh;
    }
}

