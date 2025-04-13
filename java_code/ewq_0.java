/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ewq
 */
public final class ewq_0
extends esf {
    private int a;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    @Deprecated
    public ewq_0() {
    }

    public ewq_0(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.a = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        boolean bl;
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02 == null) {
            return -1;
        }
        if (elm_02.T() == null) {
            return -1;
        }
        boolean bl2 = ((emk_1)elm_02.T()).a(fic_0.q);
        if (bl2) {
            boolean bl3;
            boolean bl4 = bl3 = this.a == efa_0.g.a();
            if (bl3) {
                return 0;
            }
            return -1;
        }
        boolean bl5 = bl = elm_02.T().b() == this.a;
        if (bl) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.dh;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        b.add(aov_1Array);
    }
}

