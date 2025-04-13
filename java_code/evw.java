/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class evw
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private ArrayList<aoq_1> b;
    private ArrayList<exh_2> f;
    private boolean g;
    private boolean h = false;

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

    public evw(ArrayList<aot_2> arrayList) {
        aoq_1 aoq_12;
        if (this.a(arrayList) == 0) {
            this.b = new ArrayList();
            for (aot_2 object : arrayList) {
                aoq_12 = (aoq_1)object;
                this.b.add(aoq_12);
            }
            this.f = null;
        }
        if (this.a(arrayList) == 1) {
            this.b = new ArrayList();
            for (aot_2 aot_22 : arrayList) {
                if (aot_22.t_() == aov_1.b) {
                    aoq_12 = (aoq_1)aot_22;
                    this.b.add(aoq_12);
                }
                if (aot_22.t_() != aov_1.a) continue;
                apd_2 apd_22 = (apd_2)aot_22;
                if (apd_22.b().equalsIgnoreCase("inventory")) {
                    this.g = true;
                    continue;
                }
                if (apd_22.b().equalsIgnoreCase("target")) {
                    this.h = true;
                    continue;
                }
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                this.f.add(this.b(apd_22.b()));
            }
        }
    }

    private boolean a(exq_1 exq_12, Object object, Object object2, Object object3, Object object4) {
        for (exq_1 exq_13 = exq_12; exq_13 != null; exq_13 = exq_13.f()) {
            for (int n = 0; n < this.b.size(); n = (int)((byte)(n + 1))) {
                if ((short)this.b.get(n).a(object, object2, object3, object4) != exq_13.d()) continue;
                return true;
            }
        }
        return false;
    }

    private boolean a(exh_2 exh_22, exq_1 exq_12) {
        exh_2[] exh_2Array;
        if (exq_12 != null && exh_22 != null && (exh_2Array = exq_12.j()) != null && exh_2Array.length > 0) {
            for (int k = 0; k < exh_2Array.length; ++k) {
                if (exh_22 != exh_2Array[k]) continue;
                return false;
            }
        }
        return true;
    }

    public TIntArrayList b() {
        TIntArrayList tIntArrayList = new TIntArrayList();
        for (aoq_1 aoq_12 : this.b) {
            if (!aoq_12.b()) continue;
            tIntArrayList.add((int)aoq_12.a(null, null, null, null));
        }
        return tIntArrayList;
    }

    public ArrayList<exh_2> d() {
        return this.f;
    }

    public evw() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Object object5;
        TLongObjectIterator<exg_2> tLongObjectIterator;
        epq_2 epq_22;
        if (object == null) {
            if (!(object3 instanceof eyc_0)) throw new aob_1("on cherche l'\u00e9quipement d'un user null");
            epq_22 = ((eyc_0)object3).b();
        } else {
            if (!(object instanceof epq_2)) {
                throw new aob_1("on cherche l'\u00e9quipement d'autre chose qu'un character");
            }
            epq_22 = this.h && object2 instanceof epq_2 ? (epq_2)object2 : (epq_2)object;
        }
        exh_1 exh_12 = epq_22.dS();
        if (this.g && exh_12 != null) {
            tLongObjectIterator = exh_12.i();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                object5 = (exg_2)tLongObjectIterator.value();
                for (Object object6 : ((exg_2)object5).g()) {
                    if (!this.a(((exk_2)object6).T().F(), object, object2, object3, object4)) continue;
                    return 0;
                }
            }
        }
        if ((tLongObjectIterator = epq_22.R_()) == null) {
            object5 = epq_22.cG();
            eyt_0 eyt_02 = epq_22.dC();
            if (object5 == null || eyt_02 == null) return -2;
            if (this.f == null) {
                for (exh_2 exh_22 : exh_2.values()) {
                    Long l = ((eyz_0)object5).a(exh_22);
                    Optional<exk_2> optional = eyt_02.b(l);
                    if (!optional.isPresent() || !this.a(optional.get().T().F(), object, object2, object3, object4)) continue;
                    return 0;
                }
                return -2;
            } else {
                for (exh_2 exh_23 : this.f) {
                    Long l = ((eyz_0)object5).a(exh_23);
                    Optional<exk_2> optional = eyt_02.b(l);
                    if (!optional.isPresent() || !this.a(exh_23, optional.get().T().F()) || !this.a(optional.get().T().F(), object, object2, object3, object4)) continue;
                    return 0;
                }
            }
            return -2;
        }
        if (this.f == null) {
            for (exh_2 exh_24 : exh_2.values()) {
                if (tLongObjectIterator.e(exh_24.a()) == null || !this.a(((exk_2)tLongObjectIterator.e(exh_24.a())).T().F(), object, object2, object3, object4)) continue;
                return 0;
            }
            return -2;
        } else {
            for (exh_2 exh_25 : this.f) {
                if (tLongObjectIterator.e(exh_25.a()) == null || !this.a(exh_25, ((exk_2)tLongObjectIterator.e(exh_25.a())).T().F()) || !this.a(((exk_2)tLongObjectIterator.e(exh_25.a())).T().F(), object, object2, object3, object4)) continue;
                return 0;
            }
        }
        return -2;
    }

    @Override
    public Enum c() {
        return eyO.m;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.d};
        a.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.d, aov_1.e};
        a.add(aov_1Array);
    }
}

