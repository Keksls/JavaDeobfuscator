/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eta
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public eta(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (!(object3 instanceof ejh_0)) {
            return -1L;
        }
        se_0 se_02 = ((ejh_0)object3).A();
        if (se_02 == null) {
            d.error((Object)"On ne peut pas calculer la distance a partir du porteur d'un effet, l'effet n'est pas stock\u00e9 dans un manager ");
            return -1L;
        }
        Su su = se_02.f();
        if (su == null) {
            return -1L;
        }
        if (object2 instanceof aoc_2) {
            aoc_2 aoc_22 = (aoc_2)object2;
            return aob_2.c((aoc_2)su, aoc_22);
        }
        if (object2 instanceof aff_1) {
            aff_1 aff_12 = (aff_1)object2;
            return aob_2.c((aoc_2)su, aff_12);
        }
        return -1L;
    }

    @Override
    public Enum c() {
        return eyO.en;
    }

    static {
        a.add(aov_1.j);
    }
}

