/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from etQ
 */
public class etq_0
extends etp_0 {
    private static final List<aov_1[]> a = new ArrayList<aov_1[]>();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public etq_0(List<aot_2> list) {
        super(list);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22;
        if (object == null) {
            if (!(object3 instanceof eyc_0)) throw new aob_1("on cherche l'\u00e9quipement d'un user null");
            epq_22 = ((eyc_0)object3).b();
        } else {
            if (!(object instanceof epq_2)) {
                throw new aob_1("on cherche l'\u00e9quipement d'autre chose qu'un character");
            }
            epq_22 = (epq_2)object;
        }
        if (epq_22 == null) {
            return 0L;
        }
        long l = 0L;
        long l2 = epq_22.U_();
        TLongHashSet tLongHashSet = euw_2.a.e(l2);
        for (long l3 : tLongHashSet) {
            Object t = euw_2.a.d(l3);
            if (t == null) continue;
            TLongArrayList tLongArrayList = this.c(t, object3, object3, object4);
            l += (long)this.a((epq_2)t, tLongArrayList);
        }
        return l;
    }

    @Override
    public Enum c() {
        return eyO.V;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.d};
        a.add(aov_1Array);
    }
}

