/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class evS
extends esf {
    private aoq_1 a;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public evS(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.a = (aoq_1)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof epq_2)) {
            throw new aob_1("Le user d'un crit\u00e8re IsMonsterBreed doit \u00eatre un player.");
        }
        epq_2 epq_22 = (epq_2)object;
        els_0 els_02 = epq_22.ck();
        if (els_02 == null) {
            return -1;
        }
        Collection collection = els_02.am();
        for (epq_2 epq_23 : collection) {
            if (epq_23 == epq_22 || epq_23.cl() != epq_22 || (long)epq_23.gO() != this.a.a(object, object2, object3, object4)) continue;
            return 0;
        }
        return -1;
    }

    public short b() {
        if (this.a.b() && this.a.a()) {
            return (short)this.a.a(null, null, null, null);
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.cY;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        b.add(aov_1Array);
    }
}

