/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class etH
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Deprecated
    public etH() {
    }

    public etH(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public Enum c() {
        return eyO.cG;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object3, object4);
        if (!(eqq_12 instanceof erp_1)) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        erp_1 erp_12 = (erp_1)((Object)eqq_12);
        return erp_12.fm().g();
    }

    static {
        a.add(aov_1.j);
    }
}

