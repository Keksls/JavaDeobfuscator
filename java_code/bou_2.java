/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from boU
 */
class bou_2
implements TObjectProcedure<erh_1> {
    private final TIntHashSet a = new TIntHashSet();

    bou_2() {
    }

    public boolean a(erh_1 erh_12) {
        if (erf_1.a(erh_12)) {
            this.a.add(erh_12.a());
        }
        return true;
    }

    TIntHashSet a() {
        return this.a;
    }

    public String toString() {
        return "FillActiveBonuses{m_activeBonuses=" + this.a.size() + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((erh_1)object);
    }
}

