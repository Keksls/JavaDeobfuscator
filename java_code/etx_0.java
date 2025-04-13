/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from etx
 */
abstract class etx_0
extends esi_0 {
    private static final ArrayList<aov_1[]> g = new ArrayList();
    aoq_1 a;
    aoq_1 b;
    String c;
    aov_2 e;
    aov_2 f;

    @Override
    protected List<aov_1[]> i() {
        return g;
    }

    etx_0() {
    }

    etx_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        if (arrayList.size() == 1) {
            this.a = (aoq_1)arrayList.get(0);
        } else if (arrayList.size() == 2) {
            this.a = (aoq_1)arrayList.get(0);
            this.c = ((apd_2)arrayList.get(1)).b();
        } else if (arrayList.size() == 3) {
            this.b = (aoq_1)arrayList.get(0);
            this.a = (aoq_1)arrayList.get(1);
            this.c = ((apd_2)arrayList.get(2)).b();
        } else if (arrayList.size() == 4) {
            this.b = (aoq_1)arrayList.get(0);
            this.a = (aoq_1)arrayList.get(1);
            this.c = ((apd_2)arrayList.get(2)).b();
            this.e = (aov_2)arrayList.get(3);
        } else if (arrayList.size() == 5) {
            this.b = (aoq_1)arrayList.get(0);
            this.a = (aoq_1)arrayList.get(1);
            this.c = ((apd_2)arrayList.get(2)).b();
            this.e = (aov_2)arrayList.get(3);
            this.f = (aov_2)arrayList.get(4);
        }
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        aff_1 aff_12;
        if (object4 == null) {
            throw new aob_1("Pas de contexte...");
        }
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        this.c(object, object2, object4, object3);
        eqq_1 eqq_12 = erQ.a(this.c, object, object2, object4, object3);
        aff_1 aff_13 = "target".equals(this.c) && object2 instanceof aff_1 ? (aff_1)object2 : (aff_12 = eqq_12 != null ? eqq_12.P_() : null);
        if (aff_12 == null) {
            return 0L;
        }
        eqq_1 eqq_13 = erQ.b(false, object, object2, object4, object3);
        Collection<? extends Su> collection = this.a(elm_02, eqq_13);
        Iterator<? extends Su> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Su su = iterator.next();
            if (!su.a(eoz_1.P)) continue;
            iterator.remove();
        }
        long l = this.a.a(object, object2, object3, object4);
        if (l <= 0L) {
            return this.e() * (long)collection.size();
        }
        long l2 = this.b == null ? 0L : this.b.a(object, object2, object3, object4);
        boolean bl = this.e != null && this.e.b(object, object2, object3, object4);
        boolean bl2 = this.f != null && this.f.b(object, object2, object3, object4);
        long l3 = 0L;
        for (Su su : collection) {
            int n = aob_2.c((aoc_2)su, aff_12);
            if ((long)n > l || (long)n < l2) continue;
            aff_1 aff_14 = su.P_();
            if (bl && aff_12.d() != aff_14.d() && aff_12.e() != aff_14.e()) continue;
            if (bl2) {
                tg_0 tg_02 = elm_02.g();
                ui_0 ui_02 = ui_0.a();
                ui_02.a(tg_02);
                ui_02.a(aff_12.d(), aff_12.e(), aff_12.f());
                ui_02.b(aff_14.d(), aff_14.e(), aff_14.f());
                if (!ui_02.b()) continue;
            }
            ++l3;
        }
        return this.e() * l3;
    }

    protected void c(Object object, Object object2, Object object3, Object object4) {
    }

    protected abstract Collection<? extends Su> a(elm_0<?> var1, eqq_1 var2);

    @Override
    public boolean a() {
        return true;
    }

    public long j() {
        return this.a == null ? -1L : this.a.a(null, null, null, null);
    }

    public long f() {
        return this.b == null ? -1L : this.b.a(null, null, null, null);
    }

    static {
        g.add(aov_1.j);
        g.add(new aov_1[]{aov_1.b});
        g.add(new aov_1[]{aov_1.b, aov_1.a});
        g.add(new aov_1[]{aov_1.b, aov_1.b, aov_1.a});
        g.add(new aov_1[]{aov_1.b, aov_1.b, aov_1.a, aov_1.c});
        g.add(new aov_1[]{aov_1.b, aov_1.b, aov_1.a, aov_1.c, aov_1.c});
    }
}

