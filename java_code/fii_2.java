/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fIi
 */
public class fii_2
extends fif_1
implements abq_1 {
    private static final Logger c = Logger.getLogger(fii_2.class);
    public static final String TAG = "borderLayoutData";
    public static final String a = "bld";
    private frg_0 d = null;
    private static final ObjectPool e = new abm_1(new fij_2());
    public static final int b = 3076010;

    public static fii_2 checkOut() {
        fii_2 fii_22;
        try {
            fii_22 = (fii_2)e.borrowObject();
            fii_22.m_currentPool = e;
        }
        catch (Exception exception) {
            c.error((Object)"Probl\u00e8me au borrowObject.");
            fii_22 = new fii_2();
            fii_22.onCheckOut();
        }
        return fii_22;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public frg_0 getData() {
        return this.d;
    }

    public void setData(frg_0 frg_02) {
        this.d = frg_02;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fii_2 fii_22 = (fii_2)fyo2;
        super.copyElement(fii_22);
        fii_22.d = this.d;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.d = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 3076010) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setData(frg_0.a(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }
}

