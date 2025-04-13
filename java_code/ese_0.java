/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from esE
 */
public class ese_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private esg_0 b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ese_0(ArrayList<aot_2> arrayList) {
        if (this.a(arrayList) == 0) {
            this.b = arrayList.size() == 0 ? esg_0.a : esg_0.valueOf(((apd_2)arrayList.get(0)).b().toUpperCase());
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        long l;
        switch (this.b) {
            case a: {
                if (object == null || !(object instanceof eqq_1)) {
                    throw new aob_1("Le User du crit\u00e8re n'est pas un CriterionUser");
                }
                l = ((eqq_1)object).a_();
                break;
            }
            case b: {
                if (object2 == null || !(object2 instanceof eqq_1)) {
                    throw new aob_1("La target du crit\u00e8re n'est pas un CriterionUser");
                }
                l = ((eqq_1)object2).a_();
                break;
            }
            default: {
                throw new aob_1("Impossible de d\u00e9finir la cible du crit\u00e8re");
            }
        }
        return super.e() * l;
    }

    @Override
    public Enum c() {
        return eyO.F;
    }

    static {
        a.add(new aov_1[]{aov_1.a});
        a.add(aov_1.j);
    }
}

