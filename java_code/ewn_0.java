/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ewn
 */
public class ewn_0
extends esf {
    private int a;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    @Deprecated
    public ewn_0() {
    }

    public ewn_0(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.a = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
        }
    }

    public int b() {
        return this.a;
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
            throw new aob_1("Utilisation du crit\u00e8re IsAchievementObjectiveComplete hors d'un contexte d'achievement");
        }
        return ro_02.b(this.a) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.by;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        b.add(aov_1Array);
    }
}

