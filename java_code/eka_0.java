/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 */
import com.google.common.collect.Ordering;
import java.util.Comparator;

/*
 * Renamed from eKa
 */
final class eka_0
extends eJQ
implements eJZ {
    private final Comparator<int[]> a;

    public eka_0(aff_1 aff_12) {
        ejs_0 ejs_02 = new ejs_0(aff_12);
        eJR eJR2 = new eJR(aff_12);
        ahl_2 ahl_22 = new ahl_2(ejs_02, eJR2);
        this.a = Ordering.from(ahl_22).reverse();
    }

    public int a(int[] nArray, int[] nArray2) {
        return this.a.compare(nArray, nArray2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((int[])object, (int[])object2);
    }
}

