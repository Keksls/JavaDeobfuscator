/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class exW
extends esf {
    private static final ArrayList<aov_1[]> f = new ArrayList();
    protected int a;
    protected String b = "caster";

    public exW(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        if (by == 0) {
            this.a = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
        }
        if (by == 1) {
            this.a = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
            this.b = ((apd_2)arrayList.get(1)).b();
        }
    }

    @Override
    protected List<aov_1[]> i() {
        return f;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.a(this.b, object, object2, object4, object3);
        if (!(eqq_12 instanceof epq_2)) {
            return -1;
        }
        epq_2 epq_22 = (epq_2)eqq_12;
        byte by = epq_22.gY();
        if (by != 0) {
            return -1;
        }
        fiR fiR2 = epq_22.dw();
        if (fiR2 == null) {
            return -1;
        }
        ezm_1 ezm_12 = epq_22.dx();
        fiO fiO2 = fiR2.b(ezm_12.d().e());
        if (fiO2 == null) {
            return -1;
        }
        return fiO2.c(this.a) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.gj;
    }

    static {
        f.add(esa_0.l);
        f.add(new aov_1[]{aov_1.b, aov_1.a});
    }
}

