/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from eUX
 */
public class eux_1
extends evk_1 {
    private final int a;
    private final TIntHashSet b;

    public eux_1(int n, int n2, int n3, int[] nArray, ezy_1 ezy_12, int n4) {
        super(n, n2, ezy_12, n4);
        this.a = n3;
        this.b = new TIntHashSet(nArray);
    }

    public int d() {
        return this.a;
    }

    public TIntHashSet e() {
        return this.b;
    }
}

