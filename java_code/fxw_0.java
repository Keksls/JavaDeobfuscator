/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
 * Renamed from fxw
 */
public class fxw_0 {
    private Comparator a;

    public fxw_0() {
    }

    public fxw_0(Comparator comparator) {
        this.a = comparator;
    }

    public int[] a(ArrayList arrayList, boolean bl) {
        Object[] objectArray = arrayList.toArray(new Object[arrayList.size()]);
        Arrays.sort(objectArray, this.a);
        int[] nArray = new int[arrayList.size()];
        int n = objectArray.length;
        for (int k = 0; k < n; ++k) {
            if (bl) {
                nArray[k] = arrayList.indexOf(objectArray[k]);
                continue;
            }
            nArray[n - k - 1] = arrayList.indexOf(objectArray[k]);
        }
        return nArray;
    }
}

