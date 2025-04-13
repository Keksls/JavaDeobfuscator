/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from evv
 */
public class evv_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private ArrayList<aoq_1> b;
    private aom_1 f;
    private ArrayList<exh_2> g = null;
    private boolean h = false;
    private boolean i = false;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    private exh_2 b(String string) {
        for (exh_2 exh_22 : exh_2.values()) {
            if (!exh_22.e().equalsIgnoreCase(string)) continue;
            return exh_22;
        }
        return null;
    }

    public evv_0(ArrayList<aot_2> arrayList) {
        aot_2 aot_22;
        int n;
        int n2;
        byte by = this.a(arrayList);
        if (arrayList.get(0).t_() == aov_1.d) {
            this.b = null;
            this.f = (aom_1)arrayList.get(0);
            n2 = 1;
        } else {
            this.b = new ArrayList();
            for (n = 0; n < arrayList.size() && arrayList.get(n).t_() == aov_1.b; ++n) {
                aot_22 = (aoq_1)arrayList.get(n);
                this.b.add((aoq_1)aot_22);
            }
            n2 = n;
        }
        if (by == 0) {
            this.g = null;
        } else if (by == 1) {
            for (n = n2; n < arrayList.size() && arrayList.get(n).t_() == aov_1.a; ++n) {
                exh_2 exh_22;
                aot_22 = (apd_2)arrayList.get(n);
                if (((apd_2)aot_22).b().equalsIgnoreCase("inventory")) {
                    this.h = true;
                    continue;
                }
                if (((apd_2)aot_22).b().equalsIgnoreCase("target")) {
                    this.i = true;
                    continue;
                }
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                if ((exh_22 = this.b(((apd_2)aot_22).b())) == null) {
                    throw new IllegalArgumentException("Nom de slot qui ne correspond a rien " + ((apd_2)aot_22).b());
                }
                this.g.add(exh_22);
            }
        }
    }

    public evv_0() {
    }

    public TIntArrayList b() {
        TIntArrayList tIntArrayList = new TIntArrayList();
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            aoq_1 aoq_12 = this.b.get(k);
            if (!aoq_12.a()) continue;
            tIntArrayList.add((int)aoq_12.a(null, null, null, null));
        }
        return tIntArrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exq_2 exq_22;
        TLongArrayList tLongArrayList;
        epq_2 epq_22;
        if (object == null) {
            if (!(object3 instanceof eyc_0)) throw new aob_1("on cherche l'\u00e9quipement d'un user null");
            epq_22 = ((eyc_0)object3).b();
        } else {
            if (!(object instanceof epq_2)) {
                throw new aob_1("on cherche l'\u00e9quipement d'autre chose qu'un character");
            }
            epq_22 = this.i && object2 instanceof epq_2 ? (epq_2)object2 : (epq_2)object;
        }
        exh_1 exh_12 = epq_22.dS();
        if (this.b != null) {
            tLongArrayList = new TLongArrayList();
            for (int n = 0; n < this.b.size(); n = (int)((byte)(n + 1))) {
                tLongArrayList.add(this.b.get(n).a(object, object2, object3, object4));
            }
        } else {
            tLongArrayList = this.f.a(object, object2, object3, object4);
        }
        if (this.h) {
            TLongObjectIterator<exg_2> tLongObjectIterator = exh_12.i();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
                for (Object object5 : exg_22.g()) {
                    if (object5 == null || !tLongArrayList.contains((long)((exk_2)object5).aT_())) continue;
                    return 0;
                }
            }
            for (int k = 0; k < tLongArrayList.size(); ++k) {
                if (evl_2.a(epq_22.R(), (int)tLongArrayList.getQuick(k)) <= 0) continue;
                return 0;
            }
        }
        if ((exq_22 = epq_22.R_()) == null) {
            eyz_0 eyz_02 = object4 instanceof eyz_0 ? (eyz_0)object4 : epq_22.cG();
            eyt_0 eyt_02 = epq_22.dC();
            if (eyz_02 == null || eyt_02 == null) return -1;
            if (this.g == null) {
                for (exh_2 exh_22 : exh_2.values()) {
                    Long l = eyz_02.a(exh_22);
                    Optional<exk_2> optional = eyt_02.b(l);
                    if (!optional.isPresent() || !tLongArrayList.contains((long)optional.get().aT_())) continue;
                    return 0;
                }
                return -1;
            } else {
                for (exh_2 exh_23 : this.g) {
                    Long l = eyz_02.a(exh_23);
                    Optional<exk_2> optional = eyt_02.b(l);
                    if (!optional.isPresent() || !tLongArrayList.contains((long)optional.get().aT_())) continue;
                    return 0;
                }
            }
            return -1;
        }
        if (this.g == null) {
            for (exh_2 exh_24 : exh_2.values()) {
                if (exq_22.e(exh_24.a()) == null || !tLongArrayList.contains((long)((exk_2)exq_22.e(exh_24.a())).T().n())) continue;
                return 0;
            }
            return -1;
        } else {
            for (exh_2 exh_25 : this.g) {
                if (exq_22.e(exh_25.a()) == null || !tLongArrayList.contains((long)((exk_2)exq_22.e(exh_25.a())).T().n())) continue;
                return 0;
            }
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.l;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.d};
        a.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.d, aov_1.e};
        a.add(aov_1Array);
    }
}

