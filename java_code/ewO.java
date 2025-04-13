/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class ewO
extends esf
implements eyk_0 {
    private boolean a = false;
    private eps_0 b;
    private static final ArrayList<aov_1[]> f = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return f;
    }

    public ewO(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.b = esH.b(((apd_2)arrayList.get(0)).b());
        }
        if (s2 == 1) {
            this.b = esH.b(((apd_2)arrayList.get(0)).b());
            this.a = ((apd_2)arrayList.get(1)).b().equalsIgnoreCase("target");
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        int n;
        eqq_1 eqq_12 = erQ.b(this.a, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        if (!eqq_12.a(this.b)) {
            return -1;
        }
        int n2 = eqq_12.c(this.b);
        if (n2 == (n = eqq_12.d(this.b))) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.ee;
    }

    @Override
    public boolean j() {
        return this.a;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a};
        f.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.a, aov_1.a};
        f.add(aov_1Array);
    }
}

