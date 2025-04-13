/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ewF
 */
public final class ewf_0
extends esf {
    private boolean a = false;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public ewf_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        switch (by) {
            case 0: {
                this.a = false;
                break;
            }
            case 1: {
                String string = ((apd_2)arrayList.get(0)).b();
                if (!string.equalsIgnoreCase("target")) break;
                this.a = true;
            }
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.a, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1;
        }
        if (epq_22.hg()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.cw;
    }

    static {
        b.add(aov_1.j);
        b.add(new aov_1[]{aov_1.a});
    }
}

