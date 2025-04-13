/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from etb
 */
public class etb_0
extends esi_0 {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public etb_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        aff_1 aff_12;
        Object object5;
        if (object == null || !(object instanceof eqq_1)) {
            return -1L;
        }
        boolean bl = object4 instanceof elm_0;
        boolean bl2 = object4 instanceof efq_0;
        if (!bl && !bl2) {
            throw new aob_1("On essaie de compter r\u00e9cup\u00e9rer la distance avec une balise en dehors d'un combat...");
        }
        elm_0 elm_02 = bl ? (elm_0)object4 : ((efq_0)object4).l();
        eqq_1 eqq_12 = (eqq_1)object;
        byte by = eqq_12.Y();
        if (object2 instanceof aoc_2) {
            object5 = (aoc_2)object2;
            aff_12 = new aff_1(object5.G(), object5.H(), object5.I());
        } else if (object2 instanceof aff_1) {
            aff_12 = (aff_1)object2;
        } else {
            return -1L;
        }
        object5 = elm_02.aB();
        int n = Short.MAX_VALUE;
        Iterator iterator = object5.iterator();
        while (iterator.hasNext()) {
            int n2;
            sr_0 sr_02 = (sr_0)iterator.next();
            if (sr_02.w() != ele_0.c.a() || sr_02.Y() != by || (n2 = aob_2.c((aoc_2)sr_02, aff_12)) >= n) continue;
            n = n2;
        }
        return n;
    }

    @Override
    public Enum c() {
        return eyO.ac;
    }
}

