/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eJS
 */
public class ejs_0
implements Comparator<int[]> {
    private final aff_1 a;

    protected ejs_0(aff_1 aff_12) {
        this.a = aff_12;
    }

    public int a(int[] nArray, int[] nArray2) {
        int n = this.a.a(nArray);
        int n2 = this.a.a(nArray2);
        return Hw.b((long)n, (long)n2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((int[])object, (int[])object2);
    }
}

