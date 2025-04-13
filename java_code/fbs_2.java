/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBs
 */
public abstract class fbs_2
extends fbl_2 {
    private boolean b = false;
    public static final int a = -908189606;

    public boolean isScaled() {
        return this.b;
    }

    public void setScaled(boolean bl) {
        this.b = bl;
    }

    @Override
    public abstract fbq_2 getMesh();

    @Override
    public void copyElement(fyo fyo2) {
        fbs_2 fbs_22 = (fbs_2)fyo2;
        super.copyElement(fbs_22);
        fbs_22.setScaled(this.b);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b = false;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != -908189606) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setScaled(Co.a(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -908189606) {
            return super.setPropertyAttribute(n, object);
        }
        this.setScaled(Co.b(object));
        return true;
    }
}

