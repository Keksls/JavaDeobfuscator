/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 */
import gnu.trove.list.array.TShortArrayList;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ewB
 */
public class ewb_0
extends esf {
    private final TShortArrayList a = new TShortArrayList();
    private boolean b = false;
    private static final ArrayList<aov_1[]> f = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return f;
    }

    public TShortArrayList b() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public ewb_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        for (aot_2 aot_22 : arrayList) {
            String string = ((apd_2)aot_22).b();
            if (string.equalsIgnoreCase("target")) {
                this.b = true;
                continue;
            }
            if (string.equalsIgnoreCase("caster")) {
                this.b = false;
                continue;
            }
            epn_2 epn_22 = epn_2.a(string);
            if (epn_22 == null) continue;
            this.a.add(epn_22.s());
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1;
        }
        if (this.a.contains(epq_22.Z_().s())) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.p;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.e};
        f.add(aov_1Array);
    }
}

