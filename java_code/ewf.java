/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ewf
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private List<aoq_1> b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ewf(ArrayList<aot_2> arrayList) {
        if (this.a(arrayList) == 0) {
            this.b = new ArrayList<aoq_1>();
            for (aot_2 aot_22 : arrayList) {
                aoq_1 aoq_12 = (aoq_1)aot_22;
                this.b.add(aoq_12);
            }
        }
    }

    public ewf() {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null) {
            return -1;
        }
        if (!(object instanceof epq_2)) {
            return -1;
        }
        epq_2 epq_22 = (epq_2)object;
        exq_2 exq_22 = epq_22.R_();
        if (exq_22 == null) {
            eyz_0 eyz_02 = epq_22.cG();
            eyt_0 eyt_02 = epq_22.dC();
            if (eyz_02 != null && eyt_02 != null) {
                if (this.a(object, object2, object3, object4, eyz_02, eyt_02, exh_2.p.a())) {
                    return 0;
                }
                if (this.a(object, object2, object3, object4, eyz_02, eyt_02, exh_2.q.a())) {
                    return 0;
                }
            }
            return -1;
        }
        try {
            if (this.a(object, object2, object3, object4, exq_22, exh_2.p.a())) {
                return 0;
            }
            if (this.a(object, object2, object3, object4, exq_22, exh_2.q.a())) {
                return 0;
            }
        }
        catch (Exception exception) {
            return -1;
        }
        return -1;
    }

    private boolean a(Object object, Object object2, Object object3, Object object4, exq_2 exq_22, byte by) {
        exk_2 exk_22 = (exk_2)exq_22.e(by);
        if (exk_22 == null) {
            return false;
        }
        if (exk_22.T() == null) {
            return false;
        }
        return this.a(exk_22.T().F(), object, object2, object3, object4);
    }

    private boolean a(Object object, Object object2, Object object3, Object object4, eyz_0 eyz_02, eyt_0 eyt_02, byte by) {
        Long l = eyz_02.a(exh_2.a(by));
        Optional<exk_2> optional = eyt_02.b(l);
        if (optional.isEmpty()) {
            return false;
        }
        exk_2 exk_22 = optional.get();
        if (exk_22.T() == null) {
            return false;
        }
        return this.a(exk_22.T().F(), object, object2, object3, object4);
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

    @Override
    public Enum c() {
        return eyO.o;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.d};
        a.add(aov_1Array);
    }
}

