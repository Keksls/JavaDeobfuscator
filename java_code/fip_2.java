/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIp
 */
public class fip_2
extends fif_1 {
    public static final String TAG = "rld";
    private frs_0 d = frs_0.e;
    public static final int a = 92903173;
    public static final int b = "vgap".hashCode();
    public static final int c = "horizontal".hashCode();

    @Override
    public String getTag() {
        return TAG;
    }

    public frs_0 getAlign() {
        return this.d;
    }

    public void setAlign(frs_0 frs_02) {
        this.d = frs_02;
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        ((fip_2)fyo2).setAlign(this.d);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.d = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 92903173) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setAlign(frs_0.a(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }
}

