/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bsL
 */
public class bsl_0
implements bsj_0 {
    private final int b;
    private final int c;

    public bsl_0(int n, int n2) {
        this.b = n;
        this.c = n2;
    }

    @Override
    public int a(int n, int n2) {
        if (n == 1 && n2 == 0) {
            return this.b;
        }
        if (n == 0 && n2 == 1) {
            return this.c;
        }
        return 0;
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        tIntHashSet.add(this.b);
        tIntHashSet.add(this.c);
    }
}

