/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAv
 */
public class fav_1
extends faj_1 {
    public static final String TAG = "ItemCondition";
    public static final int a = 97427706;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.g) {
            object = this.f;
        }
        if (!(object instanceof ftj_0) && !(object instanceof ajf_1)) {
            return false;
        }
        if (object instanceof ajf_1) {
            if (this.d != null) {
                return this.q.isValid(((ajf_1)object).b(this.d));
            }
            return this.q.isValid(object);
        }
        ftj_0 ftj_02 = (ftj_0)object;
        fiq_1 fiq_12 = ftj_02.getItem();
        if (fiq_12 != null && fiq_12.a() instanceof ajf_1 && this.d != null) {
            return this.q.isValid(fiq_12.a(this.d));
        }
        Object object2 = fiq_12 == null ? null : fiq_12.a();
        return this.q.isValid(object2);
    }

    public void setField(String string) {
        this.setKey(string);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 97427706) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setField(fze2.a(string, this.m_elementMap));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 97427706) {
            return super.setPropertyAttribute(n, object);
        }
        this.setField(String.valueOf(object));
        return true;
    }
}

