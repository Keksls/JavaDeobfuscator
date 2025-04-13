/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from ety
 */
public abstract class ety_0
extends esi_0 {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    public ety_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
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
            d.error((Object)"CriterionContent attendu, mais pas de type RunningEffect. Ce crit\u00e8re ne peut s'utiliser que comme crit\u00e8re sur un effet.");
            return 0L;
        }
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02 == null) {
            throw new aob_1("On essaie de compter les combattants en dehors d'un combat...");
        }
        aff_1 aff_12 = erQ.d(true, object, object2, object4, object3);
        if (aff_12 == null) {
            d.error((Object)"Unable to compute target position");
            return 0L;
        }
        aff_1 aff_13 = erQ.d(false, object, object2, object4, object3);
        if (aff_13 == null) {
            d.error((Object)"Unable to compute caster position");
            return 0L;
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
        eqq_1 eqq_12 = erQ.b(false, object, object2, object4, object3);
        Collection<? extends Su> collection = this.a(elm_02, eqq_12);
        int n = 0;
        for (Su su : collection) {
            aff_1 aff_14 = su.P_();
            boolean bl = aqd_12.a(aff_12.d(), aff_12.e(), aff_12.f(), aff_13.d(), aff_13.e(), aff_13.f(), aff_14.d(), aff_14.e(), aff_14.f());
            if (!bl) continue;
            ++n;
        }
        return n;
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.gw;
    }

    protected abstract Collection<? extends Su> a(elm_0<?> var1, eqq_1 var2);
}

