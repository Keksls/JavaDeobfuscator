/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bsF
 */
public class bsf_1
implements bsh_1 {
    private static final int[] d = new int[]{0};
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;

    public bsf_1(int n, int n2, int n3, int n4, int n5, int n6) {
        this.e = n;
        this.f = n2;
        this.g = n3;
        this.h = n4;
        this.i = n5;
        this.j = n6;
    }

    public int a(int n) {
        switch (n) {
            case 0: {
                return 0;
            }
            case 2: {
                return this.f;
            }
            case 1: {
                return this.e;
            }
            case 7: {
                return this.g;
            }
            case 5: {
                return this.h;
            }
            case 6: {
                return this.i;
            }
            case 4: {
                return this.j;
            }
        }
        return -1;
    }

    @Override
    public void a(TIntHashSet tIntHashSet) {
        tIntHashSet.add(this.e);
        tIntHashSet.add(this.f);
        tIntHashSet.add(this.g);
        tIntHashSet.add(this.h);
        tIntHashSet.add(this.i);
        tIntHashSet.add(this.j);
    }
}

