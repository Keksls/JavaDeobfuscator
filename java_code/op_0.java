/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from OP
 */
public class op_0 {
    private final int a;
    private final TIntArrayList b = new TIntArrayList();

    public op_0(int n) {
        this.a = n;
    }

    public void a(int[] nArray) {
        this.b.add(nArray);
    }

    public int a() {
        return this.a;
    }

    public int a(int n) {
        return this.b.get(n);
    }

    public int b() {
        return this.b.size();
    }
}

