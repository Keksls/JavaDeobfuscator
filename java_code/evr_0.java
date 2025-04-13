/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from evR
 */
public final class evr_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final boolean b;
    private final TIntHashSet f = new TIntHashSet();

    public evr_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        int n = arrayList.size();
        for (int k = 1; k < n; ++k) {
            this.f.add((int)((aoq_1)arrayList.get(k)).a(null, null, null, null));
        }
    }

    protected ArrayList<aov_1[]> b() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        if (!(eqq_12 instanceof emv_0)) {
            return -1;
        }
        emv_0 emv_02 = (emv_0)((Object)eqq_12);
        emg_0 emg_02 = (emg_0)emv_02.c();
        enu_0 enu_02 = emg_02.c();
        if (enu_02 == null) {
            return -1;
        }
        return this.f.contains(enu_02.e) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.fF;
    }

    public TIntHashSet d() {
        return this.f;
    }

    public String toString() {
        return "HasSubscriptionLevel{m_useTarget=" + this.b + ", m_subscriptionLevels=" + this.f + "}";
    }

    protected /* synthetic */ List i() {
        return this.b();
    }

    static {
        a.add(new aov_1[]{aov_1.a, aov_1.d});
    }
}

