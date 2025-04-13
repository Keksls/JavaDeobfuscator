/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class fwi
extends fwc {
    public static final String TAG = "tintIntensityColorPicker";
    public static final String d = "tintColorPicker";
    public static final String e = "intensityColorPicker";
    private fwd j;
    fwd k;
    private int l = 8;
    private float m = 0.3f;
    private float n = 1.0f;
    private fzu o;
    public static final int f = "colors".hashCode();
    public static final int g = 1162213606;
    public static final int h = -449540607;
    public static final int i = -923966673;

    @Override
    public void addThemeElementName(String string, fvE fvE2) {
        super.addThemeElementName(string, fvE2);
        if (string.equals(d)) {
            this.j = (fwd)fvE2;
            this.b = true;
            this.setNeedsToPreProcess();
        } else if (string.equals(e)) {
            this.k = (fwd)fvE2;
            this.b = true;
            this.setNeedsToPreProcess();
        }
    }

    public int getNumVariation() {
        return this.l;
    }

    public void setNumVariation(int n) {
        this.l = n;
    }

    public float getMinIntensity() {
        return this.m;
    }

    public void setMinIntensity(float f2) {
        this.m = f2;
    }

    public float getMaxIntensity() {
        return this.n;
    }

    public void setMaxIntensity(float f2) {
        this.n = f2;
    }

    void a(azj_2 azj_22) {
        if (this.k == null) {
            return;
        }
        ArrayList<azj_2> arrayList = new ArrayList<azj_2>(this.l);
        for (int k = 0; k < this.l; ++k) {
            azf_2 azf_22 = new azf_2(azj_22);
            float f2 = this.m + (float)k * (this.n - this.m) / (float)(this.l - 1);
            azf_22.a(f2);
            arrayList.add(azf_22);
        }
        this.k.setColors(arrayList);
    }

    @Override
    protected void a() {
        this.j.setColors(this.a);
        if (this.a == null || this.a.size() == 0) {
            return;
        }
        this.a((azj_2)this.a.get(0));
    }

    private void b() {
        this.o = new fwj(this);
        this.addEventListener(frd_0.j, this.o, true);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.j = null;
        this.k = null;
        this.o = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fin_2 fin_22 = (fin_2)this.getLayoutManager();
        fin_22.setHorizontal(false);
        this.l = 8;
        this.m = 0.3f;
        this.n = 1.0f;
        this.b();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1162213606) {
            this.setNumVariation(Co.c(string));
        } else if (n == -923966673) {
            this.setMaxIntensity(Co.e(string));
        } else if (n == -449540607) {
            this.setMinIntensity(Co.e(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == f) {
            this.setColors((ArrayList)object);
        } else if (n == 1162213606) {
            this.setNumVariation(Co.c(object));
        } else if (n == -923966673) {
            this.setMaxIntensity(Co.e(object));
        } else if (n == -449540607) {
            this.setMinIntensity(Co.e(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

