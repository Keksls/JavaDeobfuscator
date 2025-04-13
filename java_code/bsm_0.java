/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bsM
 */
public class bsm_0
implements bsh_1 {
    private final int b;
    private final int c;
    private final int[] d;

    public bsm_0(int n, int n2, int ... nArray) {
        assert (n > 0 && n2 > 0) : "Motif can't have dimensions less or equal to 0.";
        assert (nArray != null) : "Motif gfx can't be null";
        assert (n * n2 == nArray.length) : "Motif is " + n + "x " + n2 + ". " + n * n2 + " gfx attended, " + nArray.length + " found";
        this.b = n;
        this.c = n2;
        this.d = nArray;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int a(int n, int n2) {
        int n3;
        int n4 = n % this.b;
        if (n4 < 0) {
            n4 += this.b;
        }
        if ((n3 = n2 % this.c) < 0) {
            n3 += this.c;
        }
        return this.d[n3 * this.b + n4];
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        tIntHashSet.addAll(this.d);
    }
}

