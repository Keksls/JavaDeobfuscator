/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bmM
 */
final class bmm_1
extends eqk_2 {
    private final rg_2 b;
    final /* synthetic */ bmr_1 a;

    bmm_1(bmr_1 bmr_12, rg_2 rg_22) {
        this.a = bmr_12;
        this.b = rg_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.ek().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        TIntHashSet tIntHashSet = this.a.dF;
        TIntHashSet tIntHashSet2 = this.a.dG;
        TIntHashSet tIntHashSet3 = this.a.dH;
        this.a.dF = this.b.c != null ? new TIntHashSet(this.b.c) : null;
        this.a.dG = this.b.d != null ? new TIntHashSet(this.b.d) : null;
        this.a.dH = this.b.e != null ? new TIntHashSet(this.b.e) : null;
        if (!this.a.ak() && this.a(tIntHashSet3, this.a.dH)) {
            this.a.dd();
        }
        if (!this.a.ak() && this.a(tIntHashSet, this.a.dF)) {
            this.a.p(true);
        }
        if (!this.a.ak() && this.a(tIntHashSet2, this.a.dG)) {
            this.a.o(true);
        }
    }

    private boolean a(TIntHashSet tIntHashSet, TIntHashSet tIntHashSet2) {
        if (tIntHashSet == null) {
            return tIntHashSet2 != null;
        }
        return !tIntHashSet.equals((Object)tIntHashSet2);
    }
}

