/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ext
 */
public class ext_0
extends esf
implements eyk_0 {
    private static final ArrayList<aov_1[]> b = new ArrayList();
    protected String a;

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public ext_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        if (by == 1) {
            this.a = ((apd_2)arrayList.get(0)).b();
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.a(this.a, object, object2, object4, object3);
        if (eqq_12 == null && object3 instanceof eyc_0) {
            eqq_12 = ((eyc_0)object3).b();
        }
        if (eqq_12 == null) {
            return -1;
        }
        if (!eqq_12.ak()) {
            return -1;
        }
        elm_0<?> elm_02 = erQ.a(eqq_12, object4);
        if (elm_02 == null) {
            return -1;
        }
        tg_0 tg_02 = elm_02.g();
        if (tg_02 == null) {
            return -1;
        }
        ti_0 ti_02 = tg_02.g(eqq_12.G(), eqq_12.H());
        byte by = eqq_12.X();
        if (by <= 0) {
            return ti_02 != null && (ti_02.ab() || ti_02.ac()) ? 0 : -1;
        }
        for (int k = eqq_12.G() - by; k < eqq_12.G() + by; ++k) {
            for (int i2 = eqq_12.H() - by; i2 < eqq_12.H() + by; ++i2) {
                ti_0 ti_03 = tg_02.g(k, i2);
                if (ti_03 == null || !ti_03.ab() && !ti_03.ac()) continue;
                return 0;
            }
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.gi;
    }

    @Override
    public boolean j() {
        if (this.a == null) {
            return false;
        }
        return this.a.equalsIgnoreCase("target");
    }

    static {
        b.add(esa_0.i);
        b.add(esa_0.j);
    }
}

