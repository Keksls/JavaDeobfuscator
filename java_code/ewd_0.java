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
 * Renamed from ewD
 */
public class ewd_0
extends esf {
    private final TShortArrayList a = new TShortArrayList();
    private String b;
    private static final List<aov_1[]> f = new ArrayList<aov_1[]>();

    @Override
    protected List<aov_1[]> i() {
        return f;
    }

    public TShortArrayList b() {
        return this.a;
    }

    public boolean d() {
        return "target".equals(this.b);
    }

    public ewd_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        boolean bl = false;
        for (aot_2 aot_22 : arrayList) {
            if (!bl) {
                this.b = ((apd_2)aot_22).b();
                bl = true;
                continue;
            }
            short s2 = (short)((aoq_1)aot_22).a(null, null, null, null);
            this.a.add(s2);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.a(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        epq_1 epq_12 = eqq_12.Z_();
        if (epq_12 == null) {
            return -1;
        }
        if (this.a.contains(epq_12.s())) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.aa;
    }

    static {
        f.add(new aov_1[]{aov_1.a, aov_1.d});
    }
}

