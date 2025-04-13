/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class evo
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;
    private String f;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public evo(ArrayList<aot_2> arrayList) {
        if (arrayList.size() < 2) {
            return;
        }
        this.b = (aoq_1)arrayList.get(0);
        this.f = ((apd_2)arrayList.get(1)).b().trim();
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (this.b == null) {
            return -1;
        }
        eqq_1 eqq_12 = erQ.a(this.f, object, object2, object4, object3);
        if (!(eqq_12 instanceof erk_2)) {
            return -1;
        }
        Object t = ((erk_2)((Object)eqq_12)).dQ();
        if (t == null) {
            return -1;
        }
        short s2 = Hw.c(this.b.a(object, object2, object3, object4));
        if (s2 <= 0) {
            return -1;
        }
        for (int n = 0; n < 10; n = (int)((byte)(n + 1))) {
            eqy_1 eqy_12 = t.a(n);
            if (eqy_12 == null || eqy_12.f() != s2) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.hE;
    }

    static {
        a.add(new aov_1[]{aov_1.b, aov_1.a});
    }
}

