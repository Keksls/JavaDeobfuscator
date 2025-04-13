/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fIR
 */
public class fir_1
extends fyg_0 {
    private static Logger c = Logger.getLogger(fir_1.class);
    public static final String TAG = "Item";
    private String d = null;
    private String e = null;
    private int f = 0;
    private fak_2 g = null;
    public static final int a = 13085340;
    public static final int b = 97427706;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fak_2) {
            this.g = (fak_2)((Object)fyb_02);
        }
        super.add(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public String getField() {
        return this.d;
    }

    public void setField(String string) {
        this.d = string;
    }

    public int getAttributeHash() {
        return this.f;
    }

    public String getAttribute() {
        return this.e;
    }

    public void setAttribute(String string) {
        this.e = string;
        this.f = this.e != null ? this.e.hashCode() : 0;
    }

    public fak_2 getResultProvider() {
        return this.g;
    }

    public void setCondition(fak_2 fak_22) {
        this.g = fak_22;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.d = null;
        this.e = null;
        this.g = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.f = 0;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fir_1 fir_12 = (fir_1)fyo2;
        super.copyElement(fir_12);
        fir_12.e = this.e;
        fir_12.f = this.f;
        fir_12.d = this.d;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 13085340) {
            this.setAttribute(fze2.a(string, this.m_elementMap));
        } else if (n == 97427706) {
            this.setField(fze2.a(string, this.m_elementMap));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 13085340) {
            this.setAttribute(String.valueOf(object));
        } else if (n == 97427706) {
            this.setField(String.valueOf(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

