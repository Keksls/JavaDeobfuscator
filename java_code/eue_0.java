/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from euE
 */
public class eue_0
extends esi_0 {
    private static ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;
    private aoq_1 c;
    private final long e;
    private final String f;
    private eqq_1 g;
    private String h;

    public eue_0(List<aot_2> list) {
        byte by = this.a(list);
        this.c = (aoq_1)list.get(0);
        this.b = (aoq_1)list.get(1);
        this.h = ((apd_2)list.get(2)).b();
        this.e = ((aoq_1)list.get(3)).a(null, null, null, null);
        this.f = by >= 2 ? ((apd_2)list.get(4)).b() : "";
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
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
        eqq_1 eqq_12 = erQ.a(this.h, object, object2, object4, object3);
        aff_1 aff_13 = "target".equals(this.h) && object2 instanceof aff_1 ? (aff_1)object2 : (aff_12 = eqq_12 != null ? eqq_12.P_() : null);
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
        long l = this.b.a(object, object2, object3, object4);
        long l2 = this.c.a(object, object2, object3, object4);
        long l3 = -1L;
        for (Su su : collection) {
            int n = aob_2.c((aoc_2)su, aff_12);
            int n2 = su.e_(this.e);
            if (l >= 0L && ((long)n > l || (long)n < l2) || (long)n2 <= l3) continue;
            l3 = n2;
        }
        return this.e() * l3;
    }

    protected Collection<? extends Su> a(elm_0<?> elm_02, eqq_1 eqq_12) {
        Object object2;
        if (elm_02 == null) {
            return Collections.emptyList();
        }
        Collection collection = elm_02.am();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object object2 : collection) {
            if (!this.a(eqq_12, ((epq_2)object2).dR())) continue;
            arrayList.add(object2);
        }
        Collection<sr_0> collection2 = elm_02.i().f();
        object2 = collection2.iterator();
        while (object2.hasNext()) {
            sr_0 sr_02 = (sr_0)object2.next();
            eJL eJL2 = (eJL)sr_02.x_();
            if (eJL2 == null || !this.a(eqq_12, eJL2)) continue;
            arrayList.add(sr_02);
        }
        return arrayList;
    }

    private boolean a(eqq_1 eqq_12, eJL eJL2) {
        boolean bl = false;
        for (sd_0 sd_02 : eJL2) {
            Su su;
            if (sd_02.bt_() != efc_0.b.a()) continue;
            fie_0 fie_02 = ((eja_0)sd_02).aF();
            short s2 = fie_02.p();
            if (!this.f.isEmpty() && this.g != null && (!((su = sd_02.h()) instanceof app_2) || eqq_12 == null || su.a_() != this.g.a_()) || (long)s2 != this.e) continue;
            bl = true;
            break;
        }
        return bl;
    }

    private void c(Object object, Object object2, Object object3, Object object4) {
        this.g = erQ.a(this.f, object, object2, object3, object4);
    }

    public long f() {
        return this.e;
    }

    public long j() {
        return this.b == null ? -1L : this.b.a(null, null, null, null);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.hm;
    }

    static {
        a.add(new aov_1[]{aov_1.b, aov_1.b, aov_1.a, aov_1.b});
        a.add(new aov_1[]{aov_1.b, aov_1.b, aov_1.a, aov_1.b, aov_1.a});
    }
}

