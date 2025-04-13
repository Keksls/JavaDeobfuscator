/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bsO
 */
public class bso_0
implements bsj_0 {
    private static final int c = 256;
    private static final byte[] d = new byte[256];
    private final int[] e;

    public bso_0(int ... nArray) {
        assert (nArray != null && nArray.length >= 1) : "Random patterns must contain at least 1 gfx (2 would be even better)";
        this.e = nArray;
    }

    @Override
    public int a(int n, int n2) {
        int n3 = n * 7 + n2 * 39;
        byte by = d[Math.abs(n3) % 256];
        return this.e[Math.abs(by) % this.e.length];
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        tIntHashSet.addAll(this.e);
    }

    static {
        Hw.a(d);
    }
}

