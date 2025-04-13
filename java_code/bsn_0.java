/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bsN
 */
public class bsn_0
implements bsj_0 {
    private final bsm_0 c;

    public bsn_0(bsm_0 bsm_02) {
        assert (bsm_02 != null) : "Motif can't be null for a MotifPattern";
        this.c = bsm_02;
    }

    @Override
    public int a(int n, int n2) {
        return this.c.a(n, n2);
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        this.c.a(tIntHashSet);
    }
}

