/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from etf
 */
public class etf_0
extends esi_0 {
    private static final ArrayList<aov_1[]> b = new ArrayList();
    boolean a;
    private final aoq_1 c;
    private final aoq_1 e;
    private final aoq_1 f;
    private final boolean g;

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    @Override
    public boolean a() {
        return true;
    }

    public etf_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.a = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        this.c = (aoq_1)arrayList.get(1);
        this.e = (aoq_1)arrayList.get(2);
        this.f = (aoq_1)arrayList.get(3);
        this.g = arrayList.size() >= 5 ? ((apc_2)arrayList.get(4)).b(null, null, null, null) : false;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (object4 == null) {
            throw new aob_1("Pas de contexte...");
        }
        boolean bl = object4 instanceof elm_0;
        boolean bl2 = object4 instanceof efq_0;
        if (!bl && !bl2) {
            throw new aob_1("On essaie de compter les fighters en dehors d'un combat...");
        }
        elm_0 elm_02 = bl ? (elm_0)object4 : ((efq_0)object4).l();
        eqq_1 eqq_12 = erQ.b(false, object, object2, object4, object3);
        aff_1 aff_12 = null;
        if (!this.a) {
            if (eqq_12 != null) {
                aff_12 = eqq_12.P_();
            }
        } else if (object2 instanceof aff_1) {
            aff_12 = (aff_1)object2;
        } else {
            eqq_1 eqq_13 = erQ.b(true, object, object2, object4, object3);
            if (eqq_13 != null) {
                aff_12 = eqq_13.P_();
            }
        }
        if (aff_12 == null) {
            return 0L;
        }
        long l = 0L;
        long l2 = this.c.a(object, object2, object3, object4);
        long l3 = this.e.a(object, object2, object3, object4);
        long l4 = this.f.a(object, object2, object3, object4);
        for (sr_0 sr_02 : elm_02.i().f()) {
            if (sr_02 == eqq_12 || sr_02 == null || this.a(l2, sr_02) || this.g && sr_02.v() != eqq_12) continue;
            int n = aob_2.c((aoc_2)sr_02, aff_12);
            if (l4 >= 0L && ((long)n > l4 || (long)n < l3)) continue;
            ++l;
        }
        return super.e() * l;
    }

    protected boolean a(long l, sr_0 sr_02) {
        return (long)sr_02.w() != l;
    }

    @Override
    public Enum c() {
        return eyO.dC;
    }

    static {
        b.add(new aov_1[]{aov_1.a, aov_1.b, aov_1.b, aov_1.b});
        b.add(new aov_1[]{aov_1.a, aov_1.b, aov_1.b, aov_1.b, aov_1.c});
    }
}

