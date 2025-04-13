/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class etg
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;
    private eti c;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public etg(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        String string = ((apd_2)arrayList.get(0)).b().toLowerCase();
        if (string.equals("mine")) {
            this.c = eti.a;
        } else if (string.equals("allies")) {
            this.c = eti.b;
        } else if (string.equals("ennemies")) {
            this.c = eti.c;
        } else if (string.equals("all")) {
            this.c = eti.d;
        } else {
            throw new aob_1("param\u00e8tre invalude dans une " + this.getClass().getSimpleName() + " : '" + string + "'");
        }
        this.b = (aoq_1)arrayList.get(1);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (object4 == null) {
            throw new aob_1("Pas de contexte...");
        }
        if (object3 == null) {
            return 0L;
        }
        if (!(object3 instanceof sd_0)) {
            d.error((Object)("CriterionContent attendu, mais il est de type <" + object3.getClass() + "> au lieu de RunningEffect. Ce crit\u00e8re ne peut s'utiliser que comme crit\u00e8re sur un effet."));
            return 0L;
        }
        aff_1 aff_12 = erQ.d(true, object, object2, object4, object3);
        if (aff_12 == null) {
            d.error((Object)"Unable to compute target position");
            return 0L;
        }
        eqq_1 eqq_12 = erQ.b(false, object, object2, object3, object4);
        if (eqq_12 == null && this.c != eti.d) {
            return 0L;
        }
        aff_1 aff_13 = erQ.d(false, object, object2, object4, object3);
        if (aff_13 == null) {
            d.error((Object)"Unable to compute caster position");
            return 0L;
        }
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02 == null) {
            throw new aob_1("On essaie de compter les zones d'effet en dehors d'un combat...");
        }
        Object FX = ((sd_0)object3).f();
        if (FX == null) {
            return 0L;
        }
        aqd_1 aqd_12 = FX.u();
        if (aqd_12 == null) {
            d.error((Object)("Unable to compute effect areas in effet AOE : effect doesn't have one. EffectIf : " + FX.i()));
            return 0L;
        }
        long l = this.b.a(object, object2, object3, object4);
        int n = 0;
        for (sr_0 sr_02 : elm_02.i().f()) {
            if (sr_02 == null || sr_02.A() != l) continue;
            boolean bl = false;
            switch (this.c) {
                case c: {
                    bl = sr_02.Y() != eqq_12.Y();
                    break;
                }
                case b: {
                    bl = sr_02.Y() == eqq_12.Y();
                    break;
                }
                case a: {
                    bl = sr_02.v() == eqq_12;
                    break;
                }
                case d: {
                    bl = true;
                }
            }
            if (!bl) continue;
            aff_1 aff_14 = sr_02.P_();
            boolean bl2 = aqd_12.a(aff_12.d(), aff_12.e(), aff_12.f(), aff_13.d(), aff_13.e(), aff_13.f(), aff_14.d(), aff_14.e(), aff_14.f());
            if (!bl2) continue;
            ++n;
        }
        return super.e() * (long)n;
    }

    @Override
    public Enum c() {
        return eyO.dF;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a, aov_1.b};
        a.add(aov_1Array);
    }
}

