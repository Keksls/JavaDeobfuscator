/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bsK
 */
public class bsk_0
implements bsj_0 {
    private final bsm_0[] c;
    private final int d;
    private final int e;

    public bsk_0(bsm_0 ... bsm_0Array) {
        assert (bsm_0Array != null && bsm_0Array.length >= 2) : "A motifBoardPattern need at least 2 motifs to be usefull...";
        this.c = bsm_0Array;
        this.d = bsm_0Array[0].a();
        this.e = bsm_0Array[1].a();
        assert (this.a()) : "Motifs don't have identical dimensions in the MotifBoardPattern";
    }

    private boolean a() {
        for (int k = 0; k < this.c.length; ++k) {
            if (this.c[k] != null && this.c[k].a() == this.d && this.c[k].b() == this.e) continue;
            return false;
        }
        return true;
    }

    @Override
    public int a(int n, int n2) {
        int n3 = n / this.d;
        int n4 = n2 / this.e;
        int n5 = (n3 + n4) % this.c.length;
        if (n5 < 0) {
            n5 += this.c.length;
        }
        bsm_0 bsm_02 = this.c[n5];
        return bsm_02.a(n, n2);
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        for (bsm_0 bsm_02 : this.c) {
            bsm_02.a(tIntHashSet);
        }
    }
}

