/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from evA
 */
public class eva_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    @Deprecated
    public eva_0() {
    }

    public eva_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        if (eqq_12 == null) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        if (!(eqq_12 instanceof erp_1)) {
            throw new aob_1("Mauvais utilisateur du crit\u00e8re");
        }
        erp_1 erp_12 = (erp_1)((Object)eqq_12);
        eqm_0 eqm_02 = erp_12.fm();
        int n = (int)this.b.a(object, object2, object3, object4);
        return eqm_02.d() > 0L && eqm_02.e().contains(n) ? 0 : -1;
    }

    public int b() {
        if (this.b.a()) {
            return (int)this.b.a(null, null, null, null);
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.ao;
    }

    public String toString() {
        return "HasGuildBonus{m_bonusId=" + this.b + "}";
    }

    static {
        a.add(new aov_1[]{aov_1.b});
    }
}

