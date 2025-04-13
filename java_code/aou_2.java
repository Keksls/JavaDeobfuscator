/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;

/*
 * Renamed from aou
 */
public class aou_2
extends aom_1 {
    private aom_1 a;
    private aom_1 b;

    @Override
    public aov_1 t_() {
        return aov_1.d;
    }

    @Override
    public Enum c() {
        return aoc_1.q;
    }

    @Override
    public TLongArrayList a(Object object, Object object2, Object object3, Object object4) {
        TLongArrayList tLongArrayList = this.a.a(object, object2, object3, object4);
        tLongArrayList.add(this.b.a(object, object2, object3, object4).toArray());
        return tLongArrayList;
    }

    public aou_2(aot_2 aot_22, aot_2 aot_23) {
        ArrayList<aoq_1> arrayList;
        if (aot_22.t_() == aov_1.d) {
            this.a = (aom_1)aot_22;
        } else if (aot_22.t_() == aov_1.b) {
            arrayList = new ArrayList<aoq_1>();
            arrayList.add((aoq_1)aot_22);
            this.a = new aoy_2(arrayList);
        } else {
            throw new aos_2("On essaie de concatener deux objets qui ne sont pas des listes");
        }
        if (aot_23.t_() == aov_1.d) {
            this.b = (aom_1)aot_23;
        } else if (aot_23.t_() == aov_1.b) {
            arrayList = new ArrayList();
            arrayList.add((aoq_1)aot_23);
            this.b = new aoy_2(arrayList);
        } else {
            throw new aos_2("On essaie de concatener deux objets qui ne sont pas des listes");
        }
    }

    @Override
    public int b() {
        int n = this.a.b();
        if (n == Integer.MIN_VALUE) {
            return n;
        }
        int n2 = this.b.b();
        if (n2 == Integer.MIN_VALUE) {
            return n2;
        }
        return n + n2;
    }
}

