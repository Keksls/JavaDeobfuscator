/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIJ
 */
public class fij_1
extends fyg_0 {
    public static final String TAG = "data";
    private Object b;
    public static final int a = 111972721;

    @Override
    public String getTag() {
        return TAG;
    }

    public Object getValue() {
        return this.b;
    }

    public void setValue(Object object) {
        this.b = object;
    }

    @Override
    public Object getElementValue() {
        return this.b;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fij_1 fij_12 = (fij_1)fyo2;
        super.copyElement(fyo2);
        fij_12.b = this.b;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 111972721) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setValue(fze2.a(string, this.m_elementMap));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 111972721) {
            return super.setPropertyAttribute(n, object);
        }
        this.setValue(object);
        return true;
    }
}

