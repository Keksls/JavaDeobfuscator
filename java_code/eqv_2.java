/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.commons.lang3.ArrayUtils
 */
import gnu.trove.list.array.TIntArrayList;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from eqV
 */
public class eqv_2 {
    private final int a;
    private final int[] b;

    public eqv_2(int n, int ... nArray) {
        this.a = n;
        this.b = eqt_2.a(nArray);
    }

    public int a() {
        return this.a;
    }

    public boolean a(int n) {
        return ArrayUtils.contains((int[])this.b, (int)n);
    }

    public void a(TIntArrayList tIntArrayList) {
        tIntArrayList.add(this.b);
    }
}

