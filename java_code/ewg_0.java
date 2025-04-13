/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ewg
 */
public class ewg_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;
    private aoq_1 f;
    private boolean g;

    public ewg_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
        if (by == 1) {
            this.f = (aoq_1)arrayList.get(1);
        }
        if (by == 2) {
            this.g = ((apd_2)arrayList.get(1)).b().equalsIgnoreCase("target");
        }
    }

    public long b() {
        return this.f.b() && this.f.a() ? this.f.a(null, null, null, null) : -1L;
    }

    public int d() {
        if (this.b.b() && this.b.a()) {
            return (int)this.b.a(null, null, null, null);
        }
        return -1;
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        long l;
        long l2;
        boolean bl;
        eqq_1 eqq_12 = erQ.b(this.g, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        byte by = (byte)this.d();
        erl_2 erl_22 = erl_2.a(by);
        if (erl_22 == null) {
            return -1;
        }
        eoz_1 eoz_12 = erl_22.c();
        boolean bl2 = eqq_12.f(erl_22);
        boolean bl3 = bl = eoz_12 != null && eqq_12.f(eoz_12);
        if (!bl2 && !bl) {
            return -1;
        }
        if (this.f == null) {
            return 0;
        }
        long l3 = System.currentTimeMillis();
        if (l3 - (l2 = eqx_1.b(eqq_12.a_(), erl_22)) < (l = this.b() * 1000L)) {
            return -1;
        }
        return 0;
    }

    @Override
    public Enum c() {
        return eyO.an;
    }

    static {
        a.add(esa_0.l);
        a.add(new aov_1[]{aov_1.b, aov_1.b});
        a.add(new aov_1[]{aov_1.b, aov_1.a});
    }
}

