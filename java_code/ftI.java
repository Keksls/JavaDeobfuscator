/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class ftI
extends fup_0 {
    public static final String TAG = "RadioButton";
    private String D = "";
    private String E;
    public static final int w = 293428218;
    public static final int x = 111972721;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fqb_0 getAppearance() {
        return (fqb_0)this.m_appearance;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return fqj2 instanceof fqb_0;
    }

    public String getGroupId() {
        return this.D;
    }

    public void setGroupId(String string) {
        this.D = string;
        this.c();
    }

    public String getValue() {
        return this.E;
    }

    public void setValue(String string) {
        this.E = string;
        this.c();
    }

    @Override
    public void preApplyAttributes(aqx_2 aqx_22, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
        super.preApplyAttributes(aqx_22, fyb_02, stack, fya_02);
    }

    private void c() {
        if (this.m_elementMap.g(this.D)) {
            this.m_elementMap.f(this.D).a(this);
            if (this.E != null && this.E.equalsIgnoreCase(this.m_elementMap.f(this.D).getValue()) && !this.getAppearance().isChecked()) {
                this.getAppearance().o();
            }
        }
    }

    @Override
    public void onAdd() {
        super.onAdd();
        this.c();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqb_0 fqb_02 = new fqb_0();
        fqb_02.onCheckOut();
        fqb_02.setWidget(this);
        this.add(fqb_02);
    }

    @Override
    public void onCheckIn() {
        if (this.m_elementMap.g(this.D)) {
            this.m_elementMap.f(this.D).b(this);
        }
        super.onCheckIn();
        this.D = null;
        this.E = null;
    }

    @Override
    public void copyElement(fyo fyo2) {
        ftI ftI2 = (ftI)fyo2;
        super.copyElement(ftI2);
        ftI2.D = this.D;
        ftI2.E = this.E;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 293428218) {
            this.setGroupId(fze2.a(string, this.m_elementMap));
        } else if (n == 111972721) {
            this.setValue(fze2.a(string, this.m_elementMap));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 293428218) {
            this.setGroupId(String.valueOf(object));
        } else if (n == 111972721) {
            this.setValue(String.valueOf(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

