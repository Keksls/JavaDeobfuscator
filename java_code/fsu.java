/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class fsu
extends fso {
    public static final String TAG = "DisplayContainer";
    private int c = 30;
    private int d = 10;
    private final HashMap<fvE, fwb_0> e = new HashMap();
    public static final int a = -389176294;
    public static final int b = -1992012396;

    @Override
    public boolean addWidget(fvE fvE2, int n) {
        boolean bl = super.addWidget(fvE2, n);
        if (bl) {
            if (this.m_widgetChildren.size() > this.d) {
                ((fvE)this.m_widgetChildren.get(0)).destroySelfFromParent();
            }
            this.e.put(fvE2, new fwb_0(fvE2, this.c * 1000));
            fco_1 fco_12 = new fco_1(this, this.m_widgetChildren.size() == this.d);
            fco_12.onCheckOut();
            this.dispatchEvent(fco_12);
        }
        return bl;
    }

    @Override
    public void removeWidget(fvE fvE2) {
        fwb_0 fwb_02 = this.e.remove(fvE2);
        if (fwb_02 != null) {
            fwb_02.a();
        }
        super.removeWidget(fvE2);
        fco_1 fco_12 = new fco_1(this, this.m_widgetChildren.size() == this.d);
        fco_12.onCheckOut();
        this.dispatchEvent(fco_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public int getDuration() {
        return this.c;
    }

    public void setDuration(int n) {
        this.c = n;
    }

    public int getContentSize() {
        return this.d;
    }

    public void setContentSize(int n) {
        this.d = n;
    }

    public boolean isFull() {
        return this.d == this.m_widgetChildren.size();
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fsu fsu2 = (fsu)fyo2;
        fsu2.setDuration(this.c);
        fsu2.setContentSize(this.d);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        for (fwb_0 fwb_02 : this.e.values()) {
            fwb_02.a();
        }
        this.e.clear();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -389176294) {
            this.setContentSize(Co.c(string));
        } else if (n == -1992012396) {
            this.setDuration(Co.c(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -389176294) {
            this.setContentSize(Co.c(object));
        } else if (n == -1992012396) {
            this.setDuration(Co.c(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

