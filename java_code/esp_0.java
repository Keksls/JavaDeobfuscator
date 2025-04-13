/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from esp
 */
public class esp_0
extends esi_0 {
    private String a;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Deprecated
    public esp_0() {
    }

    public esp_0(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.a = ((apd_2)arrayList.get(0)).b();
        }
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        ro_0 ro_02 = null;
        if (object4 instanceof ro_0) {
            ro_02 = (ro_0)object4;
        } else if (object instanceof rp_0) {
            ro_02 = ((rp_0)object).O_();
        }
        if (ro_02 == null) {
            throw new aob_1("Utilisation du crit\u00e8re GetAchievementVariable hors d'un contexte d'achievement, variableName = " + this.a);
        }
        rn_0 rn_02 = ro_02.a(this.a);
        if (rn_02 == null) {
            throw new aob_1("R\u00e9cup\u00e9ration d'une variable d'achievement de nom inconnu name=" + this.a);
        }
        return super.e() * ro_02.k(rn_02.a());
    }

    @Override
    public Enum c() {
        return eyO.bx;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a};
        b.add(aov_1Array);
    }
}

