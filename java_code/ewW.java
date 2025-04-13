/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class ewW
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    @Deprecated
    public ewW() {
    }

    public ewW(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public Enum c() {
        return eyO.fP;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(object, object2, object3, object4);
        if (epq_22 == null || !(epq_22 instanceof faU)) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        return epq_22.fE().m().F().c((int)this.b.a(object, object2, object3, object4)) == fbl_0.a ? 0 : -1;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

