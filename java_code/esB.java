/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class esB
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private apc_2 b;

    public esB(ArrayList<aot_2> arrayList) {
        if (this.a(arrayList) == 0) {
            this.b = (apc_2)arrayList.get(0);
        }
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
        if (this.b != null) {
            return this.b.a(object, object2, object3, object4) == 0 ? 1L : 0L;
        }
        return 0L;
    }

    @Override
    public Enum c() {
        return eyO.bF;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.c};
        a.add(aov_1Array);
    }
}

