/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class evL
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    @Deprecated
    public evL() {
    }

    public evL(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public Enum c() {
        return eyO.fO;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(object, object2, object3, object4);
        if (epq_22 == null || !(epq_22 instanceof faU)) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        byte by = (byte)this.b.a(object, object2, object3, object4);
        fgY fgY2 = fgY.a(by);
        return epq_22.fE().y().a(fgY2) ? -1 : 0;
    }

    public byte b() {
        return (byte)this.b.a(null, null, null, null);
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

