/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class exA
extends exz_0 {
    private static final ArrayList<aov_1[]> h = new ArrayList();
    private final aoq_1 i;

    @Override
    protected List<aov_1[]> i() {
        return h;
    }

    public exA(ArrayList<aot_2> arrayList) {
        super(((apd_2)arrayList.get(0)).b(), (aoq_1)arrayList.get(1), (aov_2)arrayList.get(2));
        this.a(arrayList);
        this.i = (aoq_1)arrayList.get(3);
    }

    @Override
    protected boolean a(sr_0 sr_02, Object object, Object object2, Object object3, Object object4) {
        if (sr_02 == null) {
            return false;
        }
        if (!(sr_02 instanceof eqq_1)) {
            return false;
        }
        long l = this.i.a(object, object2, object3, object4);
        return ((eqq_1)((Object)sr_02)).d_(l);
    }

    @Override
    public Enum c() {
        return eyO.dl;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a, aov_1.b, aov_1.c, aov_1.b};
        h.add(aov_1Array);
    }
}

