/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from exK
 */
public final class exk_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private static final int b = 0;
    private short f;
    private String g = "target";

    public exk_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        this.f = 0;
        if (by == 1) {
            this.f = (short)((aoq_1)arrayList.get(0)).a(null, null, null, null);
        }
        if (by == 2) {
            this.f = (short)((aoq_1)arrayList.get(0)).a(null, null, null, null);
            this.g = ((apd_2)arrayList.get(1)).b();
        }
        if (by == 3) {
            this.g = ((apd_2)arrayList.get(0)).b();
        }
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Object object5;
        if (!(object instanceof eqq_1)) {
            throw new aob_1("on essaie de savoir si la cible est une invoc d'un user invalide " + object);
        }
        eqq_1 eqq_12 = erQ.a(this.g, object, object2, object4, object3);
        if (eqq_12 == null && object3 instanceof eyc_0) {
            eqq_12 = ((eyc_0)object3).b();
        }
        if (eqq_12 == null) {
            return -1;
        }
        if (!(eqq_12 instanceof epq_2)) {
            return -1;
        }
        if (this.f != 0) {
            object5 = eqq_12.Z_();
            if (object5 == null) {
                return -1;
            }
            if (object5.s() != this.f) {
                return -1;
            }
        }
        object5 = (epq_2)eqq_12;
        epq_2 epq_22 = (epq_2)object;
        if (((epq_2)object5).gj() == epq_22.gj() && ((epq_2)object5).C_()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.r;
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.l);
        a.add(new aov_1[]{aov_1.b, aov_1.a});
        a.add(esa_0.j);
    }
}

