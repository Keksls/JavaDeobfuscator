/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class erI
extends esf {
    private int a;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    @Deprecated
    public erI() {
    }

    public erI(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.a = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ro_0 ro_02 = null;
        if (object4 instanceof ro_0) {
            ro_02 = (ro_0)object4;
        } else if (object instanceof rp_0) {
            ro_02 = ((rp_0)object).O_();
        }
        if (ro_02 == null) {
            throw new aob_1("Utilisation du crit\u00e8re CanResetAchievement hors d'un contexte d'achievement");
        }
        if (ro_02.c(this.a)) {
            return ro_02.m(this.a) ? 0 : -1;
        }
        throw new aob_1("Utilisation du crit\u00e8re CanResetAchievement sur un achievement d'id inexistant id=" + this.a);
    }

    @Override
    public Enum c() {
        return eyO.eP;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        b.add(aov_1Array);
    }
}

