/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAq
 */
public abstract class faq_2
extends fyg_0 {
    protected String d = null;
    protected Object e = null;
    protected Object f = null;
    protected boolean g = false;
    protected far_2 h;
    public static final boolean i = false;
    public static final int j = 111972721;
    public static final int k = -691307374;
    public static final int l = 106079;

    public Object getValue() {
        return this.e;
    }

    public void setValue(Object object) {
        if (object != null && !object.equals(this.e) || this.e != null && !this.e.equals(object)) {
            this.e = object;
            this.a(true);
        }
    }

    public Object getComparedValue() {
        return this.f;
    }

    public void setComparedValue(Object object) {
        if (object != null && !object.equals(this.f) || this.f != null && !this.f.equals(object) || object == null && this.f == null) {
            this.f = object;
            this.g = true;
            this.a(true);
        }
    }

    public void a(boolean bl) {
        if (this.m_parent instanceof faq_2) {
            ((faq_2)this.m_parent).a(bl);
        } else if (this.m_parent instanceof far_2) {
            ((far_2)this.m_parent).a(bl);
        }
    }

    public String getKey() {
        return this.d;
    }

    public void setKey(String string) {
        this.d = string;
    }

    public far_2 getConditionParent() {
        return this.h;
    }

    public void setConditionParent(far_2 far_22) {
        this.h = far_22;
    }

    @Override
    public void copyElement(fyo fyo2) {
        faq_2 faq_22 = (faq_2)fyo2;
        faq_22.setKey(this.d);
        faq_22.setValue(this.e);
        if (this.g) {
            faq_22.setComparedValue(this.f);
        }
        super.copyElement(faq_22);
    }

    public abstract boolean isValid(Object var1);

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -691307374) {
            this.setComparedValue(fze2.a(string, this.m_elementMap));
        } else if (n == 111972721) {
            this.setValue(fze2.a(string, this.m_elementMap));
        } else if (n == 106079) {
            this.setKey(fze2.a(string, this.m_elementMap));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -691307374) {
            this.setComparedValue(object);
        } else if (n == 111972721) {
            this.setValue(object);
        } else if (n == 106079) {
            this.setKey(String.valueOf(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

