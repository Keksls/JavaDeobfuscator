/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;

/*
 * Renamed from aoy
 */
public class aoy_2
extends aom_1 {
    private final ArrayList<aoq_1> a;

    @Override
    public TLongArrayList a(Object object, Object object2, Object object3, Object object4) {
        TLongArrayList tLongArrayList = new TLongArrayList();
        for (aoq_1 aoq_12 : this.a) {
            tLongArrayList.add(aoq_12.a(object, object2, object3, object4));
        }
        return tLongArrayList;
    }

    public aoy_2(ArrayList<? extends aot_2> arrayList) {
        this(arrayList, false);
    }

    public aoy_2(ArrayList<? extends aot_2> arrayList, boolean bl) {
        if (bl) {
            this.a = arrayList;
        } else {
            this.a = new ArrayList();
            for (aot_2 aot_22 : arrayList) {
                if (aot_22.t_() == aov_1.b) {
                    this.a.add((aoq_1)aot_22);
                    continue;
                }
                throw new aos_2("On essaie d'ajouter " + aot_22 + " de type " + aot_22.t_().name() + " \u00e0 une liste de valeur num\u00e9rique");
            }
        }
    }

    @Override
    public int b() {
        return this.a.size();
    }

    @Override
    public Enum c() {
        return aoc_1.q;
    }
}

