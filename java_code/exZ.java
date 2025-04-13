/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class exZ
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b = false;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    exZ() {
    }

    public exZ(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        if (arrayList.size() >= 1) {
            this.b = ((aov_2)arrayList.get(0)).b(null, null, null, null);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object2 == null) {
            return 0;
        }
        if (object == null || !(object instanceof epq_2)) {
            return -1;
        }
        elm_0 elm_02 = null;
        if (object4 instanceof elm_0) {
            elm_02 = (elm_0)object4;
        } else if (object4 instanceof efq_0) {
            elm_02 = ((efq_0)object4).l();
        }
        if (elm_02 == null) {
            return -1;
        }
        if (object2 instanceof aff_1) {
            aff_1 aff_12 = (aff_1)object2;
            tg_0 tg_02 = elm_02.g();
            if (!tg_02.c(aff_12.d(), aff_12.e())) {
                return -1;
            }
            Collection<sr_0> collection = elm_02.i().f();
            for (sr_0 sr_02 : collection) {
                if (!sr_02.P_().a((Object)aff_12)) continue;
                if (this.b) {
                    return -1;
                }
                if (!sr_02.ab()) continue;
                return -1;
            }
            ti_0 ti_02 = tg_02.g(aff_12.d(), aff_12.e());
            if (ti_02 == null) {
                return 0;
            }
            return -1;
        }
        if (object2 instanceof sz_0) {
            if (this.b) {
                return -1;
            }
            sr_0 sr_03 = ((sz_0)object2).am();
            if (sr_03 != null && sr_03.ab()) {
                return -1;
            }
            return 0;
        }
        return -2;
    }

    @Override
    public Enum c() {
        return eyO.cu;
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.k);
    }
}

