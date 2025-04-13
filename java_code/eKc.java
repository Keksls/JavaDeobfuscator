/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

final class eKc
extends eJQ
implements eJZ {
    private final Comparator<int[]> a;

    eKc(aff_1 aff_12) {
        ejs_0 ejs_02 = new ejs_0(aff_12);
        eJR eJR2 = new eJR(aff_12);
        this.a = new ahl_2<int[]>(ejs_02, eJR2);
    }

    public int a(int[] nArray, int[] nArray2) {
        return this.a.compare(nArray, nArray2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((int[])object, (int[])object2);
    }
}

