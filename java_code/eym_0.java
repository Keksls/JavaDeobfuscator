/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eym
 */
abstract class eym_0
extends esi_0 {
    private static final ArrayList<aov_1[]> c = new ArrayList();
    protected boolean a = true;
    protected String b;

    @Override
    protected List<aov_1[]> i() {
        return c;
    }

    @Override
    public boolean a() {
        return true;
    }

    eym_0() {
    }

    eym_0(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.a = true;
        }
        if (s2 == 1) {
            this.a = false;
            this.b = ((apd_2)arrayList.get(0)).b();
        }
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        elm_0<?> elm_02 = erQ.b(object4);
        if (elm_02 == null) {
            elm_02 = erQ.a(object, object4);
        }
        if (elm_02 == null) {
            throw new aob_1("On essaie de compter les pi\u00e8ges en dehors d'un combat...");
        }
        eqq_1 eqq_12 = null;
        if (!this.a) {
            apq_2 apq_22;
            if (this.b == null || this.b.equalsIgnoreCase("caster")) {
                eqq_12 = erQ.b(false, object, object2, object4, object3);
            } else if (this.b.equalsIgnoreCase("target")) {
                eqq_12 = erQ.b(true, object, object2, object4, object3);
            } else if (this.b.equalsIgnoreCase("triggeringCaster")) {
                apq_22 = erQ.f(object3);
                if (apq_22 instanceof eqq_1) {
                    eqq_12 = (eqq_1)apq_22;
                }
            } else if (this.b.equalsIgnoreCase("triggeringTarget")) {
                apq_22 = erQ.e(object3);
                if (apq_22 instanceof eqq_1) {
                    eqq_12 = (eqq_1)apq_22;
                }
            } else if (this.b.equalsIgnoreCase("casterController")) {
                apq_22 = erQ.b(false, object, object2, object4, object3);
                eqq_12 = elm_02.n(apq_22.B_());
            }
        }
        long l = 0L;
        for (sr_0 sr_02 : elm_02.i().f()) {
            if (!this.a && !this.a(eqq_12, sr_02) || !this.a(sr_02)) continue;
            ++l;
        }
        return super.e() * l;
    }

    private boolean a(eqq_1 eqq_12, sr_0 sr_02) {
        return eqq_12 != null && sr_02.v() != null && sr_02.v().a_() == eqq_12.a_();
    }

    protected boolean a(sr_0 sr_02) {
        return sr_02.w() == this.f();
    }

    protected abstract int f();

    static {
        c.add(esa_0.i);
        c.add(esa_0.j);
    }
}

