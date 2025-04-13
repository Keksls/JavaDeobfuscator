/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class euC
extends etx_0 {
    private static final ArrayList<aov_1[]> h = new ArrayList();
    private final long i;
    private final long j;
    private final boolean k;
    private final String l;
    protected boolean g;
    private eqq_1 m;

    public euC(List<aot_2> list) {
        byte by = this.a(list);
        this.a = (aoq_1)list.get(0);
        this.c = ((apd_2)list.get(1)).b();
        this.i = ((aoq_1)list.get(2)).a(null, null, null, null);
        this.g = false;
        this.j = by == 1 || by == 4 ? ((aoq_1)list.get(3)).a(null, null, null, null) : -1L;
        this.k = by != 2 && by != 5 || ((aov_2)list.get(3)).b(null, null, null, null);
        String string = by == 3 ? ((apd_2)list.get(3)).b() : "";
        this.l = by == 4 || by == 5 ? ((apd_2)list.get(4)).b() : string;
    }

    @Override
    protected List<aov_1[]> i() {
        return h;
    }

    @Override
    protected Collection<? extends Su> a(elm_0<?> elm_02, eqq_1 eqq_12) {
        Object object2;
        if (elm_02 == null) {
            return Collections.emptyList();
        }
        Collection collection = this.k ? elm_02.am() : elm_02.ax();
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
            if (this.g && (!((su = sd_02.h()) instanceof app_2) || eqq_12 == null || ((app_2)((Object)su)).Y() != eqq_12.Y()) || !this.l.isEmpty() && this.m != null && (!((su = sd_02.h()) instanceof app_2) || eqq_12 == null || su.a_() != this.m.a_()) || (long)s2 != this.i || this.j >= 0L && (long)fie_02.c() != this.j) continue;
            bl = true;
            break;
        }
        return bl;
    }

    @Override
    protected void c(Object object, Object object2, Object object3, Object object4) {
        this.m = erQ.a(this.l, object, object2, object3, object4);
    }

    public long k() {
        return this.i;
    }

    public long l() {
        return this.j;
    }

    @Override
    public Enum c() {
        return eyO.dq;
    }

    static {
        h.add(new aov_1[]{aov_1.b, aov_1.a, aov_1.b});
        h.add(new aov_1[]{aov_1.b, aov_1.a, aov_1.b, aov_1.b});
        h.add(new aov_1[]{aov_1.b, aov_1.a, aov_1.b, aov_1.c});
        h.add(new aov_1[]{aov_1.b, aov_1.a, aov_1.b, aov_1.a});
        h.add(new aov_1[]{aov_1.b, aov_1.a, aov_1.b, aov_1.b, aov_1.a});
        h.add(new aov_1[]{aov_1.b, aov_1.a, aov_1.b, aov_1.c, aov_1.a});
    }
}

