/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from euH
 */
public class euh_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final boolean b;
    private final aoq_1 c;
    private final aoq_1 e;
    private final aoq_1 f;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public euh_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        this.c = (aoq_1)arrayList.get(1);
        this.e = (aoq_1)arrayList.get(2);
        this.f = (aoq_1)arrayList.get(3);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (object4 == null) {
            return 0L;
        }
        boolean bl = object4 instanceof elm_0;
        boolean bl2 = object4 instanceof efq_0;
        if (!bl && !bl2) {
            return 0L;
        }
        elm_0 elm_02 = bl ? (elm_0)object4 : ((efq_0)object4).l();
        eqq_1 eqq_12 = erQ.b(false, object, object2, object4, object3);
        if (eqq_12 == null) {
            return 0L;
        }
        aff_1 aff_12 = null;
        if (!this.b) {
            aff_12 = eqq_12.P_();
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
            if (sr_02 == eqq_12 || sr_02 == null || this.a(l2, sr_02) || sr_02.Y() != eqq_12.Y()) continue;
            int n = aob_2.c((aoc_2)sr_02, aff_12);
            if (l4 >= 0L && ((long)n > l4 || (long)n < l3)) continue;
            ++l;
        }
        return this.e() * l;
    }

    protected boolean a(long l, sr_0 sr_02) {
        return (long)sr_02.w() != l;
    }

    @Override
    public Enum c() {
        return eyO.dD;
    }

    static {
        a.add(new aov_1[]{aov_1.a, aov_1.b, aov_1.b, aov_1.b});
    }
}

