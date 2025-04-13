/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class eJR
implements Comparator<int[]> {
    private final aff_1 a;

    protected eJR(aff_1 aff_12) {
        this.a = aff_12;
    }

    public int a(int[] nArray, int[] nArray2) {
        double d2 = eJQ.a(this.a, nArray);
        double d3 = eJQ.a(this.a, nArray2);
        return Double.compare(d2, d3);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((int[])object, (int[])object2);
    }
}

