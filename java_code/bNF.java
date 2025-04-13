/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.Map;

public class bNF
extends bNI {
    private final TIntArrayList f = new TIntArrayList();
    private short g;

    public bNF(int n, short s2, short s3, short s4, fhj_0 fhj_02, boolean bl, short s5, Map<Long, int[]> map, int n2, boolean bl2) {
        super(n, s2, s3, s4, fhj_02, bl, s5, map, n2, bl2);
    }

    @Override
    public void a(int[] nArray) {
        this.f.add(nArray);
    }

    public short a() {
        return this.g;
    }

    @Override
    public void a(short s2) {
        this.g = s2;
    }

    public int[] b() {
        return this.f.toArray();
    }
}

