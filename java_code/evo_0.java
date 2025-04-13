/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from evO
 */
public class evo_0
extends esf
implements eyk_0 {
    private static final ArrayList<aov_1[]> g = new ArrayList();
    protected aoq_1 a;
    protected aoq_1 b;
    protected String f;

    @Override
    protected List<aov_1[]> i() {
        return g;
    }

    public evo_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        this.a = (aoq_1)arrayList.get(0);
        if (by == 1 || by == 3) {
            this.b = (aoq_1)arrayList.get(1);
        }
        if (by == 2) {
            this.f = ((apd_2)arrayList.get(1)).b();
        }
        if (by == 3) {
            this.f = ((apd_2)arrayList.get(2)).b();
        }
    }

    public int b() {
        return this.a.b() && this.a.a() ? (int)this.a.a(null, null, null, null) : -1;
    }

    public int d() {
        return this.b != null && this.b.b() && this.b.a() ? (int)this.b.a(null, null, null, null) : -1;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        boolean bl;
        eqq_1 eqq_12 = erQ.a(this.f, object, object2, object4, object3);
        if (eqq_12 == null && object3 instanceof eyc_0) {
            eqq_12 = ((eyc_0)object3).b();
        }
        if (eqq_12 == null) {
            return -1;
        }
        long l = this.a.a(object, object2, object3, object4);
        if (this.b == null) {
            bl = eqq_12.d_(l);
        } else {
            long l2 = this.b.a(object, object2, object3, object4);
            bl = eqq_12.a_(l, l2);
        }
        return bl ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.n;
    }

    @Override
    public boolean j() {
        return "target".equalsIgnoreCase(this.f);
    }

    static {
        g.add(new aov_1[]{aov_1.b});
        g.add(new aov_1[]{aov_1.b, aov_1.b});
        g.add(new aov_1[]{aov_1.b, aov_1.a});
        g.add(new aov_1[]{aov_1.b, aov_1.b, aov_1.a});
    }
}

