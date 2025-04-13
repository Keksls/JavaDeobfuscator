/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fIq
 */
public class fiq_2
extends fyg_0 {
    public static final String TAG = "Spring";
    static final Logger e = Logger.getLogger(fiq_2.class);
    private int f = 0;
    private String g;
    private String h;
    private String i;
    public static final int a = 3108285;
    public static final int b = -487784248;
    public static final int c = 1384965862;
    public static final int d = 111972721;

    public String getEdge() {
        return this.h;
    }

    public void setEdge(String string) {
        this.h = string;
    }

    public String getReferentEdge() {
        return this.i;
    }

    public void setReferentEdge(String string) {
        this.i = string;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public int getValue() {
        return this.f;
    }

    public void setValue(int n) {
        this.f = n;
    }

    public String toString() {
        return Integer.toString(this.getValue());
    }

    public static fiq_2 a(fiq_2 fiq_22, fiq_2 fiq_23) {
        return new fiv_2(fiq_22, fiq_23);
    }

    public static fiq_2 b(fiq_2 fiq_22, fiq_2 fiq_23) {
        return fiq_2.a(fiq_22, new fit_2(fiq_23));
    }

    public static fiq_2 a(int n) {
        return new fir_2(n);
    }

    public static fiq_2 a(fvE fvE2) {
        return new fiw_2(fvE2);
    }

    public static fiq_2 b(fvE fvE2) {
        return new fis_2(fvE2);
    }

    public static fiq_2 c(fvE fvE2) {
        return new fix_2(fvE2);
    }

    public static fiq_2 d(fvE fvE2) {
        return new fiy_2(fvE2);
    }

    public String getReferentId() {
        return this.g;
    }

    public void setReferentId(String string) {
        this.g = string;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.h = null;
        this.i = null;
        this.g = null;
        this.f = 0;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 3108285) {
            this.setEdge(fze2.a(string, this.m_elementMap));
        } else if (n == -487784248) {
            this.setReferentEdge(fze2.a(string, this.m_elementMap));
        } else if (n == 1384965862) {
            this.setReferentId(fze2.a(string, this.m_elementMap));
        } else if (n == 111972721) {
            this.setValue(Co.c(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }
}

