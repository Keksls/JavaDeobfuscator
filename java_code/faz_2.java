/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from fAZ
 */
public class faz_2
extends fqj {
    public static final String TAG = "FocusAppearance";
    private static final ObjectPool a = new abm_1(new fba_2());
    private float b;
    private float c;
    private float d;
    private float e;
    private boolean f;

    public static faz_2 checkOut() {
        faz_2 faz_22;
        try {
            faz_22 = (faz_2)a.borrowObject();
            faz_22.m_currentPool = a;
        }
        catch (Exception exception) {
            l.error((Object)"Probl\u00e8me au borrowObject");
            faz_22 = new faz_2();
            faz_22.onCheckOut();
        }
        return faz_22;
    }

    public void setCenter(float f2, float f3, float f4, float f5) {
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public void setMouseBlocked(boolean bl) {
        this.f = bl;
    }

    @Override
    public boolean a(int n, int n2) {
        return this.f && ((float)n < this.b || (float)n > this.d || (float)n2 < this.c || (float)n2 > this.e);
    }

    @Override
    public String getTag() {
        return TAG;
    }
}

