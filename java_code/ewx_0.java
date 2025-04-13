/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ewx
 */
public class ewx_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public ewx_0(ArrayList<aot_2> arrayList) {
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        if (!(eqq_12 instanceof epq_2)) {
            return -1;
        }
        epq_2 epq_22 = (epq_2)eqq_12;
        long l = epq_22.T_();
        Object t = fjw_0.e();
        if (t == null) {
            e.warn((Object)"[GD] Criterion IS_BATTLEGROUND is used on a service with no WorldInfoManager!");
            return -1;
        }
        fjv_0 fjv_02 = ((fjw_0)t).c(l);
        return fjv_02 != null && fjv_02.a() ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.gt;
    }

    static {
        a.add(esa_0.i);
    }
}

