/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class erF
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;

    public erF(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        switch (by) {
            case 0: {
                this.b = false;
                break;
            }
            case 1: {
                String string = ((apd_2)arrayList.get(0)).b();
                if (!string.equalsIgnoreCase("target")) break;
                this.b = true;
            }
        }
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
        faV faV2 = epq_22.fE();
        int n = faV2.c(faV2.n());
        fbm_0 fbm_02 = fbo_0.a().a(n);
        if (fbm_02.a(fbs_0.d)) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.cL;
    }

    static {
        a.add(aov_1.j);
        a.add(new aov_1[]{aov_1.a});
    }
}

