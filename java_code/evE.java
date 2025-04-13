/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class evE
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b = false;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public evE(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
    }

    @Override
    public Enum c() {
        return eyO.dJ;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        if (!(epq_22 instanceof eZj)) {
            return -1;
        }
        return ((eZj)((Object)epq_22)).c().b() > 0 ? 0 : -1;
    }

    static {
        a.add(new aov_1[]{aov_1.a});
    }
}

