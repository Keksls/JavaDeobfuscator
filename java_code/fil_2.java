/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIl
 */
public class fil_2
extends fif_1 {
    public static final String TAG = "gld";
    private frs_0 d = frs_0.e;
    private frs_0 e = frs_0.e;
    private boolean f = false;
    private boolean g = true;
    public static final int a = 92903173;
    public static final int b = -285611051;
    public static final int c = -266541503;

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

    public frs_0 getInitAlign() {
        return this.e;
    }

    public void setInitAlign(frs_0 frs_02) {
        this.e = frs_02;
    }

    public boolean isInitValue() {
        return this.f;
    }

    public void setInitValue(boolean bl) {
        this.f = bl;
    }

    public boolean isUsable() {
        return !this.f || this.g || fta_0.getInstance().isResized();
    }

    public void setUsable(boolean bl) {
        this.g = bl;
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        ((fil_2)fyo2).setAlign(this.d);
        ((fil_2)fyo2).setAlign(this.e);
        ((fil_2)fyo2).setInitValue(this.f);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.d = null;
        this.e = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.f = false;
        this.g = true;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 92903173) {
            this.setAlign(frs_0.a(string));
        } else if (n == -285611051) {
            this.setInitAlign(frs_0.a(string));
        } else if (n == -266541503) {
            this.setInitValue(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }
}

