/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from fxu
 */
public class fxu_0 {
    private final HashMap<String, fxw_0> c = new HashMap();
    private String d = null;
    private boolean e = true;
    public fxv_0 a = null;

    public void a(fxv_0 fxv_02) {
        this.a = fxv_02;
    }

    public void a(String string, fxw_0 fxw_02) {
        this.c.put(string, fxw_02);
        if (this.d == null) {
            this.d = string;
        }
    }

    public void a() {
        this.c.clear();
        this.d = null;
        this.e = true;
    }

    public void b() {
        this.d = null;
        this.e = true;
    }

    public int[] a(ArrayList arrayList) {
        if (this.d == null) {
            return null;
        }
        fxw_0 fxw_02 = this.c.get(this.d);
        if (fxw_02 != null) {
            return fxw_02.a(arrayList, this.e);
        }
        return null;
    }

    public int[] a(ArrayList arrayList, String string) {
        fxw_0 fxw_02;
        assert (string != null) : "columnId == null !";
        this.e = string.equals(this.d) ? !this.e : true;
        this.d = string;
        if (this.a != null) {
            this.a.onColumnSortChanged(this.d, this.e);
        }
        if ((fxw_02 = this.c.get(this.d)) == null) {
            return null;
        }
        return fxw_02.a(arrayList, this.e);
    }

    public boolean c() {
        return this.e;
    }

    public static int[] a(int n) {
        int[] nArray = new int[n];
        for (int k = 0; k < n; ++k) {
            nArray[k] = k;
        }
        return nArray;
    }

    public void d() {
        this.e = false;
    }
}

