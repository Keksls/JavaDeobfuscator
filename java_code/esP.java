/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class esP
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Deprecated
    public esP() {
    }

    public esP(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        if (arrayList.size() == 1) {
            this.b = (aoq_1)arrayList.get(0);
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        int n = (int)this.b.a(object, object2, object3, object4);
        ect_0 ect_02 = ecn_0.a.a(n);
        if (ect_02 == null) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer la nation d'ID " + n);
        }
        return super.e() * (long)ect_02.b();
    }

    @Override
    public Enum c() {
        return eyO.cD;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

