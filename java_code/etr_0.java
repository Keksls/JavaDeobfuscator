/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from etr
 */
public class etr_0
extends esi_0 {
    private static final int a = -1;
    private static final ArrayList<aov_1[]> b = new ArrayList();
    private aoq_1 c;

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public etr_0(List<aot_2> list) {
        if (this.a(list) == 0 && list.size() == 1) {
            this.c = (aoq_1)list.get(0);
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        if (!(eqq_12 instanceof epq_2)) {
            throw new aob_1("Criterion user should be a " + epq_2.class.getSimpleName() + ", not a " + eqq_12.getClass().getSimpleName());
        }
        epq_2 epq_22 = (epq_2)eqq_12;
        short s2 = (short)this.c.a(object, object2, object3, object4);
        exq_2 exq_22 = epq_22.R_();
        if (exq_22 != null) {
            exk_2 exk_22 = (exk_2)exq_22.e(s2);
            return exk_22 == null ? -1L : (long)exk_22.aT_();
        }
        eyz_0 eyz_02 = object4 instanceof eyz_0 ? (eyz_0)object4 : epq_22.cG();
        eyt_0 eyt_02 = epq_22.dC();
        if (eyz_02 == null || eyt_02 == null) {
            return -1L;
        }
        exk_2 exk_23 = eyz_02.a(eyt_02, exh_2.a((byte)s2));
        return exk_23 == null ? -1L : (long)exk_23.aT_();
    }

    @Override
    public double b(Object object, Object object2, Object object3, Object object4) {
        throw new aob_1("pas de double value sur un crit\u00e8re de type GetDistanceBetweenUsers ");
    }

    @Override
    public Enum<eyO> c() {
        return eyO.N;
    }

    public String toString() {
        return "GetEquipment{m_equipmentPosition=" + this.c + "}";
    }

    static {
        b.add(new aov_1[]{aov_1.b});
    }
}

