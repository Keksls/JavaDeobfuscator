/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class esQ
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    @Deprecated
    public esQ() {
    }

    public esQ(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public Enum c() {
        return eyO.cF;
    }

    @Override
    public boolean a() {
        return true;
    }

    public int f() {
        if (this.b.b() && this.b.a()) {
            return (int)this.b.a(null, null, null, null);
        }
        return -1;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        ece_0 ece_02 = erQ.d(object, object2, object3, object4);
        int n = (int)this.b.a(object, object2, object3, object4);
        return ece_02.f(n);
    }

    static {
        a.add(new aov_1[]{aov_1.b});
    }
}

