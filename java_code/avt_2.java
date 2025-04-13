/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.cg.CGparameter
 */
import com.jogamp.opengl.cg.CGparameter;

/*
 * Renamed from avt
 */
class avt_2 {
    public final CGparameter a;
    public final String b;
    private float c;
    private float[] d;

    avt_2(String string, CGparameter cGparameter) {
        this.b = string;
        this.a = cGparameter;
    }

    public boolean a(float f2) {
        return this.c == f2;
    }

    public void b(float f2) {
        this.c = f2;
    }

    public boolean a(float[] fArray, int n, int n2) {
        if (this.d == null) {
            return false;
        }
        for (int k = 0; k < n2; ++k) {
            if (this.d[k] == fArray[n + k]) continue;
            return false;
        }
        return true;
    }

    public void b(float[] fArray, int n, int n2) {
        if (this.d == null) {
            this.d = new float[n2];
        }
        System.arraycopy(fArray, n, this.d, 0, n2);
    }
}

