/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class esj
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final int b;

    public esj(ArrayList<aot_2> arrayList) {
        this.b = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public int f() {
        return this.b;
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
            throw new aob_1("Usage of criterion GetAchievementCategoryActiveCount out of an AchievementContext");
        }
        int n = 0;
        for (rk_0 rk_02 : ro_02.n(this.b)) {
            if (!ro_02.d(rk_02.a())) continue;
            ++n;
        }
        return n;
    }

    @Override
    public Enum c() {
        return eyO.hh;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

