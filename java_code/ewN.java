/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ewN
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;
    private long f;

    public ewN(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        this.f = ((aoq_1)arrayList.get(1)).a(null, null, null, null);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        if (eqq_12 instanceof epq_2 && !this.a((epq_2)eqq_12)) {
            return -1;
        }
        int n = eqq_12.e_(this.f);
        if (n < 0) {
            return -1;
        }
        if (object4 == null) {
            throw new aob_1("Pas de contexte...");
        }
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        Collection collection = elm_02.am();
        for (epq_2 epq_22 : collection) {
            if (!this.a(epq_22) || epq_22.e_(this.f) <= n) continue;
            return -1;
        }
        return 0;
    }

    private boolean a(epq_2 epq_22) {
        return !epq_22.a(eoz_1.P) && !epq_22.a(eoz_1.u) && !epq_22.hh();
    }

    @Override
    public Enum c() {
        return eyO.fg;
    }

    static {
        a.add(new aov_1[]{aov_1.a, aov_1.b});
    }
}

