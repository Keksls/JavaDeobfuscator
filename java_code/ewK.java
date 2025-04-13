/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.List;

public class ewK
extends esf {
    private final TIntArrayList a = new TIntArrayList();
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public TIntArrayList b() {
        return this.a;
    }

    public ewK(ArrayList<aot_2> arrayList) {
        if (this.a(arrayList) == 0) {
            return;
        }
        for (aot_2 aot_22 : arrayList) {
            int n = (int)((aoq_1)aot_22).a(null, null, null, null);
            this.a.add(n);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Object object5 = object;
        if (!(object5 instanceof ezu_2)) {
            throw new aob_1("On essaie de r\u00e9cup\u00e9rer la pr\u00e9sence d'un challenge sur une cible invalide");
        }
        ezu_2 ezu_22 = (ezu_2)object5;
        if (this.a.isEmpty()) {
            return ezu_22.dq() ? 0 : -1;
        }
        for (int n : this.a.toArray()) {
            if (ezu_22.g(n)) continue;
            return -1;
        }
        return 0;
    }

    @Override
    public Enum c() {
        return eyO.at;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.d};
        b.add(esa_0.i);
        b.add(aov_1Array);
    }
}

