/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TFloatArrayList
 */
import gnu.trove.list.array.TFloatArrayList;

/*
 * Renamed from fwY
 */
public class fwy_0 {
    private float[] a;
    private azj_2[] b;
    private int[] c;

    public azj_2[] a() {
        return this.b;
    }

    public void a(azj_2[] azj_2Array, int[] nArray) {
        this.b = azj_2Array;
        this.c = nArray;
    }

    public float[] b() {
        return this.a;
    }

    public int[] c() {
        return this.c;
    }

    public void a(float[] fArray) {
        this.a = fArray;
    }

    public float[] a(int n) {
        int n2 = this.a.length;
        TFloatArrayList tFloatArrayList = new TFloatArrayList();
        for (int k = 0; k < n2; ++k) {
            tFloatArrayList.add((float)fws_0.a(n, k));
            tFloatArrayList.add(this.a[k]);
        }
        return tFloatArrayList.toArray();
    }
}

