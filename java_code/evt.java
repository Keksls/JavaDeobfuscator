/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class evt
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final boolean b;
    private final long f;

    public evt(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        this.f = ((aoq_1)arrayList.get(1)).a(null, null, null, null);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        se_0 se_02 = eqq_12.x_();
        if (se_02 == null) {
            return -1;
        }
        boolean bl = se_02.e((int)this.f);
        if (bl) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.dL;
    }

    static {
        a.add(new aov_1[]{aov_1.a, aov_1.b});
    }
}

