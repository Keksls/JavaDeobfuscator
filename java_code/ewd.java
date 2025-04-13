/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.set.hash.TByteHashSet;
import java.util.ArrayList;
import java.util.List;

public class ewd
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final boolean b;
    private final aoq_1 f;
    private final aoq_1 g;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ewd(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        this.f = (aoq_1)arrayList.get(1);
        this.g = (aoq_1)arrayList.get(2);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object4 == null) {
            return 0;
        }
        boolean bl = object4 instanceof elm_0;
        boolean bl2 = object4 instanceof efq_0;
        if (!bl && !bl2) {
            return 0;
        }
        elm_0 elm_02 = bl ? (elm_0)object4 : ((efq_0)object4).l();
        eqq_1 eqq_12 = erQ.b(false, object, object2, object4, object3);
        if (eqq_12 == null) {
            return 0;
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
            return 0;
        }
        long l = 0L;
        long l2 = ele_0.q.a();
        long l3 = this.f.a(object, object2, object3, object4);
        long l4 = this.g.a(object, object2, object3, object4);
        for (sr_0 sr_02 : elm_02.i().f()) {
            if (sr_02 == eqq_12 || sr_02 == null || this.a(l2, sr_02) || sr_02.Y() != eqq_12.Y()) continue;
            aff_1 aff_13 = sr_02.P_();
            TByteHashSet tByteHashSet = elm_02.g().f(aff_13.d(), aff_13.e());
            if (tByteHashSet != null && !tByteHashSet.isEmpty()) continue;
            int n = aob_2.c((aoc_2)sr_02, aff_12);
            if (l4 >= 0L && ((long)n > l4 || (long)n < l3)) continue;
            ++l;
        }
        return l > 0L ? 0 : -1;
    }

    protected boolean a(long l, sr_0 sr_02) {
        return (long)sr_02.w() != l;
    }

    @Override
    public Enum c() {
        return eyO.fW;
    }

    static {
        a.add(new aov_1[]{aov_1.a, aov_1.b, aov_1.b});
    }
}

