/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bsI
 */
public class bsi_1
implements bsh_1 {
    private final bsf_1 a;
    private final bsj_0 b;

    public bsi_1(bsf_1 bsf_12, bsj_0 bsj_02) {
        this.a = bsf_12;
        this.b = bsj_02;
    }

    public int a(short s2, short s3) {
        return this.b.a(s2, s3);
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        this.a.a(tIntHashSet);
        this.b.a(tIntHashSet);
    }

    public int a(int n) {
        return this.a.a(n);
    }
}

