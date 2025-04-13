/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from evp
 */
public final class evp_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private String b;

    public evp_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b();
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.a("caster", object, object2, object4, object3);
        eqq_1 eqq_13 = erQ.a(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        if (!(eqq_13 instanceof epq_2)) {
            return -1;
        }
        eJL eJL2 = ((epq_2)eqq_13).dR();
        for (sd_0 sd_02 : eJL2) {
            fie_0 fie_02;
            if (!(sd_02 instanceof eja_0) || sd_02.h() == null || sd_02.h().a_() != eqq_12.a_() || (fie_02 = ((eja_0)sd_02).aF()) == null || !fie_02.F()) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.dW;
    }

    static {
        a.add(new aov_1[]{aov_1.a});
    }
}

