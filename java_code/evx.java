/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class evx
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b = false;

    public evx(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1;
        }
        eJL eJL2 = epq_22.dR();
        for (sd_0 sd_02 : eJL2) {
            fie_0 fie_02;
            if (!(sd_02 instanceof eja_0) || (fie_02 = ((eja_0)sd_02).aF()) == null || !fie_02.F()) continue;
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

