/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eso
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final int b;

    public eso(ArrayList<aot_2> arrayList) {
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

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        ro_0 ro_02 = null;
        if (object4 instanceof ro_0) {
            ro_02 = (ro_0)object4;
        } else if (object instanceof rp_0) {
            ro_02 = ((rp_0)object).O_();
        }
        if (ro_02 == null) {
            throw new aob_1("Usage of criterion GetAchievementLastCompleteDate out of an AchievementContext");
        }
        if (ro_02.c(this.b)) {
            return ro_02.i(this.b);
        }
        throw new aob_1("Usage of criterion GetAchievementLastCompleteDate with an unknown achievement, id : " + this.b);
    }

    @Override
    public Enum c() {
        return eyO.ba;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

