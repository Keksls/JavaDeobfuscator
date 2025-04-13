/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TFloatArrayList
 */
import gnu.trove.list.array.TFloatArrayList;
import java.util.ArrayList;

/*
 * Renamed from fwZ
 */
public class fwz_0 {
    private final ArrayList<fwy_0> a = new ArrayList(2);
    private azj_2[] b;
    private int[] c;

    public void a(fwy_0 fwy_02) {
        this.a.add(fwy_02);
    }

    public ArrayList<fwy_0> a() {
        return this.a;
    }

    public void b() {
        this.a.clear();
    }

    public void a(azj_2[] azj_2Array, int[] nArray) {
        this.b = azj_2Array;
        this.c = nArray;
    }

    public azj_2[] c() {
        return this.b;
    }

    public int[] d() {
        return this.c;
    }

    public float[] a(int n) {
        if (this.a.size() == 0) {
            return new float[0];
        }
        float[] fArray = this.a.get(0).b();
        float[] fArray2 = this.a.get(1).b();
        int n2 = fArray.length;
        TFloatArrayList tFloatArrayList = new TFloatArrayList();
        for (int k = 0; k < n2; ++k) {
            tFloatArrayList.add((float)fws_0.a(n, k));
            tFloatArrayList.add(fArray[k]);
            tFloatArrayList.add((float)fws_0.a(n, k));
            tFloatArrayList.add(fArray2[k]);
        }
        return tFloatArrayList.toArray();
    }
}

